
package analisadorclase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    private String vector[];
  
     public Interfaz() {
        initComponents(); 
        this.vector = new String[100];
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        compilar = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ingreso = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Csalida = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        error1 = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        S2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        aux = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        compilar.setText("COMPILAR");
        compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarActionPerformed(evt);
            }
        });

        abrir.setText("SELECCIONAR DE ARCHIVO");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        Ingreso.setColumns(20);
        Ingreso.setRows(5);
        jScrollPane3.setViewportView(Ingreso);

        Csalida.setColumns(20);
        Csalida.setRows(5);
        jScrollPane2.setViewportView(Csalida);

        error1.setColumns(20);
        error1.setRows(5);
        jScrollPane6.setViewportView(error1);

        salir.setText("Sacar a un archivo CSV");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        S2.setColumns(20);
        S2.setRows(5);
        jScrollPane4.setViewportView(S2);

        aux.setColumns(20);
        aux.setRows(5);
        jScrollPane5.setViewportView(aux);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(159, Short.MAX_VALUE)
                        .addComponent(abrir)
                        .addGap(97, 97, 97)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                                .addComponent(jScrollPane5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//String cadena =

	public void VCaracterEspecial()
{
	String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("[+|;|:|(|)|[|]|{|}|,|-|*|/|>|<|=|!|&|$]");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("Caracter especial : "+this.vector[i]+" ");
                                    this.aux.append("Caracter especial ");
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}
	
	public void VIdentificador()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                                   
                              String s2=st.nextToken();
                                this.vector[i]=s2;
                                Pattern pat1 = Pattern.compile("int|float|boolean|true|false|char|String|if|then|else|while|do|input|output|return");
                                Pattern pat = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)" );    
				Matcher mat = pat.matcher(s2); 
                                Matcher mat1 = pat1.matcher(s2); 
				if (mat.matches()==true&&mat1.matches()==false)
				{
                                    this.Csalida.append("identificador : "+this.vector[i]+" ");
                                    this.aux.append("identificador "); 
                                    this.Csalida.append("\n");
                                 
				}                 
                              
        }
        
}   
        public void VPalabraReservada()
	{
		String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
            {                   Pattern pat = Pattern.compile("int|float|boolean|char|String|if|then|else|while|do|input|output|return");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(s2);
				if (mat.matches()==true)
				{
                                    this.Csalida.append("palabra reservada : "+this.vector[i]+" "); 
                                    this.aux.append("palabra reservada "); 
                                    this.Csalida.append("\n");
                                    
				} 
                                
        }	
}
	  public void VErorr()
         {
         String cadena =this.Ingreso.getText();
                StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++){
 Pattern pat = Pattern.compile("[+|;|:|(|)|[|]|{|}|,|-|*|/|>|<|=|!|&|$]");
 Pattern pat1 = Pattern.compile("^//.*");
 Pattern pat2 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)" ); 
Pattern pat3 = Pattern.compile("&&|==|!=|<=|>=");
Pattern pat4 = Pattern.compile("int|float|bool|char|String|if|then|else|while|do|input|output|return");
 Pattern pat5 = Pattern.compile("-*\\d+");
 Pattern pat6 = Pattern.compile("''[a-z].*''");
 Pattern pat7 = Pattern.compile("'.'");
 Pattern pat8 = Pattern.compile("true|false");
