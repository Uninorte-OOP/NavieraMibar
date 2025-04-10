/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.client.ClienteJuridico;
import core.client.ClienteNatural;
import core.naviera.NavieraMibar;
import core.naviera.items.Bulto;
import core.naviera.ship.BarcoAlquilado;
import core.naviera.ship.BarcoPropio;
import core.naviera.trip.Ruta;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class MainParcial2250 {
    
    public static void main(String[] args) {
        ArrayList<String> ciudades;
        ArrayList<Double> latitudes;
        ArrayList<Double> longitudes;
        ArrayList<Bulto> inventario;

        NavieraMibar naviera = new NavieraMibar();

        naviera.addCliente(new ClienteNatural(697302, "John Doe", "Transversal 1 # 23-45", "3001234567", "Argentina"));
        naviera.addCliente(new ClienteNatural(320109, "Jane Smith", "Carrera 7 # 45-67", "3109876543", "Bolivia"));
        naviera.addCliente(new ClienteNatural(614613, "Carlos Perez", "Calle 10 # 12-34", "3012345678", "Chile"));
        naviera.addCliente(new ClienteNatural(195690, "Maria Garcia", "Avenida 5 # 23-45", "3023456789", "Mexico"));
        naviera.addCliente(new ClienteNatural(854944, "Luis Martinez", "Diagonal 3 # 67-89", "3034567890", "Venezuela"));
        naviera.addCliente(new ClienteNatural(928210, "Ana Torres", "Calle 20 # 11-22", "3045678901", "Paraguay"));
        naviera.addCliente(new ClienteNatural(156458, "Pedro Gomez", "Avenida 8 # 33-44", "3056789012", "Ecuador"));
        naviera.addCliente(new ClienteNatural(504434, "Laura Lopez", "Transversal 2 # 55-66", "3067890123", "Venezuela"));
        naviera.addCliente(new ClienteNatural(932442, "Javier Sanchez", "Carrera 9 # 77-88", "3078901234", "Argentina"));
        naviera.addCliente(new ClienteNatural(707470, "Sofia Ramirez", "Calle 15 # 99-00", "3089012345", "Mexico"));
        naviera.addCliente(new ClienteNatural(867186, "Andres Morales", "Avenida 12 # 21-32", "3090123456", "Uruguay"));
        naviera.addCliente(new ClienteNatural(731922, "Valentina Castro", "Diagonal 4 # 43-54", "3101234567", "Mexico"));
        naviera.addCliente(new ClienteNatural(109521, "Diego Herrera", "Calle 30 # 65-76", "3112345678", "Peru"));
        naviera.addCliente(new ClienteNatural(284464, "Camila Ruiz", "Transversal 6 # 87-98", "3123456789", "Chile"));
        naviera.addCliente(new ClienteNatural(518605, "Felipe Jimenez", "Carrera 11 # 09-10", "3134567890", "Peru"));

        naviera.addCliente(new ClienteJuridico(28255095, "Empresa Uno S.A.S", "Calle 1 # 23-45", "3001234567", "Mexico", 917210, "Juan Perez", "3109876543"));
        naviera.addCliente(new ClienteJuridico(52441827, "Corporacion Dos Ltda", "Carrera 7 # 45-67", "3109876543", "Peru", 694296, "Maria Gomez", "3012345678"));
        naviera.addCliente(new ClienteJuridico(78566173, "S.A.S Tres y Asociados", "Calle 10 # 12-34", "3012345678", "Colombia", 397202, "Carlos Torres", "3023456789"));  
        naviera.addCliente(new ClienteJuridico(22147535, "Inversiones Cuatro S.A.", "Avenida 5 # 23-45", "3023456789", "Argentina", 693994, "Luis Martinez", "3034567890"));
        naviera.addCliente(new ClienteJuridico(61219369, "Servicios Cinco Ltda", "Diagonal 3 # 67-89", "3034567890", "Chile", 411975, "Ana Torres", "3045678901"));        

        naviera.addBarco(new BarcoPropio(74145, "El poderoso", true, "Juan Perez"));
        naviera.addBarco(new BarcoPropio(99676, "El veloz", false, "Maria Gomez"));
        naviera.addBarco(new BarcoPropio(21540, "El fuerte", false, "Carlos Sanchez"));
        naviera.addBarco(new BarcoPropio(29626, "El audaz", true, "Ana Torres"));
        naviera.addBarco(new BarcoPropio(88492, "El valiente", false, "Luis Martinez"));
        naviera.addBarco(new BarcoPropio(61681, "El astuto", false, "Pedro Gomez"));
        naviera.addBarco(new BarcoPropio(63755, "El sabio", false, "Laura Lopez"));
        naviera.addBarco(new BarcoPropio(12875, "El inteligente", false, "Javier Sanchez"));
        naviera.addBarco(new BarcoPropio(67702, "El astuto", true, "Sofia Ramirez"));
        naviera.addBarco(new BarcoPropio(52655, "El ingenioso", true, "Andres Morales"));

        naviera.addBarco(new BarcoAlquilado(18098, "El alquilado", false, "Valentina Castro", "Empresa Uno S.A.S", LocalDate.of(2023, 11, 3), 8));
        naviera.addBarco(new BarcoAlquilado(24889, "El arrendado", false, "Diego Herrera", "Corporacion Dos Ltda", LocalDate.of(2023, 11, 7), 11));
        naviera.addBarco(new BarcoAlquilado(21039, "El rentado", false, "Camila Ruiz", "S.A.S Tres y Asociados", LocalDate.of(2023, 9, 14), 19));
        naviera.addBarco(new BarcoAlquilado(99548, "El prestado", false, "Felipe Jimenez", "Inversiones Cuatro S.A.", LocalDate.of(2023, 2, 5), 4));
        naviera.addBarco(new BarcoAlquilado(30781, "El cedido", false, "Juan Perez", "Servicios Cinco Ltda", LocalDate.of(2023, 12, 10), 9));

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Cali");
        latitudes.add(-25.75248);
        longitudes.add(-125.10794);
        ciudades.add("Cali");
        latitudes.add(-7.79911);
        longitudes.add(-74.02154);
        ciudades.add("Belo Horizonte");
        latitudes.add(-6.53056);
        longitudes.add(-65.65727);
        ciudades.add("Caracas");
        latitudes.add(-18.26092);
        longitudes.add(-65.38585);
        ciudades.add("Rosario");
        latitudes.add(-27.70955);
        longitudes.add(-114.19499);
        ciudades.add("Cordoba");
        latitudes.add(14.37494);
        longitudes.add(-78.59318);
        ciudades.add("Cartagena");
        latitudes.add(-24.57925);
        longitudes.add(-61.69182);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Tarija");
        latitudes.add(8.27436);
        longitudes.add(-56.41118);
        ciudades.add("Sao Paulo");
        latitudes.add(3.51570);
        longitudes.add(-86.96589);
        ciudades.add("Cartagena");
        latitudes.add(-14.74366);
        longitudes.add(-91.09954);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Maracaibo");
        latitudes.add(-5.73564);
        longitudes.add(-78.52326);
        ciudades.add("Sao Paulo");
        latitudes.add(-18.24280);
        longitudes.add(-49.24761);
        ciudades.add("Sao Paulo");
        latitudes.add(16.74042);
        longitudes.add(-60.74755);
        ciudades.add("Mendoza");
        latitudes.add(-33.78174);
        longitudes.add(-74.81598);
        ciudades.add("Sucre");
        latitudes.add(8.91812);
        longitudes.add(-100.10583);
        ciudades.add("Potosi");
        latitudes.add(-4.84566);
        longitudes.add(-115.34480);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Salvador");
        latitudes.add(-10.33519);
        longitudes.add(-92.72883);
        ciudades.add("Potosi");
        latitudes.add(-33.75531);
        longitudes.add(-63.88019);
        ciudades.add("Rosario");
        latitudes.add(29.49981);
        longitudes.add(-61.98607);
        ciudades.add("Oruro");
        latitudes.add(-2.27772);
        longitudes.add(-89.71136);
        ciudades.add("Fortaleza");
        latitudes.add(-16.90272);
        longitudes.add(-120.33892);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Sao Paulo");
        latitudes.add(-23.09206);
        longitudes.add(-81.33840);
        ciudades.add("Pando");
        latitudes.add(-43.43384);
        longitudes.add(-96.05119);
        ciudades.add("Maracay");
        latitudes.add(-8.08690);
        longitudes.add(-103.31823);
        ciudades.add("Montevideo");
        latitudes.add(-47.06325);
        longitudes.add(-100.34084);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Cordoba");
        latitudes.add(-11.21272);
        longitudes.add(-71.71425);
        ciudades.add("Mendoza");
        latitudes.add(-26.76318);
        longitudes.add(-99.58167);
        ciudades.add("San Miguel de Tucuman");
        latitudes.add(-44.12263);
        longitudes.add(-64.76471);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Rosario");
        latitudes.add(1.43549);
        longitudes.add(-104.44550);
        ciudades.add("Oruro");
        latitudes.add(-25.14523);
        longitudes.add(-106.09773);
        ciudades.add("Fortaleza");
        latitudes.add(-20.77713);
        longitudes.add(-59.47119);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Oruro");
        latitudes.add(22.36227);
        longitudes.add(-78.69293);
        ciudades.add("Rio de Janeiro");
        latitudes.add(-47.65546);
        longitudes.add(-90.59643);
        ciudades.add("Barranquilla");
        latitudes.add(-17.74718);
        longitudes.add(-113.26961);
        ciudades.add("Cali");
        latitudes.add(-10.56656);
        longitudes.add(-57.62903);
        ciudades.add("Cartagena");
        latitudes.add(-2.72274);
        longitudes.add(-72.67659);
        ciudades.add("Maracaibo");
        latitudes.add(-9.32448);
        longitudes.add(-90.74924);
        ciudades.add("La Plata");
        latitudes.add(-16.80422);
        longitudes.add(-79.09693);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Pando");
        latitudes.add(-18.23168);
        longitudes.add(-73.88201);
        ciudades.add("Rosario");
        latitudes.add(-15.64720);
        longitudes.add(-69.11078);
        ciudades.add("Ciudad de Mexico");
        latitudes.add(-23.58181);
        longitudes.add(-59.95892);
        ciudades.add("Rio de Janeiro");
        latitudes.add(-11.02508);
        longitudes.add(-82.58748);
        ciudades.add("Maracaibo");
        latitudes.add(8.64752);
        longitudes.add(-57.45512);
        ciudades.add("Medellin");
        latitudes.add(-3.97549);
        longitudes.add(-39.57102);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Salvador");
        latitudes.add(-25.23771);
        longitudes.add(-78.35245);
        ciudades.add("Rio de Janeiro");
        latitudes.add(-42.34958);
        longitudes.add(-42.01566);
        ciudades.add("Sao Paulo");
        latitudes.add(8.76674);
        longitudes.add(-86.17173);
        ciudades.add("Asuncion");
        latitudes.add(-30.84767);
        longitudes.add(-118.71450);
        ciudades.add("Maracaibo");
        latitudes.add(-21.28434);
        longitudes.add(-57.56349);
        ciudades.add("Sao Paulo");
        latitudes.add(-16.89629);
        longitudes.add(-52.65850);
        ciudades.add("Lima");
        latitudes.add(-17.88476);
        longitudes.add(-78.09954);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("Lima");
        latitudes.add(28.69633);
        longitudes.add(-74.72357);
        ciudades.add("San Miguel de Tucuman");
        latitudes.add(-16.67225);
        longitudes.add(-61.20870);
        ciudades.add("Oruro");
        latitudes.add(-12.87978);
        longitudes.add(-82.11161);
        ciudades.add("Quito");
        latitudes.add(-3.57867);
        longitudes.add(-57.93489);
        ciudades.add("La Plata");
        latitudes.add(11.70260);
        longitudes.add(-50.58160);
        ciudades.add("Tarija");
        latitudes.add(18.11980);
        longitudes.add(-88.47351);
        ciudades.add("Maracay");
        latitudes.add(13.22256);
        longitudes.add(-43.79735);
        naviera.addRuta(ciudades, latitudes, longitudes);

        ciudades = new ArrayList<>();
        latitudes = new ArrayList<>();
        longitudes = new ArrayList<>();
        ciudades.add("La Plata");
        latitudes.add(-29.22624);
        longitudes.add(-65.63422);
        ciudades.add("Santa Cruz");
        latitudes.add(-26.08406);
        longitudes.add(-96.42572);
        ciudades.add("Caracas");
        latitudes.add(-23.70243);
        longitudes.add(-106.52606);
        ciudades.add("Rosario");
        latitudes.add(12.31775);
        longitudes.add(-76.82981);
        ciudades.add("Ciudad de Mexico");
        latitudes.add(-9.29137);
        longitudes.add(-62.69483);
        ciudades.add("Santa Cruz");
        latitudes.add(-44.78849);
        longitudes.add(-86.00495);
        naviera.addRuta(ciudades, latitudes, longitudes);

        naviera.addViaje(0, naviera.getBarco(29626), naviera.getRuta(6), LocalDate.of(2024, 7, 4), 16);
        naviera.addViaje(1, naviera.getBarco(63755), naviera.getRuta(7), LocalDate.of(2024, 9, 4), 46);
        naviera.addViaje(2, naviera.getBarco(61681), naviera.getRuta(0), LocalDate.of(2024, 8, 17), 51);
        naviera.addViaje(3, naviera.getBarco(52655), naviera.getRuta(3), LocalDate.of(2024, 7, 7), 44);
        naviera.addViaje(4, naviera.getBarco(52655), naviera.getRuta(5), LocalDate.of(2024, 3, 4), 27);
        naviera.addViaje(5, naviera.getBarco(67702), naviera.getRuta(3), LocalDate.of(2024, 4, 27), 22);
        naviera.addViaje(6, naviera.getBarco(24889), naviera.getRuta(5), LocalDate.of(2024, 1, 13), 70);
        naviera.addViaje(7, naviera.getBarco(30781), naviera.getRuta(9), LocalDate.of(2024, 7, 10), 56);
        naviera.addViaje(8, naviera.getBarco(24889), naviera.getRuta(5), LocalDate.of(2024, 8, 23), 82);
        naviera.addViaje(9, naviera.getBarco(18098), naviera.getRuta(5), LocalDate.of(2024, 10, 3), 48);
        naviera.addViaje(10, naviera.getBarco(12875), naviera.getRuta(9), LocalDate.of(2024, 5, 4), 19);
        naviera.addViaje(11, naviera.getBarco(21039), naviera.getRuta(5), LocalDate.of(2024, 1, 20), 68);
        naviera.addViaje(12, naviera.getBarco(99676), naviera.getRuta(4), LocalDate.of(2024, 2, 28), 86);
        naviera.addViaje(13, naviera.getBarco(99676), naviera.getRuta(5), LocalDate.of(2024, 4, 20), 21);
        naviera.addViaje(14, naviera.getBarco(24889), naviera.getRuta(3), LocalDate.of(2024, 10, 4), 70);
        naviera.addViaje(15, naviera.getBarco(30781), naviera.getRuta(2), LocalDate.of(2024, 11, 20), 51);
        naviera.addViaje(16, naviera.getBarco(67702), naviera.getRuta(10), LocalDate.of(2024, 2, 8), 19);
        naviera.addViaje(17, naviera.getBarco(63755), naviera.getRuta(0), LocalDate.of(2024, 7, 17), 44);
        naviera.addViaje(18, naviera.getBarco(30781), naviera.getRuta(5), LocalDate.of(2024, 7, 15), 74);
        naviera.addViaje(19, naviera.getBarco(30781), naviera.getRuta(0), LocalDate.of(2024, 8, 6), 83);
        naviera.addViaje(20, naviera.getBarco(88492), naviera.getRuta(5), LocalDate.of(2024, 6, 10), 75);
        naviera.addViaje(21, naviera.getBarco(30781), naviera.getRuta(6), LocalDate.of(2024, 4, 7), 56);
        naviera.addViaje(22, naviera.getBarco(52655), naviera.getRuta(2), LocalDate.of(2024, 7, 24), 21);
        naviera.addViaje(23, naviera.getBarco(21039), naviera.getRuta(2), LocalDate.of(2024, 9, 6), 36);
        naviera.addViaje(24, naviera.getBarco(99548), naviera.getRuta(4), LocalDate.of(2024, 7, 20), 65);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(583024, "Muebles", 86.47, 1.49, 6.00, 6.61));
        inventario.add(new Bulto(101074, "Medicamentos", 8.29, 7.02, 5.72, 9.22));
        inventario.add(new Bulto(557782, "Maquinaria Pesada", 29.67, 0.74, 0.97, 6.07));
        naviera.getCliente(697302).createCarga("Puerto de Turbo", "Puerto de San Vicente", LocalDate.of(2024, 12, 22), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(623707, "Juguetes", 90.11, 3.43, 3.34, 0.89));
        naviera.getCliente(697302).createCarga("Puerto de Iquique", "Puerto de San Vicente", LocalDate.of(2024, 12, 17), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(667132, "Productos Farmaceuticos", 51.46, 6.40, 8.94, 0.93));
        inventario.add(new Bulto(969036, "Tecnologia", 61.89, 6.90, 9.58, 4.77));
        inventario.add(new Bulto(353108, "Combustible", 6.06, 1.00, 9.97, 6.62));
        naviera.getCliente(697302).createCarga("Puerto de San Pablo", "Puerto de San Andres", LocalDate.of(2024, 9, 16), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(563922, "Juguetes", 5.06, 0.31, 5.16, 8.05));
        naviera.getCliente(697302).createCarga("Puerto de San Vicente", "Puerto de San Vicente de la Sonsierra", LocalDate.of(2024, 5, 18), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(812104, "Medicamentos", 4.40, 2.82, 5.07, 2.07));
        inventario.add(new Bulto(110034, "Maquinaria Pesada", 46.51, 0.59, 8.69, 0.44));
        inventario.add(new Bulto(844994, "Ropa", 29.30, 2.34, 4.02, 2.46));
        naviera.getCliente(697302).createCarga("Puerto de Antofagasta", "Puerto de Cartagena", LocalDate.of(2024, 4, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(860674, "Combustible", 97.57, 4.15, 4.30, 5.37));
        inventario.add(new Bulto(184184, "Combustible", 89.63, 1.74, 1.99, 7.13));
        naviera.getCliente(697302).createCarga("Puerto de San Vicente de la Yedra", "Puerto de San Vicente", LocalDate.of(2024, 6, 2), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(863010, "Alimentos", 44.98, 4.94, 4.41, 2.78));
        naviera.getCliente(697302).createCarga("Puerto de San Vicente de la Sierra", "Puerto de San Pedro", LocalDate.of(2024, 12, 19), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(195870, "Material de Construccion", 79.79, 7.41, 0.89, 8.70));
        inventario.add(new Bulto(178730, "Material de Construccion", 92.29, 6.40, 9.79, 1.28));
        inventario.add(new Bulto(521236, "Articulos de Oficina", 46.46, 9.49, 7.89, 7.37));
        naviera.getCliente(697302).createCarga("Puerto de Valparaiso", "Puerto de Cartagena", LocalDate.of(2024, 1, 20), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(142171, "Vehiculos", 64.17, 0.23, 6.02, 4.70));
        inventario.add(new Bulto(245797, "Combustible", 75.82, 3.82, 2.42, 0.83));
        inventario.add(new Bulto(838080, "Productos Farmaceuticos", 25.55, 6.40, 0.22, 2.08));
        inventario.add(new Bulto(306506, "Ropa", 19.19, 4.80, 4.44, 4.13));
        naviera.getCliente(320109).createCarga("Puerto de Tumaco", "Puerto de Buenaventura", LocalDate.of(2024, 11, 14), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(980959, "Productos Farmaceuticos", 10.59, 6.56, 3.63, 2.82));
        inventario.add(new Bulto(882239, "Material de Construccion", 7.21, 9.94, 8.09, 2.23));
        inventario.add(new Bulto(586967, "Maquinaria Pesada", 89.00, 5.55, 6.52, 1.07));
        inventario.add(new Bulto(834473, "Material de Construccion", 32.83, 3.57, 9.97, 7.90));
        inventario.add(new Bulto(398753, "Material de Construccion", 12.76, 6.62, 5.64, 7.47));
        naviera.getCliente(320109).createCarga("Puerto de San Vicente de Chucuri", "Puerto de Santa Marta", LocalDate.of(2024, 8, 5), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(684021, "Medicamentos", 99.47, 2.06, 7.88, 2.55));
        inventario.add(new Bulto(632736, "Ropa", 36.65, 2.12, 8.08, 3.65));
        inventario.add(new Bulto(150155, "Articulos de Oficina", 3.71, 9.25, 6.10, 5.11));
        inventario.add(new Bulto(699973, "Medicamentos", 81.47, 9.94, 6.57, 4.41));
        inventario.add(new Bulto(263250, "Productos Quimicos", 60.84, 7.24, 2.53, 4.87));
        naviera.getCliente(320109).createCarga("Puerto de San Vicente de Chucuri", "Puerto de Turbo", LocalDate.of(2024, 5, 2), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(107090, "Material de Construccion", 53.76, 3.66, 8.54, 9.46));
        inventario.add(new Bulto(806683, "Combustible", 82.09, 5.06, 0.66, 6.39));
        naviera.getCliente(320109).createCarga("Puerto de Barranquilla", "Puerto de Covenas", LocalDate.of(2024, 6, 14), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(959255, "Productos Quimicos", 7.87, 1.76, 4.28, 7.05));
        inventario.add(new Bulto(492712, "Juguetes", 38.18, 4.89, 7.44, 8.62));
        inventario.add(new Bulto(604353, "Material de Construccion", 62.95, 2.92, 5.44, 2.04));
        naviera.getCliente(320109).createCarga("Puerto de Covenas", "Puerto de San Vicente de la Sonsierra", LocalDate.of(2024, 2, 17), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(292060, "Productos Quimicos", 5.97, 5.41, 7.63, 8.83));
        inventario.add(new Bulto(992596, "Productos Quimicos", 81.53, 8.36, 8.90, 9.73));
        inventario.add(new Bulto(605956, "Articulos de Oficina", 74.30, 8.61, 6.72, 2.94));
        inventario.add(new Bulto(401734, "Tecnologia", 9.46, 1.32, 8.02, 3.25));
        inventario.add(new Bulto(770159, "Alimentos", 29.35, 0.56, 0.85, 5.84));
        naviera.getCliente(614613).createCarga("Puerto de San Pablo", "Puerto de San Vicente de la Sonsierra", LocalDate.of(2024, 5, 16), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(685872, "Muebles", 21.90, 4.40, 3.86, 0.33));
        inventario.add(new Bulto(246898, "Medicamentos", 26.98, 7.38, 1.30, 0.81));
        inventario.add(new Bulto(760730, "Medicamentos", 4.35, 3.67, 6.46, 0.60));
        inventario.add(new Bulto(542581, "Muebles", 80.42, 1.32, 1.25, 7.13));
        inventario.add(new Bulto(320458, "Medicamentos", 77.17, 7.86, 1.41, 0.74));
        naviera.getCliente(614613).createCarga("Puerto de San Pedro", "Puerto de Cartagena", LocalDate.of(2024, 6, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(782300, "Alimentos", 35.09, 8.73, 9.79, 2.91));
        inventario.add(new Bulto(886147, "Juguetes", 62.18, 3.46, 2.08, 2.80));
        inventario.add(new Bulto(602378, "Electrodomesticos", 65.65, 5.03, 5.43, 5.05));
        inventario.add(new Bulto(860119, "Alimentos", 65.62, 8.15, 3.56, 5.30));
        inventario.add(new Bulto(895661, "Material de Construccion", 38.48, 3.44, 5.95, 8.26));
        naviera.getCliente(614613).createCarga("Puerto de Tumaco", "Puerto de Concepcion", LocalDate.of(2024, 5, 20), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(522294, "Herramientas", 97.96, 4.91, 4.01, 1.27));
        inventario.add(new Bulto(140712, "Vehiculos", 65.25, 2.70, 4.98, 7.19));
        inventario.add(new Bulto(315370, "Vehiculos", 41.98, 6.00, 0.84, 5.92));
        inventario.add(new Bulto(775498, "Electrodomesticos", 19.09, 6.11, 2.84, 4.47));
        naviera.getCliente(614613).createCarga("Puerto de Talcahuano", "Puerto de Antofagasta", LocalDate.of(2024, 11, 21), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(633688, "Muebles", 66.81, 6.40, 8.20, 0.67));
        inventario.add(new Bulto(120294, "Vehiculos", 36.23, 6.10, 3.45, 1.54));
        naviera.getCliente(195690).createCarga("Puerto de Covenas", "Puerto de San Sebastian", LocalDate.of(2024, 12, 2), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(220282, "Productos Farmaceuticos", 98.97, 0.50, 9.41, 8.26));
        inventario.add(new Bulto(400337, "Electrodomesticos", 28.67, 8.95, 6.25, 2.19));
        inventario.add(new Bulto(646478, "Electrodomesticos", 18.97, 8.44, 8.58, 8.64));
        naviera.getCliente(195690).createCarga("Puerto de San Rafael", "Puerto de San Vicente de la Vega", LocalDate.of(2024, 11, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(194288, "Ropa", 2.08, 6.53, 5.53, 8.24));
        inventario.add(new Bulto(228552, "Alimentos", 4.55, 1.87, 0.22, 7.53));
        inventario.add(new Bulto(207447, "Muebles", 45.98, 2.49, 5.32, 9.94));
        inventario.add(new Bulto(442187, "Ropa", 3.78, 7.36, 1.43, 4.08));
        inventario.add(new Bulto(613004, "Juguetes", 17.32, 9.20, 4.45, 1.31));
        naviera.getCliente(195690).createCarga("Puerto de Valparaiso", "Puerto de San Vicente", LocalDate.of(2024, 10, 16), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(848769, "Material de Construccion", 63.86, 6.00, 0.38, 3.23));
        naviera.getCliente(195690).createCarga("Puerto de San Vicente", "Puerto de San Vicente de la Sierra", LocalDate.of(2024, 12, 2), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(755441, "Combustible", 38.80, 3.62, 2.51, 9.21));
        inventario.add(new Bulto(730903, "Combustible", 5.31, 8.99, 9.16, 2.98));
        inventario.add(new Bulto(850054, "Tecnologia", 94.82, 2.38, 4.62, 5.75));
        inventario.add(new Bulto(814348, "Articulos de Oficina", 96.17, 1.96, 6.50, 4.86));
        naviera.getCliente(195690).createCarga("Puerto de San Vicente", "Puerto de Providencia", LocalDate.of(2024, 1, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(187990, "Vehiculos", 89.86, 4.06, 5.23, 0.95));
        inventario.add(new Bulto(914710, "Vehiculos", 65.37, 4.28, 1.72, 3.53));
        inventario.add(new Bulto(116006, "Vehiculos", 20.76, 3.90, 8.73, 4.13));
        inventario.add(new Bulto(233442, "Vehiculos", 12.40, 1.78, 5.28, 5.68));
        naviera.getCliente(854944).createCarga("Puerto de Callao", "Puerto de San Vicente", LocalDate.of(2024, 12, 13), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(190335, "Medicamentos", 5.92, 3.37, 6.54, 5.34));
        inventario.add(new Bulto(610726, "Medicamentos", 97.13, 4.19, 4.28, 3.36));
        inventario.add(new Bulto(547896, "Juguetes", 95.73, 2.76, 9.38, 1.31));
        inventario.add(new Bulto(484283, "Productos Farmaceuticos", 92.95, 4.46, 7.20, 0.63));
        inventario.add(new Bulto(731738, "Ropa", 46.39, 4.01, 0.47, 1.88));
        naviera.getCliente(854944).createCarga("Puerto de San Vicente", "Puerto de San Vicente del Caguan", LocalDate.of(2024, 10, 11), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(906539, "Productos Quimicos", 65.31, 7.70, 8.98, 9.03));
        inventario.add(new Bulto(735510, "Electrodomesticos", 62.45, 8.46, 2.15, 7.54));
        naviera.getCliente(854944).createCarga("Puerto de San Vicente de la Sonsierra", "Puerto de Concepcion", LocalDate.of(2024, 2, 4), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(886561, "Muebles", 57.73, 7.93, 3.94, 7.81));
        inventario.add(new Bulto(212749, "Vehiculos", 75.56, 7.29, 8.68, 5.68));
        inventario.add(new Bulto(728219, "Productos Quimicos", 71.77, 8.72, 9.25, 0.59));
        inventario.add(new Bulto(489016, "Ropa", 7.29, 3.44, 4.47, 5.63));
        naviera.getCliente(854944).createCarga("Puerto de San Vicente del Caguan", "Puerto de Buenaventura", LocalDate.of(2024, 11, 20), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(525014, "Herramientas", 93.93, 4.22, 3.12, 4.70));
        inventario.add(new Bulto(601407, "Material de Construccion", 35.87, 8.19, 4.76, 6.01));
        inventario.add(new Bulto(610581, "Productos Quimicos", 37.68, 2.13, 5.00, 4.77));
        inventario.add(new Bulto(138251, "Combustible", 7.96, 4.36, 3.74, 7.58));
        naviera.getCliente(854944).createCarga("Puerto de San Vicente de la Barquera", "Puerto de San Vicente del Caguan", LocalDate.of(2024, 7, 15), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(666473, "Juguetes", 34.86, 2.42, 9.48, 6.46));
        naviera.getCliente(854944).createCarga("Puerto de Talcahuano", "Puerto de Providencia", LocalDate.of(2024, 3, 7), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(207076, "Muebles", 86.83, 9.72, 2.18, 2.92));
        inventario.add(new Bulto(995015, "Alimentos", 44.09, 8.56, 0.89, 1.17));
        naviera.getCliente(854944).createCarga("Puerto de San Andres", "Puerto de San Pedro", LocalDate.of(2024, 8, 5), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(390078, "Electrodomesticos", 9.19, 4.60, 3.72, 7.17));
        inventario.add(new Bulto(308282, "Combustible", 50.06, 0.21, 9.56, 1.11));
        inventario.add(new Bulto(610396, "Material de Construccion", 89.58, 2.32, 6.94, 1.50));
        inventario.add(new Bulto(204264, "Tecnologia", 49.34, 9.00, 9.02, 8.65));
        inventario.add(new Bulto(529976, "Material de Construccion", 62.77, 2.83, 1.65, 4.14));
        naviera.getCliente(928210).createCarga("Puerto de Iquique", "Puerto de San Vicente de la Sonsierra", LocalDate.of(2024, 6, 21), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(121375, "Electrodomesticos", 36.54, 5.07, 0.68, 5.74));
        inventario.add(new Bulto(695521, "Muebles", 53.60, 3.94, 5.87, 5.86));
        inventario.add(new Bulto(122047, "Vehiculos", 65.48, 2.71, 6.02, 7.96));
        inventario.add(new Bulto(161405, "Juguetes", 41.40, 6.47, 4.92, 6.84));
        naviera.getCliente(928210).createCarga("Puerto de San Vicente de la Barquera", "Puerto de San Vicente del Raspeig", LocalDate.of(2024, 3, 14), inventario);        

        inventario = new ArrayList<>();
        inventario.add(new Bulto(920200, "Vehiculos", 96.34, 5.14, 1.70, 2.84));
        inventario.add(new Bulto(240242, "Electrodomesticos", 77.56, 5.63, 5.41, 8.72));
        inventario.add(new Bulto(784820, "Productos Farmaceuticos", 45.29, 6.01, 4.71, 2.99));
        inventario.add(new Bulto(979078, "Juguetes", 84.63, 2.70, 4.46, 0.55));
        inventario.add(new Bulto(931289, "Alimentos", 74.04, 4.44, 1.57, 3.58));
        naviera.getCliente(928210).createCarga("Puerto de San Vicente de la Sierra", "Puerto de Covenas", LocalDate.of(2024, 4, 9), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(464717, "Medicamentos", 94.15, 7.64, 2.33, 2.79));
        inventario.add(new Bulto(614238, "Alimentos", 14.35, 0.33, 7.38, 2.95));
        naviera.getCliente(156458).createCarga("Puerto de San Antonio", "Puerto de San Pedro", LocalDate.of(2024, 9, 16), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(707903, "Productos Farmaceuticos", 27.82, 9.72, 5.84, 9.26));
        inventario.add(new Bulto(828946, "Productos Farmaceuticos", 50.10, 1.77, 6.22, 9.99));
        inventario.add(new Bulto(231180, "Ropa", 37.68, 1.42, 2.06, 0.91));
        inventario.add(new Bulto(453726, "Maquinaria Pesada", 67.30, 6.35, 5.10, 3.58));
        inventario.add(new Bulto(569822, "Ropa", 39.99, 2.84, 7.83, 6.10));
        naviera.getCliente(156458).createCarga("Puerto de San Martin", "Puerto de Barranquilla", LocalDate.of(2024, 3, 9), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(429111, "Herramientas", 52.98, 0.36, 3.62, 1.55));
        inventario.add(new Bulto(152797, "Articulos de Oficina", 74.19, 3.82, 6.07, 4.99));
        inventario.add(new Bulto(661368, "Vehiculos", 33.01, 7.14, 6.33, 1.45));
        inventario.add(new Bulto(292264, "Articulos de Oficina", 50.61, 9.61, 2.96, 7.90));
        inventario.add(new Bulto(396415, "Juguetes", 91.30, 8.52, 0.92, 2.97));
        naviera.getCliente(504434).createCarga("Puerto de San Vicente del Caguan", "Puerto de Tumaco", LocalDate.of(2024, 2, 18), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(923348, "Maquinaria Pesada", 50.65, 5.07, 3.10, 3.26));
        inventario.add(new Bulto(238195, "Muebles", 86.32, 3.18, 8.67, 5.35));
        inventario.add(new Bulto(681014, "Articulos de Oficina", 18.02, 3.83, 6.17, 6.13));
        inventario.add(new Bulto(294046, "Medicamentos", 61.31, 3.20, 9.05, 3.09));
        inventario.add(new Bulto(494150, "Vehiculos", 55.42, 2.85, 2.31, 5.61));
        naviera.getCliente(504434).createCarga("Puerto de Barranquilla", "Puerto de San Miguel", LocalDate.of(2024, 8, 15), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(165468, "Herramientas", 68.64, 2.03, 0.41, 7.62));
        inventario.add(new Bulto(186287, "Material de Construccion", 3.24, 6.22, 3.61, 3.85));
        naviera.getCliente(504434).createCarga("Puerto de San Martin", "Puerto de Guayaquil", LocalDate.of(2024, 1, 3), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(840294, "Electrodomesticos", 2.87, 5.97, 7.25, 5.14));
        inventario.add(new Bulto(376683, "Maquinaria Pesada", 77.53, 6.31, 3.00, 2.95));
        naviera.getCliente(932442).createCarga("Puerto de Antofagasta", "Puerto de Santa Marta", LocalDate.of(2024, 9, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(332400, "Ropa", 18.47, 3.68, 2.54, 2.02));
        inventario.add(new Bulto(169715, "Material de Construccion", 55.85, 9.59, 5.07, 8.34));
        inventario.add(new Bulto(991865, "Maquinaria Pesada", 73.51, 9.14, 6.12, 5.02));
        inventario.add(new Bulto(683437, "Tecnologia", 87.14, 7.33, 4.66, 7.25));
        inventario.add(new Bulto(817138, "Ropa", 38.34, 2.08, 7.53, 2.38));
        naviera.getCliente(932442).createCarga("Puerto de Iquique", "Puerto de Concepcion", LocalDate.of(2024, 3, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(460449, "Productos Quimicos", 59.08, 1.40, 4.42, 4.71));
        inventario.add(new Bulto(357454, "Muebles", 7.58, 3.14, 6.23, 4.67));
        inventario.add(new Bulto(192506, "Electrodomesticos", 70.29, 1.15, 0.91, 4.84));
        inventario.add(new Bulto(117881, "Productos Farmaceuticos", 59.95, 9.77, 7.47, 9.04));
        naviera.getCliente(932442).createCarga("Puerto de San Vicente de la Sierra", "Puerto de Iquique", LocalDate.of(2024, 1, 27), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(659706, "Combustible", 95.09, 4.26, 2.36, 5.12));
        inventario.add(new Bulto(180235, "Material de Construccion", 79.78, 9.69, 4.97, 5.94));
        inventario.add(new Bulto(456155, "Muebles", 19.99, 9.51, 9.99, 8.40));
        naviera.getCliente(707470).createCarga("Puerto de San Vicente del Raspeig", "Puerto de Iquique", LocalDate.of(2024, 9, 11), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(156868, "Herramientas", 96.61, 4.45, 6.57, 2.55));
        inventario.add(new Bulto(759810, "Articulos de Oficina", 16.04, 7.95, 6.62, 9.61));
        naviera.getCliente(707470).createCarga("Puerto de Iquique", "Puerto de San Gil", LocalDate.of(2024, 1, 16), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(129430, "Electrodomesticos", 94.46, 9.89, 3.94, 2.97));
        naviera.getCliente(707470).createCarga("Puerto de San Vicente de la Virgen", "Puerto de Providencia", LocalDate.of(2024, 6, 12), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(625604, "Combustible", 2.01, 8.67, 7.20, 9.53));
        naviera.getCliente(707470).createCarga("Puerto de San Vicente de la Yedra", "Puerto de San Vicente", LocalDate.of(2024, 5, 16), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(574000, "Productos Farmaceuticos", 24.11, 1.09, 5.76, 9.34));
        naviera.getCliente(867186).createCarga("Puerto de San Vicente", "Puerto de San Vicente de la Sonsierra", LocalDate.of(2024, 2, 12), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(202201, "Medicamentos", 54.45, 4.29, 3.93, 9.16));
        inventario.add(new Bulto(714747, "Ropa", 83.30, 9.08, 3.38, 7.18));
        inventario.add(new Bulto(876027, "Articulos de Oficina", 94.62, 9.09, 6.05, 3.52));
        inventario.add(new Bulto(714046, "Muebles", 37.81, 9.55, 6.01, 7.49));
        naviera.getCliente(867186).createCarga("Puerto de San Vicente de la Zarza", "Puerto de Iquique", LocalDate.of(2024, 5, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(121667, "Productos Farmaceuticos", 10.12, 7.72, 9.38, 2.10));
        inventario.add(new Bulto(594610, "Juguetes", 53.20, 2.81, 8.89, 5.55));
        inventario.add(new Bulto(132930, "Material de Construccion", 81.85, 5.39, 3.76, 1.16));
        naviera.getCliente(867186).createCarga("Puerto de Iquique", "Puerto de San Vicente", LocalDate.of(2024, 10, 4), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(989840, "Productos Quimicos", 35.81, 2.63, 6.22, 5.16));
        inventario.add(new Bulto(256615, "Productos Farmaceuticos", 54.64, 1.37, 4.22, 0.91));
        inventario.add(new Bulto(700689, "Muebles", 75.26, 7.69, 9.94, 8.43));
        naviera.getCliente(867186).createCarga("Puerto de San Rafael", "Puerto de San Miguel", LocalDate.of(2024, 10, 26), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(532908, "Herramientas", 75.03, 2.19, 8.33, 8.34));
        inventario.add(new Bulto(426637, "Electrodomesticos", 98.59, 8.36, 4.41, 2.95));
        inventario.add(new Bulto(312769, "Alimentos", 92.90, 2.01, 6.64, 5.67));
        inventario.add(new Bulto(803055, "Ropa", 43.59, 0.58, 7.01, 3.10));
        naviera.getCliente(867186).createCarga("Puerto de Guayaquil", "Puerto de Buenaventura", LocalDate.of(2024, 11, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(178616, "Productos Quimicos", 82.93, 3.39, 2.78, 5.37));
        inventario.add(new Bulto(489955, "Medicamentos", 71.33, 0.17, 6.08, 6.38));
        inventario.add(new Bulto(395682, "Maquinaria Pesada", 79.39, 7.87, 7.15, 4.11));
        inventario.add(new Bulto(535051, "Tecnologia", 48.95, 6.91, 8.21, 5.86));
        inventario.add(new Bulto(960163, "Productos Farmaceuticos", 33.23, 3.76, 7.08, 3.97));
        naviera.getCliente(867186).createCarga("Puerto de Turbo", "Puerto de San Martin", LocalDate.of(2024, 2, 19), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(724274, "Electrodomesticos", 82.00, 4.09, 6.56, 7.42));
        inventario.add(new Bulto(332062, "Juguetes", 39.47, 6.95, 6.49, 4.12));
        naviera.getCliente(867186).createCarga("Puerto de San Pedro", "Puerto de San Vicente de la Virgen", LocalDate.of(2024, 6, 5), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(414740, "Vehiculos", 61.10, 2.44, 7.53, 5.65));
        inventario.add(new Bulto(916297, "Vehiculos", 97.92, 1.48, 4.67, 2.12));
        inventario.add(new Bulto(681160, "Muebles", 49.01, 0.87, 2.74, 3.29));
        inventario.add(new Bulto(658277, "Herramientas", 40.07, 8.79, 3.79, 1.62));
        naviera.getCliente(731922).createCarga("Puerto de San Vicente del Caguan", "Puerto de Callao", LocalDate.of(2024, 9, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(532701, "Vehiculos", 14.05, 4.00, 9.63, 6.20));
        inventario.add(new Bulto(129873, "Material de Construccion", 32.52, 4.76, 8.05, 0.82));
        inventario.add(new Bulto(255005, "Juguetes", 50.21, 4.07, 4.39, 2.46));
        inventario.add(new Bulto(636828, "Herramientas", 63.27, 6.76, 5.81, 0.50));
        inventario.add(new Bulto(220142, "Maquinaria Pesada", 38.75, 9.64, 8.83, 9.52));
        naviera.getCliente(731922).createCarga("Puerto de Barranquilla", "Puerto de San Andres", LocalDate.of(2024, 5, 12), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(914726, "Combustible", 26.54, 8.14, 3.33, 1.31));
        inventario.add(new Bulto(537907, "Material de Construccion", 28.45, 1.14, 7.97, 1.97));
        inventario.add(new Bulto(950365, "Maquinaria Pesada", 45.15, 9.60, 5.77, 2.90));
        naviera.getCliente(109521).createCarga("Puerto de Tumaco", "Puerto de San Vicente", LocalDate.of(2024, 10, 6), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(503817, "Productos Farmaceuticos", 69.24, 9.37, 5.68, 1.52));
        inventario.add(new Bulto(106246, "Material de Construccion", 71.70, 6.48, 7.51, 8.67));
        inventario.add(new Bulto(944604, "Electrodomesticos", 83.81, 1.29, 4.15, 0.83));
        inventario.add(new Bulto(747781, "Alimentos", 39.32, 6.23, 1.35, 4.38));
        naviera.getCliente(109521).createCarga("Puerto de San Vicente de la Zarza", "Puerto de Barranquilla", LocalDate.of(2024, 10, 17), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(902817, "Electrodomesticos", 53.45, 1.34, 0.99, 8.93));
        inventario.add(new Bulto(301634, "Alimentos", 45.54, 8.87, 0.77, 0.73));
        inventario.add(new Bulto(715292, "Herramientas", 75.95, 5.78, 2.91, 8.29));
        naviera.getCliente(109521).createCarga("Puerto de San Vicente de la Yedra", "Puerto de Tumaco", LocalDate.of(2024, 6, 22), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(128288, "Electrodomesticos", 47.73, 7.91, 1.30, 4.26));
        inventario.add(new Bulto(177850, "Ropa", 45.06, 6.60, 1.32, 6.12));
        inventario.add(new Bulto(337325, "Maquinaria Pesada", 4.75, 3.20, 2.11, 0.56));
        inventario.add(new Bulto(661024, "Tecnologia", 30.86, 1.72, 8.85, 1.26));
        inventario.add(new Bulto(986750, "Maquinaria Pesada", 44.10, 7.89, 1.05, 7.53));
        naviera.getCliente(109521).createCarga("Puerto de San Sebastian", "Puerto de Iquique", LocalDate.of(2024, 11, 13), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(275852, "Combustible", 92.99, 2.86, 9.56, 0.69));
        inventario.add(new Bulto(349364, "Tecnologia", 8.57, 0.11, 5.58, 5.53));
        inventario.add(new Bulto(607532, "Electrodomesticos", 79.66, 3.70, 4.12, 9.84));
        naviera.getCliente(284464).createCarga("Puerto de San Vicente", "Puerto de San Vicente del Raspeig", LocalDate.of(2024, 10, 28), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(107033, "Productos Farmaceuticos", 45.55, 4.12, 6.04, 3.06));
        inventario.add(new Bulto(814554, "Alimentos", 67.83, 9.53, 5.78, 9.54));
        inventario.add(new Bulto(635545, "Productos Quimicos", 47.95, 2.38, 9.57, 3.58));
        inventario.add(new Bulto(319343, "Productos Quimicos", 66.62, 0.26, 9.24, 0.18));
        inventario.add(new Bulto(224469, "Muebles", 55.19, 0.40, 6.60, 8.04));
        naviera.getCliente(284464).createCarga("Puerto de Callao", "Puerto de San Vicente de la Virgen", LocalDate.of(2024, 11, 25), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(815404, "Herramientas", 23.85, 9.52, 8.44, 9.60));
        inventario.add(new Bulto(145872, "Alimentos", 16.97, 1.06, 4.23, 6.70));
        inventario.add(new Bulto(387646, "Vehiculos", 43.77, 4.07, 5.29, 2.77));
        inventario.add(new Bulto(198957, "Alimentos", 45.46, 3.68, 2.78, 9.09));
        inventario.add(new Bulto(839092, "Electrodomesticos", 85.33, 6.04, 3.41, 9.64));
        naviera.getCliente(284464).createCarga("Puerto de Buenaventura", "Puerto de Iquique", LocalDate.of(2024, 10, 11), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(695033, "Vehiculos", 70.36, 2.09, 5.20, 0.37));
        naviera.getCliente(284464).createCarga("Puerto de San Miguel", "Puerto de Iquique", LocalDate.of(2024, 12, 23), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(964270, "Tecnologia", 84.44, 6.06, 8.73, 8.78));
        naviera.getCliente(518605).createCarga("Puerto de Providencia", "Puerto de Turbo", LocalDate.of(2024, 12, 28), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(252136, "Muebles", 71.40, 8.17, 8.62, 7.07));
        inventario.add(new Bulto(762047, "Juguetes", 62.16, 1.73, 9.24, 8.04));
        inventario.add(new Bulto(447531, "Material de Construccion", 28.57, 6.36, 2.71, 5.27));
        inventario.add(new Bulto(499437, "Combustible", 36.54, 7.75, 0.61, 5.67));
        naviera.getCliente(518605).createCarga("Puerto de Cartagena", "Puerto de Callao", LocalDate.of(2024, 4, 14), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(864822, "Vehiculos", 40.52, 7.68, 0.38, 8.72));
        inventario.add(new Bulto(331803, "Vehiculos", 50.79, 1.56, 7.36, 4.81));
        inventario.add(new Bulto(457413, "Ropa", 94.79, 8.16, 8.18, 3.16));
        inventario.add(new Bulto(561400, "Tecnologia", 8.91, 4.18, 1.54, 0.49));
        naviera.getCliente(518605).createCarga("Puerto de San Martin", "Puerto de Callao", LocalDate.of(2024, 11, 15), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(188799, "Productos Quimicos", 96.98, 5.47, 1.97, 2.24));
        inventario.add(new Bulto(642697, "Productos Farmaceuticos", 2.61, 7.42, 1.19, 2.48));
        inventario.add(new Bulto(957461, "Electrodomesticos", 53.06, 4.58, 0.62, 8.56));
        inventario.add(new Bulto(507501, "Herramientas", 87.96, 6.20, 6.77, 4.85));
        naviera.getCliente(518605).createCarga("Puerto de Iquique", "Puerto de San Vicente de la Barquera", LocalDate.of(2024, 6, 12), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(435678, "Muebles", 79.81, 9.66, 6.47, 2.39));
        inventario.add(new Bulto(737392, "Electrodomesticos", 99.17, 7.33, 8.46, 2.20));
        inventario.add(new Bulto(690228, "Material de Construccion", 28.18, 2.22, 9.52, 8.01));
        naviera.getCliente(518605).createCarga("Puerto de Callao", "Puerto de San Miguel", LocalDate.of(2024, 5, 17), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(900482, "Juguetes", 83.31, 8.75, 9.88, 9.99));
        inventario.add(new Bulto(224108, "Productos Farmaceuticos", 10.08, 7.06, 4.25, 3.22));
        naviera.getCliente(28255095).createCarga("Puerto de San Rafael", "Puerto de San Jose", LocalDate.of(2024, 2, 18), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(543152, "Material de Construccion", 56.13, 4.91, 9.27, 3.26));
        inventario.add(new Bulto(994384, "Ropa", 53.51, 2.96, 2.36, 1.66));
        inventario.add(new Bulto(453451, "Articulos de Oficina", 20.53, 8.59, 9.71, 5.12));
        naviera.getCliente(28255095).createCarga("Puerto de San Vicente de Chucuri", "Puerto de San Pablo", LocalDate.of(2024, 2, 14), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(530608, "Medicamentos", 55.79, 6.97, 4.42, 4.48));
        inventario.add(new Bulto(209421, "Material de Construccion", 32.36, 9.28, 3.16, 3.01));
        inventario.add(new Bulto(369830, "Combustible", 80.50, 4.52, 0.57, 3.26));
        naviera.getCliente(52441827).createCarga("Puerto de Turbo", "Puerto de Iquique", LocalDate.of(2024, 7, 19), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(803757, "Muebles", 58.25, 3.56, 9.89, 9.42));
        inventario.add(new Bulto(834515, "Muebles", 23.67, 1.91, 5.15, 4.75));
        inventario.add(new Bulto(354284, "Juguetes", 17.68, 2.91, 1.87, 9.41));
        naviera.getCliente(52441827).createCarga("Puerto de San Miguel", "Puerto de San Vicente de la Sierra", LocalDate.of(2024, 11, 26), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(807094, "Tecnologia", 86.93, 7.45, 3.84, 7.86));
        inventario.add(new Bulto(437569, "Maquinaria Pesada", 39.19, 1.72, 3.93, 3.29));
        inventario.add(new Bulto(681418, "Productos Quimicos", 53.95, 4.22, 8.76, 8.68));
        naviera.getCliente(52441827).createCarga("Puerto de San Vicente de la Yedra", "Puerto de San Andres", LocalDate.of(2024, 2, 18), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(175793, "Material de Construccion", 6.10, 2.30, 2.71, 5.00));
        inventario.add(new Bulto(753466, "Electrodomesticos", 20.07, 3.34, 7.33, 7.65));
        inventario.add(new Bulto(610603, "Productos Farmaceuticos", 53.06, 4.87, 6.79, 3.12));
        inventario.add(new Bulto(224120, "Alimentos", 9.15, 3.06, 8.35, 1.33));
        inventario.add(new Bulto(597147, "Ropa", 27.04, 1.01, 7.19, 2.48));
        naviera.getCliente(52441827).createCarga("Puerto de San Miguel", "Puerto de San Vicente de la Zarza", LocalDate.of(2024, 1, 26), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(842717, "Material de Construccion", 68.72, 1.70, 9.37, 0.78));
        inventario.add(new Bulto(776738, "Productos Quimicos", 62.96, 6.54, 0.38, 0.72));
        inventario.add(new Bulto(156790, "Combustible", 99.18, 6.93, 1.80, 1.19));
        inventario.add(new Bulto(316581, "Medicamentos", 83.66, 4.25, 9.17, 1.43));
        inventario.add(new Bulto(446259, "Herramientas", 73.71, 6.56, 8.41, 5.21));
        naviera.getCliente(52441827).createCarga("Puerto de San Miguel", "Puerto de Covenas", LocalDate.of(2024, 8, 21), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(880838, "Maquinaria Pesada", 38.31, 4.49, 4.85, 4.97));
        inventario.add(new Bulto(562960, "Articulos de Oficina", 1.70, 9.43, 3.79, 6.77));
        inventario.add(new Bulto(622159, "Vehiculos", 15.29, 6.16, 9.13, 7.81));
        inventario.add(new Bulto(518520, "Juguetes", 13.63, 4.62, 6.14, 4.02));
        inventario.add(new Bulto(812813, "Articulos de Oficina", 22.94, 2.07, 4.95, 6.66));
        naviera.getCliente(52441827).createCarga("Puerto de San Vicente de la Yedra", "Puerto de San Vicente", LocalDate.of(2024, 2, 4), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(272983, "Tecnologia", 29.44, 7.38, 8.59, 7.98));
        inventario.add(new Bulto(196220, "Tecnologia", 10.32, 7.83, 8.79, 9.26));
        inventario.add(new Bulto(558954, "Maquinaria Pesada", 94.17, 4.70, 3.49, 8.96));
        inventario.add(new Bulto(358843, "Vehiculos", 59.28, 4.64, 6.12, 9.52));
        inventario.add(new Bulto(272963, "Combustible", 63.10, 6.80, 3.34, 1.06));
        naviera.getCliente(52441827).createCarga("Puerto de Guayaquil", "Puerto de San Pedro", LocalDate.of(2024, 2, 7), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(677762, "Ropa", 31.28, 7.92, 9.51, 0.90));
        naviera.getCliente(78566173).createCarga("Puerto de Antofagasta", "Puerto de San Vicente", LocalDate.of(2024, 2, 14), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(656354, "Electrodomesticos", 64.73, 1.94, 7.40, 2.64));
        inventario.add(new Bulto(300205, "Combustible", 25.30, 2.83, 8.65, 1.85));
        naviera.getCliente(78566173).createCarga("Puerto de San Vicente del Raspeig", "Puerto de Buenaventura", LocalDate.of(2024, 11, 21), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(584751, "Maquinaria Pesada", 8.15, 7.46, 6.92, 3.76));
        inventario.add(new Bulto(818049, "Medicamentos", 81.96, 1.77, 7.06, 5.94));
        inventario.add(new Bulto(255038, "Articulos de Oficina", 88.17, 7.02, 7.56, 2.73));
        inventario.add(new Bulto(463790, "Tecnologia", 28.16, 9.47, 1.16, 5.20));
        inventario.add(new Bulto(834387, "Productos Farmaceuticos", 41.59, 5.27, 5.47, 7.56));
        naviera.getCliente(22147535).createCarga("Puerto de Cartagena", "Puerto de Tumaco", LocalDate.of(2024, 3, 13), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(605053, "Vehiculos", 13.08, 2.47, 1.22, 7.18));
        inventario.add(new Bulto(946530, "Alimentos", 1.51, 7.72, 7.74, 4.33));
        inventario.add(new Bulto(357704, "Ropa", 47.68, 4.11, 7.81, 4.38));
        naviera.getCliente(22147535).createCarga("Puerto de Providencia", "Puerto de San Vicente del Caguan", LocalDate.of(2024, 11, 15), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(601889, "Material de Construccion", 36.68, 7.60, 6.31, 2.91));
        naviera.getCliente(22147535).createCarga("Puerto de San Vicente de la Sonsierra", "Puerto de Valparaiso", LocalDate.of(2024, 8, 17), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(716427, "Herramientas", 95.22, 2.93, 4.53, 3.34));
        inventario.add(new Bulto(281263, "Vehiculos", 51.18, 4.14, 1.30, 6.72));
        inventario.add(new Bulto(586850, "Tecnologia", 8.47, 0.57, 6.23, 7.83));
        naviera.getCliente(61219369).createCarga("Puerto de Barranquilla", "Puerto de San Jose", LocalDate.of(2024, 5, 20), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(112281, "Vehiculos", 10.66, 3.93, 2.60, 9.16));
        inventario.add(new Bulto(339138, "Articulos de Oficina", 94.31, 7.41, 3.16, 8.24));
        inventario.add(new Bulto(898124, "Muebles", 14.39, 5.13, 7.90, 2.19));
        inventario.add(new Bulto(691793, "Maquinaria Pesada", 68.44, 1.22, 0.80, 7.57));
        naviera.getCliente(61219369).createCarga("Puerto de San Gil", "Puerto de Buenaventura", LocalDate.of(2024, 1, 1), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(179993, "Productos Quimicos", 74.80, 4.96, 5.58, 8.93));
        inventario.add(new Bulto(834879, "Ropa", 51.36, 8.37, 7.82, 1.94));
        naviera.getCliente(61219369).createCarga("Puerto de Cartagena", "Puerto de Turbo", LocalDate.of(2024, 11, 7), inventario);

        inventario = new ArrayList<>();
        inventario.add(new Bulto(717346, "Productos Quimicos", 99.30, 2.07, 2.89, 8.82));
        naviera.getCliente(61219369).createCarga("Puerto de Cartagena", "Puerto de San Antonio", LocalDate.of(2024, 8, 28), inventario);

        naviera.getViaje(0).addCarga(naviera.getCliente(854944).getCarga(6));
        naviera.getViaje(0).addCarga(naviera.getCliente(61219369).getCarga(0));
        naviera.getViaje(0).addCarga(naviera.getCliente(52441827).getCarga(5));
        naviera.getViaje(0).addCarga(naviera.getCliente(854944).getCarga(5));
        naviera.getViaje(1).addCarga(naviera.getCliente(195690).getCarga(3));
        naviera.getViaje(2).addCarga(naviera.getCliente(697302).getCarga(5));
        naviera.getViaje(2).addCarga(naviera.getCliente(867186).getCarga(4));
        naviera.getViaje(2).addCarga(naviera.getCliente(932442).getCarga(1));
        naviera.getViaje(3).addCarga(naviera.getCliente(697302).getCarga(2));
        naviera.getViaje(4).addCarga(naviera.getCliente(52441827).getCarga(2));
        naviera.getViaje(4).addCarga(naviera.getCliente(854944).getCarga(1));
        naviera.getViaje(4).addCarga(naviera.getCliente(518605).getCarga(3));
        naviera.getViaje(4).addCarga(naviera.getCliente(518605).getCarga(0));
        naviera.getViaje(5).addCarga(naviera.getCliente(284464).getCarga(3));
        naviera.getViaje(6).addCarga(naviera.getCliente(320109).getCarga(3));
        naviera.getViaje(6).addCarga(naviera.getCliente(932442).getCarga(0));
        naviera.getViaje(7).addCarga(naviera.getCliente(284464).getCarga(2));
        naviera.getViaje(7).addCarga(naviera.getCliente(928210).getCarga(2));
        naviera.getViaje(7).addCarga(naviera.getCliente(195690).getCarga(1));
        naviera.getViaje(8).addCarga(naviera.getCliente(928210).getCarga(0));
        naviera.getViaje(9).addCarga(naviera.getCliente(52441827).getCarga(3));
        naviera.getViaje(9).addCarga(naviera.getCliente(697302).getCarga(1));
        naviera.getViaje(10).addCarga(naviera.getCliente(731922).getCarga(0));
        naviera.getViaje(10).addCarga(naviera.getCliente(867186).getCarga(5));
        naviera.getViaje(10).addCarga(naviera.getCliente(109521).getCarga(0));
        naviera.getViaje(10).addCarga(naviera.getCliente(928210).getCarga(1));
        naviera.getViaje(10).addCarga(naviera.getCliente(854944).getCarga(0));
        naviera.getViaje(10).addCarga(naviera.getCliente(697302).getCarga(7));
        naviera.getViaje(10).addCarga(naviera.getCliente(504434).getCarga(1));
        naviera.getViaje(10).addCarga(naviera.getCliente(22147535).getCarga(0));
        naviera.getViaje(11).addCarga(naviera.getCliente(28255095).getCarga(0));
        naviera.getViaje(11).addCarga(naviera.getCliente(109521).getCarga(2));
        naviera.getViaje(11).addCarga(naviera.getCliente(320109).getCarga(2));
        naviera.getViaje(11).addCarga(naviera.getCliente(320109).getCarga(0));
        naviera.getViaje(11).addCarga(naviera.getCliente(284464).getCarga(1));
        naviera.getViaje(11).addCarga(naviera.getCliente(867186).getCarga(2));
        naviera.getViaje(12).addCarga(naviera.getCliente(707470).getCarga(1));
        naviera.getViaje(13).addCarga(naviera.getCliente(932442).getCarga(2));
        naviera.getViaje(13).addCarga(naviera.getCliente(707470).getCarga(0));
        naviera.getViaje(13).addCarga(naviera.getCliente(109521).getCarga(1));
        naviera.getViaje(13).addCarga(naviera.getCliente(52441827).getCarga(0));
        naviera.getViaje(13).addCarga(naviera.getCliente(504434).getCarga(0));
        naviera.getViaje(13).addCarga(naviera.getCliente(614613).getCarga(2));
        naviera.getViaje(13).addCarga(naviera.getCliente(614613).getCarga(1));
        naviera.getViaje(13).addCarga(naviera.getCliente(22147535).getCarga(2));
        naviera.getViaje(14).addCarga(naviera.getCliente(697302).getCarga(6));
        naviera.getViaje(14).addCarga(naviera.getCliente(28255095).getCarga(1));
        naviera.getViaje(14).addCarga(naviera.getCliente(284464).getCarga(0));
        naviera.getViaje(15).addCarga(naviera.getCliente(707470).getCarga(3));
        naviera.getViaje(16).addCarga(naviera.getCliente(320109).getCarga(4));
        naviera.getViaje(16).addCarga(naviera.getCliente(156458).getCarga(1));
        naviera.getViaje(16).addCarga(naviera.getCliente(52441827).getCarga(6));
        naviera.getViaje(16).addCarga(naviera.getCliente(78566173).getCarga(1));
        naviera.getViaje(16).addCarga(naviera.getCliente(52441827).getCarga(4));
        naviera.getViaje(17).addCarga(naviera.getCliente(52441827).getCarga(1));
        naviera.getViaje(17).addCarga(naviera.getCliente(320109).getCarga(1));
        naviera.getViaje(17).addCarga(naviera.getCliente(195690).getCarga(0));
        naviera.getViaje(17).addCarga(naviera.getCliente(731922).getCarga(1));
        naviera.getViaje(17).addCarga(naviera.getCliente(504434).getCarga(2));
        naviera.getViaje(17).addCarga(naviera.getCliente(707470).getCarga(2));
        naviera.getViaje(17).addCarga(naviera.getCliente(697302).getCarga(3));
        naviera.getViaje(18).addCarga(naviera.getCliente(61219369).getCarga(2));
        naviera.getViaje(18).addCarga(naviera.getCliente(614613).getCarga(3));
        naviera.getViaje(18).addCarga(naviera.getCliente(195690).getCarga(4));
        naviera.getViaje(18).addCarga(naviera.getCliente(867186).getCarga(3));
        naviera.getViaje(19).addCarga(naviera.getCliente(867186).getCarga(0));
        naviera.getViaje(19).addCarga(naviera.getCliente(518605).getCarga(1));
        naviera.getViaje(19).addCarga(naviera.getCliente(854944).getCarga(4));
        naviera.getViaje(19).addCarga(naviera.getCliente(614613).getCarga(0));
        naviera.getViaje(19).addCarga(naviera.getCliente(518605).getCarga(2));
        naviera.getViaje(20).addCarga(naviera.getCliente(697302).getCarga(4));
        naviera.getViaje(20).addCarga(naviera.getCliente(697302).getCarga(0));
        naviera.getViaje(21).addCarga(naviera.getCliente(518605).getCarga(4));
        naviera.getViaje(22).addCarga(naviera.getCliente(854944).getCarga(2));
        naviera.getViaje(22).addCarga(naviera.getCliente(195690).getCarga(2));
        naviera.getViaje(22).addCarga(naviera.getCliente(867186).getCarga(1));
        naviera.getViaje(23).addCarga(naviera.getCliente(78566173).getCarga(0));
        naviera.getViaje(23).addCarga(naviera.getCliente(61219369).getCarga(1));
        naviera.getViaje(23).addCarga(naviera.getCliente(109521).getCarga(3));
        naviera.getViaje(23).addCarga(naviera.getCliente(61219369).getCarga(3));
        naviera.getViaje(24).addCarga(naviera.getCliente(156458).getCarga(0));
        naviera.getViaje(24).addCarga(naviera.getCliente(22147535).getCarga(1));
        naviera.getViaje(24).addCarga(naviera.getCliente(854944).getCarga(3));
        naviera.getViaje(24).addCarga(naviera.getCliente(867186).getCarga(6));
        
        naviera.showResumenBarcos();
        naviera.showBarcoPropioMayorIngresos();
        naviera.showClienteMayorGasto();
        naviera.showCargaMayorValor();
    }
    
}

/**
------------- Resultados -------------

Barco 01:
- Matricula: 74145
- Nombre: El poderoso
- Bandera: Si
- Capitan: Juan Perez
- Numero de Rutas: 0
- Numero de Viajes: 0
- Ingresos: 0.00

Barco 02:
- Matricula: 99676
- Nombre: El veloz
- Bandera: No
- Capitan: Maria Gomez
- Numero de Rutas: 2
- Numero de Viajes: 2
- Ingresos: 110937.93

Barco 03:
- Matricula: 21540
- Nombre: El fuerte
- Bandera: No
- Capitan: Carlos Sanchez
- Numero de Rutas: 0
- Numero de Viajes: 0
- Ingresos: 0.00

Barco 04:
- Matricula: 29626
- Nombre: El audaz
- Bandera: Si
- Capitan: Ana Torres
- Numero de Rutas: 1
- Numero de Viajes: 1
- Ingresos: 11304.10

Barco 05:
- Matricula: 88492
- Nombre: El valiente
- Bandera: No
- Capitan: Luis Martinez
- Numero de Rutas: 1
- Numero de Viajes: 1
- Ingresos: 30326.99

Barco 06:
- Matricula: 61681
- Nombre: El astuto
- Bandera: No
- Capitan: Pedro Gomez
- Numero de Rutas: 1
- Numero de Viajes: 1
- Ingresos: 13492.49

Barco 07:
- Matricula: 63755
- Nombre: El sabio
- Bandera: No
- Capitan: Laura Lopez
- Numero de Rutas: 2
- Numero de Viajes: 2
- Ingresos: 32951.27

Barco 08:
- Matricula: 12875
- Nombre: El inteligente
- Bandera: No
- Capitan: Javier Sanchez
- Numero de Rutas: 1
- Numero de Viajes: 1
- Ingresos: 49375.72

Barco 09:
- Matricula: 67702
- Nombre: El astuto
- Bandera: Si
- Capitan: Sofia Ramirez
- Numero de Rutas: 2
- Numero de Viajes: 2
- Ingresos: 90226.93

Barco 10:
- Matricula: 52655
- Nombre: El ingenioso
- Bandera: Si
- Capitan: Andres Morales
- Numero de Rutas: 3
- Numero de Viajes: 3
- Ingresos: 36781.11

Barco 11:
- Matricula: 18098
- Nombre: El alquilado
- Bandera: No
- Capitan: Valentina Castro
- Empresa: Empresa Uno S.A.S
- Fecha Inicio: 2023-11-03
- Fecha Fin: 2024-07-03
- Numero de Rutas: 1
- Numero de Viajes: 1
- Ingresos: 11425.64

Barco 12:
- Matricula: 24889
- Nombre: El arrendado
- Bandera: No
- Capitan: Diego Herrera
- Empresa: Corporacion Dos Ltda
- Fecha Inicio: 2023-11-07
- Fecha Fin: 2024-10-07
- Numero de Rutas: 2
- Numero de Viajes: 3
- Ingresos: 48763.75

Barco 13:
- Matricula: 21039
- Nombre: El rentado
- Bandera: No
- Capitan: Camila Ruiz
- Empresa: S.A.S Tres y Asociados
- Fecha Inicio: 2023-09-14
- Fecha Fin: 2025-04-14
- Numero de Rutas: 2
- Numero de Viajes: 2
- Ingresos: 226827.45

Barco 14:
- Matricula: 99548
- Nombre: El prestado
- Bandera: No
- Capitan: Felipe Jimenez
- Empresa: Inversiones Cuatro S.A.
- Fecha Inicio: 2023-02-05
- Fecha Fin: 2023-06-05
- Numero de Rutas: 1
- Numero de Viajes: 1
- Ingresos: 7505.99

Barco 15:
- Matricula: 30781
- Nombre: El cedido
- Bandera: No
- Capitan: Juan Perez
- Empresa: Servicios Cinco Ltda
- Fecha Inicio: 2023-12-10
- Fecha Fin: 2024-09-10
- Numero de Rutas: 5
- Numero de Viajes: 5
- Ingresos: 70740.31

El barco propio que mayores ingresos le ha generado a la compania fue El veloz registrado con matricula No. 99676, con unos ingresos totales de $110937.93

El cliente que ha tenido un mayor gasto en sus envios es Camila Ruiz con identificacion 284464 del pais Chile, con un gasto total de $185705.08

La carga con un mayor valor fue enviada por el cliente Camila Ruiz y tuvo un costo de $157974.38
*/