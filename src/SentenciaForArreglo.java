import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombre = {"Manuel", "Anderson", "Lola", "Rosa", "Milo", "Carlos", "Michael", "Lucas"};
        int count = nombre.length;
        for (int i = 0; i < count; i++) {
            //para ignorar algún dato
            if (nombre[i].equalsIgnoreCase("anderson") || nombre[i].equalsIgnoreCase("carlos")) {
                continue;
            }
            System.out.println(i + ") " + nombre[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, " +
                "ejemplo \"Manuel\" o \"Milo\" o \"Rosa\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i < count; i++) {
            if (nombre[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println(i + ") " + nombre[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
