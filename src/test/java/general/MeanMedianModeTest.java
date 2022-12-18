package general;

import common.ParentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MeanMedianModeTest extends ParentTest {

    @Test
    public void test000(){
        int[] input = new int[]{64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060};
        Double[] actual = MeanMedianMode.getMeanMedianMode(input);
        print(actual);
        Double[] expected = new Double[]{43900.6,44627.5, 4978.0};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test001(){
        int[] input = new int[]{19325,74348,68955,98497,26622,32516,97390,64601,64410,10205,5173,25044,23966,60492,71098,13852,27371,40577,74997,42548,95799,26783,51505,25284,49987,99134,33865,25198,24497,19837,53534,44961,93979,76075,57999,93564,71865,90141,5736,54600,58914,72031,78758,30015,21729,57992,35083,33079,6932,96145,73623,55226,18447,15526,41033,46267,52486,64081,3705,51675,97470,64777,31060,90341,55108,77695,16588,64492,21642,56200,48312,5279,15252,20428,57224,38086,19494,57178,49084,37239,32317,68884,98127,79085,77820,2664,37698,84039,63449,63987,20771,3946,862,1311,77463,19216,57974,73012,78016,9412,90919,40744,24322,68755,59072,57407,4026,15452,82125,91125,99024,49150,90465,62477,30556,39943,44421,68568,31056,66870,63203,43521,78523,58464,38319,30682,77207,86684,44876,81896,58623,24624,14808,73395,92533,4398,8767,72743,1999,6507,49353,81676,71188,78019,88429,68320,59395,95307,95770,32034,57015,26439,2878,40394,33748,41552,64939,49762,71841,40393,38293,48853,81628,52111,49934,74061,98537,83075,83920,42792,96943,3357,83393,73735,32851,12631,954,18806,12518,77451,40057,83048,50251,4042,43390,50802,22087,33164,56529,29586,45201,53718,45822,60832,22942,71260,14629,64736,31441,95195,58122,40597,27533,79588,42012,72119,98585,88519,44490,25289,17586,44822,14592,51428,48069,90282,42412,12944,76050,70793,16815,20712,64466,73404,14806,48857,50014,23121,20402,27509,88681,28108,51497,78993,93631,78013,36779,50217,23025,67506,23403,25015,52071,16229,94964,62133,18117,10038,92156,22253,19201,35213,63072,70702,60003,62184,25174,38807,69217,18269,34780,53985,64378,58515,42341,50198,20372,934,68985,57963,11215,21403,46205,15507,69671,34155,88430,88452,1638,90592,99970,93572,63994,51694,47581,29963,6021,42300,79985,87980,53593,13316,15453,10690,7573,43792,71043,65837,86090,11849,13415,37913,80829,43556,11626,86456,11948,48753,50572,94985,23127,92587,83075,85085,89213,23297,27255,79461,26307,97724,26001,39409,93543,24518,28315,3599,56270,47726,99708,66323,74188,38233,21863,33325,49449,97950,59748,36920,52970,4946,20811,59734,48067,88412,94590,31698,29282,74060,16216,53409,24486,45424,80834,30793,94982,71937,95521,43915,92787,15257,18588,84638,21077,53848,42191,20160,81149,45716,77300,47107,65762,77770,60567,96962,86928,76800,19170,91142,61000,46222,92164,32435,49106,71353,58661,9160,25018,11123,77541,86787,50724,5969,25433,76577,98856,28132,10052,77552,86342,81409,41371,17538,24809,96460,22169,98237,3789,59813,15371,48294,70037,47116,32200,51917,62708,77990,42760,87598,87462,62436,71345,86329,14745,89479,11246,60179,37511,26942,1721,26985,53855,63666,82255,31569,24481,62224,90107,33765,88634,82435,84202,54962,20873,97722,7023,118,2156,28323,35373,24906,24622,44402,22859,91908,17323,31298,83975,56369,74897,5968,98200,42143,76553,93357,30137,21480,92955,18346,68236,67495,8807,10356,51969,80403,10977,60186,61611,74497,45701,96794,52543,43777,78845,39918,84993,85737,53324,53059,8893,31858,36064,64260,73749,64164,52772,15242,70311,43764,79923,21407,86961,34987,34521,34150,38204,51300,77691,92008,96320,61963,84021,2961,34363,28456,71932,61930,54930,42445,96453,65401,13256,79334,64615,9713,60815,28008,69492,23199,59589,28739,72633,94170,10888,51539,76480,33665,81973,81803,24272,7155,70828,65184,69458,9390,65970,98428,765,62446,22955,35044,34202,49648,58515,77039,48268,79160,96421,37434,67204,17068,51985,54255,83409,59296,59036,28023,74513,8622,69405,19712,6680,817,62113,98302,52920,12954,77764,25274,22437,90534,92079,98910,49387,69816,44078,60998,52391,51178,45243,89793,74003,91778,55278,33697,27890,18311,35679,87953,66143,97993,71430,76652,12832,35921,29371,14645,70692,7439,67552,89386,30277,36893,73268,30427,51781,76463,16556,78063,66670,15697,60224,60255,93858,15647,69254,96862,20258,73106,90668,30131,38159,86807,96083,63534,33235,56646,99334,77717,47654,78754,35419,5937,94914,75688,37158,80916,82320,13570,92068,47138,4526,3896,80131,16190,492,40210,32404,62557,23356,73738,64698,16020,87525,48586,47273,13890,72410,52461,56223,72174,41025,30187,6276,10306,32807,48922,60093,18323,11049,63702,22413,13780,84304,83085,46,75596,35294,54872,92212,32064,25302,55609,95164,1524,46990,60773,21909,68402,59472,56689,91087,39631,78193,71526,51792,63272,42985,95265,44552,28294,21810,71384,48003,80544,1363,45802,16952,7529,13362,22473,1221,94395,55384,21619,79257,77566,32224,88127,31954,35651,71426,68599,74190,33407,41231,96316,71415,42254,94181,42133,82767,27639,35673,44389,25222,7332,41911,72559,63687,43008,42840,48593,65086,43754,18516,22700,33797,24547,26764,33146,62195,90700,21335,79793,31396,47616,99154,10299,91775,32512,66035,21502,50806,77264,39799,56009,87600,64349,93885,69236,86648,55846,58090,41524,90695,50647,8308,4564,63060,16932,11331,19852,8639,11040,5202,76658,19618,76458,66905,6581,87747,69766,66507,12010,58124,84856,49117,30234,51748,3611,13964,28011,16438,84796,81080,2963,8912,41050,38175,78210,74440,37042,67605,61848,94040,41364,16395,44176,71400,61297,95912,87090,9691,18671,977,72851,50455,27237,95495,11534,65397,69505,97372,54739,78898,38469,27660,55602,69921,86400,56781,16652,72492,6572,55659,40411,22286,20435,17512,15070,53427,71684,33266,30803,17200,56805,16966,76097,20127,21996,93123,68003,6415,41574,68735,51681,5988,42035,90528,77866,48393,80726,2714,24469,14254,20282,47385,44742,36760,50505,94900,21049,58767,22447,76968,34660,23291,30673,12488,46615,77985,50839,55140,31758,8923,71099,57760,2237,99895,27919,98440,78073,3250,17013,39576,36805,78428,65778,8839,47507,51209,40737,66930,97033,9950,28929,74108,17718,31227,48917,2591,20557,60745,50520,6665,12886,2205,21233,62940,63064,99827,44353,36273,17091,22133,41282,72177,39909,99400,44757,80418,20575,27374,25036,14293,82818,64537,10341,68264,8768,65063,90343,61732,84088,92928,41263,12622,64719,81768,16617,34794,90326,87305,89775,35134,13526,98060,21125,32299,31821,53569,30817,10219,70250,56209,19281,41416,50165,30684,16851,71174,37494,32826,52678,46243,95973,51466,30591,1283,60759,26119,14561,49639,14693,57942,74728,77986,67387,73980,33794,21169,94308,13535,57336,77665,76237,26633,55123,84724,61795,50799,55130,46403,77064,3722,2943,83713,5180,31675,89814,48553,15581,18386,58474,61670,94741,65667,56691,58050,96910,81112,31084,26768,49181,44360,49573,38162,31258,95180,33203,83514,90651,17289,5019,73422,88007,23601,2671,41554,87019,77093,1470,88583,8841,84657,6010,31424,65927,10808,1713,97054,20585,34858,76380,30146,80525,32298,43056,79873,13677,47435,99707,54131,21311,5899,30165,41150,28736,78279,15171,91568,31235,42511,11095,36422,714,45729,68643,55404,77010,37352,14947,34410,87253,2023,99674,21840,63256,50010,78920,37483,13740,86182,36207,12335,86255,69645,1389,85623,34629,35540,97000,67341,37753,10438,88143,49022,21675,7974,25640,52450,37259,51969,57779,28828,89784,39197,84369,74567,70392,27302,82628,46481,78912,53537,20334,29517,20199,37447,43714,82529,68375,23352,16781,91174,3473,38759,22646,10011,29909,12330,43860,27145,38211,4371,96114,84483,23574,89416,70438,67457,34240,96515,87507,15103,50109,18034,37018,94027,82945,85596,22123,27691,11072,36388,30043,55477,36964,29155,44842,89150,4486,69248,48490,98392,50943,4550,77781,66886,81600,41604,53084,40070,88930,60544,73949,33311,30471,66913,15782,78285,76930,72520,37042,68986,43837,94224,46063,85472,72001,92578,84779,72870,66604,3226,23363,25664,59154,81211,14548,82424,10939,47442,51254,56050,95197,77959,23304,8462,89748,98052,94722,55421,90535,26127,16193,15750,76569,6362,12238,67951,34260,38716,26820,48149,98374,36872,27130,17109,65400,94303,26866,34845,88110,94988,96683,63618,23963,9994,20656,54965,53822,94836,28168,6477,93138,73931,29234,87728,67240,52419,64152,41700,721,32516,56375,25567,71196,16585,36696,76479,13480,24419,36434,71672,33742,73445,61854,56844,53164,48181,23848,95085,66647,28945,99487,6971,35820,77999,24366,83595,60755,78496,44267,97352,8016,43857,89120,13576,73019,46834,13282,69406,76455,39531,2963,45758,42325,6010,32380,52541,17340,96073,91868,40931,43220,43681,11625,99374,83824,45877,34162,27499,19445,76280,66428,48016,14662,1681,43725,95891,40204,64845,47840,6416,75532,12342,55280,98806,28520,86284,57025,15664,20195,38125,26821,6954,35942,10786,55679,88640,77839,33797,64511,74958,89019,71955,17252,1004,71078,59048,7702,94236,71137,98008,81859,92890,95632,65782,86928,70030,19485,65253,74982,95361,56903,2476,41790,77964,55352,41374,31762,12290,56482,58584,43220,56178,50987,38724,47817,21042,45094,67390,98430,11533,28884,58759,23162,71657,49440,28925,4693,21136,24328,94257,9808,92577,45852,75930,2151,49505,57759,78168,87797,82824,35706,86404,12993,8938,41606,37152,51915,12097,4388,21510,71798,61425,84956,7638,73699,29255,89177,16400,71453,90108,79062,10561,44604,25540,61945,84835,65707,39679,94848,82746,88580,95163,42939,72722,71129,36800,93351,13066,34621,22886,23586,39954,11246,51623,83339,47847,88135,42996,5184,72033,96604,48362,84720,20388,21389,34906,46035,2665,4920,94465,3196,29137,20767,49061,39634,48028,44199,29097,32274,12110,91829,32788,92025,19474,96282,34088,40272,7778,66750,16996,45025,83489,3589,66008,45773,72467,74043,77751,46004,86743,40481,27323,51069,10215,19206,36450,79667,57211,83658,59228,78735,24408,44752,34321,33803,4365,27439,9012,95864,23583,63450,11932,20021,44815,10170,94900,86241,96663,33082,70515,25822,85348,51426,93063,70527,31342,3883,9497,3495,96230,19127,77857,16310,30724,32368,62646,16378,50298,57695,90448,21023,91959,5547,71630,58750,32224,98322,52304,17361,55421,1200,84993,37888,10372,33355,10461,59193,64165,87728,98676,39184,79931,65773,58268,76007,49713,29842,9767,10021,50290,94426,7856,71069,95504,91908,3412,48516,91025,41357,59057,5349,62818,45034,15298,20004,97875,46490,25490,15783,95208,61362,46869,53645,41987,96858,85583,71207,14943,11977,91706,41540,7046,17197,27004,61897,49647,66239,83245,68753,46041,34322,76758,65595,32143,36923,44198,17143,90388,99829,20676,98555,2975,99141,12876,63617,75137,23903,66499,48565,22359,52964,27846,42921,24974,98425,38987,95924,77927,37264,18518,4709,58272,89422,84397,22040,21772,7116,39569,62032,35663,81633,86315,94020,14401,57097,85565,41264,42272,73643,13524,1556,15936,21353,51970,74909,58214,2817,28486,27908,68226,96761,26786,12991,8599,90118,74512,81723,69567,21050,5233,87266,35718,59743,37364,35688,6443,96488,47811,95945,36255,85715,76180,3852,11822,48624,44174,83234,545,36124,79133,81952,59399,10367,35724,41173,65965,59460,18738,52864,74156,20220,77784,5532,2182,93154,82136,30899,30657,11779,20502,45445,74189,59112,72748,39169,75772,75382,65380,52677,26163,27541,81791,87376,62546,40975,4353,41328,11095,88056,66021,48550,50049,11869,21732,35209,52470,64607,31285,11986,93640,6542,77841,17049,91603,37095,78304,19927,43910,36880,58369,77205,58205,67977,68879,93364,12358,35802,90268,44668,3503,36619,10964,79855,89493,50538,8750,50157,54636,27500,59749,73953,11760,9843,20259,98627,8950,78601,60936,77130,6688,48825,15946,70835,61600,87504,64249,91007,80368,47257,27273,94128,85001,86443,16747,55344,31330,18964,11641,20138,12512,10199,96447,36996,31841,31155,83663,80321,84856,92580,38764,66022,44830,12008,60387,65421,86313,21837,67073,51002,68046,69427,12254,99019,72758,86571,39963,68165,19777,36042,24189,48651,78247,1699,10011,70583,83282,60135,67535,44768,81973,74116,32111,21176,92956,82684,40121,7244,24466,91896,26306,7071,83476,89855,76901,98594,69221,12919,88446,71131,90522,74080,7277,49091,74612,26522,99356,57133,23312,45442,33372,92773,8037,2830,54337,37964,19249,59968,78659,52932,57978,61895,4406,52615,85621,73359,96664,78467,3456,3159,61691,76384,88061,21192,31571,6754,66293,7713,74860,53917,15917,74089,94417,82007,2600,81370,9502,42051,26197,54,75490,23717,73795,36581,53145,81594,59355,9899,66733,70159,85392,47845,85594,31047,2769,7809,81154,83826,79134,25761,97453,91087,31423,41468,42292,37745,43911,83645,20238,94043,8861,68668,20365,18282,36438,63231,31537,11506,83709,48569,58537,34074,141,55431,33652,43414,97246,483,59823,8422,4516,30307,26607,51951,94670,278,95417,48230,87851,81702,43732,63408,50884,82397,37076,38158,80890,5734,21712,28188,65118,48846,7900,7044,49899,31956,97047,70075,82348,89353,55822,68370,99590,72052,23036,83541,5565,9112,10135,22703,24274,68868,41813,93640,98765,30763,95298,71151,66416,23785,92895,64952,33325,62359,81647,84230,14163,2797,24321,15500,5378,44396,52547,27959,6027,12498,54060,85501,52590,55861,86023,26810,25248,81167,2184,34288,29902,7188,26365,259,12140,12384,44792,97795,49326,80617,96793,18843,87679,47442,51844,55797,61131,33945,97008,92433,73116,8928,96289,39569,52938,54555,83529,17004,70692,10103,56356,18768,48515,67098,90396,8204,93156,15376,11196,68935,18759,33949,84573,15934,93430,31352,71658,50124,74916,43918,92866,93975,66779,67560,6575,84036,23523,12070,99556,73084,4312,14498,4161,32455,89492,27427,65249,26614,34000,89005,54775,15282,18750,26159,11056,5553,40818,79956,86607,40675,50002,34664,39354,41957,67729,38601,36228,37831,25987,96623,66850,31847,85868,79806,55247,82795,90196,12632,7644,14648,79119,78278,27701,55037,27372,54045,28914,99063,66882,96018,77927,43135,11894,95424,68016,72522,99412,56436,93986,50271,89743,94768,36988,63401,35692,16157,17475,9370,11231,44413,97692,13103,57060,92127,79290,41626,56994,2637,8497,67335,46138,30900,62623,36329,59168,38478,55376,11015,1305,73712,77036,72827,88068,96784,5662,63256,61103,78741,47518,85964,53335,40062,63396,82139,94070,72478,93895,79380,12673,66730,21929,26310,74983,30147,50684,273,94126,97034,9491,36082,49630,37437,7718,88957,48078,76736,88348,17976,54328,4970,43163,45742,35204,35351,91551,6124,67178,24716,17285,60265,24938,23780,60055,50738,83812,2403,42841,40128,85074,88427,33527,44385,41547,50313,53409,85647,8128,74427,75864,42837,80339,43755,96377,40343,20319,84881,22778,14127,14218,64683,80165,47769,79428,63211,55466,44006,72059,78664,4665,10359,59943,16756,44644,20458,70070,46509,59710,88534,87105,13153,80444,66747,69879,53832,14466,6798,43829,46245,58710,19380,24639,66733,39264,43283,41566,35106,30387,2879,82930,38511,72038,84050,73115,75029,63880,85012,36944,7846,18360,60276,44372,23370,46900,35190,95352,28545,60567,8432,97358,56250,81698,85125,10335,72282,97523,90472,51939,21597,83385,25271,68248,8791,82485,89164,95215,56550,46657,36404,35773,15051,72789,5083,59111,80195,38090,78967,91950,77402,43674,11220,75062,59935,66881,82180,2184,220,44778,53053,1920,6708,93213,78174,50604,69152,37538,34174,75321,52740,28455,23803,96360,68638,37458,49366,88209,93339,3273,15711,63138,52419,93169,89108,12599,62628,64408,44625,6514,55202,5857,1716,88630,82526,65319,5585,52404,3552,96473,79771,15107,77399,38599,72213,52512,53927,74044,16938,18707,40121,45472,81515,12100,58725,99857,47152,13177,45151,61848,92998,16782,6203,13255,14617,83157,7392,79743,32779,72374,30295,89061,77386,99001,509,72929,25787,60786,25810,73685,65288,27023,81071,51613,32344,10971,42312,16378,25821,48428,83799,91649,11161};
        Double[] actual = MeanMedianMode.getMeanMedianMode(input);
        print(actual);
        Double[] expected = new Double[]{49921.5, 49253.5, 2184.0};
        Assert.assertEquals(actual,expected);
    }
}
