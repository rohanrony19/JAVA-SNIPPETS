function validateName(){
let userName=document.getElementById("nameId").value;
let nameError=document.getElementById("nameErrorId");
let pattern=/^[A-Za-z ]+$/
if(userName.length<3 || userName.length>10 && pattern.test(userName)){
nameError.innerText="Name length between 3 and 10 and name should not contain numbers";
}else{
nameError.innerText="";
}
}

function checkName(){
let userName=document.getElementById("nameId").value;
let nameError=document.getElementById("nameErrorId");

const xhttp=new XMLHttpRequest();

xhttp.open("GET","http://localhost:8081/xworkz/checkName/"+userName);
xhttp.send();

xhttp.onload=function(){
emailError.innerHTML=this.responseText;
}
}