function submitWriterForm() {
    // getting the writers form values
    var name = $('#name').val().trim();
    var surname = $('#surname').val().trim();
    var placeOfBirth = $('#placeOfBirth').val();
    var yearOfBirth = $('#yearOfBirth').val();
    if (name.length == 0) {
        $('#alertName').show();
        $('#name').focus();
        return false;
    }

    if (surname.length == 0) {
        $('#alertSurname').show();
        $('#alertName').hide();
        $('#surname').focus();
        return false;
    }

    if (placeOfBirth <= 0) {
        $('#alertPlaceOfBirth').show();
        $('#alertSurname').hide();
        $('#placeOfBirth').focus();
        return false;
    }

    if (yearOfBirth <= 0) {
        $('#alertYearOfBirth').show();
        $('#alertPlaceOfBirth').hide();
        $('#yearOfBirth').focus();
        return false;
    }

    return true;
}

function submitBooksForm() {
    var title = $('#title').val().trim();
    var publicationDate = $('#publicationDate').val().trim();
    var category = $('#category').val().trim();

    if (title.length == 0) {
        $('#alertTitle').show();
        $('#title').focus();
        return false;
    }
    if (publicationDate.length == 0) {
        $('#alertPublicationDate').show();
        $('#alertTitle').hide();
        $('#publicationDate').focus();
        return false;
    }
    if (category.length == 0) {
        $('#alertCategory').show();
        $('#alertPublicationDate').hide();
        $('#category').focus();
        return false;
    }
    return true;
}