package com.darkdeymon.ceub_potosi.staticDataClases;

import com.darkdeymon.ceub_potosi.clases.Restaurantes;

import java.util.ArrayList;

public class RestaurantesData {
    private static ArrayList<Restaurantes> restaurantes = new ArrayList<Restaurantes>();
    private static boolean llenadores = true;
    public  static ArrayList<Restaurantes> getRestaurantesData(){

        if(llenadores){
            restaurantes.add(new Restaurantes(
                    "Picanteria Doña Irene",
                    "Oteros #108",
                    "74225022",
                    "https://lh3.googleusercontent.com/WcYtPxxZl6S4CgmXIGsMPh4iqnyCz-ctlrXqR3CRulgsvLIplN0PFnZWV2LodSC5OMqphO-VmyP5nTF1HyPR-K5opz9mOVMcICWeMuPizDKvMfpMDoZKi5LfOElpV147-oP6_zNXmA=w2400",
                    -19.577740f,
                    -65.763511f
            ));
            restaurantes.add(new Restaurantes("El Rincon del Buen Sazon","Hygland Players entre Univ. y America","76171021","https://lh3.googleusercontent.com/IFHpg2ilKX3Sny9tt3M4058jnPqZhWzvvvE1qCJw9qSalcTj1MivQrm3yyxSb8HxE8F6XyFVhpaO2ERCzFVUYFZsF_WJMsCukOb8rGnATp1gX9FIXQ8WOryit9kj-qOYXfV6HV4IcA=s224-p-k",-19.581249f,-65.762334f));
            restaurantes.add(new Restaurantes("Chiken Maria","Av. Univ. frente al Complejo Ferroviario","78743915","https://lh3.googleusercontent.com/J_GMQRDCdWBT9HUNQIruBS1QDk7-l-elEV16WN4YF6zeDZb5GssmfqgziDjVz6dI7L_R9BtELGOuUwm-L7vCZcwflRsqzWbhQBITU7uTLEnI5m44m76_Wb6G-VTFa2d0C2-_1nrjpQ=w2400",-19.581652f,-65.761738f));
            restaurantes.add(new Restaurantes("Picanteria Doña Irene","Calle Oteros #108","74225022","https://lh3.googleusercontent.com/TcfKWHWAsQXs6P00uRnhKe7ZQevzgKNmZhz919sThuntDcnw1mVw46zGy39tT2nXPO6i1vGUG_jVdFQIn0hevA-urqi9aMSKNmVrxtHiEksEB8RYtHvnxqhfN8adpR3r3efuoa6ilg=w2400",-19.578905f,-65.763746f));
            restaurantes.add(new Restaurantes("Café Restaurant “Urkupiña”","Av. Univ. ","74690890","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.578937f,-65.764239f));
            restaurantes.add(new Restaurantes("Pollos “Hong Kong”","Av. Univ. esquina Av. Ferroviaria","","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.579153f,-65.764444f));
            restaurantes.add(new Restaurantes("Broasteria “Virgen de Belén”","Av Universitaria Frente al Coliseo Ciudad de Plata","75846592","https://lh3.googleusercontent.com/gkcxnnLsM3TBV5siuIyJjZxrefShtCMd5fKSeu99mxdHxUZbhrCWvryaS_qZqe-z597wpDa1q8CfeqNLcj2VVEFJKbVn8mXb1poFTSiQ5wFZH1PG95-poEtrnX0bqhvNRlplspvWHg=w2400",-19.579885f,-65.763573f));
            restaurantes.add(new Restaurantes("Pension “Maria Rodriguez”","Calle Otero #104","72357752","https://lh3.googleusercontent.com/knJeD5yTJ2pVsNFz9jQvzst0CkcBKN7HQHMRvhrS0JSIxPebXQYJ4RzLgppm7sy5Y39p-aCpiWaqMwXt4YdL6G83XLZoP05zdnsalzC2qbgmkbdZyXCVkkSaDH1SWyXdCpqdDQ0FAQ=w2400",-19.579096f,-65.763569f));
            restaurantes.add(new Restaurantes("Patty´s Chiken","Av. Univ #141","77113108","https://lh3.googleusercontent.com/_u1zpePdCuY8lWcCvwCCsqKicBZJW4NwDOzhtRdkta2-2WLnwWlV2-HA6JZG4MVEK90iWZlFFjvym1OoxQKQjI-I6zpD4SlHT--eo4CacGcFpLYcrqyLXmaFm2sluGxYEQVKdtZdsA=w2400",-19.579130f,-65.764278f));
            restaurantes.add(new Restaurantes("Ponchy II","Hygland Players #297","73888579","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.581189f,-65.762512f));
            restaurantes.add(new Restaurantes("Ponchy","Hygland Players #377","73883937","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.580045f,-65.761192f));
            restaurantes.add(new Restaurantes("Chicharroneria “El Chanchito”","Av Univ. esq. Hygland Players","78621971","https://lh3.googleusercontent.com/XA-QT0Y2EaIcSikRsHLsIeLSwiC5OmMMx0THgBiLqzKg9hgvWV1EoCWF2U0tAjYMNFEDhwYQmQygjL2KhVHp50hgwsMmIlLx-TvSUcqoMrQdu10rrECYu1VQYtWrt9d5kqRK7nIKaQ=w2400",-19.581092f,-65.762076f));
            restaurantes.add(new Restaurantes("picantería gustitos","Fortunato Gumiel","65344122","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.586861f,-65.757708f));
            restaurantes.add(new Restaurantes("Churrasqueria “ Don Jaimito”","Fortunato Gumiel","2622458","https://lh3.googleusercontent.com/FiLp2L6sfNW_jYjQe3bCL4ofucYP1n6iVak4Uyhf1hgx4gKTALd5LcSQBsFZNDO3PH6JBdH0b-pFGPP-_ADfl_zzqves4sALB1szbMnerwpZqfb0xzDLJZms2gorWcjjYWQhkOnVfg=w2400",-19.686861f,-65.757708f));
            restaurantes.add(new Restaurantes("Churrasqueria “ el asador”","Fortunato Gumiel","72589645","https://lh3.googleusercontent.com/FiLp2L6sfNW_jYjQe3bCL4ofucYP1n6iVak4Uyhf1hgx4gKTALd5LcSQBsFZNDO3PH6JBdH0b-pFGPP-_ADfl_zzqves4sALB1szbMnerwpZqfb0xzDLJZms2gorWcjjYWQhkOnVfg=w2400",-19.587035f,-65.757835f));
            restaurantes.add(new Restaurantes("EL CATRIN","QUUIJARRO Nº 3","70455191","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.585740f,-65.753366f));
            restaurantes.add(new Restaurantes("HAWAI","calle Bolívar nº 808","26226364","https://lh3.googleusercontent.com/gkcxnnLsM3TBV5siuIyJjZxrefShtCMd5fKSeu99mxdHxUZbhrCWvryaS_qZqe-z597wpDa1q8CfeqNLcj2VVEFJKbVn8mXb1poFTSiQ5wFZH1PG95-poEtrnX0bqhvNRlplspvWHg=w2400",-19.587591f,-65.753107f));
            restaurantes.add(new Restaurantes("“las leñas”","Calle Quijarro # 15","62-304991","https://lh3.googleusercontent.com/H4SBZeZlxo1TPRS7pS56m5J42sjmli_DhqJOP2pLyV0mvwnHZYikiWmdGdq7LJM1ZSUZu5GCA1MfYA3FszrVhp17hVICtF6NJgXaohO9dpmxrzu9oAzIR7zVVu21R5TeGSxs9IQeqw=w2400",-19.586974f,-65.754232f));
            restaurantes.add(new Restaurantes("Cafetería capricornio","calle sucre #11 ","77477722","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.589338f,-65.752755f));
            restaurantes.add(new Restaurantes("“Brosty”","Calle Cobija Nº 29 entre Oruro y Bustillos","72379180","https://lh3.googleusercontent.com/gkcxnnLsM3TBV5siuIyJjZxrefShtCMd5fKSeu99mxdHxUZbhrCWvryaS_qZqe-z597wpDa1q8CfeqNLcj2VVEFJKbVn8mXb1poFTSiQ5wFZH1PG95-poEtrnX0bqhvNRlplspvWHg=w2400",-19.589634f, -65.754268f));
            restaurantes.add(new Restaurantes("“ El Pizzarron”","Bolívar Nº 876","62-30848","https://lh3.googleusercontent.com/H4SBZeZlxo1TPRS7pS56m5J42sjmli_DhqJOP2pLyV0mvwnHZYikiWmdGdq7LJM1ZSUZu5GCA1MfYA3FszrVhp17hVICtF6NJgXaohO9dpmxrzu9oAzIR7zVVu21R5TeGSxs9IQeqw=w2400",-19.587549f,-65.753497f));
            restaurantes.add(new Restaurantes("“Los Tronquitos”","Pasaje Boulevard Nº 8","62-22868","https://lh3.googleusercontent.com/OFB_sa6LGvRy5UmW7cknz0WtCCIJsXSFs2zyTl-gMW8ssnCb6ZlOb6hTMzCZn83SwtCdKh2HWyMDGfAtoIpPANerfvSAkKXLVWxKDpPpYAXYh2QQtyvJA4D424vVckEL4nJh6_ixPw=w2400",-19.589268f, -65.752494f));
            restaurantes.add(new Restaurantes("“Santa clara”","Pasaje Boulevard Nº 33 entre Bolívar y matos ","6223746","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.587754f,-65.752632f));
            restaurantes.add(new Restaurantes("“TUKO’S”","Calle Hoyos Nº 29 entre Porko Y La paz  ","(+591)2623055","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.588661f, -65.750325f));
            restaurantes.add(new Restaurantes("“el fogón”","Calle Oruro Nº","","https://lh3.googleusercontent.com/_L6EwD0P4-kOv2Uze0l4awwpJBfmVnO0sZOx0fvWn8P-q7lRhGRMSnF8WGzHeOpJhICR-z1b7A7LThvwMWpBZtitdgoaEikcSkyDcs0DlfumSq2iwCpcEdsA51g81qle2cva6cqGnQ=w2400",-19.588437f, -65.755452f));
            restaurantes.add(new Restaurantes("“La Tranquita”","Calle Bolivar  Nº 1084   entre la calle La paz y pasaje boulevard ","","https://lh3.googleusercontent.com/PUtN8PotIHgq5uNb0Sruk0U_HE_Ujeilrb9zKnuioYnLftegQVihI4_cBwPVbP1-If1a5gk8RifBPmzTvTq62Z6qYOHM0MmY8Tv9DHD5Sqp7xkqI0aAYwlheZN8iYJKcVvA2BxYLew=w2400",-19.587654f,-65.751571f));
            restaurantes.add(new Restaurantes("“COMEDOR DEL MERCADO CENTRAL”","Calle bolívar","","https://lh3.googleusercontent.com/1keIaS-1G5kGc9DUdfmJL6Yuyl4gwfyayYbnRJzCJPTP_AbJHECuvX7k5hoVbVpIaRWUb8gGDX4cRiA2oHrqYuPvY6PSqDiEnZKzaUOC5TOPwg8SqTAK15vzfyWqXE-D2N4lKQorJA=w2400",-19.587410f,-65.755029f));
            restaurantes.add(new Restaurantes("“4.060”","Calle hoyos #1","","https://lh3.googleusercontent.com/fIpJArHDdro98a_0RHBqiURcUu44k7IJl0SIu3o_tKq8JYf4b41hQohfcO1f-QdRSjqZD9YhxJgBZS54z2P226d8ZTXHX_UVnq1igmWhAg_3qCS0cMDVqqt1BcqmJR7BXEbUBRLg0w=w2400",-19.588672f,-65.752145f));

            llenadores =false;
        }
        return restaurantes;
    }
}
