/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author jmartinez
 * @date 25-oct-2018
 */
public class CodingDecoding{
    
    /**
     * Devuelve el valor equivalente segun lo ingresado
     * @param i
     * @return String
     */ 
    public static String getEquival(char i) {
        
        String k = (""+i).toUpperCase();
        String rta = ""+0;
        if (k.equals("A")) rta = ""+0; else if (k.equals("0")) rta = "A";
        else if (k.equals("B")) rta = ""+1; else if (k.equals("1")) rta = "B";
        else if (k.equals("C")) rta = ""+2; else if (k.equals("2")) rta = "C";
        else if (k.equals("D")) rta = ""+3; else if (k.equals("3")) rta = "D";
        else if (k.equals("E")) rta = ""+4; else if (k.equals("4")) rta = "E";
        else if (k.equals("F")) rta = ""+5; else if (k.equals("5")) rta = "F";
        else if (k.equals("G")) rta = ""+6; else if (k.equals("6")) rta = "G";
        else if (k.equals("H")) rta = ""+7; else if (k.equals("7")) rta = "H";
        else if (k.equals("I")) rta = ""+8; else if (k.equals("8")) rta = "I";
        else if (k.equals("J")) rta = ""+9; else if (k.equals("9")) rta = "J";
        else if (k.equals("K")) rta = ""+10; else if (k.equals("10")) rta = "K";
        else if (k.equals("X")) rta = ""+10; else rta = "-";

        return rta;            
    }
    
    /**
     * Se verifica que la secuencia coincida con su valor de control
     * @param cod
     * @return boolean
     */
    public boolean isValidCod(String cod){
        
        int count = 0;
        int v = 0;
        for(int i = 0; i< cod.length(); i++){
            
            String sec = "ABCDEFGHIJKX1234567890";
            if(!sec.contains(""+cod.charAt(i))){
                return false;
            }
            if(cod.charAt(i) == 'X')
                v = 10;
            else                     
                v = Integer.parseInt("" + cod.charAt(i));
          //  System.out.println("valor de v:"+v);
            if ((i%2)!=0){
                count += v;
//                System.out.println("count impar: "+count);
            }else{
            
                count += (v*3); 
//                System.out.println("count par: "+count);
            }
//            System.out.println("acumulado: "+count);
        }
       
        return (count%10 == 0);
    }
    
    public boolean isValidCodChar(String cod){
        int count = 0;
        int v = 0;
        String sec = "ABCDEFGHIJKX1234567890";
        if(!sec.contains(cod)){
            return false;
        }else{
            for(int i = 0; i< cod.length(); i++){
                v = Integer.parseInt("" + getEquival(cod.charAt(i)));            
                if ((i%2)!=0)
                    count += (v*3);
                else
                    count += v; 
            }
        }
        
        return (count%10 == 0);
    }
    
    /**
     * Si el tamanio retornado es igual a cero, todo esta correcto. De lo contrario existe inconsistencia
     * @param cod
     * @return String
     */
    public String isValidSec(String cod){
       
        int par = 0;
        int impar = 0; 
        String check = "";
        for(int i = 0; i<=5; i++){
            par = i * 2;             
            impar = par + 1;
            if(Character.isLetter(cod.charAt(par)) && Character.isDigit(cod.charAt(impar))){
                String sec = "ABCDEFGHIJKX1234567890";
                if(!sec.contains(""+cod.charAt(par) ) ){
                    check += par+":"+cod.charAt(par)+":"+impar+":"+cod.charAt(impar)+":valor@";
                }else if(!getEquival(cod.charAt(par)).equals(""+cod.charAt(impar)) ){
                    check += par+":"+cod.charAt(par)+":"+impar+":"+cod.charAt(impar)+":valor@";                    
                }                    
            }else{
                check += par+":"+cod.charAt(par)+":"+impar+":"+cod.charAt(impar)+":tipo@";
            }                 
        }
        return check;
    }
    
    public boolean valChar(char cod){
        boolean rta = false;
        
        return rta;
    }
    
    /**
     * genera el valor de control de la secuencia
     * @param cod
     * @return String
     */
    public String checkControl(String cod) {
        
        String cadena = cod.substring(0, cod.length());           
        int total = 0;                
        int v = 0;
        int tmp = 0;
        for (int i = 0; i < cadena.length(); i++) {
            v = Integer.parseInt("" + cadena.charAt(i));            
            if ((i%2)==0)
                tmp = (v*3);
            else
                tmp = v;
            total += tmp;
//            System.out.println("v:"+v+":tmp:"+tmp+":total:"+total+" - ");
        }
        
        int control = 0;
        if((total%10) != 0)        
            control  = 10 - (total%10);
      
        if(control == 10)
            return "X";
        else 
            return ""+control;
    }
    
    /**
     * Aplica caracteres de control y redundancia
     * @param cod
     * @return String
     */
    public String generarCodigo(String cod){
        String rta = "";
        String tmp = cod+checkControl(cod);
        
        for(int n=0; n<tmp.length(); n++){
            rta += getEquival(tmp.charAt(n));
            rta += ""+tmp.charAt(n);
        }
        
        return rta;
    }
    
