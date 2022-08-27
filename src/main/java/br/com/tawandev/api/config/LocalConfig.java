package br.com.tawandev.api.config;

import br.com.tawandev.api.domain.User;
import br.com.tawandev.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig implements WebMvcConfigurer {

    @Value("${cors.originPatterns:default}")
    private String corsOriginPatterns = "";

    @Autowired
    private UserRepository repository;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        var allowedOrigins = corsOriginPatterns.split(",");
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins(allowedOrigins)
                .allowCredentials(true);
    }

    @Bean
    public void startDB() {
        User u1 = new User(null, "Tawan", "tawan.tls43@gmail.com", "123");
        User u2 = new User(null, "Silva", "silva.tls43@gmail.com", "123");
        User u3 = new User(null, "Melosa", "mpidgen0@pinterest.com", "123");
        User u4 = new User(null, "Freeman", "fguerri1@ocn.ne.jp", "123");
        User u5 = new User(null, "Keelia", "kemons3@cargocollective.com", "123");
        User u6 = new User(null, "Rosette", "rconen4@mayoclinic.com", "123");
        User u7 = new User(null, "Fleurette", "flinskill5@nytimes.com", "123");
        User u8 = new User(null, "Dolores", "dbattill6@liveinternet.ru", "123");
        User u9 = new User(null, "Shawn", "spenhalurick7@stumbleupon.com", "123");
        User u10 = new User(null, "Molli", "mwhittleton8@disqus.com", "123");
        User u11 = new User(null, "Nerta", "ncoche9@ebay.co.uk", "123");
        User u12 = new User(null, "Shep", "swoolstenholmesa@yellowpages.com", "123");
        User u13 = new User(null, "Kim", "kmariansb@netvibes.com", "123");
        User u14 = new User(null, "Selinda", "sclinkardc@dropbox.com", "123");
        User u15 = new User(null, "Regine", "rjozsad@geocities.com", "123");
        User u16 = new User(null, "Eberhard", "eedserf@ebay.com", "123");
        User u17 = new User(null, "Augie", "amucklestong@wix.com", "123");
        User u18 = new User(null, "Yancey", "ytouth@yahoo.com", "123");
        User u19 = new User(null, "Alisha", "arickesiesi@state.gov", "123");
        User u20 = new User(null, "Shalom", "sstewartj@timesonline.co.uk", "123");
        User u21 = new User(null, "Ingelbert", "ifeltonk@merriam-webster.com", "123");
        User u22 = new User(null, "Bancroft", "balenm@elpais.com", "123");
        User u23 = new User(null, "Tynan", "tstanbridgen@ca.gov", "123");
        User u24 = new User(null, "Jase", "jsteedmano@xing.com", "123");
        User u25 = new User(null, "Vivyan", "vmahodyp@salon.com", "123");
        User u26 = new User(null, "Erastus", "eriglesfordq@dmoz.org", "123");
        User u27 = new User(null, "Ruby", "rsweetnamr@loc.gov", "123");
        User u28 = new User(null, "Leontyne", "lwhoralls@china.com.cn", "123");
        User u29 = new User(null, "Karil", "kwyldboreu@google.ca", "123");
        User u30 = new User(null, "Ogdon", "oneillv@example.com", "123");
        User u31 = new User(null, "Nester", "nbessantw@ca.gov", "123");
        User u32 = new User(null, "Ainslee", "akilbournx@ning.com", "123");
        User u34 = new User(null, "Sylas", "schiechioz@time.com", "123");
        User u35 = new User(null, "Jacques", "jpfaffel10@omniture.com", "123");
        User u36 = new User(null, "Frederico", "fwhalebelly11@naver.com", "123");
        User u37 = new User(null, "Berke", "bellington12@discuz.net", "123");
        User u38 = new User(null, "Corry", "cmcilwreath13@dailymotion.com", "123");
        User u39 = new User(null, "Albert", "acowland14@phoca.cz", "123");
        User u40 = new User(null, "Vernor", "vcapponer15@fema.gov", "123");
        User u41 = new User(null, "Aggi", "amacbain16@eventbrite.com", "123");
        User u42 = new User(null, "Ches", "cfettes17@netscape.com", "123");
        User u43 = new User(null, "Candi", "cisherwood18@miitbeian.gov.cn", "123");
        User u44 = new User(null, "Malinde", "mdunge19@alexa.com", "123");
        User u45 = new User(null, "Kesley", "khurche1a@blogtalkradio.com", "123");
        User u46 = new User(null, "Barney", "bbaudon1b@gmpg.org", "123");
        User u47 = new User(null, "Hilton", "hslatten1c@google.com.br", "123");
        User u48 = new User(null, "Fionnula", "fkinsell1d@weibo.com", "123");
        User u49 = new User(null, "Byran", "bdicke1e@biglobe.ne.jp", "123");
        User u50 = new User(null, "Kathie", "kpullan1f@apple.com", "123");
        User u51 = new User(null, "Clair", "cattwooll1g@php.net", "123");
        User u52 = new User(null, "Albertine", "achantler1h@usatoday.com", "123");
        User u53 = new User(null, "Wiley", "wcasarini1i@vkontakte.ru", "123");
        User u54 = new User(null, "Leontine", "ldaton1j@hibu.com", "123");
        User u55 = new User(null, "Kenneth", "khughlock1k@deviantart.com", "123");
        User u56 = new User(null, "Torey", "tclac1l@macromedia.com", "123");
        User u57 = new User(null, "Mikael", "mmorgen1m@tumblr.com", "123");
        User u58 = new User(null, "Earl", "eshynn1n@geocities.jp", "123");
        User u59 = new User(null, "Bamby", "bveryan1o@princeton.edu", "123");
        User u60 = new User(null, "Della", "dincogna1p@istockphoto.com", "123");
        User u61 = new User(null, "Benedetta", "bdenisovo1q@utexas.edu", "123");
        User u62 = new User(null, "Sybila", "sbontine1r@pcworld.com", "123");
        User u63 = new User(null, "Garrott", "gwasiela1s@odnoklassniki.ru", "123");
        User u64 = new User(null, "Bayard", "blocks1t@telegraph.co.uk", "123");
        User u65 = new User(null, "Wolfy", "wmarchenko1u@msn.com", "123");
        User u66 = new User(null, "Yorgo", "ybloxam1v@npr.org", "123");
        User u67 = new User(null, "Giles", "gstowell1w@twitter.com", "123");
        User u68 = new User(null, "Nicolle", "nziemen1x@jugem.jp", "123");
        User u69 = new User(null, "Florance", "fhornbuckle1y@arstechnica.com", "123");
        User u70 = new User(null, "Karolina", "ksnalum1z@bloomberg.com", "123");
        User u71 = new User(null, "Tristam", "tveart20@digg.com", "123");
        User u72 = new User(null, "Gillian", "gmcgeown21@senate.gov", "123");
        User u73 = new User(null, "Hastings", "hmacenzy22@wisc.edu", "123");
        User u74 = new User(null, "Filmore", "foakshott23@com.com", "123");
        User u75 = new User(null, "Orelia", "otanti24@fastcompany.com", "123");
        User u76 = new User(null, "Arnaldo", "abatistelli25@state.gov", "123");
        User u77 = new User(null, "Llywellyn", "lmabone26@sbwire.com", "123");
        User u78 = new User(null, "Zacharias", "zcalwell27@eepurl.com", "123");
        User u79 = new User(null, "Arleyne", "apickin28@pagesperso-orange.fr", "123");
        User u80 = new User(null, "Petronella", "pmcewan29@google.fr", "123");
        User u81 = new User(null, "Cullie", "ccoldrick2a@simplemachines.org", "123");
        User u82 = new User(null, "Dasi", "dgolborne2b@amazon.com", "123");
        User u83 = new User(null, "Ellen", "ehutten2c@vistaprint.com", "123");
        User u84 = new User(null, "Davina", "dnewbigging2d@gov.uk", "123");
        User u85 = new User(null, "Willard", "walliot2e@indiegogo.com", "123");
        User u86 = new User(null, "Hilary", "handrus2f@biglobe.ne.jp", "123");
        User u87 = new User(null, "Lewiss", "lcoal2g@barnesandnoble.com", "123");
        User u88 = new User(null, "Nicola", "nbrunotti2h@discovery.com", "123");
        User u89 = new User(null, "Marina", "mrignoldes2i@nationalgeographic.com", "123");
        User u90 = new User(null, "Cilka", "cdelion2j@dot.gov", "123");
        User u91 = new User(null, "Erastus", "eanneslie2k@timesonline.co.uk", "123");
        User u92 = new User(null, "Effie", "esuermeiers2l@globo.com", "123");
        User u93 = new User(null, "Honey", "hhowcroft2m@who.int", "123");
        User u94 = new User(null, "Sherie", "sclutram2n@mozilla.com", "123");
        User u95 = new User(null, "Ethelind", "efourman2o@smugmug.com", "123");
        User u96 = new User(null, "Fremont", "ftompkiss2p@fastcompany.com", "123");
        User u97 = new User(null, "Sander", "smurty2q@clickbank.net", "123");
        User u98 = new User(null, "Lindi", "lolney2r@bizjournals.com", "123");
        User u99 = new User(null, "Sophie", "stitleyl@jugem.jp", "123");
        repository.saveAll(List.of(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15,
                u16, u17, u18, u19, u20, u21, u22, u23, u24, u25, u26, u27, u28, u29, u30, u31, u32, u34,
                u35, u36, u37, u38, u39, u40, u41, u42, u43, u44, u45, u46, u47, u48, u49, u50, u51, u52,
                u53, u54, u55, u56, u57, u58, u59, u60, u61, u62, u63, u64, u65, u66, u67, u68, u69, u70,
                u71, u72, u73, u74, u75, u76, u77, u78, u79, u80, u81, u82, u83, u84, u85, u86, u87, u88,
                u89, u90, u91, u92, u93, u94, u95, u96, u97, u98, u99));
    }
}
