package com.wayfarer.europe.data;

import com.wayfarer.europe.model.Destination;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static java.util.List.of;

@Repository
public class DestinationRepository {

    private final List<Destination> destinations = of(
        new Destination(
            "lisbon", "Lisbon", "Portugal", "Western",
            "Seven hills, yellow trams, and the smell of the Atlantic",
            "Lisbon rises in tiers above the Tagus river, its pastel facades held together by tile work " +
            "that turns entire streets into mosaics. Ride the creaking Tram 28 through the Alfama district, " +
            "then let the afternoon slow down over a custard tart and a glass of vinho verde.",
            "March to May",
            "€70–100",
            of("Ride the historic Tram 28 through Alfama", "Watch sunset from Miradouro da Senhora do Monte",
               "Day-trip to the palaces of Sintra"),
            "38.7223° N, 9.1393° W",
            "#B0552E"
        ),
        new Destination(
            "paris", "Paris", "France", "Western",
            "Wide boulevards, quiet courtyards, and light that painters chased for a century",
            "Paris rewards walkers. Beyond the postcard monuments, the city is a patchwork of markets, " +
            "hidden passages, and neighbourhood bistros where the menu changes with the season. Cross the " +
            "Seine at dusk when the bridges catch the last of the light.",
            "April to June, September to October",
            "€110–160",
            of("Wander the covered passages near Grands Boulevards", "Picnic along the Canal Saint-Martin",
               "Visit a neighbourhood market on a Sunday morning"),
            "48.8566° N, 2.3522° E",
            "#2E4A6B"
        ),
        new Destination(
            "rome", "Rome", "Italy", "Southern",
            "A working city built directly on top of an empire",
            "In Rome, ruins are not roped off in a museum, they sit beside the tram stop and the espresso bar. " +
            "The city is best explored slowly, with long lunches between the ancient sites and the smaller " +
            "churches that hold quiet, extraordinary art with no queue at all.",
            "April to May, late September to October",
            "€85–120",
            of("Watch the light shift inside the Pantheon", "Explore the Trastevere neighbourhood after dark",
               "Book the Borghese Gallery well in advance"),
            "41.9028° N, 12.4964° E",
            "#A6472B"
        ),
        new Destination(
            "barcelona", "Barcelona", "Spain", "Southern",
            "Gaudí's curves against a grid of Mediterranean sun",
            "Barcelona balances two identities: the ordered grid of L'Eixample and the tangled medieval " +
            "lanes of the Gothic Quarter. Spend mornings at the beach and evenings on a rooftop, and don't " +
            "rush the Sagrada Família, it rewards a second and third look.",
            "May to June, September",
            "€90–130",
            of("Climb the towers of Sagrada Família", "Get lost in the Gothic Quarter", "Eat late, like the locals do"),
            "41.3851° N, 2.1734° E",
            "#C9962F"
        ),
        new Destination(
            "amsterdam", "Amsterdam", "Netherlands", "Western",
            "A city built on canals, bicycles, and gabled brick",
            "Amsterdam is compact enough to see almost entirely on foot or by rented bike. The concentric " +
            "canal rings are lined with narrow merchant houses, and the museums here, from the Rijksmuseum " +
            "to smaller collections, are some of the best organised in Europe.",
            "April, September",
            "€100–140",
            of("Rent a bike and follow the canal rings", "Visit the Jordaan on a market day",
               "See the Vermeers at the Rijksmuseum"),
            "52.3676° N, 4.9041° E",
            "#2E6E6A"
        ),
        new Destination(
            "prague", "Prague", "Czechia", "Central",
            "Spires, cobblestones, and one very old astronomical clock",
            "Prague's old town survived the twentieth century almost untouched, so the skyline still reads " +
            "like a fairytale woodcut. Cross the Charles Bridge early, before the crowds, and climb up to " +
            "Prague Castle for a view over the red rooftops of the Vltava valley.",
            "May, September to October",
            "€55–80",
            of("Cross Charles Bridge at sunrise", "Explore Prague Castle and St. Vitus Cathedral",
               "Sample a proper Czech pilsner in a local pub"),
            "50.0755° N, 14.4378° E",
            "#1C2B33"
        ),
        new Destination(
            "vienna", "Vienna", "Austria", "Central",
            "Imperial architecture with a genuinely serious coffee culture",
            "Vienna moves at the pace of its coffeehouses, where a single espresso buys you a table for the " +
            "afternoon and a newspaper on a wooden dowel. The city's grand museums and palaces sit easily " +
            "alongside a very active contemporary art and music scene.",
            "April to May, September to October",
            "€95–130",
            of("Spend an afternoon in a historic coffeehouse", "Tour the Schönbrunn Palace gardens",
               "Catch a concert at the Musikverein"),
            "48.2082° N, 16.3738° E",
            "#B08D57"
        ),
        new Destination(
            "santorini", "Santorini", "Greece", "Southern",
            "Whitewashed villages balanced on the rim of a volcanic caldera",
            "Santorini's towns cling to a cliff edge formed by an ancient volcanic collapse, which is why the " +
            "views are so dramatic. Skip the busiest lookout points at sunset and instead walk the quieter " +
            "path between Fira and Oia for the same view with room to breathe.",
            "Late May to June, September",
            "€120–180",
            of("Walk the caldera-rim path from Fira to Oia", "Try the local volcanic-soil wines",
               "Visit the black sand beaches of Kamari"),
            "36.3932° N, 25.4615° E",
            "#2E6E6A"
        ),
        new Destination(
            "budapest", "Budapest", "Hungary", "Central",
            "Two cities on either side of the Danube, joined by ornate bridges",
            "Budapest splits neatly into hilly Buda and flat, grid-planned Pest, connected by bridges that " +
            "light up gold after dark. Spend an evening in one of the thermal baths, then follow it with a " +
            "walk through the ruin bars of the old Jewish Quarter.",
            "April to May, September to October",
            "€60–90",
            of("Soak in the Széchenyi thermal baths", "Cross the Chain Bridge at night",
               "Explore the ruin bars of District VII"),
            "47.4979° N, 19.0402° E",
            "#A6472B"
        ),
        new Destination(
            "edinburgh", "Edinburgh", "Scotland, UK", "Northern",
            "A medieval old town and a Georgian new town, side by side",
            "Edinburgh's skyline is dominated by its castle, perched on an extinct volcanic plug above the " +
            "Royal Mile. The city is compact and walkable, with steep closes and hidden courtyards that reward " +
            "wandering off the main thoroughfares.",
            "May to June, August for the Fringe Festival",
            "€90–130",
            of("Walk the Royal Mile from Castle to Palace", "Climb Arthur's Seat for a full city view",
               "Explore the underground vaults of Old Town"),
            "55.9533° N, 3.1883° W",
            "#1C2B33"
        ),
        new Destination(
            "dubrovnik", "Dubrovnik", "Croatia", "Southern",
            "Limestone walls enclosing a city that still runs on foot traffic",
            "Dubrovnik's old town is entirely car-free, encircled by defensive walls you can walk in full for " +
            "sweeping views of the Adriatic. Visit early or late in the day when the cruise crowds thin out, " +
            "and take the cable car up Srđ hill for the wider panorama.",
            "May to June, September",
            "€90–130",
            of("Walk the full city walls circuit", "Take the cable car up Srđ hill",
               "Swim from the rocks at Buža bar"),
            "42.6507° N, 18.0944° E",
            "#2E4A6B"
        ),
        new Destination(
            "reykjavik", "Reykjavik", "Iceland", "Northern",
            "A small capital used as a base for a very large landscape",
            "Reykjavik itself is compact and low-rise, but it's the launch point for Iceland's geothermal " +
            "fields, waterfalls, and, in the right season, the aurora overhead. Downtown is easily walked in " +
            "an afternoon, which leaves the rest of the trip for the Ring Road.",
            "June to August for daylight, September to March for the aurora",
            "€130–190",
            of("Drive the Golden Circle route", "Soak in a geothermal lagoon",
               "Watch for the aurora on a clear autumn or winter night"),
            "64.1466° N, 21.9426° W",
            "#2E6E6A"
        )
    );

    public List<Destination> findAll() {
        return destinations;
    }

    public List<Destination> findByRegion(String region) {
        if (region == null || region.isBlank() || region.equalsIgnoreCase("all")) {
            return destinations;
        }
        return destinations.stream()
            .filter(d -> d.getRegion().equalsIgnoreCase(region))
            .toList();
    }

    public Optional<Destination> findBySlug(String slug) {
        return destinations.stream().filter(d -> d.getSlug().equalsIgnoreCase(slug)).findFirst();
    }

    public List<String> regions() {
        return destinations.stream().map(Destination::getRegion).distinct().sorted().toList();
    }
}
