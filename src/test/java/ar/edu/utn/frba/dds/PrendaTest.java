package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrendaTest {

	private Prenda saco;
	private Prenda pantalon;
	private Prenda camisa;
	private NuevaPrenda nuevaPrenda;
	private PromocionPrenda promocionPrenda;
	private LiquidacionPrenda liquidacionPrenda;

	@BeforeEach
	public void setUp() {

		nuevaPrenda = new NuevaPrenda();
		promocionPrenda = new PromocionPrenda(500);
		liquidacionPrenda = new LiquidacionPrenda();

		saco = new Prenda(8000, nuevaPrenda, TipoPrenda.SACO);
		pantalon = new Prenda(4000, promocionPrenda, TipoPrenda.PANTALON);
		camisa = new Prenda(2500, liquidacionPrenda, TipoPrenda.CAMISA);

	}

	@Test
	public void getPrecioNuevaPrenda() {
		//Assert.assertTrue(saco.getPrecio() == 8000.0);
		assertEquals(8000.0d, saco.getPrecio());
	}

	@Test
	public void getPrecioPromocionPrenda() {
		//Assert.assertTrue(pantalon.getPrecio() == 3500.0);
		assertEquals(3500.0d, pantalon.getPrecio());
	}

	@Test
	public void getPrecioLiquidacionPrenda() {
		//Assert.assertTrue(camisa.getPrecio() == 1250.0);
		assertEquals(1250.0d, camisa.getPrecio());
	}
	
	@Test
	public void verificacionPrendatipoSaco() {
		//Assert.assertTrue(saco.getTipo() == TipoPrenda.SACO);
		assertEquals(TipoPrenda.SACO,saco.getTipo());
	}
	
	@Test
	public void verificacionPrendatipoPantalon() {
		//Assert.assertTrue(pantalon.getTipo() == TipoPrenda.PANTALON);
		assertEquals(TipoPrenda.PANTALON,pantalon.getTipo());
	}
	
	@Test
	public void verificacionPrendatipoCamisa() {
		//Assert.assertTrue(camisa.getTipo() == TipoPrenda.CAMISA);
		assertEquals(TipoPrenda.CAMISA, camisa.getTipo());
	}

}