
function myFunction() {
var txt;
if (confirm("Confirm!")) {
    txt = "Thank you for Submitting !";
} else {
    txt = "Your Submition has been Cancelled!";
}
document.getElementById("demo").innerHTML = txt;
}

