package br.edu.ifmt.tga.notasmvc;
    
import br.edu.ifmt.tga.notasmvc.view.ViewMB;
import br.edu.ifmt.tga.notasmvc.view.ViewMA;
import br.edu.ifmt.tga.notasmvc.view.ViewMain;

    public class NotasMVC {
        
               
        public static void main(String[] args) {        
            ViewMain v = new ViewMain();
            v.setVisible(true);
            v.setLocationRelativeTo(null);
            
        }
        
        public void calc() {        
            ViewMain v = new ViewMain();
            v.setVisible(true);
            v.setLocationRelativeTo(null);
            
        }
        
        public void bimestral(){
            ViewMB vmb = new ViewMB();
            vmb.setVisible(true);
            vmb.setLocationRelativeTo(null);
            
        }
    
        public void anual(){
            ViewMA vmf = new ViewMA();
            vmf.setVisible(true);
            vmf.setLocationRelativeTo(null);
            
        }
    
}
