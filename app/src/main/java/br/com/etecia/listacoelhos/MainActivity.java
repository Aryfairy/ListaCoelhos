package br.com.etecia.listacoelhos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView RecycleViewCoelhos;
    List<Coelhos> lstCoelhos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstCoelhos = new ArrayList<>();
        lstCoelhos.add(new Coelhos("Angorá Inglês", R.drawable.angora_ingles, "O coelho Angorá Inglês é a típica bolinha de pelos que imaginamos quando pensamos em um coelho bem fofinho. Os fios são longos e espessos, o que torna a aparência desse pet inconfundível. Aliás, para mantê-lo bonito e saudável é preciso ter alguns cuidados específicos, como escovar seus pelos ao menos três vezes por semana. Esse momento será muito apreciado pelo pet, que adora receber carinho e atenção dos tutores. Como é uma das raças de coelhos domésticos mais antigas no mundo, é natural também que seja uma das mais populares. Vale dizer que o Angorá Inglês é apenas uma das quatro variações de coelhos angorá reconhecidos no mundo. Entre eles, este é o menor, com peso corporal de até 2 kg e expectativa de vida de até nove anos de idade. Muito carinhoso e calmo, é uma boa opção para famílias com crianças. Além disso, os pelos do angorá não provocam alergia, o que pode ser um excelente diferencial na escolha do pet.", 5.0));
        lstCoelhos.add(new Coelhos("Belier", R.drawable.belier, "Também chamado de Mini Lop, o Belier tem as orelhas caídas nas laterais da cabeça. Isso faz com que sua aparência seja muito fofinha, bem parecida com a de um coelhinho de pelúcia. Mas lembre-se de que não é! O Belier, assim como todos os outros coelhinhos, precisa de cuidados e respeito no manuseio. Os indivíduos dessa espécie podem pesar até 7 kg na idade adulta, fazendo com que sejam animais de porte médio. Seu comportamento é tranquilo e gentil, sendo bastante voltado para períodos de descanso no seu próprio cantinho. ", 5.0));
        lstCoelhos.add(new Coelhos("Fuzzy Lop", R.drawable.fuzzy_lop, "Os coelhinhos dessa raça pesam até 2 kg na idade adulta, possuem cores variadas (geralmente, combinando com o branco) e têm grandes orelhas caídas para frente. Os fios longos e volumosos são sua marca registrada – isso porque esse animal parece ter o corpo coberto por lã. A personalidade dos Fuzzy Lop é doce, amistosa e tranquila. Por isso, a raça também é uma excelente escolha para famílias com crianças.", 5.0));
        lstCoelhos.add(new Coelhos("Holland Lop", R.drawable.holland_lop, "Os coelhinhos de origem holandesa, como o próprio nome indica, são um clássico exemplo de raças de minicoelho. Bem pequenos, esses animaizinhos pesam entre 1 e 2 kg e são muito calmos. Por isso, são especialmente procurados por famílias com crianças. As orelhas do Holland Lop são bem largas e caídas para baixo, e o pelo entre elas forma uma espécie de coroa no topo da cabeça. Por ter as patas bem curtinhas e o corpo largo, um coelho Holland Lop parece estar sempre abaixado ou encolhidinho. Esses animais gostam de brincar e de receber carinho, mas não são tão agitados.", 5.0));
        lstCoelhos.add(new Coelhos("Hotot", R.drawable.hotot, "Esse peludinho parece ter saído de uma pintura: com pelagem branca e pequenas manchas pretas ao redor dos olhos, que são grandes e expressivos, é um exemplar único da espécie. Para combinar com essa aparência incrível, uma personalidade igualmente cativante: o Hotot é carinhoso, muito simpático e tranquilo.", 5.0));
        lstCoelhos.add(new Coelhos("Cabeça de Leão", R.drawable.leao, "O coelho da raça Lion, também chamado Lionhead ou Minicoelho Lionhead, é um dos tipos de coelho doméstico mais procurados atualmente. Por serem bem longos e volumosos, seus pelos requerem cuidados para evitar a formação de embaraços e nós, afinal, isso pode ser bem doloroso para o animal. Os pequenos coelhos Lionhead não têm uma origem definida. Alguns especialistas dizem, inclusive, que sua pelagem única e marcante é fruto de uma mutação genética. As cores variam entre diferentes tons de preto, creme e cinza. As orelhas são curtas e apontam para cima, dando um ar engraçado e curioso ao bichinho. Com temperamento ativo e amistoso, o Lionhead é uma ótima escolha para famílias com crianças. A expectativa de vida do pequeno coelhinho é de sete a dez anos, e seu peso não passa de 2 kg.", 5.0));
        lstCoelhos.add(new Coelhos("Mini Lop", R.drawable.mini_lop, "Originário da Alemanha, esse coelhinho é bem manso, companheiro e muito apegado à família. Além de gostar de receber carinho, ele precisa interagir com frequência com seus tutores para não desenvolver depressão. Na idade adulta, chega a pesar 3 kg. A pelagem é macia e recobre todo o corpo desse pet, que é uma das principais raças de minicoelho do mundo.", 5.0));
        lstCoelhos.add(new Coelhos("Nova Zelândia", R.drawable.nova_zelandia, "A clássica representação de um Coelhinho da Páscoa: branquinho, peludo, com as orelhas apontando para o alto. É assim esse coelhinho! Apesar do nome, o Nova Zelândia foi criado nos Estados Unidos, e desde então se popularizou muito ao redor de todo o mundo. Esperto, carinhoso e amistoso, o coelho peludo da raça Nova Zelândia gosta muito de interagir com as pessoas da família. Ele precisa de bastante espaço para correr e brincar, então não é ideal para quem busca um animal que fique restrito ao tamanho da gaiola.", 5.0));
        lstCoelhos.add(new Coelhos("Rex", R.drawable.rex, "Os coelhos Rex são bem populares em todo o mundo. Originária da França, essa raça conquistou lares por todo o planeta com suas orelhas que apontam para cima, a personalidade afetuosa, a energia brincalhona e bem-disposta e uma beleza incomparável. Os coelhos Rex têm tamanho médio a grande, peso que varia de 2,5 a 4 kg e expectativa de vida de até sete anos. A raça de coelho Rex tem animais com pelagens em diferentes tons, mas as mais comuns são o preto, o branco, o cinza e o creme. Os olhos são vermelhos ou azuis e a pelagem é muito macia e fofinha. Para ficar em forma, o Rex precisa de atividades e brincadeiras diárias, e vai aguardar ansiosamente o momento de interagir com seus tutores, pois gosta muito de carinho.", 5.0));
        lstCoelhos.add(new Coelhos("Teddy", R.drawable.teddy, "Dentre as raças de coelho mini, o Teddy é um dos mais calmos e amorosos, ou seja, é ideal para quem vive em apartamento e procura um companheiro quietinho e tranquilo. Os pelos do Teddy costumam ser longos, o que torna os indivíduos da raça uma bolinha de algodão. Além disso, por pesarem até 1,2 kg, a fofura é garantida, seja qual for a cor do pet. Aliás, por falar em cor, não há padrão definido para essa raça: as possibilidades são muitas, desde cores lisas até combinações entre elas, incluindo coelhinhos tricolores.", 5.0));

        RecycleViewCoelhos = findViewById(R.id.idRecyclerCoelhos);
        RecycleViewCoelhos.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        ListaCoelhosAdapter adapter = new ListaCoelhosAdapter(getApplicationContext(),lstCoelhos);
        RecycleViewCoelhos.setAdapter(adapter);
    }
}