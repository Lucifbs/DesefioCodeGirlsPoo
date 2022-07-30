package br.com.dio.desafio;

public class Curso {
     private String titulo;
     private String descricao;
     private int cargaHorario;

     public String getTitulo() {
          return titulo;
     }

     public String getDescricao() {
          return descricao;
     }

     public int getCargaHorario() {
          return cargaHorario;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public void setCargaHorario(int cargaHorario) {
          this.cargaHorario = cargaHorario;
     }

     @Override
     public String toString() {
          return "Curso{" +
                  "titulo='" + titulo + '\'' +
                  ", descricao='" + descricao + '\'' +
                  ", cargaHorario=" + cargaHorario +
                  '}';
     }
}


