//1. Make a variable to hold the X co-ordinate of the dot and set it to 50.

void setup() {
    size(800, 300);
}

int x = mouseX;
int y = mouseY;

void draw() {
  
    //3. make the ellteipse a nice color
  ellipse(100,100,100,100);
    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right
  fill(70,255,255);
  if(mousePressed){
    print(x);
    print(y);
    ellipse(x,y,10,10);
    background(255,255,255);
    ellipse(10,10,x,y);
    
  }

    //2. Draw an ellipse of height and width 10. Make sure to use your variable for the X position.
   ellipse(10,10,x,y);
    //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}