
function myFunction() {
var txt;
if (confirm("Confirm!")) {
    txt = "Thank you for Submitting !";
} else {
    txt = "Your Submition has been Cancelled!";
}
document.getElementById("demo").innerHTML = txt;
}


function validateForm() {
  var x = document.forms["myForm"]["fname"].value;
  if (x == "") {
    alert("Please fill out all the fields");
    return false;
  }
  myFunction();
}