int score;
int y = 0;
int x = (int) random(950);
void setup(){
  size(950, 900);
}
void draw(){
  background(#202020);
  ellipse(x, y+=15, 25, 25);
  fill(#ffffff);
  noStroke();
  rect(mouseX, 860, 75, 125);
  if (y >= 950){
    y = 0;
    x = (int) random(950);
  }
  
  fill(#ffffff);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  text("Congrats, you beat the game!", 350, 300);
  textSize(500);
}
void checkCatch(int x){
  if (x > mouseX && x < mouseX + 100){
  score+=7;
  }else if (score > 0)
  score--;
  println("Your score is now " + score);
}