
package trabajon6;

import java.util.*;
import javax.swing.JOptionPane;


public class directorio {
 private HashMap<String, Cliente> clientes= new HashMap<String,Cliente>();
private ArrayList<Cliente> a=new ArrayList<Cliente>();
 private String numero;
 int validar;
 public boolean agregarCliente(String numero,Cliente cliente){
   if (clientes.get(numero)==null){
       clientes.put(numero, cliente);
    return true;
   }
   else  return false;
   
   
 } 
 public Cliente buscarCliente(String numero){
    if (clientes.containsKey(numero)){return clientes.get(numero);
     }
     return null;}
    
  public String buscarTelefono(String apellido){
       Set <String> numeros=clientes.keySet();
      Iterator<String> it=numeros.iterator();
      while(it.hasNext()){
      numero=it.next();
      Cliente clien=clientes.get(numero);
      if (clien.getApellido().equals(apellido)){
         return numero;
       }
      }
      return "no se encontro un cliente con ese apellido";
     
  }
    
    public ArrayList buscarClientes (String nciudad){
      a.clear();
      Set <String> numeros=clientes.keySet();
      Iterator<String> it=numeros.iterator();
      while(it.hasNext()){
      numero=it.next();
      Cliente clien=clientes.get(numero);
      if(clien.getCiudad().equals(nciudad)){
          a.add(clien);
      }}
      if (a.size()<=0){
          JOptionPane.showMessageDialog(null,"no se a encontrado clientes en esta localidad ");
      }
      return a;
      
    }
    
    
         
      
  
     public boolean borrarCliente(long dni){
      validar=1;
      Set <String> numeros=clientes.keySet();
      Iterator<String> it=numeros.iterator();
      while(it.hasNext()){
      numero=it.next();
      Cliente clien=clientes.get(numero);
     if (clien.getDni()==dni){
         clientes.remove(numero);
        validar=2;
      }} 
    if (!clientes.containsKey(numero)&&validar==2){
        return true;
    }
    else  return false; 
    
     }
}


     
  


    
    

