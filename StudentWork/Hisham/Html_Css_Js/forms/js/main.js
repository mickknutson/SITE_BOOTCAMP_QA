function toSubmit() {
  let fname = document.getElementById("fname");
  let lname = document.getElementById("lname");
  let email = document.getElementById("email");
  let password = document.getElementById("password");

  alert(
    `\t Hello ${fname.value} ${lname.value} \n your email is : ${email.value} \n \n your password is : ofcourse i will not print it , thats not secure`
  );
}
