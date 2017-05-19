/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import java.io.*;
import sun.audio.*;
public class PlaySounds {
    
   
  public static void play(String buttonFile)
  throws Exception
  {
    // open the sound file as a Java input stream
    
    InputStream in = new FileInputStream(buttonFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }
  
}
    

