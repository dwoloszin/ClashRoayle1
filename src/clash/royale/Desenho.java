/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clash.royale;

import javax.media.opengl.GL;

/**
 *
 * @author dario.lwoloszin
 */
public class Desenho {
    private GL gl;
    
    Desenho(GL gl){
        this.gl = gl;
        desenhaClash(gl);
    }
    
    
    
    public void desenhaClash(GL gl){
    
        gl.glScalef(32.0f, 32.0f, 32.0f);
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glPushMatrix();
        gl.glTranslatef(1.0f, 0.0f, 0.0f);
        gl.glPushMatrix();
        gl.glTranslatef(1.5f, 0.0f, -6.0f);
        gl.glRotatef(0.f, 0.f, 1.0f, 0f);
        gl.glBegin(GL.GL_QUADS);
        // Torre Base
            gl.glColor3f(0.83f,0.83f,0.83f);
            //front
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            
            //back
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);

            //lateral esquerda
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            
            //Latwral direuta
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            
        //torre superior
            //base
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            
            //superior
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.37f, 0.62f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
                 
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.37f, 0.62f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.37f, 0.62f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.37f, 0.62f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
            
            //espelho2
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.5f, 0.37f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.5f, -0.37f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.5f, 0.37f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.5f, -0.37f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
 
