package datos;

import java.time.LocalDate;

public class Cuota {
	private long idCuota;
	private double nroCuota;
	private LocalDate fechaVencimiento;
	private double saldoPendiente;
	private double amortizacion;
	private double interesCuota;
	private double cuota;
	private double deuda;
	private boolean cancelada;
	private LocalDate fechaDePago;
	private double punitorios;
	
	private Prestamo prestamo;
	
	public Cuota() {}

	public Cuota(LocalDate fechaVencimiento, double nroCuota, double saldoPendiente, double amortizacion, double interesCuota, double cuota,
			double deuda, boolean cancelada, LocalDate fechaDePago, double punitorios, Prestamo prestamo) {
		super();
		this.fechaVencimiento = fechaVencimiento;
		this.nroCuota = nroCuota;
		this.saldoPendiente = saldoPendiente;
		this.amortizacion = amortizacion;
		this.interesCuota = interesCuota;
		this.cuota = cuota;
		this.deuda = deuda;
		this.cancelada = false;
		this.fechaDePago = fechaDePago;
		this.punitorios = punitorios;
		this.prestamo = prestamo;
	}

	public long getIdCuota() {
		return idCuota;
	}

	protected void setIdCuota(long idCuota) {
		this.idCuota = idCuota;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public double getInteresCuota() {
		return interesCuota;
	}

	public void setInteresCuota(double interesCuota) {
		this.interesCuota = interesCuota;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	public LocalDate getFechaDePago() {
		return fechaDePago;
	}

	public void setFechaDePago(LocalDate fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	public double getPunitorios() {
		return punitorios;
	}

	public void setPunitorios(double punitorios) {
		this.punitorios = punitorios;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public String toString() {
		return "Cuota [idCuota=" + idCuota + ", fechaVencimiento=" + fechaVencimiento + ", amortizacion=" + amortizacion
				+ ", interesCuota=" + interesCuota + ", cuota=" + cuota + ", deuda=" + deuda
				+ ", cancelada=" + cancelada + ", fechaDePago=" + fechaDePago + ", punitorios=" + punitorios
				+ ", prestamo=" + prestamo + "]";
	}

	public double getSaldoPendiente() {
		return saldoPendiente;
	}

	public void setSaldoPendiente(double saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}

	public double getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(double nroCuota) {
		this.nroCuota = nroCuota;
	}
	
	
}