package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaTest {

	private VentaEnEfectivo ventaEnEfectivo;
	private VentaConTarjeta ventaConTarjeta;

	@BeforeEach
	public void setUp() {

		List<Item> items;

		items = new ArrayList<Item>();
		items.add(new Item(new Prenda(8000, new NuevaPrenda(), TipoPrenda.SACO), 1));
		items.add(new Item(new Prenda(4000, new PromocionPrenda(500), TipoPrenda.PANTALON), 1));
		items.add(new Item(new Prenda(2500, new LiquidacionPrenda(), TipoPrenda.CAMISA), 1));

		ventaEnEfectivo = new VentaEnEfectivo(items, LocalDate.now());
		ventaConTarjeta = new VentaConTarjeta(items, LocalDate.now(), 6, 10);
		
	}

	@Test
	public void calcularPagoEnEfectivo() {
		assertEquals(12750.0d, ventaEnEfectivo.importe());
	}

	@Test
	public void calcularPagoConTarjeta() {
		assertEquals(12937.5d,ventaConTarjeta.importe());
	}

}
