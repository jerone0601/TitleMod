package org.yggdrasil.wurmunlimited.mods.Titles;

import java.util.logging.Logger;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;

public class Mastercraft {
	private static Logger logger = Logger.getLogger(Mastercraft.class.getName());
	public static void addNewTitles(){
        try {
            ExtendTitleEnum.builder("com.wurmonline.server.players.Titles$Title");
            // GM/Developer Titles
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Game_Master", 500, "Game Master", "Game Master", -1, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Developer", 501, "Developer", "Developer", -1, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Tester", 503, "Tester", "Tester", -1, "NORMAL");


            // Requested Titles
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Murderer", 550, "Murderer", "Murderer", -1, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Original_Settler", 551, "Original Settler", "Original Settler", -1, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Peace_Officer", 552, "Peace Officer", "Peace Officer", -1, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Founder", 553, "Founder", "Founder", -1, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Crazy", 554, "Crazy", "Crazy", -1, "NORMAL");

            // Contest Titles

            //Dungeon Titles

            // Characteristic Titles
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindLogic_Normal", 1000, "Logical", "Logical", 100, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindLogic_Minor", 1001, "Intelligent", "Intelligent", 100, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindLogic_Master", 1002, "Brilliant", "Brilliant", 100, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindLogic_Legendary", 1003, "Mentalist", "Mentalist", 100, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindSpeed_Normal", 1004, "Keen", "Keen", 101, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindSpeed_Minor", 1005, "Thinker", "Thinker", 101, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindSpeed_Master", 1006, "Clever", "Clever", 101, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("MindSpeed_Legendary", 1007, "Mind Over Matter", "Mind Over Matter", 101, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStrength_Normal", 1008, "Strong", "Strong", 102, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStrength_Minor", 1009, "Fortified", "Fortified", 102, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStrength_Master", 1010, "Unyielding", "Unyielding", 102, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStrength_Legendary", 1011, "Force of Nature", "Force of Nature", 102, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStamina_Normal", 1012, "Enduring", "Enduring", 103, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStamina_Minor", 1013, "Resilient", "Resilient", 103, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStamina_Master", 1014, "Vigorous", "Vigorous", 103, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyStamina_Legendary", 1015, "Unstoppable", "Unstoppable", 103, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyControl_Normal", 1016, "Nimble", "Nimble", 104, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyControl_Minor", 1017, "Deft", "Deft", 104, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyControl_Master", 1018, "Skillful", "Skillful", 104, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("BodyControl_Legendary", 1019, "Manipulator", "Manipulator", 104, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulStrength_Normal", 1020, "Spirited", "Spirited", 105, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulStrength_Minor", 1021, "Diviner", "Diviner", 105, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulStrength_Master", 1022, "Anima", "Anima", 105, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulStrength_Legendary", 1023, "Prophet", "Prophet", 105, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulDepth_Normal", 1024, "Sensible", "Sensible", 106, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulDepth_Minor", 1025, "Medium", "Medium", 106, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulDepth_Master", 1026, "Spiritual", "Spiritual", 106, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("SoulDepth_Legendary", 1027, "Planewalker", "Planewalker", 106, "LEGENDARY");

            // Skill Titles (Full)
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Staff_Normal", 1100, "Acolyte", "Acolyte", 10090, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Staff_Minor", 1101, "Disciple", "Disciple", 10090, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Staff_Master", 1102, "Monk", "Monk", 10090, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Staff_Legendary", 1103, "Sensei", "Sensei", 10090, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Scythe_Normal", 1104, "Mower", "Mower", 10047, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Scythe_Minor", 1105, "Harvester", "Harvester", 10047, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Scythe_Master", 1106, "Scythian", "Scythian", 10047, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Scythe_Legendary", 1107, "Reaper", "Reaper", 10047, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Defensive_Normal", 1108, "Resistant", "Resistant", 10054, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Defensive_Minor", 1109, "Guardian", "Guardian", 10054, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Defensive_Master", 1110, "The Wall", "The Wall", 10054, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Defensive_Legendary", 1111, "Unbreakable", "Unbreakable", 10054, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Aggressive_Normal", 1112, "Angry", "Angry", 10053, "NORMAL");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Aggressive_Minor", 1113, "Violent", "Violent", 10053, "MINOR");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Aggressive_Master", 1114, "Battleborn", "Battleborn", 10053, "MASTER");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Aggressive_Legendary", 1115, "Warmonger", "Warmonger", 10053, "LEGENDARY");
            
            // Skill Titles (100)
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Archery_Legendary", 1500, "Legendary Marksman", "Legendary Marksman", 1030, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Body_Legendary", 1501, "Hercules", "Hercules", 1, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Axes_Legendary", 1502, "Viking", "Viking", 1003, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Baking_Legendary", 1503, "Patissier", "Patissier", 10039, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Archaeology_Legendary", 1504, "Curator", "Curator", 10069, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("CarvingKnife_Legendary", 1505, "Woodsculptor", "Woodsculptor", 10007, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Taming_Legendary", 1506, "King of the Jungle", "Queen of the Jungle", 10078, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().addExtendEntry("Climbing_Legendary", 1507, "Moonwalker", "Moonwalker", 10073, "LEGENDARY");
            ExtendTitleEnum.getSingletonInstance().ExtendEnumEntries();

        } catch (BadBytecode | ClassNotFoundException | NotFoundException | CannotCompileException e) {
            logger.warning(e.getMessage());
        }
    }
}
