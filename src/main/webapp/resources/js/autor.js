function submitAutorForm() {
    // getting the employee form values
    var imie = $('#imie').val().trim();
    var nazwisko = $('#nazwisko').val().trim();
    var miejsceUrodzenia = $('#miejsceUrodzenia').val();
    var rokUrodzenia = $('#rokUrodzenia').val();
    if (imie.length == 0) {
        alert('Podaj imiê autora');
        $('#imie').focus();
        return false;
    }

    if (nazwisko.length == 0) {
        alert('Podaj nazwisko autora');
        $('#nazwisko').focus();
        return false;
    }

    if (miejsceUrodzenia <= 0) {
        alert('Podaj miejsce urodzenia auora');
        $('#miejsceUrodzenia').focus();
        return false;
    }

    if (rokUrodzenia <= 0) {
        alert('Podaj rok urodzenia auora');
        $('#rokUrodzenia').focus();
        return false;
    }

    return true;
}
;