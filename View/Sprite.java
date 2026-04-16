class Sprite{

    String[] spriteLines = new String[0];

    public static void display( Sprite sprite ){
        for( String s : sprite ){
            System.out.println( sprite.spriteLines[i] );
        }
    }

    public static void display( Sprite[] sprites ){

        for( int iSpriteLines = 0 ; iSpriteLines < sprites[0].spriteLines.length ; iSpriteLines++ ) {
            for( int iSprites = 0 ; iSprites < sprites.length ; i++ ){

                try{
                    System.out.println( sprites[iSprites].spriteLines[iSpriteLines] );
                }catch (Exception e){

                }

            }
        }

    }

}