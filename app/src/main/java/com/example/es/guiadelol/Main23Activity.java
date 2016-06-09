package com.example.es.guiadelol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main23Activity extends AppCompatActivity {

    private String res;
    private ImageView imv;
    private TextView tvnom;
    private TextView tvnomn;
    private TextView tvnomc;
    private ImageView imvpasiva;
    private TextView tvnompasiva;
    private TextView tvdespasiva;
    private ImageView imvq;
    private TextView tvnomq;
    private TextView tveq;
    private TextView tvdesq;
    private ImageView imvw;
    private TextView tvnomw;
    private TextView tvew;
    private TextView tvdesw;
    private ImageView imve;
    private TextView tvnome;
    private TextView tvee;
    private TextView tvdese;
    private ImageView imvr;
    private TextView tvnomr;
    private TextView tver;
    private TextView tvdesr;
    private TextView tvcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        Bundle b=this.getIntent().getExtras();
        res=b.getString("valor").toString();
        ImageView imv=(ImageView)findViewById(R.id.ima);
        TextView tvnom=(TextView)findViewById(R.id.nom);
        TextView tvnomn=(TextView)findViewById(R.id.nomn);
        TextView tvnomc=(TextView)findViewById(R.id.nomc);
        ImageView imvpasiva=(ImageView)findViewById(R.id.ipasiva);
        TextView tvnompasiva=(TextView)findViewById(R.id.nompasiva);
        TextView tvdespasiva=(TextView)findViewById(R.id.despasiva);
        ImageView imvq=(ImageView)findViewById(R.id.iq);
        TextView tvnomq=(TextView)findViewById(R.id.nomq);
        TextView tveq=(TextView)findViewById(R.id.eq);
        TextView tvdesq=(TextView)findViewById(R.id.desq);
        ImageView imvw=(ImageView)findViewById(R.id.iw);
        TextView tvnomw=(TextView)findViewById(R.id.nomw);
        TextView tvew=(TextView)findViewById(R.id.ew);
        TextView tvdesw=(TextView)findViewById(R.id.desw);
        ImageView imve=(ImageView)findViewById(R.id.ie);
        TextView tvnome=(TextView)findViewById(R.id.nome);
        TextView tvee=(TextView)findViewById(R.id.ee);
        TextView tvdese=(TextView)findViewById(R.id.dese);
        ImageView imvr=(ImageView)findViewById(R.id.ir);
        TextView tvnomr=(TextView)findViewById(R.id.nomr);
        TextView tver=(TextView)findViewById(R.id.er);
        TextView tvdesr=(TextView)findViewById(R.id.desr);
        TextView tvcon=(TextView)findViewById(R.id.con);
        Toast.makeText(getApplicationContext(), "==>" + res, Toast.LENGTH_SHORT).show();
        if(res.equals("aatrox"))
        {
            imv.setImageDrawable(getDrawable(R.drawable.aatrox));
            tvnom.setText("aatrox");
            tvnomn.setText("La Espada de los Oscuros");
            tvnomc.setText("Luchador,Tanque");
            imvpasiva.setImageDrawable(getDrawable(R.drawable.aatroxp));
            tvnompasiva.setText("Pozo Sangriento(Pasiva)");
            tvdespasiva.setText("Al usar una habilidad que cuesta Vida, Aatrox acumula en el Pozo Sangriento el daño que se infligió a sí mismo. Cuando sufre un ataque mortal, Aatrox extrae la sangre del pozo y la recupera como Vida durante un breve periodo de tiempo. Además, gana un 1% de Velocidad de Ataque por cada 2% de sangre que haya en el pozo.");
            imvq.setImageDrawable(getDrawable(R.drawable.aatroxq));
            tvnomq.setText("Vuelo Oscuro (Q)");
            tvdesq.setText("Al estar activa, Aatrox inflige daño adicional cada tres ataques consecutivos a costa de su propia Vida. Al estar desactivada, Aatrox recupera Vida cada tercer ataque consecutivo.\n" +
                    "Desactivado:\n" +
                    "Sed de Sangre: En cada tercer ataque, Aatrox restaura 20/25/30/35/40 (+25% Daño de Ataque adicional) de Vida. Se incrementa un 200% cuando está debajo de la mitad de su Vida.\n" +
                    "Activado: Precio sangriento: Cada tercer ataque, Aatrox inflige 60/95/130/165/200 (+100% Daño de Ataque adicional) de daño físico adicional y pierde de Vida.");
            imvw.setImageDrawable(getDrawable(R.drawable.aatroxw));
            tvnomw.setText("Sed de Sangre (W)");
            tvdesw.setText("Al estar activa, Aatrox inflige daño adicional cada tres ataques consecutivos a costa de su propia Vida. Al estar desactivada, Aatrox recupera Vida cada tercer ataque consecutivo.\n" +
                    "Desactivado:\n" +
                    "Sed de Sangre: En cada tercer ataque, Aatrox restaura 20/25/30/35/40 (+25% Daño de Ataque adicional) de Vida. Se incrementa un 200% cuando está debajo de la mitad de su Vida.\n" +
                    "Activado: Precio sangriento: Cada tercer ataque, Aatrox inflige 60/95/130/165/200 (+100% Daño de Ataque adicional) de daño físico adicional y pierde de Vida.");
            imve.setImageDrawable(getDrawable(R.drawable.aatroxe));
            tvnome.setText("Espada del Tromento (E)");
            tvdese.setText("Aatrox desata el poder de su espada, que inflige daño y ralentiza a los enemigos impactados.\n" +
                    "Aatrox desata el poder de su espada, que inflige 75/110/145/180/215 (+60% Poder de Habilidad) (+60% Daño de Ataque adicional) de Daño Mágico a los enemigos impactados y los ralentiza un 40% durante 1.75/2/2.25/2.5/2.75 segundos.");
            imvr.setImageDrawable(getDrawable(R.drawable.aatroxr));
            tvnomr.setText("Masacre (R)");
            tvdesr.setText("Aatrox obtiene la sangre de sus enemigos e inflige daño a todos los campeones enemigos cercanos a él. Además, obtiene Velocidad de Ataque y Alcance de Ataque adicional durante un breve periodo de tiempo.\n" +
                    "Aatrox absorbe la sangre de sus enemigos e inflige 200/300/400 (+100% Poder de Habilidad) de daño mágico a los campeones enemigos que lo rodean. Masacre llena el Pozo Sangriento de Aatrox un 20% por cada campeón que alcance, aumenta un 40/50/60% la velocidad de ataque y proporciona 175 de alcance a su ataque durante 12 segundos.");
            tvcon.setText("Lo mejor es evitar entrar en combate con poca vida, a menos que Pozo Sangriento este tan lleno que se pueda recuperar vida suficiente como para seguir luchando" +
                    "El robo de vida puede ser muy potente con Aatrox para compensar sus costes de vida");

        }else{
            if(res.equals("ahri"))
            {
                imv.setImageDrawable(getDrawable(R.drawable.ahri));
                tvnom.setText("ahri");
                tvnomn.setText("La Mujer Zorro de Nueve Colas");
                tvnomc.setText("Luchador,Asesino");
                imvpasiva.setImageDrawable(getDrawable(R.drawable.ahrip));
                tvnompasiva.setText("Ladrona de Esencias(Pasiva)");
                tvdespasiva.setText("Obtiene una carga de Ladrona de Esencias cada vez que uno de sus hechizos impacta sobre un enemigo (máximo: 3 cargas por hechizo). Al alcanzar 9 cargas, el siguiente hechizo de Ahri la va a curar cada vez que golpee a un enemigo.");
                imvq.setImageDrawable(getDrawable(R.drawable.ahriq));
                tvnomq.setText("Orbe del Engaño (Q)");
                tvdesq.setText("Ahri lanza y recupera su orbe, infligiendo Daño Mágico al lanzarlo y daño verdadero al recuperarlo. Ahri gana Velocidad de Movimiento decreciente cuando se mueve el orbe.\n" +
                        "Inflige 40/65/90/115/140 (+35% Poder de Habilidad) de Daño Mágico al ir y 40/65/90/115/140 (+35% Poder de Habilidad) de daño verdadero al regresar.Ahri gana Velocidad de Movimiento decreciente cuando se mueve el orbe.");
                imvw.setImageDrawable(getDrawable(R.drawable.ahriw));
                tvnomw.setText("Fuego Zorruno (W)");
                tvdesw.setText("Ahri lanza tres fuegos zorrunos que fijan y atacan a los enemigos cercanos.\n" +
                        "Lanza tres fuegos zorrunos que se atacan a enemigos cercanos (priorizando a los campeones) e infligen 40/65/90/115/140 (+40% Poder de Habilidad) de Daño Mágico.Si varios fuegos zorrunos atacan al mismo enemigo, éste sólo recibirá un 30% de daño de todos los golpes tras el primero, hasta un máximo de 0 de daño.");
                imve.setImageDrawable(getDrawable(R.drawable.ahrie));
                tvnome.setText("Encanto (E)");
                tvdese.setText("Ahri lanza un beso que daña y hechiza al enemigo al que alcance primero, provocando que avance inofensivamente hacia ella.\n" +
                        "Lanza un beso que inflige 60/95/130/165/200 (+50% Poder de Habilidad) de Daño Mágico y hechiza al enemigo, lo que provoca que avance hacia Ahri de manera inofensiva durante 1/1.25/1.5/1.75/2 segundos.");
                imvr.setImageDrawable(getDrawable(R.drawable.ahrir));
                tvnomr.setText("Impulso Espiritual (R)");
                tvdesr.setText("Ahri corre hacia adelante y dispara rayos de esencia, infligiendo daños a 3 enemigos cercanos (da prioridad a Campeones). Impulso Espiritual podrá usarse hasta tres veces antes de entrar en Enfriamiento.\n" +
                        "Corre con agilidad hacia adelante y lanza 3 rayos de esencia a los enemigos cercanos (priorizan a los campeones), infligiéndoles 70/110/150 (+30% Poder de Habilidad) puntos de Daño Mágico. Puede usarse hasta tres veces en un plazo de 10 segundos antes de entrar en Enfriamiento.");
                tvcon.setText("El mejor combo que se puede hacer incluso a niveles bajos es la E, W y Q correspondentemente, no solo bajara vida sino q los puedes matar solo con ese combo mas el Prender." +
                        "Una vez tenida la R, puedes lanzarte a Encantarlos y meterles el combo, La R es tanto como para esquivar como para cazar y escaparse");

            }else{
                if(res.equals("akali"))
                {
                    imv.setImageDrawable(getDrawable(R.drawable.akali));
                    tvnom.setText("akali");
                    tvnomn.setText("El Puño de la Sombra");
                    tvnomc.setText("Asesino");
                    imvpasiva.setImageDrawable(getDrawable(R.drawable.akalip));
                    tvnompasiva.setText("Disciplinas Gemelas(Pasiva))");
                    tvdespasiva.setText("Disciplina de Fuerza: Los ataques básicos de Akali infligen un 6% más de daño mágico, que aumenta un 1% por cada 6 puntos de Poder de Habilidad.\n" +
                            "\n" +
                            "Disciplina de Poder: Akali consigue un 6% de Vampirismo de Hechizo, que aumenta un 1% por cada 6 puntos de Daño de Ataque adicional.");
                    imvq.setImageDrawable(getDrawable(R.drawable.akaliq));
                    tvnomq.setText("Marca del Asesino (Q)");
                    tvdesq.setText("Akali lanza su kama a un objetivo, que además de recibir daño mágico, queda marcado durante 6 segundos. Los ataques cuerpo a cuerpo de Akali contra un objetivo marcado activan y utilizan la marca para provocarle daño adicional y restaurar energía.\n" +
                            "Akali lanza su kama a un objetivo, que además de recibir 35/55/75/95/115 (+40% Poder de Habilidad) de daño mágico, queda marcado durante 6 segundos.Los ataques cuerpo a cuerpo de Akali contra un objetivo marcado consumen la marca para infligirle 45/70/95/120/145 (+50% Poder de Habilidad) de daño adicional y restaurar 40 de Energía.");
                    imvw.setImageDrawable(getDrawable(R.drawable.akaliw));
                    tvnomw.setText("Manto Crepuscular (W)");
                    tvdesw.setText("Akali lanza una cortina de humo. Mientras se encuentra dentro del área, aumenta durante breve tiempo su Velocidad de Movimiento y se vuelve invisible. Si ataca o usa habilidades se revela durante unos instantes. Los enemigos que están dentro del humo ven reducida su Velocidad de Movimiento.\n" +
                            "Akali lanza una cortina de humo que dura 8 segundos. Mientras se encuentra dentro del área, Akali se vuelve invisible y gana un 20/40/60/80/100% de Velocidad de Movimiento, que va decreciendo a lo largo de 1 segundo. Si ataca o usa habilidades se revela durante unos instantes.Los enemigos que están dentro del humo sufren un 14/18/22/26/30% de ralentización.");
                    imve.setImageDrawable(getDrawable(R.drawable.akalie));
                    tvnome.setText("Cuchilla Creciente (E)");
                    tvdese.setText("Akali blande su kama, infligiendo un daño que depende de su Daño de Ataque y su Poder de Habilidad.\n" +
                            "Akali utiliza sus kamas para golpear a las unidades cercanas y causarles 30/55/80/105/130 (+60% Daño de Ataque) (+40% Poder de Habilidad) de Daño Físico.");
                    imvr.setImageDrawable(getDrawable(R.drawable.akalir));
                    tvnomr.setText("Baile Sombrio (R)");
                    tvdesr.setText("Akali se mueve a través de las sombras para golpear con rapidez a su objetivo, al que le inflige daño mientras consume una carga de Esencia de Sombra. Akali recarga Esencia de Sombra tanto de forma periódica como con los asesinatos y ayudas, hasta un máximo de 3 acumulaciones.\n" +
                            "Akali se mueve a través de las sombras para golpear con rapidez a su objetivo, al que inflige 100/175/250 (+50% Poder de Habilidad) puntos de daño mágico.Akali almacena una Esencia de Sombra con los asesinatos y ayudas, además de otra cada 30/22.5/15 segundos, hasta un máximo de 3.");
                    tvcon.setText("Akali es muy buena matando personajes debiles. Deja que tu equipo ataque y golpea a la gente por la espalda" +
                            "Encuentra el equilibrio entre almacenar Ecensia de Sombra y usar Bile Sombrio antes de tener cargas maximas");

                }else{
                    if(res.equals("alistar"))
                    {
                        imv.setImageDrawable(getDrawable(R.drawable.alistar));
                        tvnom.setText("alistar");
                        tvnomn.setText("El Minotauro");
                        tvnomc.setText("Apoyo,Tanque");
                        imvpasiva.setImageDrawable(getDrawable(R.drawable.alistarp));
                        tvnompasiva.setText("Pisotear(Pasiva))");
                        tvdespasiva.setText("Cada vez que Alistar lanza un hechizo, atropella a las unidades cercanas durante unos segundos, e inflige daño a las unidades a las que pisotee.");
                        imvq.setImageDrawable(getDrawable(R.drawable.alistarq));
                        tvnomq.setText("Pulverizar (Q)");
                        tvdesq.setText("Alistar golpea con fuerza el suelo e inflige daño a los enemigos cercanos y los arroja por los aires durante 1,5 segundos. Al caer, los enemigos quedan aturdidos.\n" +
                                "Alistar azota el piso, lo que inflige 60/105/150/195/240 (+50% Poder de Habilidad) de Daño Mágico y arroja por los aires a las unidades enemigas cercanas, lo que las aturde durante 1.5 segundos.");
                        imvw.setImageDrawable(getDrawable(R.drawable.alistarw));
                        tvnomw.setText("Testarazo (W)");
                        tvdesw.setText("Alistar propina un cabezazo al objetivo, dañándolo y empujándolo hacia atrás.\n" +
                                "Alistar embiste contra un enemigo, lo que inflige 55/110/165/220/275 (+70% Poder de Habilidad) de daño mágico y lo derriba.");
                        imve.setImageDrawable(getDrawable(R.drawable.alistare));
                        tvnome.setText("Rugido Triunfal (E)");
                        tvdese.setText("Alistar propina un cabezazo al objetivo, dañándolo y empujándolo hacia atrás.\n" +
                                "Alistar embiste contra un enemigo, lo que inflige 55/110/165/220/275 (+70% Poder de Habilidad) de daño mágico y lo derriba.");
                        imvr.setImageDrawable(getDrawable(R.drawable.alistarr));
                        tvnomr.setText("Voluntad Inquebrantable (R)");
                        tvdesr.setText("Alistar deja salir un gran rugido con el que inflige daño adicional, elimina todos los efectos de control de masas que le afectan y reduce el daño físico y mágico recibido mientras dura el efecto.\n" +
                                "Elimina las debilitaciones de Alistar, y éste obtiene 60/75/90 de Daño de Ataque, y recibe un 70% menos de daño físico y mágico durante 7 segundos.");
                        tvcon.setText("Usar Pulverizacion te ayudara a colocarte mejor para el Testarazo" +
                                "La velocidad de movimiento es muy importante con Alistar. Elje con cuidado las botas q vas a comprar");
                    }else{
                        if(res.equals("amumu"))
                        {
                            imv.setImageDrawable(getDrawable(R.drawable.amumu));
                            tvnom.setText("amumu");
                            tvnomn.setText("La Momia Triste");
                            tvnomc.setText("Luchador,Tanque");
                            imvpasiva.setImageDrawable(getDrawable(R.drawable.amumup));
                            tvnompasiva.setText("Toque Maldito(Pasiva))");
                            tvdespasiva.setText("Los ataques de Amumu reducen la Resistencia Mágica del objetivo durante breve tiempo.");
                            imvq.setImageDrawable(getDrawable(R.drawable.amumuq));
                            tvnomq.setText("Lanzamiento de Vendas (Q)");
                            tvdesq.setText("Amumu lanza una venda adhesiva a un objetivo, causándole daño y aturdimiento mientras se acerca a él.\n" +
                                    "Lanza una venda hacia un punto. Si alcanza a una unidad enemiga, Amumu se acerca a ella, la aturde durante 1 segundo y le inflige 80/130/180/230/280 (+70% Poder de Habilidad) puntos de daño mágico.");
                            imvw.setImageDrawable(getDrawable(R.drawable.amumuw));
                            tvnomw.setText("Desesperanza (W)");
                            tvdesw.setText("Abrumados por la angustia, los enemigos cercanos pierden cada segundo un porcentaje de su Vida máxima.\n" +
                                    "Activación: Los enemigos cercanos reciben 8/12/16/20/24 puntos de daño mágico más un 1/1.5/2/2.5/3 (+1% Poder de Habilidad)% de su Vida máxima cada segundo.");
                            imve.setImageDrawable(getDrawable(R.drawable.amumue));
                            tvnome.setText("Berrinche (E)");
                            tvdese.setText("Reduce permanentemente el daño físico que recibe Amumu. Amumu puede desatar su furia para infligir daño a los enemigos cercanos. Cada vez que recibe un golpe, el enfriamiento de Berrinche se reduce 0,5 segundos.\n" +
                                    "Pasiva: Amumu recibe 2/4/6/8/10 puntos de daño menos de ataques físicos.\n" +
                                    "Activa: Amumu inflige 75/100/125/150/175 (+50% Poder de Habilidad) puntos de daño mágico a las unidades circundantes. Cada vez que Amumu recibe un golpe, el enfriamiento de Berrinche se reduce en 0,5 segundos.");
                            imvr.setImageDrawable(getDrawable(R.drawable.amumur));
                            tvnomr.setText("Maldicion de la Momia Triste (R)");
                            tvdesr.setText("Amumu envuelve en vendas a las unidades enemigas cercanas, infligiéndoles daño e impidiéndoles atacar o moverse.\n" +
                                    "Amumu enreda a las unidades enemigas que lo rodean, causa 150/250/350 (+80% Poder de Habilidad) daño mágico e impide los ataques y movimientos durante 2 segundos.");
                            tvcon.setText("Amumu depende en gran medida de sus compañeros, procura colocarte el la calle de tus amigos para ser mas eficaz" +
                                    "La reduccion de enfriamiento de Amumu es muy beneficiosa, pero suele ser dificil obtenerlamediante objetos. Emplea la mejora del azul siempre q puedas para ganar reduccion ");
                        }else{
                            if(res.equals("anivia"))
                            {
                                imv.setImageDrawable(getDrawable(R.drawable.anivia));
                                tvnom.setText("anivia");
                                tvnomn.setText("La crio Feliz");
                                tvnomc.setText("Luchador,Apoyo");
                                imvpasiva.setImageDrawable(getDrawable(R.drawable.aniviap));
                                tvnompasiva.setText("Renacimiento(Pasiva))");
                                tvdespasiva.setText("Al morir, Anivia pasa a convertirse en huevo. Si éste sobrevive 6 segundos, renace en todo su esplendor.");
                                imvq.setImageDrawable(getDrawable(R.drawable.aniviaq));
                                tvnomq.setText("Destello Helado (Q)");
                                tvdesq.setText("Anivia junta sus alas e invoca una esfera de hielo que vuela hacia sus enemigos, enfriando y dañando a cualquiera que se cruce en su camino. Al explotar, la esfera inflige daño moderado en un radio, aturdiendo a los que se encuentran en la zona.\n" +
                                        "Un gran bloque de hielo vuela hacia un objetivo, infligiendo 60/85/110/135/160 (+40% Poder de Habilidad) de daño mágico y enfriando a los objetivos, lo que ralentiza su velocidad de movimiento en un [0]%. Al final de su recorrido, o si Anivia activa el hechizo de nuevo, el proyectil explota, infligiendo 60/85/110/135/160 (+40% Poder de Habilidad) de daño mágico en una zona pequeña y aturdiendo a las unidades durante 1.1/1.2/1.3/1.4/1.5 segundos.");
                                imvw.setImageDrawable(getDrawable(R.drawable.aniviaw));
                                tvnomw.setText("Cristalizar (W)");
                                tvdesw.setText("Anivia condensa la humedad del aire en un infranqueable muro de hielo que bloquea todos los movimientos. El muro aguanta un breve periodo de tiempo antes de derretirse.\n" +
                                        "Anivia invoca un impenetrable muro de hielo de 400/500/600/700/800 unidades de ancho que bloquea cualquier movimiento. El muro aguanta 5 segundos antes de derretirse.o");
                                imve.setImageDrawable(getDrawable(R.drawable.aniviae));
                                tvnome.setText("Quemadura Gelida (E)");
                                tvdese.setText("Con un aleteo, Anivia lanza una ráfaga de quemante viento helado que inflige una pequeña cantidad de daño a su objetivo. Si el objetivo fue ralentizado por Destello Helado o Tormenta Glacial, recibe el doble de daño.\n" +
                                        "Anivia golpea a su objetivo con un viento helado, infligiendo 55/85/115/145/175 (+50% Poder de Habilidad) de daño mágico. Si el objetivo ha sido ralentizado por Destello Helado o Tormenta Glacial, recibe el doble de daño.");
                                imvr.setImageDrawable(getDrawable(R.drawable.aniviar));
                                tvnomr.setText("Tormenta Glacial (R)");
                                tvdesr.setText("Anivia invoca una lluvia de hielo y granizo que daña a sus enemigos y dificulta su movimiento.\n" +
                                        "Activación: Anivia provoca una lluvia de hielo y granizo que aumenta su tamaño a lo largo de 3 segundos, inflige 80/120/160 (+25% Poder de Habilidad) de daño mágico por segundo a sus enemigos y los enfría, lo que reduce en un 20/30/40% su velocidad de movimiento.Con el tamaño máximo, el daño, las ralentizaciones y los efectos de frío aumentan en un 50% adicional. Drena 40/50/60 de maná por segundo.");
                                tvcon.setText("Sincronizar Destello Helado con Congelacion puede provocar ressultados devastadores");
                            }else{
                                if(res.equals("annie"))
                                {
                                    imv.setImageDrawable(getDrawable(R.drawable.annie));
                                    tvnom.setText("annie");
                                    tvnomn.setText("La Hija de la Oscuridad");
                                    tvnomc.setText("Luchador,Mago");
                                    imvpasiva.setImageDrawable(getDrawable(R.drawable.anniep));
                                    tvnompasiva.setText("Piromania(Pasiva))");
                                    tvdespasiva.setText("Después de 4 lanzamientos, el siguiente hechizo de ataque de Annie aturdirá brevemente al objetivo.");
                                    imvq.setImageDrawable(getDrawable(R.drawable.annieq));
                                    tvnomq.setText("Desintegrar (Q)");
                                    tvdesq.setText("Annie lanza una bola de fuego imbuida de Maná, infligiendo daño y recuperando el costo de Maná si destruye el objetivo.\n" +
                                            "Inflige 80/115/150/185/220 (+80% Poder de Habilidad) de daño mágico. El costo de Maná y la mitad del Enfriamiento se recuperan si Desintegrar mata al objetivo.");
                                    imvw.setImageDrawable(getDrawable(R.drawable.anniew));
                                    tvnomw.setText("Incinerar (W)");
                                    tvdesw.setText("Annie lanza un abrasador cono de fuego, dañando a todos los enemigos de la zona.\n" +
                                            "Lanza un cono de fuego, infligiendo 70/115/160/205/250 (+85% Poder de Habilidad) puntos de daño mágico a todos los enemigos de la zona.");
                                    imve.setImageDrawable(getDrawable(R.drawable.anniee));
                                    tvnome.setText("Escudo fundido (E)");
                                    tvdese.setText("Otorga a Annie y Tibbers mayor resistencia al daño y daña a los enemigos que utilizan ataques básicos contra ellos.\n" +
                                            "Annie se concede a sí misma y a Tibbers un 16/22/28/34/40% de reducción de daño durante 3 segundos.Mientras el escudo está activo, los enemigos que lo atacan con ataques básicos sufren 20/30/40/50/60 (+20% Poder de Habilidad) de daño mágico.");
                                    imvr.setImageDrawable(getDrawable(R.drawable.annier));
                                    tvnomr.setText("Invocar: Tibbers (R)");
                                    tvdesr.setText("Annie da vida a su oso Tibbers, que daña a todas las unidades de la zona. Tibbers puede atacar y quemar a los enemigos adyacentes.\n" +
                                            "Invoca a Tibbers e inflige 150/275/400 (+65% Poder de Habilidad) de daño mágico a los enemigos en la zona objetivo. Durante los siguientes 45 segundos, Tibbers quema a los enemigos cercanos, infligiéndoles 10/15/20 (+10% Poder de Habilidad) por segundo, y les ataca e inflige 50/75/100 (+0) de daño mágico. Annie puede controlar a Tibbers reactivando esta habilidad.Tibbers se Enfurece cuando se le invoca, cuando Annie usa Piromanía contra un campeón enemigo y cuando Annie muere.\n" +
                                            "Furia: Tibbers obtiene 275% de velocidad de ataque y 100% de velocidad de movimiento, valor que disminuye luego de 3 segundos.");
                                    tvcon.setText("Usar un aturdimiento junto a su habilidad definitiva puede cambiar las tornas en un combate de equipo");
                                }else{
                                    if(res.equals("ashe"))
                                    {
                                        imv.setImageDrawable(getDrawable(R.drawable.ashe));
                                        tvnom.setText("ashe");
                                        tvnomn.setText("La Arquera de Hielo");
                                        tvnomc.setText("Tirador,Apoyo");
                                        imvpasiva.setImageDrawable(getDrawable(R.drawable.ashep));
                                        tvnompasiva.setText("Tiro Escarchado(Pasiva))");
                                        tvdespasiva.setText("Los ataques de Ashe ralentizan a sus objetivos y aumentan el daño que les causa con sus ataques.\n" +
                                                "\n" +
                                                "Los Golpes Críticos de Ashe no infligen daño adicional pero causan una ralentización potenciada al objetivo.");
                                        imvq.setImageDrawable(getDrawable(R.drawable.asheq));
                                        tvnomq.setText("Concentracion de Guardabosques (Q)");
                                        tvdesq.setText("Ashe acumula Concentración al atacar. Cuando tiene Concentración máxima, Ashe puede activar Concentración de la Guardabosques, que consume todas las acumulaciones de Concentración y aumenta su velocidad de ataque, lo que transforma su ataque básico en un poderoso torbellino de golpes durante ese tiempo.\n" +
                                                "Pasiva: Los ataques básicos otorgan Concentración durante 4 segundos, la cual se acumula hasta 4 veces. Las acumulaciones decaen una a la vez, y cuando tiene 4 acumulaciones, Concentración de la Guardabosques se puede utilizar, lo que consume toda la Concentración.\n" +
                                                "Activa: Durante 5 segundos, Ashe obtiene un 20/25/30/35/40% de velocidad de ataque, y sus ataques básicos generan un torbellino de flechas que inflige 0 de daño físico. Durante este tiempo, no acumula Concentración.");
                                        imvw.setImageDrawable(getDrawable(R.drawable.ashew));
                                        tvnomw.setText("Descarga (W)");
                                        tvdesw.setText("Ashe dispara 9 flechas en un arco para causar más daño. Además, aplica Tiro Escarchado.\n" +
                                                "Dispara un cono de flechas de las cuales cada una inflige 20/35/50/65/80 (+100% Daño de Ataque) de daño físico. Los enemigos pueden bloquear múltiples flechas, pero solo recibirán daño de la primera.Los impactos contra campeones cuentan como golpes críticos para determinar a Tiro Escarchado.");
                                        imve.setImageDrawable(getDrawable(R.drawable.ashee));
                                        tvnome.setText("Tiro de Halcon (E)");
                                        tvdese.setText("Ashe puede enviar su Espíritu Halcón a cualquier parte del mapa en misión de exploración.\n" +
                                                "Revela el terreno mientras vuela hacia el lugar objetivo. Otorga visión durante 5 segundos. Ashe puede almacenar hasta 2 cargas de Tiro de Halcón.");
                                        imvr.setImageDrawable(getDrawable(R.drawable.asher));
                                        tvnomr.setText("Flecha de Crstal Encantada (R)");
                                        tvdesr.setText("Ashe dispara un proyectil de hielo en línea recta. Si la flecha impacta contra un campeón enemigo, inflige daño y lo aturde. El aturdimiento será mayor cuanto más larga sea la distancia que recorra la flecha. Además, las unidades enemigas circundantes reciben daño y se ralentizan.\n" +
                                                "Dispara una flecha cristalina de hielo que aturde al primer campeón enemigo que impacta e inflige 250/425/600 (+100% Poder de Habilidad) de daño mágico. Cuanto más vuele la flecha, más durará el aturdimiento, hasta un máximo de 3.5 segundos. Los enemigos circundantes reciben la mitad de daño.");
                                        tvcon.setText("Para obtener mayores probabilidades de impacto intenta dsparar Flecha de Cristal Encantada en la misma direccion en la que se mueven los enemigos");
                                    }else{
                                        if(res.equals("aurelionsol"))
                                        {
                                            imv.setImageDrawable(getDrawable(R.drawable.aurelionsol));
                                            tvnom.setText("aurelion sol");
                                            tvnomn.setText("El Forjador de Estrellas");
                                            tvnomc.setText("Luchador,mago");
                                            imvpasiva.setImageDrawable(getDrawable(R.drawable.aurelionsolp));
                                            tvnompasiva.setText("Centro del Universo(Pasiva))");
                                            tvdespasiva.setText("Las estrellas que orbitan a Aurelion Sol infligen daño mágico al impactar a un enemigo.");
                                            imvq.setImageDrawable(getDrawable(R.drawable.aurelionsolq));
                                            tvnomq.setText("Esplosion Astral (Q)");
                                            tvdesq.setText("Aurelion Sol crea un disco expansivo que explota para aturdir e infligir daño a los enemigos que se alejan demasiado de él.\n" +
                                                    "Primera vez: Aurelion Sol crea un núcleo estelar nuevo, que crece con el tiempo y le otorga un 10% de velocidad de movimiento.El núcleo explota cuando alcanza su Límite Exterior. La explosión aplica 70/110/150/190/230 (+65% Poder de Habilidad) de daño mágico y 1.1/1.2/1.3/1.4/1.5 segundos de aturdimiento.\n" +
                                                    "Segunda vez: El núcleo explota antes de tiempo.");
                                            imvw.setImageDrawable(getDrawable(R.drawable.aurelionsolw));
                                            tvnomw.setText("xs" +
                                                    "Expansion Celestial (W)");
                                            tvdesw.setText("Aurelion Sol aleja mucho más sus estrellas, lo que aumenta el daño que infligen.\n" +
                                                    "Pasiva: Aumenta 10/20/30/40/50 el daño básico de las Estrellas.\n" +
                                                    "Alternar: Las Estrellas de Aurelion Sol orbitan en su Límite Exterior e infligen un 150% de daño por un total de 0 (+0) de daño mágico.");
                                            imve.setImageDrawable(getDrawable(R.drawable.aurelionsole));
                                            tvnome.setText("Cometa Legendario (E)");
                                            tvdese.setText("Aurelion Sol obtiene velocidad mientras avanza en una dirección continua y puede llegar a volar para atravesar una larga distancia.\n" +
                                                    "Pasiva: Genera Velocidad de Escape al moverse. Avanzar continuamente en una sola dirección otorga un aumento en la velocidad de movimiento hasta un 25/30/35/40/45%. Recibir daño de campeones o torretas reinicia esta pasiva.\n" +
                                                    "Activa: Al llegar a 100 de Velocidad de Escape, vuela sobre 3000/4000/5000/6000/7000 unidades en la dirección elegida o hasta que hagas clic para moverte. Mientras vuela, Aurelion Sol puede ver y ser visto sobre los muros.Recibir daño de campeones o torretas lo obligará a aterrizar.");
                                            imvr.setImageDrawable(getDrawable(R.drawable.aurelionsolr));
                                            tvnomr.setText("Voz de Luz (R)");
                                            tvdesr.setText("Aurelion Sol proyecta una explosión de fuego estelar puro que inflige daño y ralentiza a todos los enemigos atrapados en ella y derriba a los enemigos cercanos, empujándolos a una distancia segura.\n" +
                                                    "Desata una explosión de fuego estelar puro que inflige 200/300/400 (+70% Poder de Habilidad) de daño mágico y ralentiza un 40/50/60% durante 2 segundos. La explosión también derriba a los enemigos cercanos, empujándolos hacia el Límite Exterior de Aurelion Sol.");
                                            tvcon.setText("Aurelion es muy resistente a niveles vajos y altos y con su pasiva infinita, solo debes mantener una buena distancia entre tu y algun campeon enemigo");
                                        }else{
                                            if(res.equals("azir"))
                                            {
                                                imv.setImageDrawable(getDrawable(R.drawable.azir));
                                                tvnom.setText("azir");
                                                tvnomn.setText("el Emperador de las Arenas");
                                                tvnomc.setText("Luchador,asesino");
                                                imvpasiva.setImageDrawable(getDrawable(R.drawable.azirp));
                                                tvnompasiva.setText("Legado de Shurima(Pasiva))");
                                                tvdespasiva.setText("Azir puede invocar el Disco Solar sobre las ruinas de una torreta amiga o enemiga.");
                                                imvq.setImageDrawable(getDrawable(R.drawable.azirq));
                                                tvnomq.setText("Conquistador de las Arenas (Q)");
                                                tvdesq.setText("Azir envía a todos los soldados de arena hacia una ubicación. Los soldados de arena infligen daño mágico a los enemigos que atraviesan y además aplican una ralentización durante 1 segundo.\n" +
                                                        "Azir envía a todos los soldados de arena hacia una ubicación. Los soldados de arena infligen 65/85/105/125/145 (+50% Poder de Habilidad) de daño mágico a los enemigos que atraviesan y además aplican una ralentización de 25% durante 1 segundo.Los enemigos alcanzados por varios soldados de arena no recibirán daño adicional.");
                                                imvw.setImageDrawable(getDrawable(R.drawable.azirw));
                                                    tvnomw.setText("l   evantense (W)");
                                                tvdesw.setText("Azir invoca a un soldado de arena para atacar a los objetivos cercanos por él. El ataque básico de estos soldados reemplaza el suyo contra todos los enemigos que estén a su alcance. Su ataque inflige daño mágico a todos los enemigos situados en una línea. Además, ¡Levántense! otorga velocidad de ataque de manera pasiva a Azir y a sus soldados de arena.\n" +
                                                        "Pasiva: Gana un 20/30/40/50/60% de velocidad de ataque.\n" +
                                                        "Activa: Azir invoca a un soldado de arena durante 9 segundos. Cuando Azir ataca a un enemigo situado al alcance del soldado, es este y no el Emperador el que ataca. Su ataque inflige 0 (+60% Poder de Habilidad) de daño mágico a los enemigos situados en una línea. Si más de un soldado alcanza al mismo objetivo, todos salvo el primero infligen un 25% de daño. Los soldados atacan aunque el propio Azir no tenga a los objetivos a su alcance.Azir puede almacenar hasta {{ maxammo }} soldados de arena a la vez. Hay un nuevo soldado disponible cada 0 segundos. Si Azir se aleja demasiado de los soldados, estos desaparecen. Los soldados de arena expiran dos veces más deprisa cuando están cerca de una torreta enemiga.Azir puede gastar uno de sus soldados para dañar una torreta invocándolo sobre ella. Esto inflige 0 (+40% Poder de Habilidad) de daño mágico a la estructura.");
                                                imve.setImageDrawable(getDrawable(R.drawable.azire));
                                                tvnome.setText("Arenas Movedizas (E)");
                                                tvdese.setText("Azir se abalanza hacia uno de sus soldados de arena y daña a los enemigos con los que choque. Si golpea a un campeón, gana un escudo.\n" +
                                                        "Azir se abalanza hacia uno de sus soldados de arena e inflige 60/90/120/150/180 (+40% Poder de Habilidad) de daño mágico a todos los enemigos con los que choque. Si golpea a un campeón, se detiene y obtiene un escudo de 4 segundos que absorbe 80/120/160/200/240 (+0) de daño.");
                                                imvr.setImageDrawable(getDrawable(R.drawable.azirr));
                                                tvnomr.setText("Division Imperial (R)");
                                                tvdesr.setText("Azir invoca un muro de soldados que, con una carga hacia delante, infligen daño y derriban al enemigo.\n" +
                                                        "Azir invoca un muro de soldados acorazados que se lanzan a la carga y derriban a los enemigos, además de infligirles 150/225/300 (+60% Poder de Habilidad) de daño. A continuación, los soldados forman un muro impenetrable durante 5/6/7 segundos.División Imperial detendrá incluso a aquellos enemigos que intenten superar el muro de un salto, pero en cambio, Azir y sus aliados, no solo pueden atravesarlo, sino que reciben una bonificación del 20% a su Velocidad de Movimiento durante 1 segundo al hacerlo.División Imperial no entorpece los ataques básicos ni los hechizos de Azir.");
                                                tvcon.setText("En la calle ´rocurad colocar a los soldados entre los subditos y el campeon del enemigo. De este modo podreis usarlos tanto para dar el golpe final como para amenazar la calle enemiga.");
                                            }else{
                                                if(res.equals("bardo"))
                                                {
                                                    imv.setImageDrawable(getDrawable(R.drawable.bardo));
                                                    tvnom.setText("bardo");
                                                    tvnomn.setText("el Guardián Trotamundos");
                                                    tvnomc.setText("Tanke,Apoyo");
                                                    imvpasiva.setImageDrawable(getDrawable(R.drawable.bardop));
                                                    tvnompasiva.setText("Llamado del Viajero(Pasiva))");
                                                    tvdespasiva.setText("La presencia del Bardo manifiesta unas campanillas mágicas que le otorgan experiencia, maná y un breve aumento de velocidad. Además, lo acompañan unos espíritus menores, llamados meeps, que lo ayudan en sus ataques y cuyo poder va aumentando a lo largo de la partida conforme el Bardo recoge campanillas.");
                                                    imvq.setImageDrawable(getDrawable(R.drawable.bardoq));
                                                    tvnomq.setText("Amarre Cosmico (Q)");
                                                    tvdesq.setText("El Bardo dispara un proyectil que ralentiza al primer enemigo alcanzado, luego sigue su trayectoria. A partir de ahí, si golpea un muro, el objetivo inicial queda aturdido. Si golpea a otro enemigo, los dos sufren el efecto.\n" +
                                                            "El Bardo dispara un rayo de energía que inflige 80/125/170/215/260 (+65% Poder de Habilidad) de daño mágico a uno o dos enemigos. El primer objetivo alcanzado sufre una ralentización del 60% durante 1/1.2/1.4/1.6/1.8 segundos.Si el rayo alcanza a otro enemigo o a un muro, los enemigos alcanzados quedan aturdidos durante 1/1.2/1.4/1.6/1.8 segundos.");
                                                    imvw.setImageDrawable(getDrawable(R.drawable.bardow));
                                                    tvnomw.setText("Altar del Guardian (W)");
                                                    tvdesw.setText("Manifiesta un santuario curativo que tarda unos segundos en cargarse y desaparece después de curar al primer aliado que lo toca.\n" +
                                                            "El Bardo levanta un santuario que cura 30/60/90/120/150 (+30% Poder de Habilidad) de vida de manera inmediata. Esta cantidad puede aumentar hasta 70/110/150/190/230 (+60% Poder de Habilidad) si se le dejan 10 segundos de margen para cargar su poder. Además, el santuario otorga también un 50% de velocidad de movimiento adicional, que va decreciendo a lo largo de 1.5 segundos. El Bardo puede tener hasta 3 santuarios activos a la vez. Los santuarios perduran hasta que los visita un campeón aliado o los destruye un campeón enemigo.");
                                                    imve.setImageDrawable(getDrawable(R.drawable.bardoe));
                                                    tvnome.setText("Viaje Mistico (E)");
                                                    tvdese.setText("El Bardo abre un portal en un terreno cercano. Tanto sus aliados como sus enemigos pueden atravesarlo para cruzar al otro lado, pero solo funciona en un sentido.\n" +
                                                            "El Bardo abre un corredor (de un solo sentido) a través de un accidente del terreno cercano. Tanto los aliados como los enemigos que se encuentren a poca distancia pueden utilizarlo haciendo clic derecho sobre él. Los aliados lo cruzan un 10/20/30/40/50% más rápido.El corredor desaparece al cabo de 10 segundos.");
                                                    imvr.setImageDrawable(getDrawable(R.drawable.bardor));
                                                    tvnomr.setText("Destino Apacible (R)");
                                                    tvdesr.setText("El Bardo lanza arcos de energía espiritual que inmovilizan a todos los campeones, súbditos, monstruos y torretas de la zona momentáneamente.\n" +
                                                            "El Bardo lanza un arco de energía mágica contra una ubicación. Todos los campeones, súbditos, monstruos y torretas de la zona quedan paralizados, lo que los hace invencibles e inmunes a los ataques (pero tampoco pueden actuar) durante 2.5 segundos.Los monstruos épicos también quedan paralizados, a pesar de que normalmente son inmunes a las debilitaciones.");
                                                    tvcon.setText("En importante recoger campanas para mejorar los ataques de vuestros meeps, pero no os olvideis de vuestro compañero de carril .");
                                                }else{
                                                    if(res.equals("blitzcrank"))
                                                    {
                                                        imv.setImageDrawable(getDrawable(R.drawable.blitzcrank));
                                                        tvnom.setText("blitzcrank");
                                                        tvnomn.setText("el Gran Gólem de Vapor");
                                                        tvnomc.setText("Tanke,Apoyo");
                                                        imvpasiva.setImageDrawable(getDrawable(R.drawable.blitzcrankp));
                                                        tvnompasiva.setText("Barrera de Mana(Pasiva))");
                                                        tvdespasiva.setText("Cuando la Vida de Blitzcrank baja del 20%, activa su Barrera de Maná. Esto crea un Escudo de Maná igual al 50% de su Maná durante 10 segundos. La Barrera de Maná solo ocurre una vez cada 90 segundos.");
                                                        imvq.setImageDrawable(getDrawable(R.drawable.blitzcrankq));
                                                        tvnomq.setText("Agarre Cohete (Q)");
                                                        tvdesq.setText("Blitzcrank dispara su mano derecha para apresar a un rival que encuentre en su camino, infligiendo daño y atrayéndolo hacia él.\n" +
                                                                "Blitzcrank dispara su mano derecha. Si se encuentra con una unidad enemiga, la aturdirá e infligirá 80/135/190/245/300 (+100% Poder de Habilidad) de daño mágico mientras la arrastra hacia él.");
                                                        imvw.setImageDrawable(getDrawable(R.drawable.blitzcrankw));
                                                        tvnomw.setText("Sobremarcha (W)");
                                                        tvdesw.setText("Blitzcrank se sobrecarga para aumentar drásticamente su velocidad de movimiento y su velocidad de ataque. Queda ralentizado temporalmente después de que termina el efecto.\n" +
                                                                "Blitzcrank se sobrecarga para aumentar un 70/75/80/85/90% la Velocidad de movimiento y un 30/38/46/54/62% la Velocidad de Ataque durante 5 segundos. La velocidad de movimiento adicional se va reduciendo hasta finalizar el efecto.Cuando termina Sobremarcha, Blitzcrank es ralentizado un 30% durante 1.5 segundos.");
                                                        imve.setImageDrawable(getDrawable(R.drawable.blitzcranke));
                                                        tvnome.setText("Puño de Poder (E)");
                                                        tvdese.setText("Blitzcrank carga su puño para que su siguiente ataque cause el doble de daño y lance al objetivo por los aires.\n" +
                                                                "Blitzcrank carga su puño para hacer que su siguiente ataque inflija el doble del total de su daño de ataque como daño físico y arroje por los aires a su objetivo.");
                                                        imvr.setImageDrawable(getDrawable(R.drawable.blitzcrankr));
                                                        tvnomr.setText("Campo Estatico (R)");
                                                        tvdesr.setText("Provoca de forma pasiva que unos rayos dañen a un enemigo cercano. Además, Blitzcrank puede activar esta habilidad para dañar a los enemigos cercanos y silenciarlos durante 0,5 segundos, pero al hacerlo elimina los rayos pasivos hasta que Campo Estático vuelva a estar disponible.\n" +
                                                                "Pasiva: De Blitzcrank surgen rayos que golpean a un enemigo cercano al azar e infligen 100/200/300 (+20% Poder de Habilidad) puntos de daño mágico cada 2,5 segundos.\n" +
                                                                "Activa: Inflige 250/375/500 (+100% Poder de Habilidad) de daño mágico y silencia a las unidades enemigas cercanas durante 0,5 segundos. La pasiva no tiene efecto durante el Enfriamiento.");
                                                        tvcon.setText("La combinacion 1,2,3 de agarre de misil , puño de poder y campo estatico puede aniquilar a un oponente que este solo.");
                                                    }else{
                                                        if(res.equals("brand"))
                                                        {
                                                            imv.setImageDrawable(getDrawable(R.drawable.brand));
                                                            tvnom.setText("brand");
                                                            tvnomn.setText("la Venganza Ardiente");
                                                            tvnomc.setText("Luchador,mago");
                                                            imvpasiva.setImageDrawable(getDrawable(R.drawable.brandp));
                                                            tvnompasiva.setText("Llamarada(Pasiva))");
                                                            tvdespasiva.setText("Los hechizos de Brand prenden fuego a sus objetivos, lo que les inflige un 2% de su vida máxima en daño mágico durante 4 segundos; se puede acumular hasta 3 veces. Cuando Llamarada alcanza la acumulación máxima contra un campeón o un monstruo gigante, se vuelve inestable. Detona en 2 segundos e inflige daño masivo en una zona alrededor de la víctima.");
                                                            imvq.setImageDrawable(getDrawable(R.drawable.brandq));
                                                            tvnomq.setText("Abrasar (Q)");
                                                            tvdesq.setText("Brand lanza una bola de fuego que inflige daño mágico. Si el objetivo está en llamas, Abrasar lo dejará aturdido durante 1,5 segundos.\n" +
                                                                    "Brand lanza una bola de fuego que inflige 80/110/140/170/200 (+55% Poder de Habilidad) de daño mágico.\n" +
                                                                    "Llamarada: Si el objetivo está en llamas, Abrasar lo aturdirá durante 1,5 segundos.");
                                                            imvw.setImageDrawable(getDrawable(R.drawable.brandw));
                                                            tvnomw.setText("Columna de Fuego (W)");
                                                            tvdesw.setText("Tras un breve retardo, Brand crea una columna de fuego en la zona objetivo, lo que inflige daño mágico a las unidades enemigas dentro del área. Las unidades en llamas sufren un 25% de daño adicional.\n" +
                                                                    "Tras un breve retardo, Brand crea una columna de fuego en la zona objetivo, lo que inflige 75/120/165/210/255 (+60% Poder de Habilidad) de daño mágico a las unidades enemigas dentro del área.\n" +
                                                                    "Llamarada: Las unidades en llamas sufren un 25% de daño adicional por la Columna de Fuego.");
                                                            imve.setImageDrawable(getDrawable(R.drawable.brande));
                                                            tvnome.setText("Conflagacion (E)");
                                                            tvdese.setText("Brand conjura un rayo poderoso contra su objetivo y le inflige daño mágico. Si el objetivo está en llamas, Conflagración se extenderá a los enemigos cercanos.\n" +
                                                                    "Brand conjura un rayo poderoso contra su objetivo y le inflige 70/90/110/130/150 (+35% Poder de Habilidad) de daño mágico.\n" +
                                                                    "Llamarada: Si el objetivo está en llamas, Conflagración se extenderá a los enemigos cercanos.");
                                                            imvr.setImageDrawable(getDrawable(R.drawable.brandr));
                                                            tvnomr.setText("Piroclasma (R)");
                                                            tvdesr.setText("Brand libera un devastador torrente de fuego que inflige daño mágico cada vez que rebota, hasta un máximo de 5 impactos. Los rebotes priorizan acumular Llamarada al máximo en los campeones. Si un objetivo está en llamas, Piroclasma lo ralentiza brevemente.\n" +
                                                                    "Brand libera un devastador torrente de fuego que inflige 100/200/300 (+25% Poder de Habilidad) de daño mágico cada vez que rebota, hasta un máximo de 5 impactos. Los rebotes priorizan acumular Llamarada al máximo en los campeones.\n" +
                                                                    "Llamarada: Si un objetivo está en llamas, Piroclasma lo ralentiza brevemente en un 30/45/60%.");
                                                            tvcon.setText("Puedes evitar que los enemigos se queden cerca de sus subditos prendiendoles fuego con incendio.");
                                                        }else{
                                                            if(res.equals("braum"))
                                                            {
                                                                imv.setImageDrawable(getDrawable(R.drawable.braum));
                                                                tvnom.setText("braum");
                                                                tvnomn.setText("el Corazón del Fréljord");
                                                                tvnomc.setText("tanke,Apoyo");
                                                                imvpasiva.setImageDrawable(getDrawable(R.drawable.braump));
                                                                tvnompasiva.setText("Golpes Conmocionantes(Pasiva))");
                                                                tvdespasiva.setText("Braum añade acumulaciones de Golpes Conmocionantes con sus ataques básicos o con Rigor del Invierno. Tanto sus aliados como él siguen añadiendo acumulaciones con sus ataques básicos y al llegar a 4, el objetivo queda aturdido.");
                                                                imvq.setImageDrawable(getDrawable(R.drawable.braumq));
                                                                tvnomq.setText("Rigor del inverno (Q)");
                                                                tvdesq.setText("Braum lanza un chorro de gélido hielo desde el escudo, que ralentiza y causa daño mágico. \n" +
                                                                        "\n" +
                                                                        "Aplica una acumulación de Golpes Conmocionantes.\n" +
                                                                        "Braum lanza hielo con su escudo y causa 70/115/160/205/250 (+0) de daño mágico y ralentiza 70% al primer enemigo al que alcanza, valor que disminuye a lo largo de los siguientes 2 segundos hasta volver a la normalidad.Aplica una acumulación de Golpes Conmocionantes.");
                                                                imvw.setImageDrawable(getDrawable(R.drawable.braumw));
                                                                tvnomw.setText("Detras de Mi (W)");
                                                                tvdesw.setText("Braum salta hacia un campeón o súbdito aliado. Al alcanzarlo, ambos obtienen Armadura y Resistencia Mágica durante unos segundos.\n" +
                                                                        "Braum salta hacia un campeón o súbdito aliado objetivo.Al alcanzarlo, ambos obtienen 0 de Armadura y 0 de Resistencia Mágica durante 15/17.5/20/22.5/25 segundos, más 10/11.5/13/14.5/16% de la Armadura y Resistencia Mágica adicionales de Braum durante 3 segundos.");
                                                                imve.setImageDrawable(getDrawable(R.drawable.braume));
                                                                tvnome.setText("Inquebrantable (E)");
                                                                tvdese.setText("Braum alza su escudo en una dirección durante varios segundos e intercepta todos los proyectiles, que lo golpean y son destruidos. Anula por completo el daño del primero y reduce el de los siguientes que lleguen desde la misma dirección.\n" +
                                                                        "Braum reduce el daño recibido y lo bloquea para los aliados detrás de él.Braum alza su escudo en una dirección durante 3/3.25/3.5/3.75/4 segundos y bloquea el siguiente ataque desde esa dirección. Los siguientes ataques causan 30/32.5/35/37.5/40% menos de daño.Braum intercepta los proyectiles y hace que lo golpeen a él y se destruyan.Además, obtiene 10% de Velocidad de Movimiento adicional mientras el efecto siga activo.");
                                                                imvr.setImageDrawable(getDrawable(R.drawable.braumr));
                                                                tvnomr.setText("Fisura Glaciar (R)");
                                                                tvdesr.setText("Braum golpea el suelo y derriba a los enemigos cercanos y situados en una línea delante de él. A lo largo de esta línea se abre una fisura que ralentiza a los enemigos.\n" +
                                                                        "Braum golpea el suelo, y derriba a los enemigos cercanos y situados en una línea delante de él. A lo largo de esta línea se abre una fisura durante 4 segundos que ralentiza a los enemigos sobre ella un 40/50/60%.Los enemigos alcanzados reciben 150/250/350 (+60% Poder de Habilidad) de daño mágico. Derriba durante 1/1.25/1.5 segundos al primer campeón al que golpea, y a los demás de manera más breve.");
                                                                tvcon.setText("Colabora con tus compañeros para acumular golpes conmocionantes y animalos a utilizar ataques basicos contra los objetivos marcados.");
                                                            }else{
                                                                if(res.equals("caitlyn"))
                                                                {
                                                                    imv.setImageDrawable(getDrawable(R.drawable.caitlyn));
                                                                    tvnom.setText("caitlyn");
                                                                    tvnomn.setText("la Sheriff de Piltóver");
                                                                    tvnomc.setText("carry");
                                                                    imvpasiva.setImageDrawable(getDrawable(R.drawable.caitlynp));
                                                                    tvnompasiva.setText("Disparos a la Cabeza(Pasiva))");
                                                                    tvdespasiva.setText("Caitlyn puede disparar un Disparo a la Cabeza cada pocos ataques básicos o contra un objetivo que atrapó o clavó, lo que inflige daño adicional que mejora con su Probabilidad de Golpe Crítico. El rango de Disparo a la Cabeza de Caitlyn es el doble contra objetivos atrapados o clavados.");
                                                                    imvq.setImageDrawable(getDrawable(R.drawable.caitlynq));
                                                                    tvnomq.setText("Pacificadora de Piltóver (Q)");
                                                                    tvdesq.setText("Caitlyn carga su rifle durante 1 segundo para liberar un disparo penetrante que provoca daño físico (causa menos daños a los objetivos posteriores).\n" +
                                                                            "Carga el rifle durante 1 segundos para liberar un disparo penetrante que inflige 30/70/110/150/190 (+0) de daño físico. Luego de impactar a cualquier objetivo, se abre en un disparo más amplio que inflige 33% menos daño. Siempre inflige daño completo a los objetivos revelados por sus trampas.");
                                                                    imvw.setImageDrawable(getDrawable(R.drawable.caitlynw));
                                                                    tvnomw.setText("Trampa para Yordles (W)");
                                                                    tvdesw.setText("Caitlyn pone una trampa para encontrar a los astutos yordles. Al activarse, la trampa inmoviliza al campeón, lo revela durante un breve espacio de tiempo y provoca daño mágico durante 1,5 segundos.\n" +
                                                                            "Coloca trampas que los campeones enemigos pueden activar, lo que los inmoviliza durante 2 segundos y los revela durante un breve periodo de tiempo.Las trampas tienen una duración de 90 segundos. Se puede tener 3/3/4/4/5 trampas activas a la vez.Los enemigos atrapados reciben 30/70/110/150/190 (+0) de daño aumentado adicional de Disparo a la Cabeza.");
                                                                    imve.setImageDrawable(getDrawable(R.drawable.caitlyne));
                                                                    tvnome.setText("Red Calibre 90 (E)");
                                                                    tvdese.setText("Caitlyn lanza una red pesada para ralentizar a su objetivo. El retroceso empuja hacia atrás a Caitlyn.\n" +
                                                                            "Lanza una red que hace retroceder Caitlyn. La red inflige 70/110/150/190/230 (+80% Poder de Habilidad) de daño mágico y ralentiza un 50% al primer enemigo golpeado durante 1 segundos.");
                                                                    imvr.setImageDrawable(getDrawable(R.drawable.caitlynr));
                                                                    tvnomr.setText("As bajo la Mira (R)");
                                                                    tvdesr.setText("Caitlyn se toma su tiempo para preparar el tiro perfecto, causando una gran cantidad de Daño a un solo objetivo a gran distancia. Los campeones enemigos pueden interceptar la bala para sus aliados.\n" +
                                                                            "Se toma su tiempo para preparar el tiro perfecto, lanzando una bala desde una distancia de hasta 2000/2500/3000 al campeón enemigo. El disparo inflige 250/475/700 (+200% Daño de Ataque adicional) de daño físico, pero los demás campeones enemigos pueden interceptar la bala.");
                                                                    tvcon.setText("Utiliza las trampas para jordles de modo que tengas siempre una disponible durante el combate.");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
