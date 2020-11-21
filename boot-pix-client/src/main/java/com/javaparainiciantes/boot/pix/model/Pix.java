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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

/**
 * Pix
 */
@JsonPropertyOrder({
  Pix.JSON_PROPERTY_END_TO_END_ID,
  Pix.JSON_PROPERTY_TXID,
  Pix.JSON_PROPERTY_VALOR,
  Pix.JSON_PROPERTY_HORARIO,
  Pix.JSON_PROPERTY_PAGADOR,
  Pix.JSON_PROPERTY_INFO_PAGADOR,
  Pix.JSON_PROPERTY_DEVOLUCOES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class Pix {
  public static final String JSON_PROPERTY_END_TO_END_ID = "endToEndId";
  private String endToEndId;

  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_VALOR = "valor";
  private String valor = null;

  public static final String JSON_PROPERTY_HORARIO = "horario";
  private OffsetDateTime horario;

  public static final String JSON_PROPERTY_PAGADOR = "pagador";
  private Pessoa pagador = null;

  public static final String JSON_PROPERTY_INFO_PAGADOR = "infoPagador";
  private String infoPagador;

  public static final String JSON_PROPERTY_DEVOLUCOES = "devolucoes";
  private List<Devolucao> devolucoes = null;


  public Pix endToEndId(String endToEndId) {
    
    this.endToEndId = endToEndId;
    return this;
  }

   /**
   * EndToEndIdentification que transita na PACS002, PACS004 e PACS008
   * @return endToEndId
  **/
  @ApiModelProperty(required = true, value = "EndToEndIdentification que transita na PACS002, PACS004 e PACS008")
  @JsonProperty(JSON_PROPERTY_END_TO_END_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndToEndId() {
    return endToEndId;
  }


  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }


  public Pix txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * # Identificador da transação  O campo txid, obrigatório, determina o identificador da transação. O objetivo desse campo é ser um elemento que possibilite ao PSP do recebedor apresentar ao usuário recebedor a funcionalidade de conciliação de pagamentos.  Na pacs.008, é referenciado como &#x60;TransactionIdentification &lt;txId&gt;&#x60; ou &#x60;idConciliacaoRecebedor&#x60;. O preenchimento do campo txid é limitado a 35 caracteres na pacs.008.  Em termos de fluxo de funcionamento, o txid é lido pelo aplicativo do PSP do pagador e,  depois de confirmado o pagamento, é enviado para o SPI via pacs.008.  Uma pacs.008 também é enviada ao PSP do recebedor, contendo, além de todas as informações usuais  do pagamento, o txid. Ao perceber um recebimento dotado de txid, o PSP do recebedor está apto a se comunicar com o usuário recebedor,  informando que um pagamento específico foi liquidado.  O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. O txid, no contexto de representação de uma cobrança, é único por CPF/CNPJ do usuário recebedor. Cabe ao  PSP recebedor validar essa regra na API PIX. 
   * @return txid
  **/
  @Nullable
  @ApiModelProperty(value = "# Identificador da transação  O campo txid, obrigatório, determina o identificador da transação. O objetivo desse campo é ser um elemento que possibilite ao PSP do recebedor apresentar ao usuário recebedor a funcionalidade de conciliação de pagamentos.  Na pacs.008, é referenciado como `TransactionIdentification <txId>` ou `idConciliacaoRecebedor`. O preenchimento do campo txid é limitado a 35 caracteres na pacs.008.  Em termos de fluxo de funcionamento, o txid é lido pelo aplicativo do PSP do pagador e,  depois de confirmado o pagamento, é enviado para o SPI via pacs.008.  Uma pacs.008 também é enviada ao PSP do recebedor, contendo, além de todas as informações usuais  do pagamento, o txid. Ao perceber um recebimento dotado de txid, o PSP do recebedor está apto a se comunicar com o usuário recebedor,  informando que um pagamento específico foi liquidado.  O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. O txid, no contexto de representação de uma cobrança, é único por CPF/CNPJ do usuário recebedor. Cabe ao  PSP recebedor validar essa regra na API PIX. ")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public Pix valor(String valor) {
    
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValor() {
    return valor;
  }


  public void setValor(String valor) {
    this.valor = valor;
  }


  public Pix horario(OffsetDateTime horario) {
    
    this.horario = horario;
    return this;
  }

   /**
   * Horário em que o Pix foi processado no PSP.
   * @return horario
  **/
  @ApiModelProperty(required = true, value = "Horário em que o Pix foi processado no PSP.")
  @JsonProperty(JSON_PROPERTY_HORARIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getHorario() {
    return horario;
  }


  public void setHorario(OffsetDateTime horario) {
    this.horario = horario;
  }


  public Pix pagador(Pessoa pagador) {
    
    this.pagador = pagador;
    return this;
  }

   /**
   * Get pagador
   * @return pagador
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGADOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pessoa getPagador() {
    return pagador;
  }


  public void setPagador(Pessoa pagador) {
    this.pagador = pagador;
  }


  public Pix infoPagador(String infoPagador) {
    
    this.infoPagador = infoPagador;
    return this;
  }

   /**
   * Get infoPagador
   * @return infoPagador
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFO_PAGADOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInfoPagador() {
    return infoPagador;
  }


  public void setInfoPagador(String infoPagador) {
    this.infoPagador = infoPagador;
  }


  public Pix devolucoes(List<Devolucao> devolucoes) {
    
    this.devolucoes = devolucoes;
    return this;
  }

  public Pix addDevolucoesItem(Devolucao devolucoesItem) {
    if (this.devolucoes == null) {
      this.devolucoes = new ArrayList<>();
    }
    this.devolucoes.add(devolucoesItem);
    return this;
  }

   /**
   * Get devolucoes
   * @return devolucoes
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVOLUCOES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Devolucao> getDevolucoes() {
    return devolucoes;
  }


  public void setDevolucoes(List<Devolucao> devolucoes) {
    this.devolucoes = devolucoes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pix pix = (Pix) o;
    return Objects.equals(this.endToEndId, pix.endToEndId) &&
        Objects.equals(this.txid, pix.txid) &&
        Objects.equals(this.valor, pix.valor) &&
        Objects.equals(this.horario, pix.horario) &&
        Objects.equals(this.pagador, pix.pagador) &&
        Objects.equals(this.infoPagador, pix.infoPagador) &&
        Objects.equals(this.devolucoes, pix.devolucoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndId, txid, valor, horario, pagador, infoPagador, devolucoes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pix {\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    horario: ").append(toIndentedString(horario)).append("\n");
    sb.append("    pagador: ").append(toIndentedString(pagador)).append("\n");
    sb.append("    infoPagador: ").append(toIndentedString(infoPagador)).append("\n");
    sb.append("    devolucoes: ").append(toIndentedString(devolucoes)).append("\n");
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

