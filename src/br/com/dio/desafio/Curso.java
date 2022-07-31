package br.com.dio.desafio;

public class Curso extends Conteudo{

          private int cargaHorario;
     @Override
     public double calcularXp() {
          return XP_PADRAO * cargaHorario;
     }

     public Curso() {

     }

     public int getCargaHorario() {
          return cargaHorario;
     }

     public void setCargaHorario(int cargaHorario) {
          this.cargaHorario = cargaHorario;
     }

     @Override
     public String toString() {
          return "Curso{" +
                  "titulo='" + getTitulo() + '\'' +
                  ", descricao='" + getDescricao() + '\'' +
                  ", cargaHorario=" + cargaHorario +
                  '}';
     }

}


