package com.coralcorp.hangedman;

import java.util.Random;

public class OpcionesGeneradas extends Palabras
{
    public static String[] seleccion(final int seleccionada) {
        final String[] generada = new String[2];
        final Random aleatorio = new Random();
        final int numPalabra = aleatorio.nextInt(10);
        if (seleccionada == 0) {
            if (numPalabra == 1) {
                generada[0] = "violeta";
                generada[1] = "Tambi\u00e9n es el nombre de una flor com\u00fan en los bosques de Espa\u00f1a.";
            }
            else if (numPalabra == 2) {
                generada[0] = "amarillo";
                generada[1] = "Es el color de la flor que busca el sol.";
            }
            else if (numPalabra == 3) {
                generada[0] = "naranja";
                generada[1] = "Tambi\u00e9n se hace jugo de esta fruta para el desayuno.";
            }
            else if (numPalabra == 4) {
                generada[0] = "morado";
                generada[1] = "Si no respiras, te pondr\u00e1s de ese color.";
            }
            else if (numPalabra == 5) {
                generada[0] = "blanco";
                generada[1] = "En Jap\u00f3n, este color se utiliza para representar el luto.";
            }
            else if (numPalabra == 6) {
                generada[0] = "verde";
                generada[1] = "Es vida.";
            }
            else if (numPalabra == 7) {
                generada[0] = "beige";
                generada[1] = "En el desierto y la playa, ver\u00e1s ese color.";
            }
            else if (numPalabra == 8) {
                generada[0] = "terracota";
                generada[1] = "El ej\u00e9rcito del emperador Qin Shi Huang es llamado as\u00ed.";
            }
            else if (numPalabra == 9) {
                generada[0] = "turquesa";
                generada[1] = "Unos te dir\u00e1n que es verde, y otros que es azul...";
            }
            else {
                generada[0] = "negro";
                generada[1] = "No refleja ninguna radiaci\u00f3n visible.";
            }
        }
        else if (seleccionada == 1) {
            if (numPalabra == 1) {
                generada[0] = "perro";
                generada[1] = "Animal dom\u00e9stico.";
            }
            else if (numPalabra == 2) {
                generada[0] = "jirafa";
                generada[1] = "Come las hojas de las copas de los \u00e1rboles.";
            }
            else if (numPalabra == 3) {
                generada[0] = "carnero";
                generada[1] = "Sus cuernos son largos y curvos.";
            }
            else if (numPalabra == 4) {
                generada[0] = "tigre";
                generada[1] = "Su piel a rayas le permite camuflarse en la sabana.";
            }
            else if (numPalabra == 5) {
                generada[0] = "elefante";
                generada[1] = "Viven muchos a\u00f1os y se dice que tienen una memoria extraordinaria.";
            }
            else if (numPalabra == 6) {
                generada[0] = "ballena";
                generada[1] = "Es el mamifero m\u00e1s grande del mundo.";
            }
            else if (numPalabra == 7) {
                generada[0] = "delf\u00edn";
                generada[1] = "Es juguet\u00f3n, muy inteligente y vive en el oc\u00e9ano.";
            }
            else if (numPalabra == 8) {
                generada[0] = "caballo";
                generada[1] = "En el pasado era usado para tirar de las carretas.";
            }
            else if (numPalabra == 9) {
                generada[0] = "jaguar";
                generada[1] = "Es el felino m\u00e1s grande de de am\u00e9rica";
            }
            else {
                generada[0] = "marmota";
                generada[1] = "Es un roedor grande, la ingesta de su carne puede transmitir la peste bub\u00f3nica";
            }
        }
        else if (seleccionada == 2) {
            if (numPalabra == 1) {
                generada[0] = "silla";
                generada[1] = "Mientras esperas, puedes sentarte";
            }
            else if (numPalabra == 2) {
                generada[0] = "sill\u00f3n";
                generada[1] = "Ahora que si quieres sentarte m\u00e1s c\u00f3modamente.";
            }
            else if (numPalabra == 3) {
                generada[0] = "cama";
                generada[1] = "Si estas por dormir, usa una.";
            }
            else if (numPalabra == 4) {
                generada[0] = "bur\u00f3";
                generada[1] = "Usualmente se encuentra junto a tu cama.";
            }
            else if (numPalabra == 5) {
                generada[0] = "mesa";
                generada[1] = "Procura no subir los codos.";
            }
            else if (numPalabra == 6) {
                generada[0] = "vitrina";
                generada[1] = "La abuela guarda muchas figuras ah\u00ed.";
            }
            else if (numPalabra == 7) {
                generada[0] = "lavabo";
                generada[1] = "L\u00e1vate las manos tres veces al d\u00eda.";
            }
            else if (numPalabra == 8) {
                generada[0] = "escritorio";
                generada[1] = "Es donde el abuelo trabaja y lee";
            }
            else if (numPalabra == 9) {
                generada[0] = "l\u00e1mpara";
                generada[1] = "Enci\u00e9ndela y ver\u00e1s m\u00e1s claro.";
            }
            else {
                generada[0] = "c\u00f3moda";
                generada[1] = "La abuela se cepilla el cabello mientras se ve al espejo.";
            }
        }
        else if (seleccionada == 3) {
            if (numPalabra == 1) {
                generada[0] = "camisa";
                generada[1] = "Te la pones cuando vas a alguna reuni\u00f3n formal y te cubre el torso.";
            }
            else if (numPalabra == 2) {
                generada[0] = "corbata";
                generada[1] = "Te la pones cuando vas a alguna reuni\u00f3n formal.";
            }
            else if (numPalabra == 3) {
                generada[0] = "zapato";
                generada[1] = "No tocas el suelo debido a que tres...";
            }
            else if (numPalabra == 4) {
                generada[0] = "pantal\u00f3n";
                generada[1] = "Los usas a diario, a menos que uses shorts.";
            }
            else if (numPalabra == 5) {
                generada[0] = "su\u00e9ter";
                generada[1] = "Te lo pones cuando hace frio, tambi\u00e9n lo usan los viejitos.";
            }
            else if (numPalabra == 6) {
                generada[0] = "chamarra";
                generada[1] = "Te mantienen caliente durante el invierno.";
            }
            else if (numPalabra == 7) {
                generada[0] = "bufanda";
                generada[1] = "Va en tu cuello y a la vez evita que respires aire fr\u00edo.";
            }
            else if (numPalabra == 8) {
                generada[0] = "calcet\u00edn";
                generada[1] = "Tus pies agradencen tenerlos durante invierno.";
            }
            else if (numPalabra == 9) {
                generada[0] = "short";
                generada[1] = "Andas muy fresco.";
            }
            else {
                generada[0] = "playera";
                generada[1] = "Prenda que cubre tu torso.";
            }
        }
        else if (seleccionada == 4) {
            if (numPalabra == 1) {
                generada[0] = "cuchara";
                generada[1] = "Comes sopa con ella.";
            }
            else if (numPalabra == 2) {
                generada[0] = "sart\u00e9n";
                generada[1] = "No puedes cocinar un huevito si no tienes un...";
            }
            else if (numPalabra == 3) {
                generada[0] = "microondas";
                generada[1] = "Calienta los alimentos.";
            }
            else if (numPalabra == 4) {
                generada[0] = "refrigerador";
                generada[1] = "Conserva tus alimentos.";
            }
            else if (numPalabra == 5) {
                generada[0] = "alacena";
                generada[1] = "Guardas la despensa aqu\u00ed dentro";
            }
            else if (numPalabra == 6) {
                generada[0] = "exprimidor";
                generada[1] = "Hacer agua de lim\u00f3n es mucho m\u00e1s f\u00e1cil ahora que tengo un...";
            }
            else if (numPalabra == 7) {
                generada[0] = "cafetera";
                generada[1] = "El caf\u00e9 no se prepara solo.";
            }
            else if (numPalabra == 8) {
                generada[0] = "estufa";
                generada[1] = "No es cocina si no la tiene.";
            }
            else if (numPalabra == 9) {
                generada[0] = "mesa";
                generada[1] = "Colocas tus recipientes con alimentos sobre ella.";
            }
            else {
                generada[0] = "licuadora";
                generada[1] = "Chocolate, azucar, leche, avena, para un rico licuado solo falta la...";
            }
        }
        else if (seleccionada == 5) {
            if (numPalabra == 1) {
                generada[0] = "aguacate";
                generada[1] = "Alimento de perezosos gigantes hace muchos a\u00f1os";
            }
            else if (numPalabra == 2) {
                generada[0] = "cereza";
                generada[1] = "No puede faltar arriba del pastel";
            }
            else if (numPalabra == 3) {
                generada[0] = "zarzamora";
                generada[1] = "Tartas, mermeladas, se acompa\u00f1a muy bien con queso crema";
            }
            else if (numPalabra == 4) {
                generada[0] = "fresa";
                generada[1] = "Como fruta, deliciosa. Como persona, insoportble";
            }
            else if (numPalabra == 5) {
                generada[0] = "manzana";
                generada[1] = "Solo Newton hace una Ley cuando le cae una ...";
            }
            else if (numPalabra == 6) {
                generada[0] = "mandarina";
                generada[1] = "Su nombre deriva del color de los trajes de los gobernantes de la antigua China.";
            }
            else if (numPalabra == 7) {
                generada[0] = "sand\u00eda";
                generada[1] = "Grandes, muy jugosas. Ahora hasta cuadradas se encuentran.";
            }
            else if (numPalabra == 8) {
                generada[0] = "pi\u00f1a";
                generada[1] = "El \u00fanico alimento que se come tu lengua mientras la comes.";
            }
            else if (numPalabra == 9) {
                generada[0] = "mango";
                generada[1] = "Con chilito o chamoy, no puede faltar estando en la playa.";
            }
            else {
                generada[0] = "durazno";
                generada[1] = "Nombre de la princesa de Mario Bros.";
            }
        }
        else if (seleccionada == 6) {
            if (numPalabra == 1) {
                generada[0] = "coche";
                generada[1] = "Transporte privado com\u00fan.";
            }
            else if (numPalabra == 2) {
                generada[0] = "cami\u00f3n";
                generada[1] = "Siempre corres para alcanzarlo";
            }
            else if (numPalabra == 3) {
                generada[0] = "avi\u00f3n";
                generada[1] = "Dos de estos hicieron una masacre un 11 de septiembre unu.";
            }
            else if (numPalabra == 4) {
                generada[0] = "motocicleta";
                generada[1] = "Dos personas en una de estas, con gorra y ";
            }
            else if (numPalabra == 5) {
                generada[0] = "bicicleta";
                generada[1] = "Tiene dos ruedas y todav\u00eda no se andar en ella :(";
            }
            else if (numPalabra == 6) {
                generada[0] = "monociclo";
                generada[1] = "Un payaso de circo anda montado en \u00e9l";
            }
            else if (numPalabra == 7) {
                generada[0] = "tren";
                generada[1] = "Hace chu chu";
            }
            else if (numPalabra == 8) {
                generada[0] = "metro";
                generada[1] = "Va llen\u00edsimo en las ma\u00f1anas y hasta te aplastan con las bolsas las se\u00f1oras >:|";
            }
            else if (numPalabra == 9) {
                generada[0] = "triciclo";
                generada[1] = "EL equivalente a una bicicleta para ni\u00f1os :)";
            }
            else {
                generada[0] = "patineta";
                generada[1] = "Tiene cuatro ruedas y no es coche, es chiquita y no es mi amiga Nadia.";
            }
        }
        else if (seleccionada == 7) {
            if (numPalabra == 1) {
                generada[0] = "alemania";
                generada[1] = "Ocasion\u00f3 la segunda guerra mundial.";
            }
            else if (numPalabra == 2) {
                generada[0] = "italia";
                generada[1] = "Pizza Pizza (no estamos asociados con LittleCaesar's)";
            }
            else if (numPalabra == 3) {
                generada[0] = "espa\u00f1a";
                generada[1] = "Ol\u00e9 t\u00edo.";
            }
            else if (numPalabra == 4) {
                generada[0] = "portugal";
                generada[1] = "Su capital es Lisboa";
            }
            else if (numPalabra == 5) {
                generada[0] = "grecia";
                generada[1] = "El Partenon.";
            }
            else if (numPalabra == 6) {
                generada[0] = "b\u00e9lgica";
                generada[1] = "Se habla flamenco, franc\u00e8s y alem\u00e1n en este pa\u00eds.";
            }
            else if (numPalabra == 7) {
                generada[0] = "austria";
                generada[1] = "Viena se encuentra en este pa\u00eds.";
            }
            else if (numPalabra == 8) {
                generada[0] = "francia";
                generada[1] = "Viva la Revoluci\u00f3n!";
            }
            else if (numPalabra == 9) {
                generada[0] = "dinamarca";
                generada[1] = "Tiene el mejor sistema educativo a nivel mundial.";
            }
            else {
                generada[0] = "suecia";
                generada[1] = "Es- el -colmo que no adivines esta.";
            }
        }
        else if (seleccionada == 8) {
            if (numPalabra == 1) {
                generada[0] = "estados unidos";
                generada[1] = "Capitalista de coraz\u00f3n";
            }
            else if (numPalabra == 2) {
                generada[0] = "m\u00e9xico";
                generada[1] = "Aya ya yai, canta y no llores...";
            }
            else if (numPalabra == 3) {
                generada[0] = "argentina";
                generada[1] = "Boludo, pero a poco no adivinas esta?";
            }
            else if (numPalabra == 4) {
                generada[0] = "chile";
                generada[1] = "Desafortunadamente no cabe en mi taquito :(";
            }
            else if (numPalabra == 5) {
                generada[0] = "colombia";
                generada[1] = "Antes era la capital de las drogras, ahora es M\u00e9xico.";
            }
            else if (numPalabra == 6) {
                generada[0] = "ecuador";
                generada[1] = "Las islas gal\u00e1pagos se encuentran en este bello lugar.";
            }
            else if (numPalabra == 7) {
                generada[0] = "guatemala";
                generada[1] = "Guatepeor.";
            }
            else if (numPalabra == 8) {
                generada[0] = "canad\u00e1";
                generada[1] = "Tienen por s\u00edmbolo nacional una hoja.";
            }
            else if (numPalabra == 9) {
                generada[0] = "panam\u00e1";
                generada[1] = "El canal m\u00e1s famoso de Am\u00e9rica.";
            }
            else {
                generada[0] = "brasil";
                generada[1] = "Se arman unos festivales bien extravagantes...";
            }
        }
        else if (seleccionada == 9) {
            if (numPalabra == 1) {
                generada[0] = "toy story";
                generada[1] = "los juguetes est\u00e1n vivos :O";
            }
            else if (numPalabra == 2) {
                generada[0] = "pinocho";
                generada[1] = "No deber\u00eda de mentir tanto...";
            }
            else if (numPalabra == 3) {
                generada[0] = "la bella y la bestia";
                generada[1] = "Lo que importa son los sentimientos, no la apariencia.";
            }
            else if (numPalabra == 4) {
                generada[0] = "La cenicienta";
                generada[1] = "Mi papel cuando me ponen a limpiar la casa :(";
            }
            else if (numPalabra == 5) {
                generada[0] = "blancanieves";
                generada[1] = "Como me siento cuando chiflo y me contesta un pajarito.";
            }
            else if (numPalabra == 6) {
                generada[0] = "zootopia";
                generada[1] = "Los animales son m\u00e1s humanos que los humanos.";
            }
            else if (numPalabra == 7) {
                generada[0] = "moana";
                generada[1] = "Deja que las olas te lleven.";
            }
            else if (numPalabra == 8) {
                generada[0] = "frozen";
                generada[1] = "Let it go!";
            }
            else if (numPalabra == 9) {
                generada[0] = "pocahontas";
                generada[1] = "Nativa Americana.";
            }
            else {
                generada[0] = "aladdin";
                generada[1] = "El genio de la l\u00e1mpara";
            }
        }
        return generada;
    }
}

