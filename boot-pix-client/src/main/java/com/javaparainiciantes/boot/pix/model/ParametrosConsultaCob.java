/*
 * API Pix
 * A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e conciliação. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços PIX do PSP.  # Evolução da API Pix As seguintes mudanças são esperadas e consideradas retro-compatíveis (_backwards-compatibility_):  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações  Mudanças compatíveis não geram nova versão da API Pix. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  Mudanças incompatíveis geram nova versão da API Pix.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: suporte.ti@bcb.gov.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.javaparainiciantes.boot.pix.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Parâmetros utilizados para a realização de uma consulta de cobranças.
 */
@ApiModel(description = "Parâmetros utilizados para a realização de uma consulta de cobranças.")
@JsonPropertyOrder({
  ParametrosConsultaCob.JSON_PROPERTY_INICIO,
  ParametrosConsultaCob.JSON_PROPERTY_FIM,
  ParametrosConsultaCob.JSON_PROPERTY_CPF,
  ParametrosConsultaCob.JSON_PROPERTY_CNPJ,
  ParametrosConsultaCob.JSON_PROPERTY_STATUS,
  ParametrosConsultaCob.JSON_PROPERTY_PAGINACAO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class ParametrosConsultaCob {
  public static final String JSON_PROPERTY_INICIO = "inicio";
  private OffsetDateTime inicio;

  public static final String JSON_PROPERTY_FIM = "fim";
  private OffsetDateTime fim;

  public static final String JSON_PROPERTY_CPF = "cpf";
  private String cpf = null;

  public static final String JSON_PROPERTY_CNPJ = "cnpj";
  private String cnpj = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CobStatus status = null;

  public static final String JSON_PROPERTY_PAGINACAO = "paginacao";
  private Paginacao paginacao;


  public ParametrosConsultaCob inicio(OffsetDateTime inicio) {
    
    this.inicio = inicio;
    return this;
  }

   /**
   * Data inicial utilizada na consulta. Respeita RFC 3339.
   * @return inicio
  **/
  @ApiModelProperty(example = "2020-04-01T00:00Z", required = true, value = "Data inicial utilizada na consulta. Respeita RFC 3339.")
  @JsonProperty(JSON_PROPERTY_INICIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getInicio() {
    return inicio;
  }


  public void setInicio(OffsetDateTime inicio) {
    this.inicio = inicio;
  }


  public ParametrosConsultaCob fim(OffsetDateTime fim) {
    
    this.fim = fim;
    return this;
  }

   /**
   * Data de fim utilizada na consulta. Respeita RFC 3339.
   * @return fim
  **/
  @ApiModelProperty(example = "2020-04-01T17:00Z", required = true, value = "Data de fim utilizada na consulta. Respeita RFC 3339.")
  @JsonProperty(JSON_PROPERTY_FIM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getFim() {
    return fim;
  }


  public void setFim(OffsetDateTime fim) {
    this.fim = fim;
  }


  public ParametrosConsultaCob cpf(String cpf) {
    
    this.cpf = cpf;
    return this;
  }

   /**
   * Get cpf
   * @return cpf
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCpf() {
    return cpf;
  }


  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  public ParametrosConsultaCob cnpj(String cnpj) {
    
    this.cnpj = cnpj;
    return this;
  }

   /**
   * Get cnpj
   * @return cnpj
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CNPJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCnpj() {
    return cnpj;
  }


  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }


  public ParametrosConsultaCob status(CobStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CobStatus getStatus() {
    return status;
  }


  public void setStatus(CobStatus status) {
    this.status = status;
  }


  public ParametrosConsultaCob paginacao(Paginacao paginacao) {
    
    this.paginacao = paginacao;
    return this;
  }

   /**
   * Get paginacao
   * @return paginacao
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAGINACAO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Paginacao getPaginacao() {
    return paginacao;
  }


  public void setPaginacao(Paginacao paginacao) {
    this.paginacao = paginacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametrosConsultaCob parametrosConsultaCob = (ParametrosConsultaCob) o;
    return Objects.equals(this.inicio, parametrosConsultaCob.inicio) &&
        Objects.equals(this.fim, parametrosConsultaCob.fim) &&
        Objects.equals(this.cpf, parametrosConsultaCob.cpf) &&
        Objects.equals(this.cnpj, parametrosConsultaCob.cnpj) &&
        Objects.equals(this.status, parametrosConsultaCob.status) &&
        Objects.equals(this.paginacao, parametrosConsultaCob.paginacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inicio, fim, cpf, cnpj, status, paginacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosConsultaCob {\n");
    sb.append("    inicio: ").append(toIndentedString(inicio)).append("\n");
    sb.append("    fim: ").append(toIndentedString(fim)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paginacao: ").append(toIndentedString(paginacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

