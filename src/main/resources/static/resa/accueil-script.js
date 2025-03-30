// Un peu exagéré pour de créer une classe juste pour formulaire, mais plus pratique pour récupérer les données
class Form{
    constructor() {
        this.nbPersonne = getValueForm("nb-personne");
        this.date = getValueForm("date");
        this.destination = getValueForm("opt-destination");
        this.nom = getValueForm("nom");
        this.email = getValueForm("email");
        this.iban = getValueForm("iban");
        this.virement = getValueForm("virement");
        this.promo = document.forms["reservationForm"]["promo"].checked;
        this.condition = document.forms["reservationForm"]["condition"].checked;
    }
}

function testDisponibilite(){
    let form = new Form();
    if(form.nbPersonne <= 0){
        window.alert('[Attention]: Minimum 1 voyageur');
    } else if(form.nbPersonne > 20){
        window.alert('[Attention]: Maximum 20 voyageurs');
    } else if(form.destination === "foix" && form.nbPersonne <= 5){
        window.alert('[Attention]: Minimum 6 voyageurs pour la destination Foix');
    } else if(form.virement === 'cheques' && (form.nbPersonne < 1 || form.nbPersonne > 2)){
        window.alert('[Attention]: Le mode de paiement "Chèques vacances" n\'est possible que pour 1 ou 2 personnes');
    } else {
        window.alert('Tout est OK !')
        return true
    }

    return false
}

function valideForm(event){
    event.preventDefault();
    if(!testDisponibilite()) return;
    if(!confirm("Confirmer l'envoie ?")) return;

    let form = new Form();
    fetch('/resa/form/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(form)
    })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            window.location.href = "../../templates/resa/confirmation/index.html";
        })
        .catch((error) => {
            console.error('Error:', error);
        });
}

function getValueForm(id){
    return document.forms["reservationForm"][id].value;
}

function cacherIBAN(){
    let ele = document.getElementById("iban");
    ele.style.display = "none";
}

function afficherIBAN(){
    let ele = document.getElementById("iban");
    ele.style.display = "block";
}

//DEBUG: La fonction sert à pré remplir le formulaire pour faire des tests
function autoCompleteForm() {
    document.getElementById("nb-personne").value = 6;
    document.getElementById("date").value = "2023-12-25";
    document.getElementById("opt-destination").value = "foix";
    document.getElementById("nom").value = "John Doe";
    document.getElementById("email").value = "john.doe@example.com";
    document.getElementById("virement").checked = true;
    document.getElementById("iban").value = "FR07 1234 5678 9123 4567 8901 234";
    document.getElementById("promo").checked = true;
    document.getElementById("condition").checked = true;
}

//Décommenté cette ligne pour pré remplir le formulaire
autoCompleteForm();

