class TJUtility {

    static Closure tjceu = { String name -> 'tjceu:' + name }

    static Closure tjId = { String name -> resource('tjceu', name) }

}