    public String decodificar(String cod){
        String rta = "";
        
        for(int n=0; n<cod.length()-1; n++){
            if(n%2!=0)
                rta += ""+cod.charAt(n);
        }
        
        return rta;
    }
    
    
    /**
     * Realiza las secuencias de comparacion
     * @param cod
     * @return String
     */
    public String masterControl(String cod){
       
        String validSec = isValidSec(cod);
        String rta = "";
        DetectorCorrectorFrame dct = new DetectorCorrectorFrame();
        
        String neoCod = "";
        String codUndecoded = "";
       // System.out.println("informacion devuelve isValidSec: "+validSec);
        if (validSec.length() > 0){
            rta += "Error en la secuencia ingresada:<br>";
            String[] registros = validSec.split("@");
            String codTmpX = "-";
            for(int i=0; i< registros.length; i++){
                String[] info = registros[i].split(":");
                int posA = Integer.parseInt(info[0]) + 1;
                int posB = Integer.parseInt(info[2]) + 1;
               
                rta += "&nbsp;&nbsp;Posicion <b>"+posA+"</b> y <b>"+posB+"</b> no coinciden en su <b>"+info[4]+"</b>: ";
                neoCod = "";
                if(info[4].equals("tipo")){
                    String[] evalTmp = {"",""};
                    if(!Character.isLetter(cod.charAt(Integer.parseInt(info[0])))){// && Character.isDigit(cod.charAt(impar))){
                        evalTmp = evalLetter(cod, info);
                        rta += evalTmp[0];
                        neoCod = evalTmp[1];
                    }else if(!Character.isDigit(cod.charAt(Integer.parseInt(info[2])))){// && Character.isDigit(cod.charAt(impar))){
                        evalTmp = evalNumber(cod, info);
                        rta += evalTmp[0];
                        neoCod = evalTmp[1];
                    }
                }else{
                    String secLet = "";
                    String secNum = "";
                    int par = 0;
                    int impar = 0;
                    for(int k = 0; k<=5; k++){
                        par = k * 2;             
                        impar = par + 1;
                                             
                        if(Character.isLetter(cod.charAt(par)))
                            secLet += getEquival(cod.charAt(par));                       
                        else
                            secLet += cod.charAt(par);
                        
                        if(Character.isLetter(cod.charAt(impar)))
                            secNum += getEquival(cod.charAt(impar));                       
                        else
                            secNum += cod.charAt(impar);
                        
                        
                    }
                    if(!codTmpX.equals(neoCod)){
                        if(isValidCod(secNum)){
                            String[] codTmp = cod.split("");                
                            codTmp[Integer.parseInt(info[0])] = getEquival(cod.charAt(Integer.parseInt(info[2])));
                           // System.out.println("valor a remplazar "+codTmp[Integer.parseInt(info[0])]);
                            for (String o : codTmp) {
                                neoCod += o; //reordeno el nuevo codigo agregando el nuevo a verfificar
                            }
                            rta += "&nbsp;Código podria ser &rarr; <span style='color:red; font-weight:bold;'>"+neoCod+"</span><br>";
                            codTmpX = neoCod;
                        }else {
                            String[] codTmp = cod.split("");                
                            codTmp[Integer.parseInt(info[2])] = getEquival(cod.charAt(Integer.parseInt(info[0])));

                            for (String o : codTmp) {
                                neoCod += o; //reordeno el nuevo codigo agregando el nuevo a verfificar
                            }
                            rta += "&nbsp;Código podria ser &rarr; <span style='color:red; font-weight:bold;'>"+neoCod+"</span><br>";
                            codTmpX = neoCod;
                        }
                    }
                    
                }
                System.out.println("neoCod: "+neoCod);
                codUndecoded = decodificar(neoCod.toUpperCase());
                dct.setJField(codUndecoded); 
                System.out.println("decodificado: i:"+i+" --> uncd: "+codUndecoded);
            }
        }else{
            rta += "<strong>No hay error en el ruido aplicado</strong>";
        }
      //  rta += "</html>";
        rta += rta+"#"+codUndecoded;
        
        return rta;
    }
    
    public String[] evalLetter(String cod, String[] info){
        String[] rta = {"",""};
        String[] codTmp = cod.split("");      
        String neoCod = "";
        
        String sec = "ABCDEFGHIJKX1234567890";
        if(!sec.contains(""+cod.charAt(Integer.parseInt(info[2])))){
            String[] tmp = evalNumber(cod, info); 
            rta[0] = tmp[0];
            rta[1] = tmp[1];
        }else{
            codTmp[Integer.parseInt(info[0])] = getEquival(cod.charAt(Integer.parseInt(info[2])));

            for (String o : codTmp) {
                neoCod += o; //reordeno el nuevo codigo agregando el nuevo a verfificar
            }
            rta[0] = "&nbsp;&nbsp;Código podría ser &rarr; <span style='color:red; font-weight:bold;'>"+neoCod+"</span><br>";
            rta[1] = neoCod;
        }
        
        
        return rta;
    }
    
    public String[] evalNumber(String cod, String[] info){
        String[] rta = {"",""};
        String[] codTmp = cod.split("");      
        String neoCod = "";
        codTmp[Integer.parseInt(info[2])] = getEquival(cod.charAt(Integer.parseInt(info[0])));

        for (String o : codTmp) {
            neoCod += o; //reordeno el nuevo codigo agregando el nuevo a verfificar
        }
        rta[0] = "&nbsp;&nbsp;Código podría ser &rarr; <span style='color:red; font-weight:bold;'>"+neoCod+"</span><br>";
        rta[1] = neoCod;
        return rta;
    }
    
    
   
//    public static void main(String[] args){
//        CodingDecoding cdc = new CodingDecoding();
//        String codigo = "85741";
//       
////        System.out.println(cdc.masterControl(codigo)); 
//          System.out.println("cod control :"+cdc.checkControl(codigo));
////        System.out.println("es valido: 856249: "+cdc.decodificar("I8f2G6C2E4J9"));
//        
//    }
    
    
            
}
