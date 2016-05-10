function submitWriterForm() {
    // getting the writers form values
    var name = $('#name').val().trim();
    var surname = $('#surname').val().trim();
    var placeOfBirth = $('#placeOfBirth').val();
    var yearOfBirth = $('#yearOfBirth').val();
    if (name.length == 0) {
        alert('Enter name of the writer');
        $('#name').focus();
        return false;
    }

    if (surname.length == 0) {
        alert('Enter surname of the writer');
        $('#surname').focus();
        return false;
    }

    if (placeOfBirth <= 0) {
        alert('Enter place of brith');
        $('#placeOfBirth').focus();
        return false;
    }

    if (yearOfBirth <= 0) {
        alert('Enter year of birth');
        $('#yearOfBirth').focus();
        return false;
    }

    return true;
}
;