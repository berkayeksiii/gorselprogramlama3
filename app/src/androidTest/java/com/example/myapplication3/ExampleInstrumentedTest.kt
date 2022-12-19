package com.atilimciftci.gorseldegistir;
inport...
public class MainActivity extends AppCompatActivity
private ActivityMainBinding binding;
ArrayList<Borsel> gorselArrayList;
int secilisirano;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding ActivityMainBinding.inflate (getLayoutInflater());
    View view = binding.getRoot();
    setContentView(view);
    gorselArrayList = new ArrayList<>();
//Verd
    Gorsel balon = new Gorsel( bilgi: "Sari Balon", siaNo 1, R.drawable.balon);
    Gorsel cicek new Gorsel( bilgi: "Mavi Çiçek", siaNo: 2,R.drawable.cicek);
    Gorsel kelebek = new Gorsel( bilgi "Mavi Kelebek", siraNo 3, R.drawable.kelebek);
    Gorsel kus = new Gorsel( bilgi "Yuvada Kuş", siraNo: 4,R.drawable.kus);
//ArrayList Yüklemesi
    gorselArrayList.add(balon);
    gorselArrayList.add(cicek);
    gorselArrayList.add(kelebek);
    gorselArrayList.add(kus);
    binding.imageViewGorsel.setImageResource (gorselArrayList.get(0).foto);
    binding, textViewBilgi.setText("Bilgi : " + gorselArrayList.get(0).bilgi);
    secilisiraNo=0;