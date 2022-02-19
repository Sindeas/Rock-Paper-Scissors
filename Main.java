var playerbot = '';
var playerchoice = '';
var arr = [];
var roundchoice;

var numbot = function () {  
  var num = Math.floor(Math.random() * 3);
  return arr[num];
};



var round = 0;
var playercount = 0;
var botcount = 0;


var winner = function () {
  playerchoice = prompt("Choose rock, paper or scissors ");
  arr = ["rock","paper","scissors"];
  playerbot = numbot();
  
   if (arr.indexOf(playerchoice) == -1) {
    alert ("False entry, you need to choose rock, paper or scissors");
    return;
   }
   
  //  if (roundchoice != 1 && roundchoice != 3) {
  //  alert ("Please choose 1 or 3, for one round or best of three");
  //  return;
  //  }
   
   else if (playerchoice == "rock" && playerbot == "scissors") {
    round++;
    playercount++;
    alert("Round " +round +": user wins (user: " +playercount+", bot: "+botcount+")");
   }
   else if (playerchoice == "rock" && playerbot == "paper"){
    round++;
    botcount++;
    alert("Round " +round +": bot wins (user: " +playercount+", bot: "+botcount+")");
      }
  else if (playerchoice == "rock" && playerbot == "rock"){
    round++;
    alert("Round " +round +": draw (user: " +playercount+", bot: "+botcount+")");
      }
  else if (playerchoice == "paper" && playerbot == "scissors"){
    round++;
    botcount++;
    alert("Round " +round +": bot wins (user: " +playercount+", bot: "+botcount+")");
      }
  else if (playerchoice == "paper" && playerbot == "rock"){
    round++;
    playercount++;
    alert("Round " +round +": user wins (user: " +playercount+", bot: "+botcount+")");
      }
  else if (playerchoice == "paper" && playerbot == "paper"){
    round++;
    alert("Round " +round +": draw (user: " +playercount+", bot: "+botcount+")");
      }
  else if (playerchoice == "scissors" && playerbot == "paper"){
    round++;
    playercount++;
    alert("Round " +round +": user wins (user: " +playercount+", bot: "+botcount+")");
      }
  else if (playerchoice == "scissors" && playerbot == "rock"){
    round++;
    botcount++;
    alert("Round " +round +": bot wins (user: " +playercount+", bot: "+botcount+")");
      }  
  else if (playerchoice == "scissors" && playerbot == "scissors") {
    round++;
    alert("Round " +round +": draw (user: " +playercount+", bot: "+botcount+")");
  }
};


var single = function () {
  winner(); 
}

var bestOfThree = function () {
  while (playercount < 2 && botcount < 2) {
    winner();
  }
}

var game = function () {
  roundchoice = prompt("Do you want to play one round, or best of three? Choose 1 or 3");
  while (roundchoice === '1' || roundchoice === '3') {
    playercount = 0;
    botcount = 0;
    round = 0;
    if (roundchoice == 3) {
      bestOfThree();
    } else if (roundchoice == 1) {
      single();
    }
    roundchoice = prompt("Do you want to play one round, or best of three? Choose 1 or 3. Cancel to quit.");
  }
}

game();