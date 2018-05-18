package com.darkdeymon.ceub_potosi.staticDataClases;

import com.darkdeymon.ceub_potosi.clases.Bancos;

import java.util.ArrayList;

public class BancosData {
    private static ArrayList<Bancos> bancos = new ArrayList<Bancos>();
    private static boolean llenadoBa = true;

    public static ArrayList<Bancos> getBancos(){
        if (llenadoBa){

            bancos.add(new Bancos(
                "Banco de Credito BCP",
                "Calle Bustillos y Ayacucho",
                "Cajero",
                -19.588973f,
                -65.754494f
            ));
            bancos.add(new Bancos("Banco Unión","Av. Litoral entre Arce y Colquechaca","Cajero",-19.579889f,-65.755619f));
            bancos.add(new Bancos("Banco Unión","C/ Boulevard Esq. Matos ","Cajero",-19.587517f,-65.753189f));
            bancos.add(new Bancos("Banco Unión","Sucre esquina Matos ","Cajero",-19.588013f,-65.752505f));
            bancos.add(new Bancos("Banco Unión","Cochabamba edif. Entel","Cajero",-19.588023f,-65.756384f));
            bancos.add(new Bancos("Banco Unión","Camacho entre Oruro y Bolívar","Cajero",-19.586569f,-65.756618f));
            bancos.add(new Bancos("Banco Unión","Bolívar entre Junín y Boulevard","Cajero",-19.587517f,-65.753189f));
            bancos.add(new Bancos("Banco Unión","Boulevard Esq. Matos ","Cajero",-19.587975f,-65.752519f));
            bancos.add(new Bancos("Banco Unión","Cívica entre Oruro y Serrudo","Cajero",-19.584905f,-65.756575f));
            bancos.add(new Bancos("Banco Unión","Litoral entre Arce y Colquechaca","Cajero",-19.579889f,-65.755619f));
            bancos.add(new Bancos("Banco Unión","Wenceslao Alba Casi esq. Villazon","Cajero",-19.582182f,-65.757779f));
            bancos.add(new Bancos("Banco Unión","Calle Antofagasta entre San Alberto y Sebilla","Cajero",-19.582824f,-65.760249f));
            bancos.add(new Bancos("Banco Unión","Av. Murillo Entre Manrique y Gareca","Cajero",-19.570368f,-65.767224f));
            bancos.add(new Bancos("Banco Unión","Hoyos esquina transversal Linares","Cajero",-19.588828f,-65.747671f));
            bancos.add(new Bancos("BANCO MERCANTIL SANTA CRUZ ","Av. Litoral esquina Chayanta","Cajero",-19.581133f,-65.752451f));
            bancos.add(new Bancos("BANCO MERCANTIL SANTA CRUZ ","Av. Del maestro entre Villazon y Arce","Cajero",-19.582025f,-65.757984f));
            bancos.add(new Bancos("BANCO MERCANTIL SANTA CRUZ ","Av. Sanjinés final Av. Murillo","Cajero",-19.576962f,-65.765263f));
            bancos.add(new Bancos("BANCO MERCANTIL SANTA CRUZ ","Av. Las Banderas esq. Circunvalación","Cajero",-19.570200f,-65.754953f));
            bancos.add(new Bancos("BANCO MERCANTIL SANTA CRUZ ","Av. Las Banderas esq. Circunvalación","Cajero",-19.570200f,-65.754953f));
            bancos.add(new Bancos("BANCO DE CREDITO (BCP)","C/ Bolívar entre sucre y Simón Chacón  ","Cajero",-19.587408f,-65.752362f));
            bancos.add(new Bancos("BANCO DE CREDITO (BCP)","Av. Antofagasta entre San Alberto y Sebilla","Cajero",-19.582840f,-65.760214f));
            bancos.add(new Bancos("BANCO DE CREDITO (BCP)","Av. Camacho esq.  Pasaje Chichas y Oruro","Cajero",-19.587763f,-65.756322f));
            bancos.add(new Bancos("BANCO DE CREDITO (BCP)","Murillo zona Satélite","Cajero",-19.570284f,-65.767071f));
            bancos.add(new Bancos("BANCO DE CREDITO (BCP)","C/ Pando entre Santa Cruz y Arce","Cajero",-19.578055f,-65.753915f));
            bancos.add(new Bancos("BANCO BISA","C/ Boulevard entre Matos y Bolívar","Cajero",-19.587869f,-65.752582f));
            bancos.add(new Bancos("BANCO BISA","Mercado Uyuni pasaje Medinaceli y Av. Santa Cruz","Cajero",-19.577930f,-65.754494f));
            bancos.add(new Bancos("BANCO BISA","Av. Villazon entre San Alberto y Wenceslao Alba","Cajero",-19.581904f,-65.757880f));
            bancos.add(new Bancos("BANCO BISA","Av. Antofagasta entre Sebilla y San Alberto","Cajero",-19.582999f,-65.760019f));
            bancos.add(new Bancos("BANCO BISA","Av. Independencia esq. Av. Universitaria","Cajero",-19.578066f,-65.768005f));
            bancos.add(new Bancos("BANCO BISA","Medinaceli y Av. Santa Cruz","Cajero",-19.580136f,-65.754462f));
            bancos.add(new Bancos("BANCO BISA","C/ Boulevard entre Matos y Bolívar","Cajero",-19.589132f,-65.752628f));
            bancos.add(new Bancos("BANCO FIE","Av. Sanjinés esq. Universitaria","Cajero",-19.577728f,-65.765769f));
            bancos.add(new Bancos("BANCO FIE","Av. Universitaria Esq. Ecuador","Cajero",-19.577304f,-65.766276f));
            bancos.add(new Bancos("BANCO FIE","Av. Cívica entre Oruro y Serrudo","Cajero",-19.584448f,-65.756147f));
            bancos.add(new Bancos("BANCO FIE","Plaza 10 de noviembre C/ Tarija","Cajero",-19.589149f,-65.753127f));
            bancos.add(new Bancos("BANCO FIE","Av. Murillo entre Manríquez y Gareca","Cajero",-19.571410f,-65.766970f));
            bancos.add(new Bancos("BANCO SOL","C/ Padilla entre Chuquisaca y Linares","Cajero",-19.589463f,-65.752444f));
            bancos.add(new Bancos("BANCO SOL","Av. Pando y Av. Santa Cruz","Cajero",-19.578956f,-65.753395f));
            bancos.add(new Bancos("BANCO SOL","Av. Universitaria Esq. H. Player","Cajero",-19.581074f,-65.762012f));
            bancos.add(new Bancos("BANCO SOL","C/ Padilla entre Chuquisaca y Linares","Cajero",-19.589463f,-65.752444f));
            bancos.add(new Bancos("ECOFUTURO","C/ Bolívar esq. Bustillo","Cajero",-19.587563f,-65.754688f));
            bancos.add(new Bancos("ECOFUTURO","Mercado Uyuni Av. Santa Cruz y 15 de Mayo","Cajero",-19.578856f,-65.753374f));
            bancos.add(new Bancos("ECOFUTURO","Mercado Uyuni Av. Santa Cruz y 15 de Mayo","Cajero",-19.578856f,-65.753374f));
            bancos.add(new Bancos("ECOFUTURO","C/ Padilla entre Matos y Hoyos","Cajero",-19.588413f,-65.752580f));
            bancos.add(new Bancos("LOS ANDES PROCREDIT","C/ Junín Nº 5  esq. Bolívar y Matos Zona Central","Cajero",-19.587679f,-65.753130f));
            bancos.add(new Bancos("LOS ANDES PROCREDIT","C/ Junín esq. Bolívar y Matos","Cajero",-19.588268f,-65.752243f));
            bancos.add(new Bancos("LOS ANDES PROCREDIT","Av. Antofagasta entre San Alberto y Sebilla","Cajero",-19.583098f,-65.759982f));
            bancos.add(new Bancos("PRODEM","C/ Junín Nº 5  entre  Bolívar y Matos Zona Central","Cajero",-19.587676f,-65.753174f));
            bancos.add(new Bancos("PRODEM","C/ Sanjinés esq. Universitaria (Frente ex – terminal)","Cajero",-19.577624f,-65.766046f));
            bancos.add(new Bancos("PRODEM","C/ Junín entre Bolívar y Matos","Cajero",-19.587676f,-65.753174f));
            bancos.add(new Bancos("PRODEM","Av. Murillo 173","Cajero",-19.569359f,-65.767493f));

            llenadoBa =false;
        }
        return bancos;
    }
}
