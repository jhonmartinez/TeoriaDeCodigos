/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jmartinez
 * @date 25-oct-2018
 */
public class CalculatorCode {
    
    /**
     * Permite calcular el digito de control de un codigo ISBN dado
     * @param leido
     * @return String
     */
    public String recalcularISBN(String leido) {
       
        String cod10 = leido;
        int tam = leido.length()-1;
        int total = 0;
        
        for (int i = 0; i < tam; i++) {
            int v = 0;
            if (cod10.charAt(i) == 'X'){
                v = 10;
            }else{
                v = Integer.parseInt("" + cod10.charAt(i));
            }
            int tmpv = ((10 - i) * v);
            total += tmpv;
        }
       
        int control = 11 - (total%11);
        if(control == 10)
            return "X";
        else
            return ""+control;
    }
    
    /**
     * Calcula el i-ésimo valor de un codigo ISBN dado
     * @param cod10
     * @return String
     */
    public String precisarISBN(String cod10){
        int total = 0;
        int posX = 0;
        int prod = 0;
        int tam = cod10.length();
        
        for (int i = 0; i < tam; i++) {
            if ((i == (tam-1)) && (cod10.toUpperCase().charAt(i) == 'X')){
                total += 10;
            }else if(cod10.toUpperCase().charAt(i) != 'K'){
                int v = 0;
                if (cod10.charAt(i) == 'X'){
                    v = 10;
                }else{
                    v = Integer.parseInt("" + cod10.charAt(i));
                }
                int tmpv = ((10 - i) * v);
                total += tmpv;
                
            }else{
                
                posX = i+1;
                prod = (10 - i);
            }             
        }
        
        boolean var = true;
        int count = 0;
        int tmp = 0;
        
        do{       
            //se controla que solo la ultima posicion puede ser 10 
            if(posX == 10){
                tmp = (total + (prod * count))%11;
                if((count == 11) || (tmp == 0)  )
                    var = false;
                else{
                    count++;               
                }
            }else if(posX < 10){
                tmp = (total + (prod * count))%11;
                if((count == 10) || (tmp == 0)  )
                    var = false;
                else{
                    count++;               
                }
            }                                                    
        }while(var);
        
         if((posX == 10) && (count == 10) && (tmp == 0)){
            return posX+":X"; 
         }else if((count < 10) && (tmp == 0))
            return posX+":"+count;
         else{
            return posX+":-1";
         }
    }
    
    /**
     * Permite determinar las posibles combinaciones posibles
     * @param cod
     * @return List
     */
    public List<String> checkCode(String cod){
        List<String> cods = new ArrayList<>();
        System.out.println("codigo a comprobar "+cod); 
        String info = "";      
        for(int i = 0; i < cod.length(); i++){
            
            for(int j = 0; j <= 9; j++){
                String[] codTmp = cod.split("");                
                codTmp[i] = ""+j;
                String neoCod = "";
                for (String o : codTmp) {
                    neoCod += o; //reordeno el nuevo codigo agregando el nuevo a verfificar                   
                }

                if(isMod11(neoCod)){                    
                    info = i+":"+j+":"+neoCod;
                    cods.add(info);
                }                    
            }
        }            
        return cods;
    }
    
    /**
     * Indica si es correcto el codigo 
     * @param cod
     * @return boolean
     */
    public boolean isMod11(String cod){ 
        //System.out.println("llega a isMod11: "+cod);
        int count = 0;
        for(int i = 0; i< cod.length(); i++){
            if((""+cod.charAt(i)).equals("X")){
                count += (10 - i) * 10;
            }else{
                count += (10 - i) * Integer.parseInt(""+cod.charAt(i));
            }
            
        }
        return (count%11 == 0);
    }
}
