/*
 * A relative layout contains an ImageView and a TextView widget overlaying
 * the ImageView using a z-index. The layout is animated although individual 
 * widgets can also be animated.
 */

package com.course.example.xmltweened;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.ImageView;

public class XMLTweened extends Activity {
    
	private RelativeLayout layout;
	private ImageView image;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        layout = (RelativeLayout)findViewById(R.id.layout);
        image = (ImageView) findViewById(R.id.img);
        image.setImageResource(R.drawable.shape);
		
		// Load the appropriate animation
        Animation an =  AnimationUtils.loadAnimation(this, R.anim.shakeitup);
        // Register a listener
        an.setAnimationListener(new MyAnimationListener());	
        // Start the animation
        layout.startAnimation(an);	
        
        
    }
    
    public class MyAnimationListener implements Animation.AnimationListener {

		public void onAnimationEnd(Animation animation) {
			// what to do when animation ends
		}
		public void onAnimationRepeat(Animation animation) {
			// what to do when animation loops 
		}

		public void onAnimationStart(Animation animation) {			
			// what to do when animation starts
		}
		
	}
    
}