            //escada
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.26f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, 0.26f, 0.42f);
            gl.glVertex3f( -0.26f, 0.26f, 0.42f);
            
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.08f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, 0.26f, 0.42f);
            gl.glVertex3f( -0.08f, 0.26f, 0.42f);
            
            //degraus
            
            gl.glVertex3f( -0.05f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.38f, 0.50f);
            gl.glVertex3f( -0.05f, -0.38f, 0.50f);
            
            gl.glVertex3f( -0.05f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.20f, 0.48f);
            gl.glVertex3f( -0.05f, -0.20f, 0.48f);
            
            gl.glVertex3f( -0.05f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, -0.04f, 0.46f);
            gl.glVertex3f( -0.05f, -0.04f, 0.46f);
            
            gl.glVertex3f( -0.05f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.21f, 0.42f);
            gl.glVertex3f( -0.05f, 0.21f, 0.42f);
            
            //Janela
            gl.glColor3f(0.0f,0.0f,0.0f);
            gl.glVertex3f( 0.06f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.10f, 0.43f);
            gl.glVertex3f( 0.06f, 0.10f, 0.43f);
            
  
         
        gl.glEnd();
        gl.glPopMatrix();
        
        
        //TORRE 2
        gl.glPushMatrix();
        gl.glTranslatef(-2.0f, 0.0f, -6.0f);
        //gl.glRotatef(rquad, 0f, 1.0f, 0f);
        gl.glBegin(GL.GL_QUADS);
        // Torre Base
            gl.glColor3f(0.83f,0.83f,0.83f);
            //front
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            
            //back
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);

            //lateral esquerda
            gl.glVertex3f( -0.5f, -0.5f, 0.5f);
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.5f, -0.5f, -0.5f);
            
            //Latwral direuta
            gl.glVertex3f( 0.5f, -0.5f, 0.5f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( 0.5f, -0.5f, -0.5f);
            
        //torre superior
            //base
            gl.glVertex3f( -0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, 0.38f);
            gl.glVertex3f( 0.38f, 0.5f, -0.38f);
            gl.glVertex3f( -0.38f, 0.5f, -0.38f);
            
            //superior
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.37f, 0.62f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.19f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
                 
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.37f, 0.62f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.19f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.37f, 0.62f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.19f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.37f, 0.62f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.19f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
            
            //espelho2
            gl.glVertex3f( 0.37f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.62f, 0.37f);
            gl.glVertex3f( 0.19f, 0.5f, 0.37f);
            gl.glVertex3f( 0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( 0.37f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.62f, -0.37f);
            gl.glVertex3f( 0.19f, 0.5f, -0.37f);
            gl.glVertex3f( 0.37f, 0.5f, -0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.62f, 0.37f);
            gl.glVertex3f( -0.19f, 0.5f, 0.37f);
            gl.glVertex3f( -0.37f, 0.5f, 0.37f);
            
            gl.glVertex3f( -0.37f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.62f, -0.37f);
            gl.glVertex3f( -0.19f, 0.5f, -0.37f);
            gl.glVertex3f( -0.37f, 0.5f, -0.37f);
 
            //escada
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.26f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, -0.5f, 0.51f);
            gl.glVertex3f( -0.22f, 0.26f, 0.42f);
            gl.glVertex3f( -0.26f, 0.26f, 0.42f);
            
            gl.glColor3f(1.0f,1.0f,0.0f);
            gl.glVertex3f( -0.08f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, -0.5f, 0.51f);
            gl.glVertex3f( -0.04f, 0.26f, 0.42f);
            gl.glVertex3f( -0.08f, 0.26f, 0.42f);
            
            //degraus
            
            gl.glVertex3f( -0.05f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.32f, 0.49f);
            gl.glVertex3f( -0.25f, -0.38f, 0.50f);
            gl.glVertex3f( -0.05f, -0.38f, 0.50f);
            
            gl.glVertex3f( -0.05f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.14f, 0.47f);
            gl.glVertex3f( -0.25f, -0.20f, 0.48f);
            gl.glVertex3f( -0.05f, -0.20f, 0.48f);
            
            gl.glVertex3f( -0.05f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, 0.02f, 0.45f);
            gl.glVertex3f( -0.25f, -0.04f, 0.46f);
            gl.glVertex3f( -0.05f, -0.04f, 0.46f);
            
            gl.glVertex3f( -0.05f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.15f, 0.43f);
            gl.glVertex3f( -0.25f, 0.21f, 0.42f);
            gl.glVertex3f( -0.05f, 0.21f, 0.42f);
            
            //Janela
            gl.glColor3f(0.0f,0.0f,0.0f);
            gl.glVertex3f( 0.06f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.28f, 0.41f);
            gl.glVertex3f( 0.25f, 0.10f, 0.43f);
            gl.glVertex3f( 0.06f, 0.10f, 0.43f);
            
  
         
        gl.glEnd();
        gl.glPopMatrix();
        
        
        
        //torre do rei
      gl.glPushMatrix();
   //   gl.glLoadIdentity();
      gl.glTranslatef(-0.25f, 0.4f, -8.0f);
      gl.glRotatef(0, 0.0f, 1.0f, 0.0f);
      gl.glBegin(GL.GL_QUADS);           	// Draw A Quad
      
        //gl.glColor3f(0.47f,0.53f,0.42f);			// Set The Color To Cinza
        			// Bottom Right Of The Quad (Top)
      
        float x = 1.1f;
      
        /*gl.glColor3f(0.47f,0.53f,0.42f);			// Set The Color To Cinza
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)*/
        
        gl.glColor3f(0.83f,0.83f,0.83f);			// Set The Color To Cinza Claro
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        
        gl.glVertex3f( 0.95f, 1.0f, 0.95f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-0.95f, 1.0f, 0.95f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        
        gl.glVertex3f( 0.95f, 1.0f,-0.95f);			// Top Right Of The Quad (Back)
        gl.glVertex3f(-0.95f, 1.0f,-0.95f);			// Top Left Of The Quad (Back)
        gl.glVertex3f(-1.0f, -1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f( 1.0f, -1.0f,-1.0f);			// Bottom Right Of The Quad (Back)

        
        gl.glVertex3f(-0.95f, 1.0f, 0.95f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-0.95f, 1.0f,-0.95f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        
        gl.glVertex3f( 0.95f, 1.0f,-0.95f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 0.95f, 1.0f, 0.95f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        
                
        //PARTE SUPERIOR DA TORRE (PARTE MAIS LARGA)
        //gl.glColor3f(0.12f, 0.56f, 1.0f);                       // Set The Color To Azul Furtivo
        gl.glVertex3f( 1.0f*x, 1.0f,-1.0f*x);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f*x, 1.0f,-1.0f*x);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f*x, 1.0f, 1.0f*x);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f*x, 1.0f, 1.0f*x);                   // Bottom Right Of The Quad (Top)
        

        gl.glVertex3f( 1.0f*x, 1.2f*x,   1.0f*x);		// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f*x, 1.2f*x,   1.0f*x);		// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f*x, 0.905f*x, 1.0f*x);		// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f*x, 0.905f*x, 1.0f*x);		// Bottom Right Of The Quad (Front)
        

        gl.glVertex3f( 1.0f*x, 1.2f*x,  -1.0f*x);		// Top Right Of The Quad (Back)
        gl.glVertex3f(-1.0f*x, 1.2f*x,  -1.0f*x);		// Top Left Of The Quad (Back)
        gl.glVertex3f(-1.0f*x, 0.905f*x,-1.0f*x);		// Bottom Left Of The Quad (Back)
        gl.glVertex3f( 1.0f*x, 0.905f*x,-1.0f*x);		// Bottom Right Of The Quad (Back)
        
        
        gl.glVertex3f(-1.0f*x, 1.2f*x,   1.0f*x);		// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f*x, 1.2f*x,  -1.0f*x);		// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f*x, 0.905f*x,-1.0f*x);		// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f*x, 0.905f*x, 1.0f*x);		// Bottom Right Of The Quad (Left)
        
        
        gl.glVertex3f(1.0f*x, 1.2f*x,  -1.0f*x);                // Top Right Of The Quad (Right)
        gl.glVertex3f(1.0f*x, 1.2f*x,   1.0f*x);                // Top Left Of The Quad (Right)
        gl.glVertex3f(1.0f*x, 0.905f*x, 1.0f*x);                // Bottom Left Of The Quad (Right)
        gl.glVertex3f(1.0f*x, 0.905f*x,-1.0f*x);		// Bottom Right Of The Quad (Right)
        
        
        gl.glColor3f(0.12f, 0.56f, 1.0f);               // Set The Color To Azul Furtivo
        gl.glVertex3f( 0.3f*x, 0.0f*x, 1.0f*x);		// Top Right Of The Quad (Front)
        gl.glVertex3f(-0.3f*x, 0.0f*x, 1.0f*x);		// Top Left Of The Quad (Front)
        gl.glVertex3f(-0.3f*x,-0.89f*x, 1.0f*x);	// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 0.3f*x,-0.89f*x, 1.0f*x);	// Bottom Right Of The Quad (Front)
        
        
      gl.glEnd();
      gl.glPopMatrix();
       
        
        // Arena
            gl.glPushMatrix();
            gl.glTranslatef(1.9f, 0.0f, -6.0f);
            //gl.glRotatef(rquad, 0f, 1.0f, 0f);
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(0.48f,0.63f,0.14f);
            gl.glVertex3f( 0.84f, -0.5f, 1.56f);
            gl.glVertex3f( -6f, -0.5f, 1.56f);
            gl.glVertex3f( -6f, -0.5f, -12.56f);
            gl.glVertex3f( 0.84f, -0.5f, -12.56f);
            gl.glEnd();
            gl.glPopMatrix();
            
            
            
        // Trilha
            gl.glPushMatrix();
            gl.glTranslatef(0.0f, 0.01f, -6.0f);
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(1.0f, 0.84f, 0.0f);
            gl.glVertex3f(-2.0f, -0.5f, -1.0f);
            gl.glVertex3f(-3.0f, -0.5f, -1.06f);
            gl.glVertex3f(-3.0f, -0.5f, -12.56f);
            gl.glVertex3f(-2.0f, -0.5f, -12.56f);
            gl.glEnd();
            gl.glPopMatrix();
            gl.glPopMatrix();
            
            
            
        gl.glFlush();
      
      //rota��o do quadrado
     // rquad += 0.5f;
    
    
    }
    
}
