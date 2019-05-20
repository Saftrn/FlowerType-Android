package ca.sa.poe.flowertype;

import java.util.ArrayList;

public class FlowersData {

    public static String[][] data = new String[][]{
            //data resource = wikipedia.org, image resource = unsplash.com, arenaflowers.co.in
            {"Cherry Blossom",
                    "flower of several trees of genus Prunus",
                    "https://images.unsplash.com/photo-1527942176780-4b82f4673179?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    "A cherry blossom is a flower of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata, which is called sakura after the Japanese (桜 or 櫻; さくら)",
                    "Magnoliopsida",
                    "Rosales",
                    "Prunus"},
            {"Azalea",
                    "type of flowering plant from the Rhododendron genus",
                    "https://www.arenaflowers.co.in/blog/wp-content/uploads/2017/09/32868042992_a9dda0d47b_z.jpg",
                    "Azalea is a type of flowering plant of the Ericaceae family and the Rhododendron genus that grows in temperate regions. Azaleas grow in most parts of East Asia and North America. The flowers develop at the beginning of summer in June and in autumn drop leaves, especially in American species. Asian Azalea species have year-round green leaves.",
                    "Magnoliopsida",
                    "Ericales",
                    "Rhododendron"},
            {"Rose",
                    "is a woody perennial flowering plant of the genus Rosa",
                    "https://images.unsplash.com/photo-1455582916367-25f75bfc6710?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=455&q=80",
                    "A rose is a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears. There are over three hundred species and thousands of cultivars. They form a group of plants that can be erect shrubs, climbing, or trailing, with stems that are often armed with sharp prickles.",
                    "Eudicots, Rosids",
                    "Rosales",
                    "Rosa"},
            {"Dahlia",
                    "is a genus of bushy, tuberous, herbaceous perennial plants",
                    "https://www.flowermeaning.com/flower-pics/Dahlia/Dahlia-4.jpg",
                    "There are 42 species of dahlia, with hybrids commonly grown as garden plants. Flower forms are variable, with one head per stem; these can be as small as 5 cm (2 in) diameter or up to 30 cm (1 ft) (\"dinner plate\"). ",
                    "Eudicots, Asterids",
                    "Asterales",
                    "Dahlia"},
            {"Tulips",
                    "form a genus of spring-blooming perennial herbaceous",
                    "https://images.unsplash.com/photo-1534257263484-58c3d9b36367?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=753&q=80",
                    "They often have a different coloured blotch at the base of the tepals (petals and sepals, collectively), internally. Because of a degree of variability within the populations, and a long history of cultivation, classification has been complex and controversial.",
                    "Monocots",
                    "Liliales",
                    "Tulipa"},
            {"Hydrangea",
                    "is a genus of 70–75 species of flowering plants",
                    "https://images.unsplash.com/photo-1525157205656-512551ca54b3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    "‘Hydrangea’ is derived from Greek and means ‘water vessel’, which is in reference to the shape of its seed capsules. The earlier name, Hortensia, is a Latinised version of the French given name Hortense, referring to the wife of Jean-André Lepaute",
                    "Eudicots, Asterids",
                    "Cornales",
                    "Hydrangea"},
            {"Lily",
                    "is a genus of herbaceous flowering plants",
                    "https://images.unsplash.com/photo-1544165118-ed65c4473a1b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    "Lilies are tall perennials ranging in height from 2–6 ft (60–180 cm). They form naked or tunicless scaly underground bulbs which are their organs of perennation. In some North American species the base of the bulb develops into rhizomes, on which numerous small bulbs are found. Some species develop stolons.",
                    "Monocots",
                    "Liliales",
                    "Lilium"},
            {"Peony",
                    "is a flowering plant in the genus Paeonia",
                    "https://images.unsplash.com/photo-1552639884-29fbbc399171?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80",
                    "Peonies are among the most popular garden plants in temperate regions. Herbaceous peonies are also sold as cut flowers on a large scale, although generally only available in late spring and early summer.",
                    "Eudicots",
                    "Saxifragales",
                    "Paeonia"},
            {"Petunia",
                    "is genus of 20 species of flowering plants of South American origin", "https://www.arenaflowers.co.in/blog/wp-content/uploads/2017/09/3701844504_af626bf296_z.jpg",
                    "Petunias are generally insect pollinated, with the exception of P. exserta, which is a rare, red-flowered, hummingbird-pollinated species. Most petunias are diploid with 14 chromosomes and are interfertile with other petunia species.",
                    "Eudicots, Asterids",
                    "Solanales",
                    "Petunia"},
            {"Hibiscus",
                    "is a genus of flowering plants in the mallow family, Malvaceae",
                    "https://images.unsplash.com/photo-1554658507-937832ba9c4f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=80",
                    "The leaves are alternate, ovate to lanceolate, often with a toothed or lobed margin. The flowers are large, conspicuous, trumpet-shaped, with five or more petals, colour from white to pink, red, orange, peach, yellow or purple, and from 4–18 cm broad.",
                    "Eudicots, Rosids",
                    "Malvales",
                    "Hibiscus"},
    };

    public static ArrayList<Flowers> getListData(){
        Flowers flowers = null;
        ArrayList<Flowers> list = new ArrayList<>();
        for (String[] fdata: data) {
            flowers = new Flowers();
            flowers.setName(fdata[0]);
            flowers.setGenus(fdata[1]);
            flowers.setPhoto(fdata[2]);
            flowers.setData(fdata[3]);
            flowers.setClade(fdata[4]);
            flowers.setOrder(fdata[5]);
            flowers.setJenis(fdata[6]);

            list.add(flowers);
        }

        return list;
    };
}
