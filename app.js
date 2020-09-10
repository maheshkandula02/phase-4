function populate() {
    if(quiz.isEnded()) {
        showScores();
    }
    else {
        // show question
        var element = document.getElementById("question");
        element.innerHTML = quiz.getQuestionIndex().text;

        // show options
        var choices = quiz.getQuestionIndex().choices;
        for(var i = 0; i < choices.length; i++) {
            var element = document.getElementById("choice" + i);
            element.innerHTML = choices[i];
            guess("bt" + i, choices[i]);
        }

        showProgress();
    }
};

function guess(id, guess) {
    var button = document.getElementById(id);
    button.onclick = function() {
        quiz.guess(guess);
        populate();
    }
   
  
};


function showProgress() {
    var currentQuestionNumber = quiz.questionIndex + 1;
    var element = document.getElementById("progress");
    element.innerHTML = "Question " + currentQuestionNumber + " of " + quiz.questions.length;
};

function showScores() {
    var gameOverHTML = "<h1>Result</h1>";
    gameOverHTML += "<h2 id='score'> Your scores: " + quiz.score + "</h2>";
    var element = document.getElementById("quiz");
    element.innerHTML = gameOverHTML;
};

// create questions
var questions = [
    new Question("2. Who is the managing director of DXC Technology in India ?", ["Nachiket Sukhtankar", "Lokendra Sethi","Mike Salvino", "None of these"], "Nachiket Sukhtankar"),

    new Question("3. How many employees does DXC technology have in India ?", ["44,000 employees", "43,000 employees","52,000 employees", "55,000 employees"], "43,000 employees"),
    

    new Question("4. Who is owned by DXC Technology?", ["HP", "ASUS","Lenovo", "Samsung"], "HP"),
    
     new Question("5. Who is the Human Resources Head of DXC Technology in India ?", ["Nachiket Sukhtankar","Lokendra Sethi","Mike Salvino","Mike Salvino"],"Lokendra Sethi"),
    new Question("Currency of India?", ["Dollar", "Rupee","Euro", "Pound"], "Rupee"),
        

];


var quiz = new Quiz(questions);


populate();




