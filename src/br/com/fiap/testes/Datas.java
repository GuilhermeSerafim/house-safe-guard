package br.com.fiap.testes;

import java.sql.Date;

public interface Datas {
	  public static java.sql.Date converteParaBanco(Date data) {
          return new java.sql.Date(data.getTime());
  }

 public static Date converteDoBanco(java.sql.Date data) {
          return new Date(data.getTime());
 }

}
