mods.chisel.Carving.removeVariation('marble', item('astralsorcery:blockmarble'))

def types = [
        'agon',
        'azur',
        'bitt',
        'cray',
        'fort',
        'glaxx',
        'iszm',
        'jelt',
        'korp',
        'kryp',
        'lair',
        'lave',
        'mint',
        'myst',
        'reds',
        'reed',
        'roen',
        'sols',
        'sync',
        'tank',
        'vect',
        'vena',
        'zane',
        'zech',
        'zest',
        'zeta',
        'zion',
        'zkul',
        'zoea',
        'zome',
        'zone',
        'zorg',
        'ztyl',
        'zyth'
].forEach {
    mods.chisel.Carving.addGroup(it)
    for (i in 0..15) {
        mods.chisel.Carving.addVariation(it, item("xtones:${it}", i))
    }
}