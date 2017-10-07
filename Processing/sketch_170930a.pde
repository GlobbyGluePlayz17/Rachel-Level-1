int score;
int y = 0;
int x = (int) random(950);
void setup(){
  size(950, 900);
}
void draw(){
  background(#202020);
  ellipse(x, y+=15, 10, 10);
  fill(#ffffff);
  noStroke();
  rect(mouseX, 860, 31, 37);
  if (y >= 950){
    y = 0;
    x = (int) random(950);
  }
  
  fill(#ffffff);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  if (score == 2){
  text("Congrats, you beat the game!", 350, 300);
  textSize(500);
  }
 {
 if (x > mouseX && x < mouseX+100){
  score++;
 }
 else if (score>0) {
   score--;
 }
}