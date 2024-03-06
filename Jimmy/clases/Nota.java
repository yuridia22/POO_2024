package Jimmy.clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Nota {
  private String texto;
  private String tipo;
  private String fechalimite;
  private String autor;
  private String fecha;
  private Color c;

  public Nota(String texto, String tipo, String fechalimite, String autor, String color, LocalDateTime fecha) {
    c = new Color(color.toLowerCase());
    this.texto = "";
    setTexto(texto);
    setTipo(tipo);
    setFechaLimite(fechalimite);
    setAutor(autor);
    setFecha(fecha);
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getFechaLimite() {
    return fechalimite;
  }

  public void setFechaLimite(String fechalimite) {
    this.fechalimite = fechalimite;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    LocalDateTime fechaactual = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.fecha = fechaactual.format(formato);
  }

  public void agregarTexto(String texto) {
    if (!texto.equals(""))
      this.texto += texto;
    else
      this.texto = texto;
  }

  public void imprimir(int tamanio) {
    String cadena = "";
    String cadena2 = "";
    String linea = "";
    int longitud2 = getTipo().length();

    int longitud = getTexto().length();
    int contador = 0;
    if (tamanio < 15) {
      tamanio = 15;
    }
    if (c.getColorAnci() != null)
      System.out.print(c.getColorAnci());

    for (int i = 0; i < (tamanio + 4); i++) {
      System.out.print("*");
    }
    System.out.println("");

    for (int i = 0; i < (tamanio - 9); i++) {
      cadena += " ";
    }
    System.out.println("*" + cadena + getFecha() + " *");
    cadena = "";

    for (int i = 0; i < tamanio - longitud2; i++) {
      cadena += " ";
    }
    System.out.println("* " + getTipo() + cadena + " *");

    for (int i = 0; i < tamanio + 1; i++) {
      cadena2 += " ";
    }
    System.out.println("*" + cadena2 + " *");

    while (contador < longitud) {
      System.out.print("*");
      linea = "";
      cadena = "";

      for (int i = 0; i < tamanio; i++) {
        if (contador == longitud)
          break;

        linea += getTexto().charAt(contador);
        contador++;
      }

      longitud2 = linea.length();

      if (longitud2 < tamanio - 1) {
        for (int i = 0; i < tamanio - longitud2; i++) {
          cadena += " ";
        }
        System.out.println(" " + linea + cadena + " *");
        break;
      }

      if (linea.charAt(0) == ' ')
        System.out.println(linea + "  *");
      else
        System.out.println(" " + linea + " *");
    }

    cadena = "";
    for (int i = 0; i < tamanio + 1; i++) {
      cadena += " ";
    }
    System.out.println("*" + cadena + " *");

    cadena = "";
    longitud2 = getFechaLimite().length();
    for (int i = 0; i < tamanio - longitud2; i++) {
      cadena += " ";
    }
    System.out.println("* " + getFechaLimite() + cadena + " *");

    cadena = "";
    longitud2 = getAutor().length();
    for (int i = 0; i < tamanio - longitud2; i++) {
      cadena += " ";
    }
    System.out.println("* " + getAutor() + cadena + " *");

    cadena = "";
    for (int i = 0; i < tamanio + 1; i++) {
      cadena += " ";
    }
    System.out.println("*" + cadena + " *");

    for (int i = 0; i < (tamanio + 4); i++) {
      System.out.print("*");
    }
    System.out.println("");
  }
}