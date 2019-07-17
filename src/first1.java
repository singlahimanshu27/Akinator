import java.awt.Color;
import java.sql.*;
public class first1 extends javax.swing.JFrame {
Connection cn;
PreparedStatement pst, pst1,pst2;
ResultSet rs;
 String url,sql;
 int i=0;
   public void MyConnection()
{
    try
    {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url="jdbc:sqlserver://localhost;instance=ABGJQJN;databaseName=akinator;user=himanshu1;password=hello";
            cn=DriverManager.getConnection(url);
    }
    catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
                
}
   public void ShowFirst()
   {
      
       try
    {
        MyConnection();
              
        sql="Select character From recent";
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
      
        while(rs.next())
        {
       jTextField11.setText(rs.getString("character"));
       }
       if(jTextField11.getText().equals(""))
        jTextField11.setText("Your answers were Contradictory");
        
        rs.close();
        cn.close();
    
    }
     
             catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
   }
   
   
   public void nextques()
   {
       jTextField1.setEditable(false);
        jTextField1.setText("Is your character male?");
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField12.setEditable(false);
       jTextField13.setEditable(false);
       jTextField14.setEditable(false);
       jTextField11.setEditable(false);

       
   }
  
   
   public void showsport()
   {
         try{
           MyConnection();
                sql="Select character,male,age50,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where sportman like 'yes' ";
                pst=cn.prepareStatement(sql);
                rs=pst.executeQuery();
         pst2=cn.prepareStatement("delete from recent where sportman like 'no'");
        pst2.execute();
         rs.close();
        cn.close();
         jTextField3.setText("Is your characer more than 50 years old?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   
   
   public void showceo()
   {
         try{
           MyConnection();             
        sql="Select character,male,age50,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where sportman like 'yes' ";
     

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
         pst2=cn.prepareStatement("delete from recent where ceo like 'no'");
        pst2.execute();
         rs.close();
        cn.close();

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   public void showceon()
   {
         try{
           MyConnection();        
        sql="Select character,male,age50,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where sportman like 'yes' ";   
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
         pst2=cn.prepareStatement("delete from recent where ceo like 'yes'");
        pst2.execute();
         rs.close();
        cn.close();

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   
   
   public void showsportno()
   {
         try{
           MyConnection();
          // if(jRadioButton2.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where sportman like 'no' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        pst1=cn.prepareStatement("delete from recent where sportman like 'yes'");
        pst1.execute();
        rs.close();
        cn.close();
        jTextField3.setText("Is your characer more than 50 years old?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   public void showus()
   {
         try{
           MyConnection();
          // if(jRadioButton19.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where USPresident like 'yes' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        pst1=cn.prepareStatement("delete from recent where USPresident like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
  jTextField12.setText("Is your character related to history?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
  
  
    public void showusn()
   {
         try{
           MyConnection();
          // if(jRadioButton20.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where USPresident like 'no' ";
       // }
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        pst1=cn.prepareStatement("delete from recent where USPresident like'yes'");
        pst1.execute();
         rs.close();
        cn.close();
  jTextField12.setText("Is your character related to history?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   
   public void showageno()
   {
         try{
           MyConnection();            
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where age50 like 'yes' ";
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
       
         rs.close();
        cn.close();
        
         jTextField4.setText("Is your character related to cinema?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   public void showcinemayes()
   {
         try{
           MyConnection();            
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where cinema like 'yes' ";
         pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        rs.close();
        cn.close();
        jTextField5.setText("Is your characer dead?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
   public void showcinemano()
   {
         try{
           MyConnection();
         sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where cinema like 'no' ";
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where cinema like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
               jTextField5.setText("Is your characer dead?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
   
    public void showdiedyes()
   {
         try{
           MyConnection();
                      
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where died like 'yes' ";
        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where died like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField6.setText("Is your character a model?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
    
    
    public void showdiedno()
   {
         try{
           MyConnection();
                      
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where died like 'no' ";
       // }
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where died like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
         jTextField6.setText("Is your character a model?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
    
    
     public void showmodelyes()
   {
         try{
           MyConnection();
                 sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where model like 'yes' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where model like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
         jTextField7.setText("Is your character from NorthKorea?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
     
      public void showmodelno()
   {
         try{
           MyConnection();
                 sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where model like 'no' ";
      
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where model like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField7.setText("Is your character from NorthKorea?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
      
      
      
      
        public void shownorthkorea()
   {
         try{
           MyConnection();
          // if(jRadioButton13.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where northkorea like 'yes' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where northkorea like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField8.setText("Is your character from Kapoor Khan Or Bachchan Family?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
        
        
        
          public void shownorthkorean()
   {
         try{
           MyConnection();
          // if(jRadioButton14.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where northkorea like 'no' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent  where northkorea like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField8.setText("Is your character from Kapoor Khan Or Bachchan Family?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
     
    
          public void showkkb()
           {
         try{
           MyConnection();
         
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where kkb like 'yes' ";
       
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent  where kkb like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField9.setText("Is your character host crorepati?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
          
          public void showkkbn()
   {
         try{
           MyConnection();
          // if(jRadioButton16.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where kkb like 'no' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent  where kkb like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField9.setText("Is your character host crorepati?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
          
          public void showc()
   {
         try{
           MyConnection();
          // if(jRadioButton17.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where crorepati like 'yes' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent  where crorepati like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
         jTextField10.setText("Is your character currently US President?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
          
          public void showcn()
   {
         try{
           MyConnection();
          // if(jRadioButton18.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where crorepati like 'yes' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent  where crorepati like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
          jTextField10.setText("Is your character currently US President?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
            public void showshot()
   {
         try{
           MyConnection();
          // if(jRadioButton21.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where short like 'yes' ";
       // }
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where short like 'no'");
            pst1.execute();
         rs.close();
        cn.close();
 jTextField14.setText("Is your character ceo of apple ?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
              public void showshotn()
   {
         try{
           MyConnection();
         //  if(jRadioButton22.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where short like 'no' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
          pst1=cn.prepareStatement("delete from recent where short like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField14.setText("Is your character ceo of apple ?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
               public void showageyes()
   {
         try{
           MyConnection();
         //  if(jRadioButton22.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where short like 'no' ";
       
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
         
          pst1=cn.prepareStatement("delete from recent where age50 like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
        jTextField4.setText("Is your characer related to cinema?");

   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
              
              
                public void showhistory()
   {
         try{
           MyConnection();
          // if(jRadioButton23.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where history like 'yes' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        pst1=cn.prepareStatement("delete from recent where history like 'no'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField13.setText("Is your character been short on head  ?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
                  public void showhistoryn()
   {
         try{
           MyConnection();
          // if(jRadioButton24.isEnabled())
        //{
             
        sql="Select character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceo,kkb,short,retiredcricket,crorepati,USPresident,northkorea  from recent where history like 'no' ";
        //}
        

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
         
          pst1=cn.prepareStatement("delete from recent where history like 'yes'");
        pst1.execute();
         rs.close();
        cn.close();
 jTextField13.setText("Is your character been shot on head  ?");
   }
            catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
         }
     
   
   
   
   public void showyes1()
   {
       
       try{
           MyConnection();
              sql="SELECT character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceoOfApple,kkb,short,retiredcricket,crorepati,USPresident,northkorea  From ms1 where male like 'yes'";
           
        pst1=cn.prepareStatement("delete from recent");
        pst1.execute();

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();

        while(rs.next())
        {
            String tablename = rs.getString("character");
            String tablename1 = rs.getString("male");
            String tablename2 = rs.getString("age50");
            String tablename3 = rs.getString("sportman");
            String tablename4 = rs.getString("died");
            String tablename5 = rs.getString("model");
            String tablename6 = rs.getString("lawntennis");
            String tablename7 = rs.getString("cinema");
            String tablename8 = rs.getString("history");
            String tablename9 = rs.getString("mrworld");
            String tablename10 = rs.getString("northkorea");
            String tablename11 = rs.getString("ceoOfApple");
            String tablename12 = rs.getString("kkb");
            String tablename13 = rs.getString("short");
            String tablename14 = rs.getString("retiredcricket");
            String tablename15 = rs.getString("crorepati");
            String tablename16 = rs.getString("USPresident");
            
                   // ,male,age50,sportman,died,model,lawntennis,cinema,history,[mr.world],northkorea,ceoOfApple,kkb,short,retiredcricket,crorepati,USPresident"));
            //dh=(rs.getString("character"),i,0);

            sql="Insert into recent values('" + tablename +"','"+tablename1+"','"+tablename2+"','"+tablename3+"','"+tablename4+"','"+tablename5+"','"+tablename6+"','"+tablename7+"','"+tablename8+"','"+tablename9+"','"+tablename11+"','"+tablename12+"','"+tablename13+"','"+tablename14+"','"+tablename15+"','"+tablename16+"','"+tablename10+"')";
            pst1=cn.prepareStatement(sql);
            pst1.execute();

            i++;
        }
       
        
        
       
         rs.close();
        cn.close();
 jTextField2.setText("is your character sportperson?");
       }
        catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
   }
   
   
   
   
   public void showno1()
   {
       
       try{
           MyConnection();
          
       sql="SELECT character,male,age50,sportman,died,model,lawntennis,cinema,history,mrworld,ceoOfApple,kkb,short,retiredcricket,crorepati,USPresident,northkorea  From ms1 where male like 'no'";
        pst1=cn.prepareStatement("delete from recent");
        pst1.execute();

        pst=cn.prepareStatement(sql);
        rs=pst.executeQuery();
        System.out.println("jj");
        
        while(rs.next())
        {
            String tablename = rs.getString("character");
            String tablename1 = rs.getString("male");
            String tablename2 = rs.getString("age50");
            String tablename3 = rs.getString("sportman");
            String tablename4 = rs.getString("died");
            String tablename5 = rs.getString("model");
            String tablename6 = rs.getString("lawntennis");
            String tablename7 = rs.getString("cinema");
            String tablename8 = rs.getString("history");
            String tablename9 = rs.getString("mrworld");
            String tablename10 = rs.getString("northkorea");
            String tablename11 = rs.getString("ceoOfApple");
            String tablename12 = rs.getString("kkb");
            String tablename13 = rs.getString("short");
            String tablename14 = rs.getString("retiredcricket");
            String tablename15 = rs.getString("crorepati");
            String tablename16 = rs.getString("USPresident");
            System.out.println("heyy");
            
        
            sql="Insert into recent values('" + tablename +"','"+tablename1+"','"+tablename2+"','"+tablename3+"','"+tablename4+"','"+tablename5+"','"+tablename6+"','"+tablename7+"','"+tablename8+"','"+tablename9+"','"+tablename11+"','"+tablename12+"','"+tablename13+"','"+tablename14+"','"+tablename15+"','"+tablename16+"','"+tablename10+"')";
            System.out.println("heyyy");
            pst1=cn.prepareStatement(sql);
            pst1.execute();
            System.out.println("hey");

            i++;
        }
       
        
        
       
         rs.close();
        cn.close();
          jTextField2.setText("is your character sportperson?");

        
        
        
          
        
          
        }
        catch(Exception e)
    {
        lblmessage.setText(e.toString());
    }
   }  
    public first1() {
        
        initComponents();

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jTextField10 = new javax.swing.JTextField();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jTextField12 = new javax.swing.JTextField();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jTextField13 = new javax.swing.JTextField();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jTextField14 = new javax.swing.JTextField();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(null);

        jButton5.setText("Start");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(630, 60, 60, 23);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 620, 55, 23);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(630, 100, 60, 23);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 0, 270, 60);
        jPanel1.add(lblmessage);
        lblmessage.setBounds(0, 0, 0, 0);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("no");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(520, 60, 37, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("yes");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(470, 60, 43, 23);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(60, 60, 372, 31);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(60, 100, 370, 28);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("no");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(520, 100, 37, 23);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(470, 100, 43, 23);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(60, 140, 370, 33);

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("yes");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(470, 140, 43, 23);

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("no");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(520, 140, 37, 23);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(60, 180, 370, 33);

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setText("no");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(520, 180, 37, 23);

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setText("yes");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(470, 180, 43, 23);

        buttonGroup5.add(jRadioButton9);
        jRadioButton9.setText("yes");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(470, 220, 43, 23);

        buttonGroup5.add(jRadioButton10);
        jRadioButton10.setText("no");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(520, 220, 37, 23);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(60, 220, 370, 30);

        buttonGroup6.add(jRadioButton12);
        jRadioButton12.setText("no");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(520, 260, 37, 23);

        buttonGroup6.add(jRadioButton11);
        jRadioButton11.setText("yes");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(470, 260, 43, 23);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(60, 260, 370, 32);

        buttonGroup7.add(jRadioButton14);
        jRadioButton14.setText("no");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton14);
        jRadioButton14.setBounds(520, 300, 37, 23);

        buttonGroup7.add(jRadioButton13);
        jRadioButton13.setText("yes");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton13);
        jRadioButton13.setBounds(470, 300, 43, 23);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(60, 300, 370, 32);

        buttonGroup8.add(jRadioButton15);
        jRadioButton15.setText("yes");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton15);
        jRadioButton15.setBounds(470, 340, 43, 23);

        buttonGroup8.add(jRadioButton16);
        jRadioButton16.setText("no");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton16);
        jRadioButton16.setBounds(520, 340, 37, 23);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(60, 340, 370, 33);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(60, 380, 370, 33);

        buttonGroup9.add(jRadioButton17);
        jRadioButton17.setText("yes");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton17);
        jRadioButton17.setBounds(470, 380, 43, 23);

        buttonGroup9.add(jRadioButton18);
        jRadioButton18.setText("no");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton18);
        jRadioButton18.setBounds(520, 380, 37, 23);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(60, 420, 370, 30);

        buttonGroup10.add(jRadioButton19);
        jRadioButton19.setText("yes");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton19);
        jRadioButton19.setBounds(470, 420, 43, 23);

        buttonGroup10.add(jRadioButton20);
        jRadioButton20.setText("no");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton20);
        jRadioButton20.setBounds(520, 420, 37, 23);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12);
        jTextField12.setBounds(60, 460, 370, 34);

        buttonGroup11.add(jRadioButton21);
        jRadioButton21.setText("yes");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton21);
        jRadioButton21.setBounds(470, 460, 43, 23);

        buttonGroup11.add(jRadioButton22);
        jRadioButton22.setText("no");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton22);
        jRadioButton22.setBounds(520, 460, 37, 23);

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(60, 500, 370, 30);

        buttonGroup12.add(jRadioButton23);
        jRadioButton23.setText("yes");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton23);
        jRadioButton23.setBounds(470, 500, 43, 23);

        buttonGroup12.add(jRadioButton24);
        jRadioButton24.setText("no");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton24);
        jRadioButton24.setBounds(520, 500, 37, 23);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField14);
        jTextField14.setBounds(60, 540, 370, 30);

        buttonGroup13.add(jRadioButton25);
        jRadioButton25.setText("yes");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton25);
        jRadioButton25.setBounds(470, 540, 43, 23);

        buttonGroup13.add(jRadioButton26);
        jRadioButton26.setText("no");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton26);
        jRadioButton26.setBounds(520, 540, 37, 23);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(170, 610, 225, 49);

        jButton3.setText("submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(420, 620, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/charj/newpackage/647842.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -110, 810, 1210);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 20, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        nextques();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        showsport();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        showyes1();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        showno1();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        showageno();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
        showdiedyes();
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        showsportno();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    showageyes();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        showcinemayes();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
        showcinemano();
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
        showdiedno();
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
        showmodelyes();
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
        showmodelno();
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
        shownorthkorea();
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        shownorthkorean();
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
        showkkb();
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
        showc();
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
        showcn();
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
        showkkbn();
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ShowFirst();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
        showhistory();
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        // TODO add your handling code here:
        showshotn();
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        // TODO add your handling code here:
        showhistoryn();
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        // TODO add your handling code here:
        showshot();
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
        showus();
        
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
        showusn();
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
        showceo();
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
        showceon();
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new character().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField12.setText("");
       jTextField13.setText("");
       jTextField14.setText("");
       jTextField11.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(first1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblmessage;
    // End of variables declaration//GEN-END:variables
}
