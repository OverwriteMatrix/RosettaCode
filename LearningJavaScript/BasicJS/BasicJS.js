/* To see this code run BasicJS.html right click on the page, select inspect, and then click the console tab */

// JavaScript Tutorial for Beginners___________________________________________________________________________________________
/*

console.log(`Hello, World!`);
console.log(`I Love JS!`);

window.alert(`This is an alert!`);
window.alert(`This is alert #2`);

//This is a comment
/* This is a multi-line comment 

document.getElementById("myH1intro").textContent = `Hello`;
document.getElementById("myPintro").textContent = `Hello (Paragraph Form)`;

*/
// Variables___________________________________________________________________________________________________________________
/*
// Variable = A container that stores a value. Behaves as if it were that vale it contains

// 1. decleration       let x;
// 2. assignment        x = 100;


// Numbers
let x;
x = 100;
console.log(x);
let age = 25;
let price = 10.99;
let gpa = 2.1;
console.log(`You are ${age} years old with a ${2.1} GPA.`);
console.log(`The price is: $${price}`);
console.log(typeof age);
//console.log(typeof price);
//console.log(typeof gpa);


// Strings
let firstName = "Paxton";
console.log(typeof firstName);
console.log(`Your first name is ${firstName}`)
let email = "paxtonclark123@fake.com";
console.log(`Your email is: ${email}`)

// Booleans
let online = true;
console.log(`Paxton is online: ${online}`);
let forSale = false;
console.log(`This car is for sale: ${forSale}`)

// Displaying Variables on WebPage
let fullName = "Paxton Clark";
let paxAge = 19;
let isStudent = true;
document.getElementById("p1").textContent = fullName;
document.getElementById("p2").textContent = paxAge;
document.getElementById("p3").textContent = isStudent;
document.getElementById("p4").textContent = `Your name is ${fullName} your are ${paxAge} years old and you are a student: ${isStudent}`;

*/
// Arithmetic Operators________________________________________________________________________________________________________
/*

// arithmetic operators = operands (values, variables, ect.)
//                        operators = (+ - * /)
//                        ex. 11 = x + 5;

let students = 30;

//students = students + 1;      //Addition
//students = students - 1;      //Subtraction
//students = student * 2;       //Multiplication
//students = students / 2;      //Division
//students = students ** 2;     //Exponent
//students = students % 3;      //Modulus/Remainder

//Shortcuts (Augmented Assignment Operators)
//students += 1;
//students -= 1;
//students *= 2;
//students /= 2;
//students **= 2;
//students %= 3;

//Increment and Decrement Operator
//students++;
//students--;

//console.log(students);


// Operator Precedence
//
//    1. Parenthesis ()
//    2. Exponents
//    3. Multiplication and Division and Modulus
//    4. Addition and Subtraction
//

// Ex: 
let result = 1 + 2 * 3 + 4 ** 2;
console.log(result);
result = 1 + 2 * 3 + 16;
result = 1 + 6 + 16;
result = 7 + 16;
result = 23;
console.log(result);

*/
// Acept User Input____________________________________________________________________________________________________________
/*

// How to accept user input
// 1. EASY WAY = window prompt
// 2. PROFESSIONAL WAY = HTML textbox

// Easy window prompt
//let username1;
//username1 = window.prompt("What's your username");
//console.log(username1);

// Professional HTML textbox
let username;


document.getElementById("mySubmit").onclick = function () {
    username = document.getElementById("myText").value;
    console.log(username);
    document.getElementById("myH1").textContent = `Hello, ${username}`
}

*/
// Type Conversion_____________________________________________________________________________________________________________
/*

// type conversion = change the datatype of a value to another (strings, numbers, booleans)

//Strings + A Number
let age = window.prompt("How old are you?");
age += 1;
console.log(age, typeof age);

// Convert a string to a number
age = window.prompt("How old are you?");
age = Number(age);
age += 1;
console.log(age, typeof age);

let x = `pizza`;
let y = `pizza`;
let z = `pizza`;

x = Number(x);
y = String(y);
z = Boolean(z);

console.log(x, typeof x);   //NaN = not a number
console.log(y, typeof y);
console.log(z, typeof z);   //If there is some value will return true

*/
// Constants___________________________________________________________________________________________________________________
/*

// const = a variable that cannont be changed

//const PI = 3.14159;     //Replace let with const when declaring a constant variable
//let radius;
//let circumference;


//radius = window.prompt("Enter the radius of a circle");
//radius = Number(radius);

//PI = 145;     Cannot accidentally or maliciously change PI when there is const

//circumference = 2 * PI * radius;
//console.log(circumference);

const PI = 3.14159;
let radius;
let circumference;

document.getElementById("mySubmit").onclick = function () {
    radius = document.getElementById("myText").value;
    radius = Number(radius);
    circumference = 2 * PI * radius;
    document.getElementById("myH3").textContent = circumference + " cm";
}

*/
//// Counter Program___________________________________________________________________________________________________________
/*

const decreaseBtn = document.getElementById("decrease");
const resetBtn = document.getElementById("reset");
const increaseBtn = document.getElementById("increase");
const countLabel = document.getElementById("countLabel");
let count = 0;

increaseBtn.onclick = function () {
    count++;
    countLabel.textContent = count;
}

decreaseBtn.onclick = function () {
    count--;
    countLabel.textContent = count;
}

resetBtn.onclick = function () {
    count = 0;
    countLabel.textContent = count;
}

*/
// Math________________________________________________________________________________________________________________________
/*

// Math = built-in object that provides a collection of properties and methods

console.log(Math.PI);
console.log(Math.E);

let x = 3.99;
let y = 2;
let z;

z = Math.round(x);    //Rounds
//z = Math.floor(x);    //Rounds Down
//z = Math.ceil(x);     //Rounds Up
//z = Math.trunk(x);    //Removes Decimal Places
//z = Math.pow(x, y);   //Power of x^y
//z = Math.sqrt(x);     //Takes the square root
//z = Math.log(x);      //Takes the log(x)
//z = Math.sin(x);      //Takes the sin(x)
//z = Math.cos(x);      //Takes the cos(x)
//z = Math.tan(x);      //Takes the tan(x)
//z = Math.abs(x);      //Takes the |x| (absolute value)
//z = Math.sign(x);     //Tells the sign of a number Positive = 1, Negative = -1, and 0 = 0
console.log(z);

let max = Math.max(x, y, z);    //Tells the max of x, y, and z
let min = Math.min(x, y, z);    //Tells the min of x, y, and z
console.log(max);
console.log(min);

*/
// Random Number Generator_____________________________________________________________________________________________________
/*

// Random Numbers
let randomNum = Math.random();      //Generates a random number between 0 and 1 (Decimal)
console.log(randomNum);

//Random number between 1 and 6
let diceRoll = Math.floor(Math.random() * 6) + 1;  
console.log(diceRoll);

// Random number between a max and min number
const min = 50;
const max = 100;
let diceRollFiftyHundred = Math.floor(Math.random() * (max - min)) + min;
console.log(diceRollFiftyHundred);

//Random Number Generator
const myButton = document.getElementById("myButton");
const myLabel = document.getElementById("myLabel");
const randmin = 1;
const randmax = 6;
let randomNumber;
myButton.onclick = function () {
    randomNumber = Math.floor(Math.random() * randmax) + randmin;
    myLabel.textContent = randomNumber;
}

*/
// If Statements_______________________________________________________________________________________________________________
/*

// If statements = if a condition is true, execute some code. If not, do something else

let age = 18;

if (age >= 18){
    console.log("You are old enough to enter this site");
}
else{
    console.log("You are not old enough to enter this site");
}

*/
// Checked Properly____________________________________________________________________________________________________________
