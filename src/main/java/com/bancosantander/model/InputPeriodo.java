package com.bancosantander.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InputPeriodo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Pago mínimo TC")
	private java.lang.Integer pagoMinimoTc;
	@org.kie.api.definition.type.Label("Compras acumuladas")
	private java.lang.Integer montoAcumulado;
	@org.kie.api.definition.type.Label("Pago TC")
	private java.lang.Integer pagoTc;
	@org.kie.api.definition.type.Label("Canales Digitales")
	private java.lang.String canalesDigitales;

	/**
	 * Constructor por defecto
	 */
	public InputPeriodo() {
	}
	/**
	 * @return
	 */
	public java.lang.Integer getPagoMinimoTc() {
		return this.pagoMinimoTc;
	}
	/**
	 * @param integer
	 */
	public void setPagoMinimoTc(java.lang.Integer pagoMinimoTc) {
		this.pagoMinimoTc = pagoMinimoTc;
	}
	/**
	 * @return
	 */
	public java.lang.Integer getMontoAcumulado() {
		return this.montoAcumulado;
	}
	/**
	 * @param integer
	 */
	public void setMontoAcumulado(java.lang.Integer montoAcumulado) {
		this.montoAcumulado = montoAcumulado;
	}
	/**
	 * @return
	 */
	public java.lang.Integer getPagoTc() {
		return this.pagoTc;
	}
	/**
	 * @param integer
	 */
	public void setPagoTc(java.lang.Integer pagoTc) {
		this.pagoTc = pagoTc;
	}
	/**
	 * @return
	 */
	public java.lang.String getCanalesDigitales() {
		return this.canalesDigitales;
	}
	/**
	 * @param string
	 */
	public void setCanalesDigitales(java.lang.String canalesDigitales) {
		this.canalesDigitales = canalesDigitales;
	}
	public InputPeriodo(java.lang.Integer pagoMinimoTc,
			java.lang.Integer montoAcumulado, java.lang.Integer pagoTc,
			java.lang.String canalesDigitales) {
		this.pagoMinimoTc = pagoMinimoTc;
		this.montoAcumulado = montoAcumulado;
		this.pagoTc = pagoTc;
		this.canalesDigitales = canalesDigitales;
	}
}