/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.lth.cs.nlp.wikipedia.lang;

import se.lth.cs.nlp.mediawiki.model.Page;
import se.lth.cs.nlp.wikipedia.WikipediaPageType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Swedish Wikipedia configuration
 */
public class SwedishConfig extends TemplateConfig {
    public SwedishConfig() {
        addNamespaceAlias(-2, "Media");
        addNamespaceAlias(-1, "Special");
        addNamespaceAlias(1, "Diskussion");
        addNamespaceAlias(2, "Användare");
        addNamespaceAlias(3, "Användardiskussion");
        addNamespaceAlias(4,"Wikipedia");
        addNamespaceAlias(5, "Wikipediadiskussion");
        addNamespaceAlias(6, "Fil", "Bild");
        addNamespaceAlias(7, "Fildiskussion", "Bilddiskussion");
        addNamespaceAlias(8, "MediaWiki");
        addNamespaceAlias(9, "MediaWiki-diskussion", "MediaWiki_diskussion");
        addNamespaceAlias(10, "Mall");
        addNamespaceAlias(11, "Malldiskussion");
        addNamespaceAlias(12, "Hjälp");
        addNamespaceAlias(13, "Hjälpdiskussion", "Hjälp_diskussion");
        addNamespaceAlias(14, "Kategori");
        addNamespaceAlias(15, "Kategoridiskussion");

        addNamespaceAlias(100,"Portal");
        addNamespaceAlias(101,"Portaldiskussion");
        addNamespaceAlias(446,"Utbildningsprogram");
        addNamespaceAlias(447,"Utbildningsprogramsdiskussion");
        addNamespaceAlias(828,"Modul");
        addNamespaceAlias(829,"Moduldiskussion");

        addI18nCIAlias("redirect", "#OMDIRIGERING", "#REDIRECT");
        addI18nCIAlias("notoc", "__INGENINNEHÅLLSFÖRTECKNING__", "__NOTOC__");
        addI18nCIAlias("nogallery", "__INGETGALLERI__", "__NOGALLERY__");
        addI18nCIAlias("forcetoc", "__ALLTIDINNEHÅLLSFÖRTECKNING__", "__FORCETOC__");
        addI18nCIAlias("toc", "__INNEHÅLLSFÖRTECKNING__", "__TOC__");
        addI18nCIAlias("noeditsection", "__INTEREDIGERASEKTION__", "__NOEDITSECTION__");
        addI18nAlias("currentmonth", "NUVARANDEMÅNAD", "NUMÅNAD", "CURRENTMONTH", "CURRENTMONTH2");
        addI18nAlias("currentmonth1", "NUVARANDEMÅNAD1", "CURRENTMONTH1");
        addI18nAlias("currentmonthname", "NUVARANDEMÅNADSNAMN", "NUMÅNADSNAMN", "CURRENTMONTHNAME");
        addI18nAlias("currentmonthabbrev", "NUVARANDEMÅNADKORT", "NUMÅNADKORT", "CURRENTMONTHABBREV");
        addI18nAlias("currentday", "NUVARANDEDAG", "NUDAG", "CURRENTDAY");
        addI18nAlias("currentday2", "NUVARANDEDAG2", "NUDAG2", "CURRENTDAY2");
        addI18nAlias("currentdayname", "NUVARANDEDAGSNAMN", "NUDAGSNAMN", "CURRENTDAYNAME");
        addI18nAlias("currentyear", "NUVARANDEÅR", "NUÅR", "CURRENTYEAR");
        addI18nAlias("currenttime", "NUVARANDETID", "NUTID", "CURRENTTIME");
        addI18nAlias("currenthour", "NUVARANDETIMME", "NUTIMME", "CURRENTHOUR");
        addI18nAlias("localmonth", "LOKALMÅNAD", "LOCALMONTH", "LOCALMONTH2");
        addI18nAlias("localmonth1", "LOKALMÅNAD1", "LOCALMONTH1");
        addI18nAlias("localmonthname", "LOKALMÅNADSNAMN", "LOCALMONTHNAME");
        addI18nAlias("localmonthabbrev", "LOKALMÅNADKORT", "LOCALMONTHABBREV");
        addI18nAlias("localday", "LOKALDAG", "LOCALDAY");
        addI18nAlias("localday2", "LOKALDAG2", "LOCALDAY2");
        addI18nAlias("localdayname", "LOKALDAGSNAMN", "LOCALDAYNAME");
        addI18nAlias("localyear", "LOKALTÅR", "LOCALYEAR");
        addI18nAlias("localtime", "LOKALTID", "LOCALTIME");
        addI18nAlias("localhour", "LOKALTIMME", "LOCALHOUR");
        addI18nAlias("numberofpages", "ANTALSIDOR", "NUMBEROFPAGES");
        addI18nAlias("numberofarticles", "ANTALARTIKLAR", "NUMBEROFARTICLES");
        addI18nAlias("numberoffiles", "ANTALFILER", "NUMBEROFFILES");
        addI18nAlias("numberofusers", "ANTALANVÄNDARE", "NUMBEROFUSERS");
        addI18nAlias("numberofactiveusers", "ANTALAKTIVAANVÄNDARE", "NUMBEROFACTIVEUSERS");
        addI18nAlias("numberofedits", "ANTALREDIGERINGAR", "NUMBEROFEDITS");
        addI18nAlias("numberofviews", "ANTALVISNINGAR", "NUMBEROFVIEWS");
        addI18nAlias("pagename", "SIDNAMN", "PAGENAME");
        addI18nAlias("pagenamee", "SIDNAMNE", "PAGENAMEE");
        addI18nAlias("namespace", "NAMNRYMD", "NAMESPACE");
        addI18nAlias("namespacee", "NAMNRYMDE", "NAMESPACEE");
        addI18nAlias("talkspace", "DISKUSSIONSRYMD", "TALKSPACE");
        addI18nAlias("talkspacee", "DISKUSSIONSRYMDE", "TALKSPACEE");
        addI18nAlias("subjectspace", "ARTIKELRYMD", "SUBJECTSPACE", "ARTICLESPACE");
        addI18nAlias("subjectspacee", "ARTIKELRYMDE", "SUBJECTSPACEE", "ARTICLESPACEE");
        addI18nAlias("fullpagename", "HELASIDNAMNET", "FULLPAGENAME");
        addI18nAlias("fullpagenamee", "HELASIDNAMNETE", "FULLPAGENAMEE");
        addI18nAlias("subpagename", "UNDERSIDNAMN", "SUBPAGENAME");
        addI18nAlias("subpagenamee", "UNDERSIDNAMNE", "SUBPAGENAMEE");
        addI18nAlias("basepagename", "GRUNDSIDNAMN", "BASEPAGENAME");
        addI18nAlias("basepagenamee", "GRUNDSIDNAMNE", "BASEPAGENAMEE");
        addI18nAlias("talkpagename", "DISKUSSIONSSIDNAMN", "TALKPAGENAME");
        addI18nAlias("talkpagenamee", "DISKUSSIONSSIDNAMNE", "TALKPAGENAMEE");
        addI18nCIAlias("msg", "MED:", "MSG:");
        addI18nCIAlias("subst", "BYT:", "SUBST:");
        addI18nCIAlias("msgnw", "MEDNW:", "MSGNW:");
        addI18nAlias("img_thumbnail", "miniatyr", "mini", "thumbnail", "thumb");
        addI18nAlias("img_manualthumb", "miniatyr=$1", "mini=$1", "thumbnail=$1", "thumb=$1");
        addI18nAlias("img_right", "höger", "right");
        addI18nAlias("img_left", "vänster", "left");
        addI18nAlias("img_none", "ingen", "none");
        addI18nAlias("img_center", "centrerad", "center", "centre");
        addI18nAlias("img_framed", "inramad", "ram", "framed", "enframed", "frame");
        addI18nAlias("img_frameless", "ramlös", "frameless");
        addI18nAlias("img_page", "sida=$1", "sida $1", "page=$1", "page $1");
        addI18nAlias("img_upright", "stående", "stående=$1", "stående $1", "upright", "upright=$1", "upright $1");
        addI18nAlias("img_border", "kantlinje", "border");
        addI18nAlias("img_baseline", "baslinje", "baseline");
        addI18nAlias("img_sub", "ned", "sub");
        addI18nAlias("img_super", "upp", "super", "sup");
        addI18nAlias("img_top", "topp", "top");
        addI18nAlias("img_text_top", "text-topp", "text-top");
        addI18nAlias("img_middle", "mitten", "middle");
        addI18nAlias("img_bottom", "botten", "bottom");
        addI18nAlias("img_text_bottom", "text-botten", "text-bottom");
        addI18nAlias("img_link", "länk=$1", "link=$1");
        addI18nAlias("sitename", "SAJTNAMN", "SITENAMN", "SITENAME");
        addI18nCIAlias("ns", "NR:", "NS:");
        addI18nCIAlias("localurl", "LOKALURL:", "LOCALURL:");
        addI18nCIAlias("localurle", "LOKALURLE:", "LOCALURLE:");
        addI18nCIAlias("servername", "SERVERNAMN", "SERVERNAME");
        addI18nCIAlias("scriptpath", "SKRIPTSÖKVÄG", "SCRIPTPATH");
        addI18nCIAlias("grammar", "GRAMMATIK:", "GRAMMAR:");
        addI18nCIAlias("gender", "KÖN:", "GENDER:");
        addI18nAlias("currentweek", "NUVARANDEVECKA", "NUVECKA", "CURRENTWEEK");
        addI18nAlias("currentdow", "NUVARANDEVECKODAG", "CURRENTDOW");
        addI18nAlias("localweek", "LOKALVECKA", "LOCALWEEK");
        addI18nAlias("localdow", "LOKALVECKODAG", "LOCALDOW");
        addI18nAlias("revisionid", "REVISIONSID", "REVISIONID");
        addI18nAlias("revisionday", "REVISIONSDAG", "REVISIONDAY");
        addI18nAlias("revisionday2", "REVISIONSDAG2", "REVISIONDAY2");
        addI18nAlias("revisionmonth", "REVISIONSMÅNAD", "REVISIONMONTH");
        addI18nAlias("revisionyear", "REVISIONSÅR", "REVISIONYEAR");
        addI18nAlias("revisiontimestamp", "REVISIONSTIDSSTÄMPEL", "REVISIONTIMESTAMP");
        addI18nAlias("revisionuser", "REVISIONSANVÄNDARE", "REVISIONUSER");
        addI18nCIAlias("fullurl", "FULLTURL:", "FULLURL:");
        addI18nCIAlias("fullurle", "FULLTURLE:", "FULLURLE:");
        addI18nCIAlias("lcfirst", "LBFÖRST:", "LCFIRST:");
        addI18nCIAlias("ucfirst", "UCFIRST", "SBFÖRST:", "UCFIRST:");
        addI18nCIAlias("lc", "LB:", "LC:");
        addI18nCIAlias("uc", "SB:", "UC:");
        addI18nCIAlias("raw", "RÅ:", "RAW:");
        addI18nAlias("displaytitle", "VISATITEL", "DISPLAYTITLE");
        addI18nAlias("newsectionlink", "__NYTTAVSNITTLÄNK__", "__NEWSECTIONLINK__");
        addI18nAlias("currentversion", "NUVARANDEVERSION", "NUVERSION", "CURRENTVERSION");
        addI18nAlias("currenttimestamp", "NUTIDSTÄMPEL", "CURRENTTIMESTAMP");
        addI18nAlias("localtimestamp", "LOKALTIDSTÄMPEL", "LOCALTIMESTAMP");
        addI18nCIAlias("language", "#SPRÅK:", "#LANGUAGE:");
        addI18nAlias("contentlanguage", "INNEHÅLLSSPRÅK", "CONTENTLANGUAGE", "CONTENTLANG");
        addI18nAlias("pagesinnamespace", "SIDORINAMNRYMD:", "SIDORINR:", "PAGESINNAMESPACE:", "PAGESINNS:");
        addI18nAlias("numberofadmins", "ANTALADMINS", "ANTALADMINISTRATÖRER", "NUMBEROFADMINS");
        addI18nCIAlias("formatnum", "FORMATERANUM", "FORMATERATAL", "FORMATNUM");
        addI18nAlias("defaultsort", "STANDARDSORTERING:", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
        addI18nCIAlias("filepath", "FILSÖKVÄG:", "FILEPATH:");
        addI18nCIAlias("tag", "tagg", "tag");
        addI18nAlias("hiddencat", "__DOLDKAT__", "__HIDDENCAT__");
        addI18nAlias("pagesincategory", "SIDORIKATEGORI", "PAGESINCATEGORY", "PAGESINCAT");
        addI18nAlias("pagesize", "SIDSTORLEK", "PAGESIZE");
        addI18nAlias("index", "__INDEXERA__", "__INDEX__");
        addI18nAlias("noindex", "__INTEINDEXERA_", "__NOINDEX__");
        addI18nAlias("numberingroup", "ANTALIGRUPP", "NUMBERINGROUP", "NUMINGROUP");
        addI18nAlias("staticredirect", "__STATISKOMDIRIGERING__", "__STATICREDIRECT__");
        addI18nAlias("protectionlevel", "SKYDDSNIVÅ", "PROTECTIONLEVEL");
        addI18nCIAlias("formatdate", "formateradatum", "datumformat", "formatdate", "dateformat");

    }

    private static final Pattern stubTextPattern = Pattern.compile("\\{\\{\\s*?([a-zA-Z0-9åäöÅÄÖ\\ ]*?stub)\\s*?\\}\\}", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    private static final Pattern disambiguationTextPattern = Pattern.compile("\\{\\{\\s*?(förgrening|gren)\\s*?\\}\\}", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    private static final Pattern listTitlePattern = Pattern.compile("(^lista\\s+över)|(\\(lista\\))", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.DOTALL);
    private static final Pattern disambiguationTitlePattern = Pattern.compile(".*?\\((\\s|[\\_])*olika(\\s|[\\_])*betydelser(\\s|[\\_])*\\)", Pattern.CASE_INSENSITIVE);

    @Override
    public WikipediaPageType classifyPageType(Page page) {
        WikipediaPageType type = super.classifyPageType(page);
        if(type == WikipediaPageType.ARTICLE) {
            Matcher matcher = disambiguationTextPattern.matcher(page.getContent());
            if(matcher.find() || disambiguationTitlePattern.matcher(page.getTitle()).find() ) {
                return WikipediaPageType.DISAMBIGUATION;
            }

            matcher = stubTextPattern.matcher(page.getContent());
            if(matcher.find()) {
                return WikipediaPageType.STUB;
            }

            if(listTitlePattern.matcher(page.getTitle()).find())
                return WikipediaPageType.LIST;

            return WikipediaPageType.ARTICLE;
        }
        else
            return type;
    }

    @Override
    protected String getSiteName() {
        return "Wikipedia";
    }

    @Override
    protected String getWikiUrl() {
        return "http://sv.wikipedia.org/";
    }

    @Override
    public String getIso639() {
        return "sv";
    }
}
