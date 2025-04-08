class TJUtility {

    static def tjceu = { String name -> 'tjceu:' + name }

    static def tjId = { String name -> resource('tjceu', name) }

}
