package com.taurenk.pinpoint.geocoder.library;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by taurenk on 4/7/15.
 */
public class DataSets {

    private static Map<String,String> STREET_TYPE_MAP = new HashMap();
    private static Map<String,String> UNIT_MAP = new HashMap();
    private static Map<String,String> DIRECTIONAL_MAP = new HashMap();
    private static Map<String,String> STATE_MAP = new HashMap();

    public static Map<String, String> getStreetTypeMap() { return STREET_TYPE_MAP; }
    public static Map<String, String> getUnitMap() { return UNIT_MAP; }
    public static Map<String, String> getDirectionalMap() { return DIRECTIONAL_MAP; }
    public static Map<String, String> getStateMap() { return STATE_MAP; }

    static {
        STREET_TYPE_MAP.put("4WD TRL","4WD TRL");
        STREET_TYPE_MAP.put("ALLEE","ALY");
        STREET_TYPE_MAP.put("ALLEY","ALY");
        STREET_TYPE_MAP.put("ALLY","ALY");
        STREET_TYPE_MAP.put("ALY","ALY");
        STREET_TYPE_MAP.put("ANEX","ANX");
        STREET_TYPE_MAP.put("ANNEX","ANX");
        STREET_TYPE_MAP.put("ANX","ANX");
        STREET_TYPE_MAP.put("ARC","ARC");
        STREET_TYPE_MAP.put("ARCADE","ARC");
        STREET_TYPE_MAP.put("AV","AVE");
        STREET_TYPE_MAP.put("AVE","AVE");
        STREET_TYPE_MAP.put("AVEN","AVE");
        STREET_TYPE_MAP.put("AVENIDA","AVE");
        STREET_TYPE_MAP.put("AVENU","AVE");
        STREET_TYPE_MAP.put("AVENUE","AVE");
        STREET_TYPE_MAP.put("AVN","AVE");
        STREET_TYPE_MAP.put("AVNUE","AVE");
        STREET_TYPE_MAP.put("BAYOO","BYU");
        STREET_TYPE_MAP.put("BAYOU","BYU");
        STREET_TYPE_MAP.put("BCH","BCH");
        STREET_TYPE_MAP.put("BEACH","BCH");
        STREET_TYPE_MAP.put("BELTWAY","BELTWAY");
        STREET_TYPE_MAP.put("BEND","BND");
        STREET_TYPE_MAP.put("BLF","BLF");
        STREET_TYPE_MAP.put("BLUF","BLF");
        STREET_TYPE_MAP.put("BLUFF","BLF");
        STREET_TYPE_MAP.put("BLUFFS","BLFS");
        STREET_TYPE_MAP.put("BLVD","BLVD");
        STREET_TYPE_MAP.put("BND","BND");
        STREET_TYPE_MAP.put("BOT","BTM");
        STREET_TYPE_MAP.put("BOTTM","BTM");
        STREET_TYPE_MAP.put("BOTTOM","BTM");
        STREET_TYPE_MAP.put("BOUL","BLVD");
        STREET_TYPE_MAP.put("BOULEVARD","BLVD");
        STREET_TYPE_MAP.put("BOULV","BLVD");
        STREET_TYPE_MAP.put("BR","BR");
        STREET_TYPE_MAP.put("BRANCH","BR");
        STREET_TYPE_MAP.put("BRDGE","BRG");
        STREET_TYPE_MAP.put("BRG","BRG");
        STREET_TYPE_MAP.put("BRIDGE","BRG");
        STREET_TYPE_MAP.put("BRK","BRK");
        STREET_TYPE_MAP.put("BRNCH","BR");
        STREET_TYPE_MAP.put("BROOK","BRK");
        STREET_TYPE_MAP.put("BROOKS","BRKS");
        STREET_TYPE_MAP.put("BTM","BTM");
        STREET_TYPE_MAP.put("BURG","BG");
        STREET_TYPE_MAP.put("BURGS","BGS");
        STREET_TYPE_MAP.put("BYP","BYP");
        STREET_TYPE_MAP.put("BYPA","BYP");
        STREET_TYPE_MAP.put("BYPAS","BYP");
        STREET_TYPE_MAP.put("BYPASS","BYP");
        STREET_TYPE_MAP.put("BYPS","BYP");
        STREET_TYPE_MAP.put("CAMP","CP");
        STREET_TYPE_MAP.put("CANYN","CYN");
        STREET_TYPE_MAP.put("CANYON","CYN");
        STREET_TYPE_MAP.put("CAPE","CPE");
        STREET_TYPE_MAP.put("CAUSEWAY","CSWY");
        STREET_TYPE_MAP.put("CAUSWAY","CSWY");
        STREET_TYPE_MAP.put("CEN","CTR");
        STREET_TYPE_MAP.put("CENT","CTR");
        STREET_TYPE_MAP.put("CENTER","CTR");
        STREET_TYPE_MAP.put("CENTERS","CTRS");
        STREET_TYPE_MAP.put("CENTR","CTR");
        STREET_TYPE_MAP.put("CENTRE","CTR");
        STREET_TYPE_MAP.put("CIR","CIR");
        STREET_TYPE_MAP.put("CIRC","CIR");
        STREET_TYPE_MAP.put("CIRCL","CIR");
        STREET_TYPE_MAP.put("CIRCLE","CIR");
        STREET_TYPE_MAP.put("CIRCLES","CIRS");
        STREET_TYPE_MAP.put("CK","CRK");
        STREET_TYPE_MAP.put("CLB","CLB");
        STREET_TYPE_MAP.put("CLF","CLF");
        STREET_TYPE_MAP.put("CLFS","CLFS");
        STREET_TYPE_MAP.put("CLIFF","CLF");
        STREET_TYPE_MAP.put("CLIFFS","CLFS");
        STREET_TYPE_MAP.put("CLUB","CLB");
        STREET_TYPE_MAP.put("CMN","CMN");
        STREET_TYPE_MAP.put("CMNS","CMNS");
        STREET_TYPE_MAP.put("CMP","CP");
        STREET_TYPE_MAP.put("CNTER","CTR");
        STREET_TYPE_MAP.put("CNTR","CTR");
        STREET_TYPE_MAP.put("CNYN","CYN");
        STREET_TYPE_MAP.put("COMMON","CMN");
        STREET_TYPE_MAP.put("COMMONS","CMNS");
        STREET_TYPE_MAP.put("COR","COR");
        STREET_TYPE_MAP.put("CORNER","COR");
        STREET_TYPE_MAP.put("CORNERS","CORS");
        STREET_TYPE_MAP.put("CORS","CORS");
        STREET_TYPE_MAP.put("COURSE","CRSE");
        STREET_TYPE_MAP.put("COURT","CT");
        STREET_TYPE_MAP.put("COURTS","CTS");
        STREET_TYPE_MAP.put("COVE","CV");
        STREET_TYPE_MAP.put("COVES","CVS");
        STREET_TYPE_MAP.put("CP","CP");
        STREET_TYPE_MAP.put("CPE","CPE");
        STREET_TYPE_MAP.put("CR","CRK");
        STREET_TYPE_MAP.put("CRCL","CIR");
        STREET_TYPE_MAP.put("CRCLE","CIR");
        STREET_TYPE_MAP.put("CRECENT","CRES");
        STREET_TYPE_MAP.put("CREEK","CRK");
        STREET_TYPE_MAP.put("CRES","CRES");
        STREET_TYPE_MAP.put("CRESCENT","CRES");
        STREET_TYPE_MAP.put("CRESENT","CRES");
        STREET_TYPE_MAP.put("CREST","CRST");
        STREET_TYPE_MAP.put("CRK","CRK");
        STREET_TYPE_MAP.put("CROSSING","XING");
        STREET_TYPE_MAP.put("CROSSROAD","XRD");
        STREET_TYPE_MAP.put("CRSCNT","CRES");
        STREET_TYPE_MAP.put("CRSE","CRSE");
        STREET_TYPE_MAP.put("CRSENT","CRES");
        STREET_TYPE_MAP.put("CRSNT","CRES");
        STREET_TYPE_MAP.put("CRSSING","XING");
        STREET_TYPE_MAP.put("CRSSNG","XING");
        STREET_TYPE_MAP.put("CRST","CRST");
        STREET_TYPE_MAP.put("CRT","CT");
        STREET_TYPE_MAP.put("CSWY","CSWY");
        STREET_TYPE_MAP.put("CT","CT");
        STREET_TYPE_MAP.put("CTR","CTR");
        STREET_TYPE_MAP.put("CTS","CTS");
        STREET_TYPE_MAP.put("CURVE","CURV");
        STREET_TYPE_MAP.put("CUTOFF","CUTOFF");
        STREET_TYPE_MAP.put("CV","CV");
        STREET_TYPE_MAP.put("CYN","CYN");
        STREET_TYPE_MAP.put("DALE","DL");
        STREET_TYPE_MAP.put("DAM","DM");
        STREET_TYPE_MAP.put("DIV","DV");
        STREET_TYPE_MAP.put("DIVIDE","DV");
        STREET_TYPE_MAP.put("DL","DL");
        STREET_TYPE_MAP.put("DM","DM");
        STREET_TYPE_MAP.put("DR","DR");
        STREET_TYPE_MAP.put("DRIV","DR");
        STREET_TYPE_MAP.put("DRIVE","DR");
        STREET_TYPE_MAP.put("DRIVES","DRS");
        STREET_TYPE_MAP.put("DRIVEWAY","DRIVEWAY");
        STREET_TYPE_MAP.put("DRV","DR");
        STREET_TYPE_MAP.put("DV","DV");
        STREET_TYPE_MAP.put("DVD","DV");
        STREET_TYPE_MAP.put("ESPLANADE","ESPLANADE");
        STREET_TYPE_MAP.put("EST","EST");
        STREET_TYPE_MAP.put("ESTATE","EST");
        STREET_TYPE_MAP.put("ESTATES","ESTS");
        STREET_TYPE_MAP.put("ESTS","ESTS");
        STREET_TYPE_MAP.put("EXP","EXPY");
        STREET_TYPE_MAP.put("EXPR","EXPY");
        STREET_TYPE_MAP.put("EXPRESS","EXPY");
        STREET_TYPE_MAP.put("EXPRESSWAY","EXPY");
        STREET_TYPE_MAP.put("EXPW","EXPY");
        STREET_TYPE_MAP.put("EXPY","EXPY");
        STREET_TYPE_MAP.put("EXT","EXT");
        STREET_TYPE_MAP.put("EXTENSION","EXT");
        STREET_TYPE_MAP.put("EXTENSIONS","EXTS");
        STREET_TYPE_MAP.put("EXTN","EXT");
        STREET_TYPE_MAP.put("EXTNSN","EXT");
        STREET_TYPE_MAP.put("EXTS","EXTS");
        STREET_TYPE_MAP.put("FALL","FALL");
        STREET_TYPE_MAP.put("FALLS","FLS");
        STREET_TYPE_MAP.put("FERRY","FRY");
        STREET_TYPE_MAP.put("FIELD","FLD");
        STREET_TYPE_MAP.put("FIELDS","FLDS");
        STREET_TYPE_MAP.put("FLAT","FLT");
        STREET_TYPE_MAP.put("FLATS","FLTS");
        STREET_TYPE_MAP.put("FLD","FLD");
        STREET_TYPE_MAP.put("FLDS","FLDS");
        STREET_TYPE_MAP.put("FLS","FLS");
        STREET_TYPE_MAP.put("FLT","FLT");
        STREET_TYPE_MAP.put("FLTS","FLTS");
        STREET_TYPE_MAP.put("FORD","FRD");
        STREET_TYPE_MAP.put("FORDS","FRDS");
        STREET_TYPE_MAP.put("FOREST","FRST");
        STREET_TYPE_MAP.put("FOREST HIGHWAY","FOREST HWY");
        STREET_TYPE_MAP.put("FOREST HWY","FOREST HWY");
        STREET_TYPE_MAP.put("FORESTS","FRST");
        STREET_TYPE_MAP.put("FORG","FRG");
        STREET_TYPE_MAP.put("FORGE","FRG");
        STREET_TYPE_MAP.put("FORGES","FRGS");
        STREET_TYPE_MAP.put("FORK","FRK");
        STREET_TYPE_MAP.put("FORKS","FRKS");
        STREET_TYPE_MAP.put("FORT","FT");
        STREET_TYPE_MAP.put("FOUR-WHEEL DRIVE TRAIL","4WD TRL");
        STREET_TYPE_MAP.put("FRD","FRD");
        STREET_TYPE_MAP.put("FREEWAY","FWY");
        STREET_TYPE_MAP.put("FREEWY","FWY");
        STREET_TYPE_MAP.put("FRG","FRG");
        STREET_TYPE_MAP.put("FRK","FRK");
        STREET_TYPE_MAP.put("FRKS","FRKS");
        STREET_TYPE_MAP.put("FRRY","FRY");
        STREET_TYPE_MAP.put("FRST","FRST");
        STREET_TYPE_MAP.put("FRT","FT");
        STREET_TYPE_MAP.put("FRWAY","FWY");
        STREET_TYPE_MAP.put("FRWY","FWY");
        STREET_TYPE_MAP.put("FRY","FRY");
        STREET_TYPE_MAP.put("FT","FT");
        STREET_TYPE_MAP.put("FWY","FWY");
        STREET_TYPE_MAP.put("GARDEN","GDN");
        STREET_TYPE_MAP.put("GARDENS","GDNS");
        STREET_TYPE_MAP.put("GARDN","GDN");
        STREET_TYPE_MAP.put("GATEWAY","GTWY");
        STREET_TYPE_MAP.put("GATEWY","GTWY");
        STREET_TYPE_MAP.put("GATWAY","GTWY");
        STREET_TYPE_MAP.put("GDN","GDN");
        STREET_TYPE_MAP.put("GDNS","GDNS");
        STREET_TYPE_MAP.put("GLEN","GLN");
        STREET_TYPE_MAP.put("GLENS","GLNS");
        STREET_TYPE_MAP.put("GLN","GLN");
        STREET_TYPE_MAP.put("GRADE","GRADE");
        STREET_TYPE_MAP.put("GRDEN","GDN");
        STREET_TYPE_MAP.put("GRDN","GDN");
        STREET_TYPE_MAP.put("GRDNS","GDNS");
        STREET_TYPE_MAP.put("GREEN","GRN");
        STREET_TYPE_MAP.put("GREENS","GRNS");
        STREET_TYPE_MAP.put("GRN","GRN");
        STREET_TYPE_MAP.put("GROV","GRV");
        STREET_TYPE_MAP.put("GROVE","GRV");
        STREET_TYPE_MAP.put("GROVES","GRVS");
        STREET_TYPE_MAP.put("GRV","GRV");
        STREET_TYPE_MAP.put("GTWAY","GTWY");
        STREET_TYPE_MAP.put("GTWY","GTWY");
        STREET_TYPE_MAP.put("HARB","HBR");
        STREET_TYPE_MAP.put("HARBOR","HBR");
        STREET_TYPE_MAP.put("HARBORS","HBRS");
        STREET_TYPE_MAP.put("HARBR","HBR");
        STREET_TYPE_MAP.put("HAVEN","HVN");
        STREET_TYPE_MAP.put("HAVN","HVN");
        STREET_TYPE_MAP.put("HBR","HBR");
        STREET_TYPE_MAP.put("HEIGHT","HTS");
        STREET_TYPE_MAP.put("HEIGHTS","HTS");
        STREET_TYPE_MAP.put("HGTS","HTS");
        STREET_TYPE_MAP.put("HIGHWAY","HWY");
        STREET_TYPE_MAP.put("HIGHWY","HWY");
        STREET_TYPE_MAP.put("HILL","HL");
        STREET_TYPE_MAP.put("HILLS","HLS");
        STREET_TYPE_MAP.put("HIWAY","HWY");
        STREET_TYPE_MAP.put("HIWY","HWY");
        STREET_TYPE_MAP.put("HL","HL");
        STREET_TYPE_MAP.put("HLLW","HOLW");
        STREET_TYPE_MAP.put("HLS","HLS");
        STREET_TYPE_MAP.put("HOLLOW","HOLW");
        STREET_TYPE_MAP.put("HOLLOWS","HOLW");
        STREET_TYPE_MAP.put("HOLW","HOLW");
        STREET_TYPE_MAP.put("HOLWS","HOLW");
        STREET_TYPE_MAP.put("HRBOR","HBR");
        STREET_TYPE_MAP.put("HT","HTS");
        STREET_TYPE_MAP.put("HTS","HTS");
        STREET_TYPE_MAP.put("HVN","HVN");
        STREET_TYPE_MAP.put("HWAY","HWY");
        STREET_TYPE_MAP.put("HWY","HWY");
        STREET_TYPE_MAP.put("INLET","INLT");
        STREET_TYPE_MAP.put("INLT","INLT");
        STREET_TYPE_MAP.put("IS","IS");
        STREET_TYPE_MAP.put("ISLAND","IS");
        STREET_TYPE_MAP.put("ISLANDS","ISS");
        STREET_TYPE_MAP.put("ISLE","ISLE");
        STREET_TYPE_MAP.put("ISLES","ISLE");
        STREET_TYPE_MAP.put("ISLND","IS");
        STREET_TYPE_MAP.put("ISLNDS","ISS");
        STREET_TYPE_MAP.put("ISS","ISS");
        STREET_TYPE_MAP.put("JCT","JCT");
        STREET_TYPE_MAP.put("JCTION","JCT");
        STREET_TYPE_MAP.put("JCTN","JCT");
        STREET_TYPE_MAP.put("JCTNS","JCTS");
        STREET_TYPE_MAP.put("JCTS","JCTS");
        STREET_TYPE_MAP.put("JEEP TRAIL","JEEP TRL");
        STREET_TYPE_MAP.put("JEEP TRL","JEEP TRL");
        STREET_TYPE_MAP.put("JUNCTION","JCT");
        STREET_TYPE_MAP.put("JUNCTIONS","JCTS");
        STREET_TYPE_MAP.put("JUNCTN","JCT");
        STREET_TYPE_MAP.put("JUNCTON","JCT");
        STREET_TYPE_MAP.put("KEY","KY");
        STREET_TYPE_MAP.put("KEYS","KYS");
        STREET_TYPE_MAP.put("KNL","KNL");
        STREET_TYPE_MAP.put("KNLS","KNLS");
        STREET_TYPE_MAP.put("KNOL","KNL");
        STREET_TYPE_MAP.put("KNOLL","KNL");
        STREET_TYPE_MAP.put("KNOLLS","KNLS");
        STREET_TYPE_MAP.put("KY","KY");
        STREET_TYPE_MAP.put("KYS","KYS");
        STREET_TYPE_MAP.put("LA","LN");
        STREET_TYPE_MAP.put("LAKE","LK");
        STREET_TYPE_MAP.put("LAKES","LKS");
        STREET_TYPE_MAP.put("LAND","LAND");
        STREET_TYPE_MAP.put("LANDING","LNDG");
        STREET_TYPE_MAP.put("LANE","LN");
        STREET_TYPE_MAP.put("LANES","LN");
        STREET_TYPE_MAP.put("LCK","LCK");
        STREET_TYPE_MAP.put("LCKS","LCKS");
        STREET_TYPE_MAP.put("LDG","LDG");
        STREET_TYPE_MAP.put("LDGE","LDG");
        STREET_TYPE_MAP.put("LF","LF");
        STREET_TYPE_MAP.put("LGT","LGT");
        STREET_TYPE_MAP.put("LIGHT","LGT");
        STREET_TYPE_MAP.put("LIGHTS","LGTS");
        STREET_TYPE_MAP.put("LK","LK");
        STREET_TYPE_MAP.put("LKS","LKS");
        STREET_TYPE_MAP.put("LN","LN");
        STREET_TYPE_MAP.put("LNDG","LNDG");
        STREET_TYPE_MAP.put("LNDNG","LNDG");
        STREET_TYPE_MAP.put("LOAF","LF");
        STREET_TYPE_MAP.put("LOCK","LCK");
        STREET_TYPE_MAP.put("LOCKS","LCKS");
        STREET_TYPE_MAP.put("LODG","LDG");
        STREET_TYPE_MAP.put("LODGE","LDG");
        STREET_TYPE_MAP.put("LOGGING RD","LOGGING RD");
        STREET_TYPE_MAP.put("LOGGING ROAD","LOGGING RD");
        STREET_TYPE_MAP.put("LOOP","LOOP");
        STREET_TYPE_MAP.put("LOOPS","LOOP");
        STREET_TYPE_MAP.put("MALL","MALL");
        STREET_TYPE_MAP.put("MANOR","MNR");
        STREET_TYPE_MAP.put("MANORS","MNRS");
        STREET_TYPE_MAP.put("MDW","MDW");
        STREET_TYPE_MAP.put("MDWS","MDWS");
        STREET_TYPE_MAP.put("MEADOW","MDW");
        STREET_TYPE_MAP.put("MEADOWS","MDWS");
        STREET_TYPE_MAP.put("MEDOWS","MDWS");
        STREET_TYPE_MAP.put("MEWS","MEWS");
        STREET_TYPE_MAP.put("MILL","ML");
        STREET_TYPE_MAP.put("MILLS","MLS");
        STREET_TYPE_MAP.put("MISSION","MSN");
        STREET_TYPE_MAP.put("MISSN","MSN");
        STREET_TYPE_MAP.put("ML","ML");
        STREET_TYPE_MAP.put("MLS","MLS");
        STREET_TYPE_MAP.put("MNR","MNR");
        STREET_TYPE_MAP.put("MNRS","MNRS");
        STREET_TYPE_MAP.put("MNT","MT");
        STREET_TYPE_MAP.put("MNTAIN","MTN");
        STREET_TYPE_MAP.put("MNTN","MTN");
        STREET_TYPE_MAP.put("MNTNS","MTNS");
        STREET_TYPE_MAP.put("MOTORWAY","MTWY");
        STREET_TYPE_MAP.put("MOUNT","MT");
        STREET_TYPE_MAP.put("MOUNTAIN","MTN");
        STREET_TYPE_MAP.put("MOUNTAINS","MTNS");
        STREET_TYPE_MAP.put("MOUNTIN","MTN");
        STREET_TYPE_MAP.put("MSN","MSN");
        STREET_TYPE_MAP.put("MSSN","MSN");
        STREET_TYPE_MAP.put("MT","MT");
        STREET_TYPE_MAP.put("MTIN","MTN");
        STREET_TYPE_MAP.put("MTN","MTN");
        STREET_TYPE_MAP.put("MTWY","MTWY");
        STREET_TYPE_MAP.put("NCK","NCK");
        STREET_TYPE_MAP.put("NECK","NCK");
        STREET_TYPE_MAP.put("OPAS","OPAS");
        STREET_TYPE_MAP.put("ORCH","ORCH");
        STREET_TYPE_MAP.put("ORCHARD","ORCH");
        STREET_TYPE_MAP.put("ORCHRD","ORCH");
        STREET_TYPE_MAP.put("OVAL","OVAL");
        STREET_TYPE_MAP.put("OVERPASS","OPAS");
        STREET_TYPE_MAP.put("OVL","OVAL");
        STREET_TYPE_MAP.put("PARK","PARK");
        STREET_TYPE_MAP.put("PARKS","PARK");
        STREET_TYPE_MAP.put("PARKWAY","PKWY");
        STREET_TYPE_MAP.put("PARKWAYS","PKWY");
        STREET_TYPE_MAP.put("PARKWY","PKWY");
        STREET_TYPE_MAP.put("PASS","PASS");
        STREET_TYPE_MAP.put("PASSAGE","PSGE");
        STREET_TYPE_MAP.put("PATH","PATH");
        STREET_TYPE_MAP.put("PATHS","PATH");
        STREET_TYPE_MAP.put("PIKE","PIKE");
        STREET_TYPE_MAP.put("PIKES","PIKE");
        STREET_TYPE_MAP.put("PINE","PNE");
        STREET_TYPE_MAP.put("PINES","PNES");
        STREET_TYPE_MAP.put("PK","PARK");
        STREET_TYPE_MAP.put("PKWAY","PKWY");
        STREET_TYPE_MAP.put("PKWY","PKWY");
        STREET_TYPE_MAP.put("PKWYS","PKWY");
        STREET_TYPE_MAP.put("PKY","PKWY");
        STREET_TYPE_MAP.put("PL","PL");
        STREET_TYPE_MAP.put("PLACE","PL");
        STREET_TYPE_MAP.put("PLAIN","PLN");
        STREET_TYPE_MAP.put("PLAINES","PLNS");
        STREET_TYPE_MAP.put("PLAINS","PLNS");
        STREET_TYPE_MAP.put("PLAZA","PLZ");
        STREET_TYPE_MAP.put("PLN","PLN");
        STREET_TYPE_MAP.put("PLNS","PLNS");
        STREET_TYPE_MAP.put("PLZ","PLZ");
        STREET_TYPE_MAP.put("PLZA","PLZ");
        STREET_TYPE_MAP.put("PNES","PNES");
        STREET_TYPE_MAP.put("POINT","PT");
        STREET_TYPE_MAP.put("POINTE","POINTE");
        STREET_TYPE_MAP.put("POINTS","PTS");
        STREET_TYPE_MAP.put("PORT","PRT");
        STREET_TYPE_MAP.put("PORTS","PRTS");
        STREET_TYPE_MAP.put("PR","PR");
        STREET_TYPE_MAP.put("PRAIRIE","PR");
        STREET_TYPE_MAP.put("PRARIE","PR");
        STREET_TYPE_MAP.put("PRK","PARK");
        STREET_TYPE_MAP.put("PROMENADE","PROMENADE");
        STREET_TYPE_MAP.put("PRR","PR");
        STREET_TYPE_MAP.put("PRT","PRT");
        STREET_TYPE_MAP.put("PRTS","PRTS");
        STREET_TYPE_MAP.put("PSGE","PSGE");
        STREET_TYPE_MAP.put("PT","PT");
        STREET_TYPE_MAP.put("PTS","PTS");
        STREET_TYPE_MAP.put("RAD","RADL");
        STREET_TYPE_MAP.put("RADIAL","RADL");
        STREET_TYPE_MAP.put("RADIEL","RADL");
        STREET_TYPE_MAP.put("RADL","RADL");
        STREET_TYPE_MAP.put("RAILROAD","RR");
        STREET_TYPE_MAP.put("RAILWAY","RLWY");
        STREET_TYPE_MAP.put("RAMP","RAMP");
        STREET_TYPE_MAP.put("RANCH","RNCH");
        STREET_TYPE_MAP.put("RANCHES","RNCH");
        STREET_TYPE_MAP.put("RAPID","RPD");
        STREET_TYPE_MAP.put("RAPIDS","RPDS");
        STREET_TYPE_MAP.put("RD","RD");
        STREET_TYPE_MAP.put("RDG","RDG");
        STREET_TYPE_MAP.put("RDGE","RDG");
        STREET_TYPE_MAP.put("RDGS","RDGS");
        STREET_TYPE_MAP.put("RDS","RDS");
        STREET_TYPE_MAP.put("REST","RST");
        STREET_TYPE_MAP.put("RIDGE","RDG");
        STREET_TYPE_MAP.put("RIDGES","RDGS");
        STREET_TYPE_MAP.put("RIV","RIV");
        STREET_TYPE_MAP.put("RIVER","RIV");
        STREET_TYPE_MAP.put("RIVR","RIV");
        STREET_TYPE_MAP.put("RLWY","RLWY");
        STREET_TYPE_MAP.put("RNCH","RNCH");
        STREET_TYPE_MAP.put("RNCHS","RNCH");
        STREET_TYPE_MAP.put("ROAD","RD");
        STREET_TYPE_MAP.put("ROADS","RDS");
        STREET_TYPE_MAP.put("ROADWAY","ROADWAY");
        STREET_TYPE_MAP.put("ROUTE","RTE");
        STREET_TYPE_MAP.put("ROW","ROW");
        STREET_TYPE_MAP.put("RPD","RPD");
        STREET_TYPE_MAP.put("RPDS","RPDS");
        STREET_TYPE_MAP.put("RR","RR");
        STREET_TYPE_MAP.put("RST","RST");
        STREET_TYPE_MAP.put("RTE","RTE");
        STREET_TYPE_MAP.put("RUE","RUE");
        STREET_TYPE_MAP.put("RUN","RUN");
        STREET_TYPE_MAP.put("RVR","RIV");
        STREET_TYPE_MAP.put("SERVICE ROAD","SVC RD");
        STREET_TYPE_MAP.put("SHL","SHL");
        STREET_TYPE_MAP.put("SHLS","SHLS");
        STREET_TYPE_MAP.put("SHOAL","SHL");
        STREET_TYPE_MAP.put("SHOALS","SHLS");
        STREET_TYPE_MAP.put("SHOAR","SHR");
        STREET_TYPE_MAP.put("SHOARS","SHRS");
        STREET_TYPE_MAP.put("SHORE","SHR");
        STREET_TYPE_MAP.put("SHORES","SHRS");
        STREET_TYPE_MAP.put("SHR","SHR");
        STREET_TYPE_MAP.put("SHRS","SHRS");
        STREET_TYPE_MAP.put("SKWY","SKWY");
        STREET_TYPE_MAP.put("SKYWAY","SKWY");
        STREET_TYPE_MAP.put("SMT","SMT");
        STREET_TYPE_MAP.put("SPG","SPG");
        STREET_TYPE_MAP.put("SPGS","SPGS");
        STREET_TYPE_MAP.put("SPNG","SPG");
        STREET_TYPE_MAP.put("SPNGS","SPGS");
        STREET_TYPE_MAP.put("SPRING","SPG");
        STREET_TYPE_MAP.put("SPRINGS","SPGS");
        STREET_TYPE_MAP.put("SPRNG","SPG");
        STREET_TYPE_MAP.put("SPRNGS","SPGS");
        STREET_TYPE_MAP.put("SPUR","SPUR");
        STREET_TYPE_MAP.put("SPURS","SPUR");
        STREET_TYPE_MAP.put("SQ","SQ");
        STREET_TYPE_MAP.put("SQR","SQ");
        STREET_TYPE_MAP.put("SQRE","SQ");
        STREET_TYPE_MAP.put("SQRS","SQS");
        STREET_TYPE_MAP.put("SQU","SQ");
        STREET_TYPE_MAP.put("SQUARE","SQ");
        STREET_TYPE_MAP.put("SQUARES","SQS");
        STREET_TYPE_MAP.put("ST","ST");
        STREET_TYPE_MAP.put("STA","STA");
        STREET_TYPE_MAP.put("STATION","STA");
        STREET_TYPE_MAP.put("STATN","STA");
        STREET_TYPE_MAP.put("STN","STA");
        STREET_TYPE_MAP.put("STR","ST");
        STREET_TYPE_MAP.put("STRA","STRA");
        STREET_TYPE_MAP.put("STRAV","STRA");
        STREET_TYPE_MAP.put("STRAVE","STRA");
        STREET_TYPE_MAP.put("STRAVEN","STRA");
        STREET_TYPE_MAP.put("STRAVENUE","STRA");
        STREET_TYPE_MAP.put("STRAVN","STRA");
        STREET_TYPE_MAP.put("STREAM","STRM");
        STREET_TYPE_MAP.put("STREET","ST");
        STREET_TYPE_MAP.put("STREETS","STS");
        STREET_TYPE_MAP.put("STREME","STRM");
        STREET_TYPE_MAP.put("STRIP","STRIP");
        STREET_TYPE_MAP.put("STRM","STRM");
        STREET_TYPE_MAP.put("STRT","ST");
        STREET_TYPE_MAP.put("STRVN","STRA");
        STREET_TYPE_MAP.put("STRVNUE","STRA");
        STREET_TYPE_MAP.put("SUMIT","SMT");
        STREET_TYPE_MAP.put("SUMITT","SMT");
        STREET_TYPE_MAP.put("SUMMIT","SMT");
        STREET_TYPE_MAP.put("SVC RD","SVC RD");
        STREET_TYPE_MAP.put("TER","TER");
        STREET_TYPE_MAP.put("TERR","TER");
        STREET_TYPE_MAP.put("TERRACE","TER");
        STREET_TYPE_MAP.put("THOROUGHFARE","THOROUGHFARE");
        STREET_TYPE_MAP.put("THROUGHWAY","TRWY");
        STREET_TYPE_MAP.put("TOLLWAY","TOLLWAY");
        STREET_TYPE_MAP.put("TPK","TPKE");
        STREET_TYPE_MAP.put("TPKE","TPKE");
        STREET_TYPE_MAP.put("TR","TRL");
        STREET_TYPE_MAP.put("TRACE","TRCE");
        STREET_TYPE_MAP.put("TRACES","TRCE");
        STREET_TYPE_MAP.put("TRACK","TRAK");
        STREET_TYPE_MAP.put("TRACKS","TRAK");
        STREET_TYPE_MAP.put("TRAFFICWAY","TRFY");
        STREET_TYPE_MAP.put("TRAIL","TRL");
        STREET_TYPE_MAP.put("TRAILS","TRL");
        STREET_TYPE_MAP.put("TRAK","TRAK");
        STREET_TYPE_MAP.put("TRCE","TRCE");
        STREET_TYPE_MAP.put("TRFY","TRFY");
        STREET_TYPE_MAP.put("TRK","TRAK");
        STREET_TYPE_MAP.put("TRKS","TRAK");
        STREET_TYPE_MAP.put("TRL","TRL");
        STREET_TYPE_MAP.put("TRLS","TRL");
        STREET_TYPE_MAP.put("TRNPK","TPKE");
        STREET_TYPE_MAP.put("TROLLEY","TROLLEY");
        STREET_TYPE_MAP.put("TRPK","TPKE");
        STREET_TYPE_MAP.put("TRUCK TRAIL","TRUCK TRL");
        STREET_TYPE_MAP.put("TRUCK TRL","TRUCK TRL");
        STREET_TYPE_MAP.put("TUNEL","TUNL");
        STREET_TYPE_MAP.put("TUNL","TUNL");
        STREET_TYPE_MAP.put("TUNLS","TUNL");
        STREET_TYPE_MAP.put("TUNNEL","TUNL");
        STREET_TYPE_MAP.put("TUNNELS","TUNL");
        STREET_TYPE_MAP.put("TUNNL","TUNL");
        STREET_TYPE_MAP.put("TURNPIKE","TPKE");
        STREET_TYPE_MAP.put("TURNPK","TPKE");
        STREET_TYPE_MAP.put("UN","UN");
        STREET_TYPE_MAP.put("UNDERPASS","UPAS");
        STREET_TYPE_MAP.put("UNION","UN");
        STREET_TYPE_MAP.put("UNIONS","UNS");
        STREET_TYPE_MAP.put("VALLEY","VLY");
        STREET_TYPE_MAP.put("VALLEYS","VLYS");
        STREET_TYPE_MAP.put("VALLY","VLY");
        STREET_TYPE_MAP.put("VDCT","VIA");
        STREET_TYPE_MAP.put("VIA","VIA");
        STREET_TYPE_MAP.put("VIADCT","VIA");
        STREET_TYPE_MAP.put("VIADUCT","VIADUCT");
        STREET_TYPE_MAP.put("VIEW","VW");
        STREET_TYPE_MAP.put("VIEWS","VWS");
        STREET_TYPE_MAP.put("VILL","VLG");
        STREET_TYPE_MAP.put("VILLAG","VLG");
        STREET_TYPE_MAP.put("VILLAGE","VLG");
        STREET_TYPE_MAP.put("VILLAGES","VLGS");
        STREET_TYPE_MAP.put("VILLE","VL");
        STREET_TYPE_MAP.put("VILLG","VLG");
        STREET_TYPE_MAP.put("VILLIAGE","VLG");
        STREET_TYPE_MAP.put("VIS","VIS");
        STREET_TYPE_MAP.put("VIST","VIS");
        STREET_TYPE_MAP.put("VISTA","VIS");
        STREET_TYPE_MAP.put("VL","VL");
        STREET_TYPE_MAP.put("VLG","VLG");
        STREET_TYPE_MAP.put("VLGS","VLGS");
        STREET_TYPE_MAP.put("VLLY","VLY");
        STREET_TYPE_MAP.put("VLY","VLY");
        STREET_TYPE_MAP.put("VLYS","VLYS");
        STREET_TYPE_MAP.put("VST","VIS");
        STREET_TYPE_MAP.put("VSTA","VIS");
        STREET_TYPE_MAP.put("VW","VW");
        STREET_TYPE_MAP.put("VWS","VWS");
        STREET_TYPE_MAP.put("WALK","WALK");
        STREET_TYPE_MAP.put("WALKS","WALK");
        STREET_TYPE_MAP.put("WALKWAY","WALKWAY");
        STREET_TYPE_MAP.put("WALL","WALL");
        STREET_TYPE_MAP.put("WAY","WAY");
        STREET_TYPE_MAP.put("WAYS","WAYS");
        STREET_TYPE_MAP.put("WELL","WL");
        STREET_TYPE_MAP.put("WELLS","WLS");
        STREET_TYPE_MAP.put("WLS","WLS");
        STREET_TYPE_MAP.put("WY","WAY");
        STREET_TYPE_MAP.put("XING","XING");

        // Load Unit Map //
        UNIT_MAP.put("APARTMENT", "APT");
        UNIT_MAP.put("APMT", "APT");
        UNIT_MAP.put("BASEMENT", "BSMT");
        UNIT_MAP.put("BUILDING", "BLDG");
        UNIT_MAP.put("DEPARTMENT", "DEPT");
        UNIT_MAP.put("FLOOR", "FL");
        UNIT_MAP.put("F", "FL");
        UNIT_MAP.put("FRONG", "FRNT");
        UNIT_MAP.put("HANGAR", "HNGR");
        UNIT_MAP.put("LOBBY", "LBBY");
        UNIT_MAP.put("LBY", "LBBY");
        UNIT_MAP.put("LOT", "LOT");
        UNIT_MAP.put("LT", "LOT");
        UNIT_MAP.put("LOWER", "LOWR");
        UNIT_MAP.put("NUMBER", "#");
        UNIT_MAP.put("#", "#");
        UNIT_MAP.put("NO", "#");
        UNIT_MAP.put("OFFICE", "OFC");
        UNIT_MAP.put("OFIC", "OFC");
        UNIT_MAP.put("OFFC", "OFC");
        UNIT_MAP.put("PIER", "PIER");
        UNIT_MAP.put("PENTHOUSE", "PH");
        UNIT_MAP.put("PBOX", "PO BOX");
        UNIT_MAP.put("PB", "PO BOX");
        UNIT_MAP.put("PBX", "PO BOX");
        UNIT_MAP.put("P O BOX", "PO BOX");
        UNIT_MAP.put("POBX", "PO BOX");
        UNIT_MAP.put("POBOX", "PO BOX");
        UNIT_MAP.put("BOX", "BX");
        UNIT_MAP.put("REAR", "REAR");
        UNIT_MAP.put("ROOM", "RM");
        UNIT_MAP.put("SIDE", "SIDE");
        UNIT_MAP.put("SLIP", "SLIP");
        UNIT_MAP.put("SPACE", "SPC");
        UNIT_MAP.put("STOP", "STOP");
        UNIT_MAP.put("SUITE", "STE");
        UNIT_MAP.put("SUIT", "STE");
        UNIT_MAP.put("TRAILER", "TRLR");
        UNIT_MAP.put("UNIT", "UNT");
        UNIT_MAP.put("UPPER", "UPPR");

        // Directional Map //
        DIRECTIONAL_MAP.put("NORTH", "N");
        DIRECTIONAL_MAP.put("NORTHEAST", "NE");
        DIRECTIONAL_MAP.put("EAST", "E");
        DIRECTIONAL_MAP.put("SOUTHEAST", "SE");
        DIRECTIONAL_MAP.put("SOUTH", "S");
        DIRECTIONAL_MAP.put("SOUTHWEST", "SW");
        DIRECTIONAL_MAP.put("WEST", "W");
        DIRECTIONAL_MAP.put("NORTHWEST", "NW");

        // State Map //
        STATE_MAP.put("Alabama", "AL");
        STATE_MAP.put("AL", "AL");
        STATE_MAP.put("Alaska", "AK");
        STATE_MAP.put("AK", "AK");
        STATE_MAP.put("Arizona", "AZ");
        STATE_MAP.put("AZ", "AZ");
        STATE_MAP.put("Arkansas", "AR");
        STATE_MAP.put("AR", "AR");
        STATE_MAP.put("California", "CA");
        STATE_MAP.put("CA", "CA");
        STATE_MAP.put("Colorado", "CO");
        STATE_MAP.put("CO", "CO");
        STATE_MAP.put("Connecticut", "CT");
        STATE_MAP.put("CT", "CT");
        STATE_MAP.put("Delaware", "DE");
        STATE_MAP.put("DE", "DE");
        STATE_MAP.put("Florida", "FL");
        STATE_MAP.put("FL", "FL");
        STATE_MAP.put("Georgia", "GA");
        STATE_MAP.put("GA", "GA");
        STATE_MAP.put("Hawaii", "HI");
        STATE_MAP.put("HI", "HI");
        STATE_MAP.put("Idaho", "ID");
        STATE_MAP.put("ID", "ID");
        STATE_MAP.put("Illinois", "IL");
        STATE_MAP.put("IL", "IL");
        STATE_MAP.put("Indiana", "IN");
        STATE_MAP.put("IN", "IN");
        STATE_MAP.put("Iowa", "IA");
        STATE_MAP.put("IA", "IA");
        STATE_MAP.put("Kansas", "KS");
        STATE_MAP.put("KS", "KS");
        STATE_MAP.put("Kentucky", "KY");
        STATE_MAP.put("KY", "KY");
        STATE_MAP.put("Louisiana", "LA");
        STATE_MAP.put("LA", "LA");
        STATE_MAP.put("Maine", "ME");
        STATE_MAP.put("ME", "ME");
        STATE_MAP.put("Maryland", "MD");
        STATE_MAP.put("MD", "MD");
        STATE_MAP.put("Massachusetts", "MA");
        STATE_MAP.put("MA", "MA");
        STATE_MAP.put("Michigan", "MI");
        STATE_MAP.put("MI", "MI");
        STATE_MAP.put("Minnesota", "MN");
        STATE_MAP.put("MN", "MN");
        STATE_MAP.put("Mississippi", "MS");
        STATE_MAP.put("MS", "MS");
        STATE_MAP.put("Missouri", "MO");
        STATE_MAP.put("MO", "MO");
        STATE_MAP.put("Montana", "MT");
        STATE_MAP.put("MT", "MT");
        STATE_MAP.put("Nebraska", "NE");
        STATE_MAP.put("NE", "NE");
        STATE_MAP.put("Nevada", "NV");
        STATE_MAP.put("NV", "NV");
        STATE_MAP.put("New Hampshire", "NH");
        STATE_MAP.put("NH", "NH");
        STATE_MAP.put("New Jersey", "NJ");
        STATE_MAP.put("NJ", "NJ");
        STATE_MAP.put("New Mexico", "NM");
        STATE_MAP.put("NM", "NM");
        STATE_MAP.put("New York", "NY");
        STATE_MAP.put("NY", "NY");
        STATE_MAP.put("North Carolina", "NC");
        STATE_MAP.put("NC", "NC");
        STATE_MAP.put("North Dakota", "ND");
        STATE_MAP.put("ND", "ND");
        STATE_MAP.put("Ohio", "OH");
        STATE_MAP.put("OH", "OH");
        STATE_MAP.put("Oklahoma", "OK");
        STATE_MAP.put("OK", "OK");
        STATE_MAP.put("Oregon", "OR");
        STATE_MAP.put("OR", "OR");
        STATE_MAP.put("Pennsylvania", "PA");
        STATE_MAP.put("PA", "PA");
        STATE_MAP.put("Rhode Island", "RI");
        STATE_MAP.put("RI", "RI");
        STATE_MAP.put("South Carolina", "SC");
        STATE_MAP.put("SC", "SC");
        STATE_MAP.put("South Dakota", "SD");
        STATE_MAP.put("SD", "SD");
        STATE_MAP.put("Tennessee", "TN");
        STATE_MAP.put("TN", "TN");
        STATE_MAP.put("Texas", "TX");
        STATE_MAP.put("TX", "TX");
        STATE_MAP.put("Utah", "UT");
        STATE_MAP.put("UT", "UT");
        STATE_MAP.put("Vermont", "VT");
        STATE_MAP.put("VT", "VT");
        STATE_MAP.put("Virginia", "VA");
        STATE_MAP.put("VA", "VA");
        STATE_MAP.put("Washington", "WA");
        STATE_MAP.put("WA", "WA");
        STATE_MAP.put("West Virginia", "WV");
        STATE_MAP.put("WV", "WV");
        STATE_MAP.put("Wisconsin", "WI");
        STATE_MAP.put("WI", "WI");
        STATE_MAP.put("Wyoming", "WY");
        STATE_MAP.put("WY", "WY");
        STATE_MAP.put("American Samoa", "AS");
        STATE_MAP.put("AS", "AS");
        STATE_MAP.put("District of Columbia", "DC");
        STATE_MAP.put("DC", "DC");
        STATE_MAP.put("Federated States of Micronesia", "FM");
        STATE_MAP.put("FM", "FM");
        STATE_MAP.put("Guam", "GU");
        STATE_MAP.put("GU", "GU");
        STATE_MAP.put("Marshall Islands", "MH");
        STATE_MAP.put("MH", "MH");
        STATE_MAP.put("Northern Mariana Islands", "MP");
        STATE_MAP.put("MP", "MP");
        STATE_MAP.put("Palau", "PW");
        STATE_MAP.put("PW", "PW");
        STATE_MAP.put("Puerto Rico", "PR");
        STATE_MAP.put("PR", "PR");
        STATE_MAP.put("Virgin Islands", "VI");
        STATE_MAP.put("VI", "VI");
        STATE_MAP.put("Armed Forces Africa", "AE");
        STATE_MAP.put("AE", "AE");
        STATE_MAP.put("Armed Forces Americas", "AA");
        STATE_MAP.put("AA", "AA");
        STATE_MAP.put("Armed Forces Canada", "AE");
        STATE_MAP.put("AE", "AE");
        STATE_MAP.put("Armed Forces Europe", "AE");
        STATE_MAP.put("AE", "AE");
        STATE_MAP.put("Armed Forces Middle East", "AE");
        STATE_MAP.put("AE", "AE");
        STATE_MAP.put("Armed Forces Pacific", "AP");
        STATE_MAP.put("AP", "AP");

    }
}