Pattern pat9 = Pattern.compile("-*\\d+,\\d+");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
Matcher mat = pat.matcher(s2);
Matcher mat1 = pat1.matcher(s2);
Matcher mat2 = pat2.matcher(s2);
Matcher mat3 = pat3.matcher(s2);
Matcher mat4 = pat4.matcher(s2);
Matcher mat5 = pat5.matcher(s2);
Matcher mat6 = pat6.matcher(s2);
Matcher mat7 = pat7.matcher(s2); 
Matcher mat8 = pat8.matcher(s2);
Matcher mat9 = pat9.matcher(s2);
		if (mat.matches()==false&&mat1.matches()==false&&mat2.matches()==false&&mat3.matches()==false
                     &&mat4.matches()==false&&mat5.matches()==false&&mat6.matches()==false&&mat7.matches()==false
                     &&mat8.matches()==false&&mat9.matches()==false)
		{
                         this.Csalida.append("Error : "+this.vector[i]+" "); 
                         this.error1.append("El Error es el siguiente: "+this.vector[i]+"\n");
                         this.Csalida.append("\n");
                                    
		} 
                                
        }	
         }
	public void ErrorLinea()
        {try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\csv.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena=" ";
                        error1.setText(" ");
                        while((cadena=br.readLine())!=null)     {
                            
                            if(cadena.equals("Error"))
                            {
                            error1.setText("Hay un error en la linea");
                            }else
                            {
                            error1.setText("No hay ningun error");
                            }
                      
                        }   
                   abrir.close();    
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "hay un error"+ex);
		}
        }
        public void EDeclaracion()
        {
            String cadena =this.Ingreso.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
	{                       Pattern pat = Pattern.compile("int|float|boolean|char|string");
                                Pattern pat1 = Pattern.compile("[a-z]+(\\d*|_*|[a-z]*)(\\d*|[a-z]*)");
                                 Pattern pat2 = Pattern.compile(";");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(this.vector[0]);
                                System.out.println(this.vector[0]);
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                System.out.println(this.vector[1]);
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                System.out.println(this.vector[2]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true)
				{
                                    this.S2.append("La declaracion es correcta"); 
                                    this.S2.append("\n");
                                    
				} else{
                                     this.S2.append("la declaracion es incorrecta");
                                     this.S2.append("\n");
                                     }
                                
                                
        }	
        
        }
         public void EDeclaracionSuma()
        {
            String cadena =this.aux.getText();
            StringTokenizer st =new StringTokenizer(cadena);
		
         for(int i=0;i<vector.length&&st.hasMoreTokens();i++)
             
	{                       
            Pattern pat1 = Pattern.compile("int|float");
            Pattern pat = Pattern.compile("Caracter especial");
            Pattern pat2 = Pattern.compile("int|float");
            Pattern pat3 = Pattern.compile("int|float");
                                String s2;
				s2 = st.nextToken();
                                this.vector[i]=s2;
				Matcher mat = pat.matcher(this.vector[0]);
                                System.out.println(this.vector[0]);
                                Matcher mat1 = pat1.matcher(this.vector[1]);
                                System.out.println(this.vector[1]);
                                Matcher mat2 = pat2.matcher(this.vector[2]);
                                Matcher mat3 = pat2.matcher(this.vector[3]);
                                System.out.println(this.vector[2]);
				if (mat.matches()==true&&mat1.matches()==true&&mat2.matches()==true&&mat3.matches()==true)
				{
                                    this.S2.append("La declaracion es correcta"); 
                                    this.S2.append("\n");
                                    
				} else{
                                     this.S2.append("la declaracion es incorrecta");
                                     this.S2.append("\n");
                                     }
                                
                                
        }	
        
        }
        
        
    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
      this.Csalida.setText("");
    this.error1.setText("");
    this.S2.setText("");
    this.aux.setText("");
    this.VPalabraReservada();
    this.VIdentificador();
    this.VCaracterEspecial();
    
    
     
     this.VErorr();
     this.EDeclaracion();
   //  this.ErrorLinea();     
    }//GEN-LAST:event_compilarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
     try{
          String direccion="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\ejemplo.c.txt";
			FileReader abrir=new FileReader(direccion);
			BufferedReader br = new BufferedReader(abrir);
			String cadena=" ";
                        Ingreso.setText(" ");
                        while((cadena=br.readLine())!=null)     {
                           
                            Ingreso.append("\n");
                            Ingreso.append(cadena+" ");
           
                      
                        }   
                   abrir.close();    
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "hay un error"+ex);
		}
    }//GEN-LAST:event_abrirActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
	try{
            String direccion1="C:\\Users\\DAVID PROAÑO\\Desktop\\CompiladoresAnalisador\\csv.txt";
		
		String cadena=" \n";
		File abrir=new File (direccion1);
		FileWriter  w=new FileWriter(abrir);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr =new PrintWriter(bw);
                String aux=this.Csalida.getText();			
			wr.write(aux+"\n");
                       System.out.println(aux);
            
		wr.close();
		bw.close();
	}catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null, "La direccion del archivo esta incorrecta");
	}
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Csalida;
    private javax.swing.JTextArea Ingreso;
    private javax.swing.JTextArea S2;
    private javax.swing.JButton abrir;
    private javax.swing.JTextArea aux;
    private javax.swing.JButton compilar;
    private javax.swing.JTextArea error1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
