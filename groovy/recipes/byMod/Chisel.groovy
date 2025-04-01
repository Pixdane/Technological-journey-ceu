mods.chisel.Carving.removeVariation("marble", item('astralsorcery:blockmarble'));

def types = [
        "agon",
        "azur",
        "bitt",
        "cray",
        "fort",
        "glaxx",
        "iszm",
        "jelt",
        "korp",
        "kryp",
        "lair",
        "lave",
        "mint",
        "myst",
        "reds",
        "reed",
        "roen",
        "sols",
        "sync",
        "tank",
        "vect",
        "vena",
        "zane",
        "zech",
        "zest",
        "zeta",
        "zion",
        "zkul",
        "zoea",
        "zome",
        "zone",
        "zorg",
        "ztyl",
        "zyth"
] as String[];

for (block in types) {
        mods.chisel.Carving.addGroup(block);
        mods.chisel.Carving.addVariation(block, item('xtones:' + block + ':*'));
}