//= Auriga Script ==============================================================
// Ragnarok Online Portmalaya Town Script	by refis
//= Registry ===================================================================
// $MalayaName$[0] -> �|�[�g�}�����̉\
// $MalayaName$[1] -> �o���I�E�}�q���K�̉\
// $MalayaName$[2] -> �J�v���̖����̉\
// $MalayaName$[3] -> ma_fild01��̐����̉\
// $MalayaName$[4] -> ma_fild02��̐����̉\
// $MalayaName$[5] -> ma_scene01��̐����̉\
// $MalayaFes -> �s���^�h�X�t�F�X�e�B�o���J�Ê���
// $MalayaFes01 -> �����Ȃ���� �[�i��
// $MalayaFes02 -> ��̏\���� �[�i��
// $MalayaFes03 -> ���� �[�i��
//==============================================================================

//============================================================
// Shop
//------------------------------------------------------------
ma_in01.gat,73,22,3	shop	���폤�l	536,1207,1216,1107,1122,1116,1154,1407,1457,1354,1519
ma_in01.gat,67,13,5	shop	�h��l	536,2211,2401,2403,2501,2503,2101,2103,2305,2321,2332,2328,2627
ma_in01.gat,22,23,3	shop	����l	536,611,1750,501,502,503,504,645,656,601,602,1065,2239
malaya.gat,150,261,3	shop	�ʕ����l	535,512,513,515,516,535

//============================================================
// �A���x���^�̃|�[�g�}�����]��NPC
//------------------------------------------------------------
alberta.gat,196,202,3	script	�I�t�^���}���D��	100,{
	mes "[�I�t�^���}���D��]";
	mes "���`���A�N�B";
	mes "�|�[�g�}�����܂�10,000Zeny";
	mes "�Ȃ񂾂��ǂǂ������H";
	next;
	switch(select("�|�[�g�}�����ɂ���","�|�[�g�}�����ɍs��","��߂�")) {
	case 1:
		mes "[�I�t�^���}���D��]";
		mes "�|�[�g�}�����́A�A���x���^����";
		mes "�쐼�����Ɉʒu���鏬���Ȓ����B";
		next;
		mes "[�I�t�^���}���D��]";
		mes "���΂炭�q�H����������Ă����񂾂�";
		mes "�ŋ߁A�܂��s����悤�ɂȂ����񂾁B";
		next;
		mes "[�I�t�^���}���D��]";
		mes "�O�ɍs��������";
		mes "�܂�Ō̋����v�킹��悤��";
		mes "���炬�������钬��������B";
		mes "�����A���x���^�ɖ߂肽���Ȃ���";
		mes "�v���Ă��܂����قǂ���B";
		next;
		mes "[�I�t�^���}���D��]";
		mes "�N���|�[�g�}�����ɍs����";
		mes "���������Ă��邱�Ƃ�";
		mes "�����ł���Ǝv���B";
		close;
	case 2:
		if(Zeny < 10000) {
			mes "[�I�t�^���}���D��]";
			mes "���������A��������Ȃ����B";
			mes "�|�[�g�}�����܂ł̋�����";
			mes "�^�_�ŏ悹�邱�Ƃ͂ł��Ȃ��B";
			mes "��������10,000Zeny��";
			mes "�p�ӂ��ė��Ă���I ";
			close;
		}
		mes "[�I�t�^���}���D��]";
		mes "��`��";
		mes "�|�[�g�}�����ɏo��!!";
		close2;
		set Zeny,Zeny-10000;
		warp "malaya.gat",271,55;
		end;
	case 3:
		mes "[�I�t�^���}���D��]";
		mes "�ŋ߂̖`���҂�����";
		mes "�ƂĂ��Z�������ɂ��Ă�ȁB";
		mes "�ɂɂȂ����痈�Ă���B";
		mes "�|�[�g�}�����ɂł��V�тɍs�����B";
		close;
	}
OnInit:
	waitingroom "�|�[�g�}�����s��",0;
	end;
}

malaya.gat,276,55,4	script	�I�t�^���}���D��	100,{
	if(MALAYA_1QUE < 2) {
		mes "[�I�t�^���}���D��]";
		mes "�܂��������������悤���ȁB";
		mes "�ό��͏I��������H";
		mes "�A���x���^�ɖ߂�D�ւ�";
		mes "���ł����邩��ȁB";
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�I�t�^���}���D��]";
		mes "����`���҂̂������Œ��̐l�X��";
		mes "�����͈��S�����悤���B";
		mes "�A���x���^�ɖ߂�̂��H";
	}
	else {
		mes "[�I�t�^���}���D��]";
		mes "�N���]�ނȂ�΃A���x���^�܂�";
		mes "�����Ă����悤�B�ǂ����߂邩�H";
	}
	next;
	if(select("�߂�","�߂�Ȃ�") == 2) {
		mes "[�I�t�^���}���D��]";
		mes "�킩�����B";
		mes "�A���x���^�ɖ߂肽���Ȃ�����";
		mes "�܂����Ă���B";
		close;
	}
	mes "[�I�t�^���}���D��]";
	mes "�悵�A�A���x���^�ɏo��!!";
	close2;
	warp "alberta.gat",192,217;
	end;
}

//============================================================
// warp
//------------------------------------------------------------
malaya.gat,178,211,0	script	���ٓ����	45,1,1,{
	if(MALAYA_1QUE < 2) {
		mes "�]���������Ă���B";
		mes "�@�Z���͂��Ȃ����x�����Ă���悤���]";
		close;
	}
	warp "ma_in01.gat",24,80;
	end;
}

malaya.gat,112,212,0	script	���퉮�����	45,1,1,{
	if(MALAYA_1QUE < 6) {
		mes "�]���������Ă���B";
		mes "�@�Z���͂��Ȃ����x�����Ă���悤���]";
		close;
	}
	warp "ma_in01.gat",83,16;
	end;
}

malaya.gat,299,167,0	script	��������	45,1,1,{
	if(MALAYA_1QUE < 6) {
		mes "�]���������Ă���B";
		mes "�@�Z���͂��Ȃ����x�����Ă���悤���]";
		close;
	}
	warp "ma_in01.gat",12,24;
	end;
}

malaya.gat,261,240,0	script	���Ɠ����	45,1,1,{
	if(MALAYA_1QUE < 6) {
		mes "�]���������Ă���B";
		mes "�@�Z���͂��Ȃ����x�����Ă���悤���]";
		close;
	}
	warp "ma_in01.gat",126,20;
	end;
}

malaya.gat,300,211,0	script	���Ɠ����	45,1,1,{
	if(MALAYA_1QUE < 2) {
		mes "�]���������Ă���B";
		mes "�@�Z���͂��Ȃ����x�����Ă���悤���]";
		close;
	}
	warp "ma_in01.gat",36,152;
	end;
}

malaya.gat,309,70,0	script	�y���[�������	45,1,1,{
	if(MALAYA_3QUE < 1) {
		mes "�]�����������Ă���";
		mes "�@���ɓ���Ȃ��]";
		close;
	}
	warp "ma_in01.gat",108,92;
	end;
}

ma_dun01.gat,150,6,0	script	�a�@2�K����	45,1,1,{
	if(MALAYA_4QUE < 27) {
		mes "�]�Ō�t���Y�́A�K�i��";
		mes "�@��������Ă���ƌ����Ă�����";
		mes "�@�ʂ��悤���]";
		next;
		if(select("2�K�ɍs��","�����Ԃ�") == 2) {
			mes "�]���Ȃ��͊K�i�ɔw���������]";
			close;
		}
		mes "�]���Ȃ��͊K�i��������]";
		close2;
	}
	warp "ma_dun01_jp.gat",36,156;
	end;
}

//============================================================
// ����
//------------------------------------------------------------
ma_in01.gat,30,94,4	script	���ق̎�	583,{
	if(MALAYA_1QUE < 6) {
		mes "[���ق̎�]";
		mes "�ŋ߁A���ŉ\�ɂȂ��Ă���`���҂���";
		mes "���Ȃ��̂��Ƃł���ˁH";
		mes "�������l�ŉc�Ƃ����邱�Ƃ�";
		mes "�ł���悤�ɂȂ�܂����B";
		mes "���肪�Ƃ��������܂��B";
	}
	else {
		mes "[���ق̎�]";
		mes "��������Ⴂ�܂��B";
		mes "�|�[�g�}�����ōō��̗���";
		mes "�R�[�������[�t�ł�";
	}
	next;
	mes "[���ق̎�]";
	mes "�x��ł�������ł����H";
	mes "�h�����5000Zeny�ł��B";
	next;
	switch(select("�Z�[�u����","�x��ł��� - 5000z","��߂�")) {
	case 1:
		mes "[���ق̎�]";
		mes "�Z�[�u���܂����B";
		mes "�܂�������܂��傤�B";
		savepoint "ma_in01.gat",44,97;
		close;
	case 2:
		if(Zeny < 5000) {
			mes "[���ق̎�]";
			mes "���q�l�A���݂܂���";
			mes "�h�������Ȃ��悤�ł��B";
			close;
		}
		mes "[���ق̎�]";
		mes "�ł͂������x��ŉ������B";
		close2;
		set Zeny,Zeny-5000;
		warp "ma_in01.gat",43,98;
		percentheal 100,100;
		end;
	case 3:
		mes "[���ق̎�]";
		mes "�܂��̂����X�����҂����Ă���܂��B";
		close;
	}
}

//============================================================
// �W�v�j�[�h���C�o�[NPC
//------------------------------------------------------------
function	script	MalayaJeepney	{
	set '@type,getarg(0);
	switch(select("���悷��","�W�v�j�[�H","���̃W�v�j�[�͂���܂��񂩁H","���͏��܂���")) {
	case 1:
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�ǂ��ɂ����܂����H";
		next;
		switch(select("�a�@�O","�k�̏Z��n","�D������","�|�[�g�}�����o��","�����L��","����h��O","����O","�W�v�j�[�ɏ�荞��","����ς��߂�")) {
		case 1:
			set '@x,66;
			set '@y,46;
			break;
		case 2:
			set '@x,183;
			set '@y,350;
			break;
		case 3:
			set '@x,258;
			set '@y,56;
			break;
		case 4:
			set '@x,361;
			set '@y,281;
			break;
		case 5:
			set '@x,239;
			set '@y,217;
			break;
		case 6:
			set '@x,119;
			set '@y,212;
			break;
		case 7:
			set '@x,292;
			set '@y,171;
			break;
		case 8:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�ł́A�y�������Ԃ������肭�������B";
			close2;
			warp "ma_zif0" +'@type+ ".gat",29,24;
			end;
		case 9:
			close;
		}
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�ł́A�y�������Ԃ������肭�������B";
		close2;
		warp "malaya.gat",'@x,'@y;
		end;
	case 2:
		switch('@type) {
		case 1:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			mes "�ł́A�������܂��傤�B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�͌��X�A";
			mes "�ݕ��p�̎ԗ��������̂ł����A";
			mes "��荇���^�N�V�[�Ƃ��ĉ������A";
			mes "��O��ʎ�i�ƂȂ��Ă��܂��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "��������l�̌��ɂ����";
			mes "�l�X�ȃf�U�C���̃W�v�j�[��";
			mes "���邱�Ƃ��ł��܂��B";
			close;
		case 2:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			mes "�ł́A�������܂��傤�B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�͌��X�A";
			mes "�ݕ��p�̎ԗ��������̂ł����A";
			mes "��荇���^�N�V�[�Ƃ��ĉ������A";
			mes "��O��ʎ�i�ƂȂ��Ă��܂��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "���̃W�v�j�[�͎����������܂����B";
			mes "����͏��Ȃ߂ł����A";
			mes "�d���Œׂꂽ��͂��܂����B";
			close;
		case 3:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			mes "�ł́A�������܂��傤�B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�͌��X�A";
			mes "�ݕ��p�̎ԗ��������̂ł����A";
			mes "��荇���^�N�V�[�Ƃ��ĉ������A";
			mes "��O��ʎ�i�ƂȂ��Ă��܂��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "��������l�̌��ɂ����";
			mes "�l�X�ȃf�U�C���̃W�v�j�[��";
			mes "���邱�Ƃ��ł��܂��B";
			mes "����|�[�g�}�����̖����ł��B";
			close;
		case 4:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�͌��X�A";
			mes "�ݕ��p�̎ԗ��������̂ł����A";
			mes "��荇���^�N�V�[�Ƃ��ĉ������A";
			mes "��O��ʎ�i�ƂȂ��Ă��܂��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����ɗ�������ɂ�";
			mes "�W�v�j�[�ɏ��Ȃ��ƌ�����܂���B";
			close;
		case 5:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			mes "�܂��A�T�[�r�X�Ő������܂��傤�B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�̓|�[�g�}�������\����";
			mes "��O��ʎ�i�ł��B";
			mes "���S��̖��ŁA�W�v�j�[���Ƃ�";
			mes "����l���𒲐����Ă��܂��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�ȑO�́A�W�v�j�[��180�l��";
			mes "���ꍇ���������Ƃ����܂����A";
			mes "�ŋ߂ł́A����ȑ吨����邱�Ƃ�";
			mes "����܂���ˁB";
			close;
		case 6:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			mes "���s�҂ւ̂��ē����h���C�o�[�̎d���I";
			mes "���������A���������܂��傤�B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�ݕ��p�̎ԗ���";
			mes "�I�V�����ɉ��������̂��W�v�j�[���I";
			mes "�������A���̃W�v�j�[��";
			mes "��������������ł��B";
			mes "�C�P�Ă�ł��傤�H";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "���Ƃ��A���q�l������M���ł����Ă�";
			mes "���̃W�v�j�[���^�]������킯�ɂ�";
			mes "�����܂����B";
			close;
		case 7:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�̓|�[�g�}������";
			mes "��O��ʎ�i�ł��B";
			mes "���̂��������Ō������܂����A";
			mes "�Ȃ�Ƃ����Ă������ł��I";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�ɂ���Ē�����o���o����";
			mes "���ꊴ������܂��񂯂ǁA";
			mes "�N�����ɂ��܂���B";
			mes "�����Ȃ�A���̃W�v�j�[�ɏ���";
			mes "���������ł�����ˁB";
			close;
		case 8:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�͈��S�����d�����ꂽ";
			mes "��O��ʎ�i�ł��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "���̃W�v�j�[�́A";
			mes "���݃|�[�g�}�����ł̍ō�����";
			mes "�u60�l�W�v�j�[�܁v�����Ă��܂��I";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "���!!�@���S�ł�����";
			mes "�S�z���Ȃ��ŏ���Ă��������B";
			close;
		case 9:
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�|�[�g�}�����̒��͏��߂Ăł����H";
			mes "�ł́A�������܂��傤�B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�W�v�j�[�͌��X";
			mes "�ݕ��p�̎ԗ��������̂ł����A";
			mes "��荇���^�N�V�[�Ƃ��ĉ������A";
			mes "��O��ʎ�i�ƂȂ��Ă��܂��B";
			next;
			mes "[�W�v�j�[�h���C�o�[]";
			mes "��������l�̌��ɂ����";
			mes "�l�X�ȃf�U�C���̃W�v�j�[��";
			mes "���邱�Ƃ��ł��܂��B";
			close;
		}
	case 3:
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�����|�[�g�}�����ł�";
		mes "�S����9�̃W�v�j�[���^�s���ł��B";
		next;
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���̃W�v�j�[�̈ʒu��";
		mes "�m�肽���ł����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�W�v�j�[�h���C�o�[]";
			mes "�킩��܂����B";
			mes "�ł́A�y�����������߂������������I";
			close;
		}
		viewpoint 1,237,240,1,0xF7E009;
		viewpoint 1,67,44,2,0xF7E009;
		viewpoint 1,282,129,3,0xF7E009;
		viewpoint 1,134,250,4,0xF7E009;
		viewpoint 1,341,153,5,0xF7E009;
		viewpoint 1,293,290,6,0xF7E009;
		viewpoint 1,242,221,7,0xF7E009;
		viewpoint 1,62,245,8,0xF7E009;
		viewpoint 1,257,58,9,0xF7E009;
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�n�}��ɁA�W�v�j�[�̈ʒu��";
		mes "�������Ă����܂����B";
		close;
	case 4:
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�W�v�j�[�𗘗p�������Ȃ�����A";
		mes "�߂��̃h���C�o�[��";
		mes "���������Ă��������B";
		close;
	}
}

malaya.gat,237,240,4	script	�W�v�j�[�h���C�o�[#01	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�������������c�c";
		mes "�|���c�c�|����c�c";
		mes "�ǂ����Ă���Ȃ��ƂɂȂ����񂾁H";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�܂����������Łc�c";
		mes "�W�v�j�[���^�s���Ă����̂�";
		mes "�킩��Ȃ��c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�͂͂́A��������Ⴂ�܂��B";
	mes "�W�v�j�[���^�s���Ă���";
	mes "^1561EA�{��^000000�Ƃ����܂��B";
	next;
	callfunc "MalayaJeepney",1;
	end;
}

malaya.gat,67,44,4	script	�W�v�j�[�h���C�o�[#02	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���c�c���������c�c";
		mes "�a�@�ŉ����N�����Ă���񂾁H";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�a�@���畷�����鋃������";
		mes "�������Ȃ��Ă����悤���c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�W�v�j�[���^�]���Ă���";
	mes "^1561EA�`�[^000000�ł��B";
	mes "��낵���`";
	next;
	callfunc "MalayaJeepney",2;
	end;
}

malaya.gat,282,129,4	script	�W�v�j�[�h���C�o�[#03	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�悻�҂ɘb�����Ƃ͂���܂���c�c";
		mes "�����o�L�l�Ȃ�";
		mes "�����Ƃ��̎��Ԃ��������邽�߂�";
		mes "���@��m���Ă���ɈႢ�Ȃ��c�c";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�ŋ߃����o�L�l�ɉ�����Ƃ����̂�";
		mes "�N�����Ȃ̂��c�c�H";
		mes "����A����Ȑl����";
		mes "����ȂƂ���ɂ���킯�͂Ȃ����B";
		mes "�c�c�Ƃ������Ƃ́A���΂��Ȃ̂��H";
		mes "���킠���c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�W�v�j�[���^�]���Ă���";
	mes "^1561EA�g�b�v^000000�ł��B";
	next;
	callfunc "MalayaJeepney",3;
	end;
}

malaya.gat,134,250,6	script	�W�v�j�[�h���C�o�[#04	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���c�c�������Ɂc�c�s���Ă���c�c";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���킠���c�c";
		mes "�т����肵������Ȃ����c�c";
		mes "�������ɍs����c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�|����Ȃ̂ň��S�^�]��S�����Ă���";
	mes "�W�v�j�[�h���C�o�[";
	mes "^1561EA�u���u^000000�ł��B";
	next;
	callfunc "MalayaJeepney",4;
	end;
}

malaya.gat,341,153,4	script	�W�v�j�[�h���C�o�[#05	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�܁c�c���Ɉ��삪�c�c";
		mes "�����c�c�N������ɂ��ꂽ�̂��H";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���삪�������̂��c�c�H";
		mes "���������Â��ɂȂ����悤���B";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�W�v�j�[���^�]���Ă���";
	mes "^1561EA���r��^000000�ł��B";
	next;
	callfunc "MalayaJeepney",5;
	end;
}

malaya.gat,293,290,6	script	�W�v�j�[�h���C�o�[#06	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���c�c�x�����c�c";
		mes "�x�����͂��������������Ă���񂾁H";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "����ƌx�����������o�����̂��H";
		mes "�Ƃ肠��������ŉ��Ƃ��Ȃ�̂��c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�^����ꂽ�d���͓I�m�ɏ�������";
	mes "�W�v�j�[�h���C�o�[";
	mes "^1561EA�K�[�h^000000�ł��B";
	next;
	callfunc "MalayaJeepney",6;
	end;
}

malaya.gat,242,221,4	script	�W�v�j�[�h���C�o�[#07	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�����c�c�����イ�����΂����炯���B";
		mes "��͂�A�w���҃����o�L�l��";
		mes "�s���Ȃ���΂Ȃ�Ȃ��̂��c�c�H";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���΂��c�c";
		mes "�����o�L�l�Ȃ�A���΂���h�����@��";
		mes "�m���Ă���͂����c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "���΂����񂹕t���Ȃ�";
	mes "�W�v�j�[���^�]���Ă���";
	mes "^1561EA�z�[�g^000000�ł��B";
	next;
	callfunc "MalayaJeepney",7;
	end;
}

malaya.gat,62,245,6	script	�W�v�j�[�h���C�o�[#08	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "����ȁ`";
		mes "���΂��Ȃ痈��ȁ`";
		mes "�l�ł�����ȁ`";
		mes "����ȁ`";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�����c�c�N�c�c";
		mes "�l����ˁH";
		mes "���΂�����Ȃ���ˁH";
		mes "�������ƌ����Ă���c�c";
		mes "���肢���c�c";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "�W�v�j�[���^�]���Ă���";
	mes "^1561EA������^000000�Ƃ����܂��B";
	mes "��Ă��ꂵ���ł��B";
	next;
	callfunc "MalayaJeepney",8;
	end;
}

malaya.gat,257,58,6	script	�W�v�j�[�h���C�o�[#09	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "�c�c�O�����痈�����ł��ˁB";
		mes "���̒��͊댯�Ȃ̂�";
		mes "�C��t���Ă��������B";
		close;
	}
	else if(MALAYA_1QUE < 6) {
		mes "[�W�v�j�[�h���C�o�[]";
		mes "���ς�炸���͊댯�ł��B";
		mes "���������ɂȂ�܂ł́A";
		mes "�W�v�j�[���o���܂���B";
		close;
	}
	mes "[�W�v�j�[�h���C�o�[]";
	mes "���߂܂��āA";
	mes "�W�v�j�[���^�]���Ă���";
	mes "^1561EA�O���}^000000�ł��B";
	next;
	callfunc "MalayaJeepney",9;
	end;
}

ma_zif01.gat,30,22,0	warp	jeepney01	1,1,malaya.gat,241,238
ma_zif02.gat,30,22,0	warp	jeepney02	1,1,malaya.gat,71,43
ma_zif03.gat,30,22,0	warp	jeepney03	1,1,malaya.gat,284,129
ma_zif04.gat,30,22,0	warp	jeepney04	1,1,malaya.gat,134,247
ma_zif05.gat,30,22,0	warp	jeepney05	1,1,malaya.gat,341,150
ma_zif06.gat,30,22,0	warp	jeepney06	1,1,malaya.gat,294,293
ma_zif07.gat,30,22,0	warp	jeepney07	1,1,malaya.gat,239,221
ma_zif08.gat,30,22,0	warp	jeepney08	1,1,malaya.gat,59,246
ma_zif09.gat,30,22,0	warp	jeepney09	1,1,malaya.gat,254,68

//============================================================
// �|�[�g�}��������NPC
//------------------------------------------------------------
ma_in01_jp.gat,81,22,5	script	�Y�ޘV��	575,{
	mes "[�Y�ޘV��]";
	mes "�ŋ߂��̕ӂ�̖����������Ă��Ă���B";
	next;
	mes "[�Y�ޘV��]";
	mes "�����炭���̐��E�Ŋ������Ă���";
	mes "���������̗͂����X��";
	mes "�����Ȃ��Ă��Ă���̂���낤�c�c�B";
	next;
	if(select("�����ɑ΍R����ɂ́H","��������") == 2) {
		mes "[�Y�ޘV��]";
		mes "�����Ƃ̐�ɏ�������悤�Ɂc�c�B";
		close;
	}
	if(countitem(6497) < 3 || Zeny < 1000) {
		mes "[�Y�ޘV��]";
		mes "�Â����畔����";
		mes "�`����Ă�����@������c�c�B";
		next;
		mes "[�Y�ޘV��]";
		mes "�Ñ㐸��̗͂��Ăт���";
		mes "�g�p������@�Ȃ̂��Ⴊ�A";
		mes "���ʂȍޗ����K�v�ɂȂ�B";
		next;
		menu "���̍ޗ��Ƃ́H",-;
		mes "[�Y�ޘV��]";
		mes "�Ñ㐸��̗͂��h�点��";
		mes "�����Ȃ����3�ƕ����ɓ`���";
		mes "���ʂȕ����K�v�Ȃ̂��Ⴊ�c�c�B";
		next;
		mes "[�Y�ޘV��]";
		mes "���̓��ʂȕ��͍��ł�";
		mes "������ɓ���邱�Ƃ��ł���c�c�B";
		next;
		menu "�����ł͔����Ȃ����Ȃ�ł����H",-;
		mes "[�Y�ޘV��]";
		mes "���́c�c�܁A�ۂ����c�c����͉����ˁH";
		next;
		menu "�Ђ���Ƃ���Zeny�̂��Ƃł����H",-;
		mes "[�Y�ޘV��]";
		mes "�����ɌÂ�����`��镨��";
		mes "�悭���Ă��������";
		mes "����Ă��邶��Ȃ����B";
		next;
		mes "[�Y�ޘV��]";
		mes "���A���ꂪ��R����Έ����ɑ΍R����";
		mes "�Ñ㐸��̂�������邱�Ƃ�";
		mes "�ł��邩�������c�c�B";
		next;
		mes "[�Y�ޘV��]";
		mes "�����c�c�N�������ɑ΍R����͂�";
		mes "����Ȃ��Ȃ������ɂ�";
		next;
		mes "[�Y�ޘV��]";
		mes "^FF0000�����Ȃ����3��^000000��";
		mes "����^FF0000Zeny�Ƃ�������1000��^000000�ق�";
		mes "�����ė��Ȃ����c�c�B";
		next;
		mes "[�Y�ޘV��]";
		mes "20���ԁA����������10%��";
		mes "����ɋ����U�������邱�Ƃ��ł���";
		mes "�Ñ㐸��̂���������Ă�낤�B";
		close;
	}
	mes "[�Y�ޘV��]";
	mes "�����ɑ΍R����͂��s�����Ă���̂��B";
	next;
	mes "[�Y�ޘV��]";
	mes "�ǂ�����A";
	mes "^FF0000�����Ȃ����3��1,000Zeny^000000�ŁA";
	mes "20���ԁA����������10%��";
	mes "����ɋ����U�������邱�Ƃ��ł���";
	mes "^0000FF�Ñ㐸��̂����^000000������Ă�낤���H";
	next;
	if(select("���܂�","���v�ł�") == 2) {
		mes "[�Y�ޘV��]";
		mes "�����Ƃ̐�ɏ�������悤�Ɂc�c�B";
		close;
	}
	if(checkitemblank() == 0) {
		mes "[�Y�ޘV��]";
		mes "�����i�̎�ސ���������";
		mes "�n���Ȃ��̂��B";
		mes "��ސ������炵�Ă���܂����Ȃ����B";
		close;
	}
	misceffect 71,"";
	misceffect 9;
	delitem 6497,3;
	set Zeny,Zeny-1000;
	getitem 12775,1;
	mes "[�Y�ޘV��]";
	mes "�����Ƃ̐�ɏ�������悤�Ɂc�c�B";
	close;
}

ma_in01_jp.gat,67,22,5	script	�e�B�N�o��������	582,{
	if(checkquest(7406)) {
		mes "[�e�B�N�o��������]";
		mes "����̍��𕪂��Ăق����H";
		mes "�����A�o���^�C�̃G�T�Ɏg���񂾂ȁB";
		next;
		mes "[�e�B�N�o��������]";
		mes "�ł��A����̍��͂ƂĂ��M�d��";
		mes "�����ޗ��Ȃ񂾁B";
		mes "��ɓ����̂���ςȕ�������";
		mes "���������Ă����鎞�ɂ͑����";
		mes "���̌�������`���Ė���Ă���񂾁B";
		next;
		menu "��������΂����ł����H",-;
		mes "[�e�B�N�o��������]";
		mes "���̓e�B�N�o�����̌��������Ă���B";
		mes "����͌����̈�Ƃ���";
		mes "�퓬�̋L�^���Ƃ肽���񂾁B";
		mes "�����ŁA�N�ɂ̓e�B�N�o������";
		mes "�퓬�����Ă��Ăق����B";
		next;
		mes "[�e�B�N�o��������]";
		mes "�������ȁA�e�B�N�o������";
		mes "^FF000020�C^000000�|���Ώ\�����낤�B";
		mes "�N�͂ƂĂ������������A�y������H";
		mes "���ꂶ�Ⴀ�A��낵�����ނ�B";
		delquest 7406;
		setquest 106176;
		close;
	}
	if(checkquest(106176)) {
		if(!(checkquest(106176) & 0x4)) {
			mes "[�e�B�N�o��������]";
			mes "�ǂ������H";
			mes "�����e�B�N�o������^FF000020�C^000000";
			mes "�|���Ă��Ă���B";
			mes "��낵�����ނ�B";
			close;
		}
		mes "[�e�B�N�o��������]";
		mes "���A�e�B�N�o�����Ƃ̐퓬�L�^��";
		mes "�����Ă��Ă��ꂽ�̂��B";
		next;
		mes "[�e�B�N�o��������]";
		mes "�����I�@����͐����I";
		mes "�N�̂������ŁA���ɗǂ�������";
		mes "�o���������B";
		mes "�{���ɂ��肪�Ƃ�!!";
		next;
		menu "����̍��́H",-;
		mes "[�e�B�N�o��������]";
		mes "�����A���܂Ȃ��B";
		mes "�e�B�N�o�����̎��ƂȂ��";
		mes "�����������Ă��܂��񂾁B";
		mes "�ق�A���ꂪ����̍����B";
		mes "�����Ă����Ƃ����B";
		next;
		if(checkitemblank() == 0) {
			mes "[�e�B�N�o��������]";
			mes "����A�ו��������ēn���Ȃ��ȁB";
			mes "�����ו������炵�Ă��Ă���B";
			close;
		}
		delquest 106176;
		setquest 72060;
		getitem 6507,10;
		mes "[�e�B�N�o��������]";
		mes "����̍����K�v�ɂȂ�����";
		mes "�܂��K�˂Ă���Ƃ����B";
		mes "�������A��`���͂��ĖႤ���ǂˁB";
		close;
	}
	mes "[�e�B�N�o��������]";
	mes "���͐l����90%��";
	mes "�e�B�N�o���������̂��߂�";
	mes "�͂����ė����B";
	mes "�e�B�N�o�����̂��ƂȂ�";
	mes "�Ȃ�ł������Ă���I";
	next;
	switch(select("�܂��Ⴂ�ł���","�e�B�N�o�����H","�e�B�N�o������߂܂�����@�́H")) {
	case 1:
		mes "[�e�B�N�o��������]";
		mes "���A����Ȃ��Ƃ͂Ȃ��I";
		mes "�����ڂ����Ŕ��f���Ė���Ă͍���B";
		next;
		mes "[�e�B�N�o��������]";
		mes "���͓���Ȃ̂Ō����ڂ���";
		mes "�΂��Ƃ��Ă���񂾁B";
		next;
		menu "�c�c�c",-;
		mes "[�e�B�N�o��������]";
		mes "�M����!!�@�M����҂ɂ͕�������";
		mes "�Ƃ�������Ȃ����B";
		close;
	case 2:
		mes "[�e�B�N�o��������]";
		mes "�ӂӂӁc�c�悭�������Ă��ꂽ�B";
		mes "���ꂱ�����̐�啪�삾�B";
		mes "���ł������Ă������B";
		while(1) {
			next;
			switch(select("�����������Ƃ͂Ȃ�","����","�O��","�\","�����n")) {
			case 1:
				mes "[�e�B�N�o��������]";
				mes "�܂��C�ɂȂ邱�Ƃł���������";
				mes "�V�тɗ���Ƃ����B";
				close;
			case 2:
				mes "[�e�B�N�o��������]";
				mes "�e�B�N�o����������";
				mes "�ڂ̑O�ɗ��s�҂�����������";
				mes "���̗��s�҂��ǂ��ɍs���Ă�";
				mes "�����牓���ɍs���Ă�";
				mes "���̂܂ɂ�����f�r��������悤��";
				mes "�􂢂������Ă��܂��񂾁B";
				next;
				mes "[�e�B�N�o��������]";
				mes "�܂��A������������@������B";
				mes "���Ԃ��ɃV���c�𒅂�΂����B";
				mes "�V���c��������Ώ㒅�𗠕Ԃ��ɂ���";
				mes "���Ă��������B";
				next;
				mes "[�e�B�N�o��������]";
				mes "�܂��͓���i�ގ��ɁA";
				mes "�e�B�N�o����������";
				mes "�C�������Ȃ��悤�ɐÂ��ɐi�߂΂����B";
				next;
				mes "[�e�B�N�o��������]";
				mes "�͂͂́A�`���҂���������i�ނƂ���";
				mes "�Â��ɒʂ�Ȃ����āH";
				next;
				mes "[�e�B�N�o��������]";
				mes "����΂�����͎��̌����ł�";
				mes "�ǂ����悤���Ȃ��ȁB";
				break;
			case 3:
				mes "[�e�B�N�o��������]";
				mes "�e�B�N�o������";
				mes "�傫�Ȕw��^AAAAAA(�����܂����c�c)^000000";
				mes "�s���R�Ȃقǒ����葫�����Ă���B";
				mes "���Ⴊ�݂���ō����Ă��鎞��";
				mes "�G�����̏�ɂ��邭�炢���B";
				next;
				mes "[�e�B�N�o��������]";
				mes "�����āA�n�̂悤�ȓ��Ƒ������Ă���B";
				mes "�@";
				mes "����Ȏp�̂�����";
				mes "�e�B�N�o������";
				mes "�n�����瑗���ė����q���A";
				mes "�Ȃǂƌ����Ă���B";
				break;
			case 4:
				mes "[�e�B�N�o��������]";
				mes "�e�B�N�o�����Ɋւ���";
				mes "�ʔ����\���������񂠂�B";
				next;
				mes "[�e�B�N�o��������]";
				mes "���̒��̈�̓e�B�N�o����������";
				mes "���R�𐒔q���Ă���A���鉤���̎���";
				mes "�Ƃ��������B";
				next;
				mes "[�e�B�N�o��������]";
				mes "���̉����ɓG�΂��Ă�����";
				mes "���ӂ������Đڋ߂��闷�s�҂�����ƁA";
				mes "��������f�r��������悤��";
				mes "�􂢂�������炵���B";
				next;
				mes "[�e�B�N�o��������]";
				mes "�܂��̂̓��b�ł̓e�B�N�o������";
				mes "�l�Ԃɕϐg������A�p�𓧖���";
				mes "���邱�Ƃ��ł���Ə�����Ă��邪�A";
				mes "���ۂɊm�F�͂���Ă͂��Ȃ��B";
				break;
			case 5:
				mes "[�e�B�N�o��������]";
				mes "�e�B�N�o�����̎�Ȑ����n�́A";
				mes "�l�C�����Ȃ��؂⑐�ŕ����Ă���";
				mes "�Â��ꏊ�B";
				next;
				mes "[�e�B�N�o��������]";
				mes "�Ⴆ�΋��̉���������";
				mes "�o�i�i���A�|�сA������";
				mes "�傫�Ȗ؂̉��ɐ������Ă���炵���B";
				next;
				mes "[�e�B�N�o��������]";
				mes "����͎��̗\�z�Ȃ񂾂�";
				mes "���̂悤�ȏꏊ�ɏZ��ł��闝�R��";
				mes "�l�X�ɂ������炵�₷���ꏊ������";
				mes "�ł͂Ȃ����ƍl���Ă���B";
				break;
			}
			next;
			mes "[�e�B�N�o��������]";
			mes "�����͂��ꂭ�炢�ŏ\�����낤�B";
			mes "����ȏ�������Ă�";
			mes "������t���o�ė��邩��";
			mes "�b���Ă��������ɂ������낤���ȁB";
			next;
			mes "[�e�B�N�o��������]";
			mes "�܂����ɕ����������Ƃ͂��邩�H";
		}
	case 3:
		mes "[�e�B�N�o��������]";
		mes "�ӂӂӁA���̎��̈̑傳��";
		mes "����Ƃ킩�����悤���ȁH";
		next;
		mes "[�e�B�N�o��������]";
		mes "�{���A�e�B�N�o������߂܂��邱�Ƃ�";
		mes "�ƂĂ�����A�������Ȃ񂾂���";
		mes "���́A�ȒP�Ƀe�B�N�o������";
		mes "�߂܂�����@������񂾁B";
		next;
		mes "[�e�B�N�o��������]";
		mes "����͂��̎����J������";
		mes "^F80835�e�B�N�o�����x���g^000000���g���̂��B";
		next;
		if(countitem(6496) < 3 || countitem(6497) < 5) {
			mes "[�e�B�N�o��������]";
			mes "�������^�_�ŁA�Ƃ����킯�ɂ͂����Ȃ��B";
			mes "^F80835�e�B�N�o�����̔w��3��^000000��";
			mes "^F80835�����Ȃ����5��^000000��";
			mes "�����Ă�����������Ă�낤�B";
			close;
		}
		mes "[�e�B�N�o��������]";
		mes "���A�e�B�N�o�����x���g�̍ޗ���";
		mes "^F80835�e�B�N�o�����̔w��3��^000000��";
		mes "^F80835�����Ȃ����5��^000000��";
		mes "�����Ă��邶��Ȃ����B";
		next;
		mes "[�e�B�N�o��������]";
		mes "^F80835�e�B�N�o�����x���g^000000���g����";
		mes "�e�B�N�o�������ȒP��";
		mes "�߂܂��邱�Ƃ��ł���B";
		mes "�������K����������킯�ł͂Ȃ����B";
		mes "�@";
		mes "�ǂ����H�@����Ă�낤���H";
		next;
		if(select("����ĉ�����","���͎����̗͂ŕ߂܂���") == 2) {
			mes "[�e�B�N�o��������]";
			mes "�e�B�N�o������߂܂���̂�";
			mes "���������B";
			mes "�f����^F80835�e�B�N�o�����x���g^000000��";
			mes "�g���������ǂ����B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[�e�B�N�o��������]";
			mes "�����i�̎�ސ���������";
			mes "���̂܂܂���n���Ȃ��ȁB";
			mes "��ސ������炵�Ă���܂�������B";
			close;
		}
		delitem 6496,3;
		delitem 6497,5;
		getitem 12699,1;
		mes "[�e�B�N�o��������]";
		mes "�ق����I�@����`�I";
		misceffect 143;
		next;
		mes "[�e�B�N�o��������]";
		mes "^F80835�e�B�N�o�����x���g^000000��";
		mes "�����������I";
		mes "�����A�󂯎�肽�܂��B";
		close;
	}
}

//============================================================
// ��̐���NPC
//------------------------------------------------------------
ma_fild01.gat,74,367,6	script	��̐���#01	572,2,2,{
	end;
OnTouch:
	if(getcharid(1)) {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	else if($MalayaName$[3] == strcharinfo(0) || $MalayaName$[5] == strcharinfo(0)) {
		mes "�]��̐����͂��Ȃ����������";
		mes "�@������Ɋ��Ԃ����ď������]";
	}
	else if(rand(3) == 1) {
		set $MalayaName$[3],strcharinfo(0);
		mes "�]��̐����͂��Ȃ����������";
		mes "�@���Ă���������]";
	}
	else {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	close2;
	hideonnpc strnpcinfo(0);
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"02","03","04"; break;
	case 2: setarray '@npc$,"01","03","04"; break;
	case 3: setarray '@npc$,"01","02","04"; break;
	case 4: setarray '@npc$,"01","02","03"; break;
	case 5: setarray '@npc$,"06","07","08"; break;
	case 6: setarray '@npc$,"05","07","08"; break;
	case 7: setarray '@npc$,"05","06","08"; break;
	case 8: setarray '@npc$,"05","06","07"; break;
	case 9: setarray '@npc$,"10","11"; break;
	case 10: setarray '@npc$,"09","11"; break;
	case 11: setarray '@npc$,"09","10"; break;
	}
	hideoffnpc "��̐���#" + '@npc$[rand(getarraysize('@npc$))];
	end;
OnInit:
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"01","02","03","04"; break;
	case 5: setarray '@npc$,"05","06","07","08"; break;
	case 9: setarray '@npc$,"09","10","11"; break;
	default: end;
	}
	set '@size,getarraysize('@npc$);
	set '@rand,rand('@size);
	for(set '@i,0; '@i<'@size; set '@i,'@i+1) {
		if('@i == '@rand)
			hideoffnpc "��̐���#" +'@npc$['@i];
		else
			hideonnpc "��̐���#" +'@npc$['@i];
	}
	end;
}

ma_fild01.gat,109,116,4		script	��̐���#02	572,2,2,{
	end;
OnTouch:
	if(!getcharid(1)) {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	else if($MalayaName$[3] == strcharinfo(0) || $MalayaName$[5] == strcharinfo(0)) {
		mes "�]��̐����͂��Ȃ����������";
		mes "�@������Ɋ��Ԃ����ď������]";
	}
	else if(rand(3) == 1) {
		set $MalayaName$[3],strcharinfo(0);
		mes "�]��̐����͂��Ȃ����������";
		mes "�@���Ă���������]";
	}
	else {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	close2;
	hideonnpc strnpcinfo(0);
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"02","03","04"; break;
	case 2: setarray '@npc$,"01","03","04"; break;
	case 3: setarray '@npc$,"01","02","04"; break;
	case 4: setarray '@npc$,"01","02","03"; break;
	case 5: setarray '@npc$,"06","07","08"; break;
	case 6: setarray '@npc$,"05","07","08"; break;
	case 7: setarray '@npc$,"05","06","08"; break;
	case 8: setarray '@npc$,"05","06","07"; break;
	case 9: setarray '@npc$,"10","11"; break;
	case 10: setarray '@npc$,"09","11"; break;
	case 11: setarray '@npc$,"09","10"; break;
	}
	hideoffnpc "��̐���#" + '@npc$[rand(getarraysize('@npc$))];
	end;
}

ma_fild01.gat,280,150,6		duplicate(��̐���#02)	��̐���#03	572,2,2
ma_fild01.gat,309,221,6		duplicate(��̐���#02)	��̐���#04	572,2,2
ma_fild02.gat,282,41,4		duplicate(��̐���#01)	��̐���#05	572,2,2

ma_fild02.gat,246,324,4		script	��̐���#06	572,2,2,{
	end;
OnTouch:
	if(!getcharid(1)) {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	else if($MalayaName$[3] == strcharinfo(0) || $MalayaName$[5] == strcharinfo(0)) {
		mes "�]��̐����͂��Ȃ����������";
		mes "�@������Ɋ��Ԃ����ď������]";
	}
	else if(rand(3) == 1) {
		set $MalayaName$[4],strcharinfo(0);
		mes "�]��̐����͂��Ȃ����������";
		mes "�@���Ă���������]";
	}
	else {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	close2;
	hideonnpc strnpcinfo(0);
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"02","03","04"; break;
	case 2: setarray '@npc$,"01","03","04"; break;
	case 3: setarray '@npc$,"01","02","04"; break;
	case 4: setarray '@npc$,"01","02","03"; break;
	case 5: setarray '@npc$,"06","07","08"; break;
	case 6: setarray '@npc$,"05","07","08"; break;
	case 7: setarray '@npc$,"05","06","08"; break;
	case 8: setarray '@npc$,"05","06","07"; break;
	case 9: setarray '@npc$,"10","11"; break;
	case 10: setarray '@npc$,"09","11"; break;
	case 11: setarray '@npc$,"09","10"; break;
	}
	hideoffnpc "��̐���#" + '@npc$[rand(getarraysize('@npc$))];
	end;
}

ma_fild02.gat,71,296,6		duplicate(��̐���#06)	��̐���#07	572,2,2
ma_fild02.gat,32,263,4		duplicate(��̐���#06)	��̐���#08	572,2,2

ma_scene01.gat,195,92,4		script	��̐���#09	572,2,2,{
	end;
OnTouch:
	if(getcharid(1)) {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	else if($MalayaName$[3] == strcharinfo(0) || $MalayaName$[5] == strcharinfo(0)) {
		mes "�]��̐����͂��Ȃ����������";
		mes "�@������Ɋ��Ԃ����ď������]";
	}
//	else if($MalayaName$[2] == strcharinfo(0)) {
//		mes "�]��̐����͂��Ȃ����������";
//		mes "�@���Ă���������]";
//	}
	else if(rand(3) == 1) {
		set $MalayaName$[5],strcharinfo(0);
		mes "�]��̐����͂��Ȃ����������";
		mes "�@���Ă���������]";
	}
	else {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	close2;
	hideonnpc strnpcinfo(0);
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"02","03","04"; break;
	case 2: setarray '@npc$,"01","03","04"; break;
	case 3: setarray '@npc$,"01","02","04"; break;
	case 4: setarray '@npc$,"01","02","03"; break;
	case 5: setarray '@npc$,"06","07","08"; break;
	case 6: setarray '@npc$,"05","07","08"; break;
	case 7: setarray '@npc$,"05","06","08"; break;
	case 8: setarray '@npc$,"05","06","07"; break;
	case 9: setarray '@npc$,"10","11"; break;
	case 10: setarray '@npc$,"09","11"; break;
	case 11: setarray '@npc$,"09","10"; break;
	}
	hideoffnpc "��̐���#" + '@npc$[rand(getarraysize('@npc$))];
	end;
OnInit:
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"01","02","03","04"; break;
	case 5: setarray '@npc$,"05","06","07","08"; break;
	case 9: setarray '@npc$,"09","10","11"; break;
	default: end;
	}
	set '@size,getarraysize('@npc$);
	set '@rand,rand('@size);
	for(set '@i,0; '@i<'@size; set '@i,'@i+1) {
		if('@i == '@rand)
			hideoffnpc "��̐���#" +'@npc$['@i];
		else
			hideonnpc "��̐���#" +'@npc$['@i];
	}
	end;
}

ma_scene01.gat,158,139,4	script	��̐���#10	572,2,2,{
	end;
OnTouch:
	if(!getcharid(1)) {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	else if($MalayaName$[3] == strcharinfo(0) || $MalayaName$[5] == strcharinfo(0)) {
		mes "�]��̐����͂��Ȃ����������";
		mes "�@������Ɋ��Ԃ����ď������]";
	}
//	else if($MalayaName$[2] == strcharinfo(0)) {
//		mes "�]��̐����͂��Ȃ����������";
//		mes "�@���Ă���������]";
//	}
	else if(rand(3) == 1) {
		set $MalayaName$[5],strcharinfo(0);
		mes "�]��̐����͂��Ȃ����������";
		mes "�@���Ă���������]";
	}
	else {
		mes "�]��̐����͂��Ȃ�������";
		mes "�@�����������]";
	}
	close2;
	hideonnpc strnpcinfo(0);
	set '@num,strnpcinfo(2);
	switch('@num) {
	case 1: setarray '@npc$,"02","03","04"; break;
	case 2: setarray '@npc$,"01","03","04"; break;
	case 3: setarray '@npc$,"01","02","04"; break;
	case 4: setarray '@npc$,"01","02","03"; break;
	case 5: setarray '@npc$,"06","07","08"; break;
	case 6: setarray '@npc$,"05","07","08"; break;
	case 7: setarray '@npc$,"05","06","08"; break;
	case 8: setarray '@npc$,"05","06","07"; break;
	case 9: setarray '@npc$,"10","11"; break;
	case 10: setarray '@npc$,"09","11"; break;
	case 11: setarray '@npc$,"09","10"; break;
	}
	hideoffnpc "��̐���#" + '@npc$[rand(getarraysize('@npc$))];
	end;
}

ma_scene01.gat,167,112,6	duplicate(��̐���#10)	��̐���#11	572,2,2

//============================================================
// �\�bNPC
//------------------------------------------------------------
malaya.gat,227,311,4	script	���k�����	575,{
	if(MALAYA_1QUE < 2) {
		mes "[���k�����]";
		mes "�O���痈���̂����H";
		mes "���̗l�q���ς�����C��t���Ȃ����B";
		next;
		mes "[���k�����]";
		mes "�����̉ł��D�P���ő�ςȂ̂�B";
		mes "�������Ȃ���΂����̂�����ǁc�c�B";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[���k�����]";
		mes "���̒��̊O���痈���l��";
		mes "�撣���Ă���Ă���炵����B";
		next;
		mes "[���k�����]";
		mes "����ł����̉ł����S���˂��B";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,2)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[���k�����]";
			mes "�ŋ߁A�}�i�i���K�����D����";
			mes "�ǂ��Ă���";
			mes $MalayaName$['@rand];
			mes "�Ƃ����������܂�����B";
			next;
			mes "[���k�����]";
			mes "�������̂Ȃ���������";
			mes "�������Ă����Ȃ��ƂˁB";
			close;
		}
	case 2:
		mes "[���k�����]";
		mes "�ł��D�P�����Ă��邩��S�z�Ȃ񂾂�B";
		mes "�}�i�i���K�����łɎ���o���Ȃ����";
		mes "�����̂Ɂc�c�B";
		next;
		menu "�}�i�i���K���H",-;
		mes "[���k�����]";
		mes "���񂽁A���̊O���痈���l�����H";
		mes "�O���痈���l�ł��C��t���Ȃ����";
		mes "�Ȃ�Ȃ�����ˁc�c�B";
		mes "���R�������Ă������B";
		next;
		mes "[���k�����]";
		mes "�}�i�i���K���͐́X�|�[�g�}������";
		mes "�Z��ł��������������񂾂�B";
		mes "�ǂ��j�Əo����Č��������āA";
		mes "�q�����o�����񂾂�B";
		next;
		mes "[���k�����]";
		mes "�����ǁA�݂�Ȃ��K���ɂȂ�Ƃ�";
		mes "����Ȃ����낤�H";
		mes "���̕v�w�͌�����ɏ�肭�����Ȃ��āA";
		mes "���Ǖʂ�Ă��܂����񂶂�B";
		next;
		menu "���z�ł���",-;
		mes "[���k�����]";
		mes "�ق�Ƃɂ˂��c�c";
		mes "�₪�āA���̏�����";
		mes "�K���ȉƑ��Ɏ��i�����邠�܂�";
		mes "����}�i�i���K���ƂȂ�";
		mes "�K�������ȉƑ����݂��";
		mes "�q����D���čs���悤�ɂȂ����񂾁B";
		next;
		mes "[���k�����]";
		mes "�����钆�Ƀ|�[�g�}������";
		mes "��������Ă���";
		mes "�`�N�`�N�܂��̓��N���N�Ƃ���";
		mes "����������A�}�i�i���K����";
		mes "��������Ă��鉹������";
		mes "���ӂ�������������B";
		close;
	}
}

malaya.gat,189,263,4	script	���ۂ��������N	578,{
	if(MALAYA_1QUE < 2) {
		emotion 23;
		mes "[���ۂ��������N]";
		mes "���킠���c�c�B";
		mes "���̕��͋C�͂܂��";
		mes "���̎��ƈꏏ����Ȃ����c�c�B";
		next;
		emotion 23;
		mes "[���ۂ��������N]";
		mes "�������܂ꂽ���̎��Ɓc�c";
		mes "���킠���c�c�B";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[���ۂ��������N]";
		mes "���O�͒m��Ȃ���";
		mes "����`���҂̂�������";
		mes "�������������Ă����悤�Ȃ񂾁B";
		next;
		emotion 54;
		mes "[���ۂ��������N]";
		mes "�ӂ����c�c�B";
		mes "���͂܂��o�R�i�����o���̂���";
		mes "�v������c�c�B";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,2)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[���ۂ��������N]";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "�o�R�i�����������ݍ��ނ̂�";
			mes "�h�����炵���B������ȁB";
			mes "�������ň��S���ĕ�点���B";
			close;
		}
	case 2:
		mes "[���ۂ��������N]";
		mes "�|�[�g�}�����ł̓o�R�i���̂��Ƃ�";
		mes "�������ݍ��މ����Ƃ��Ă�ł���B";
		next;
		mes "[���ۂ��������N]";
		mes "�������A���͒m���Ă���c�c�B";
		mes "�z�͐l�����ݍ��މ����ɂ�";
		mes "�Ȃ�邱�Ƃ��c�c�B";
		next;
		menu "�댯�ȉ����ł���",-;
		emotion 29;
		mes "[���ۂ��������N]";
		mes "�ӂӂӁc�c�Ƃ��낪���A";
		mes "�o�R�i������g�������@������񂾁B";
		next;
		mes "[���ۂ��������N]";
		mes "����6�����ݍ��񂾋��낵���z�ɂ�";
		mes "��_�͂���Ƃ������Ƃ��B";
		next;
		menu "���̎�_�Ƃ́H",-;
		mes "[���ۂ��������N]";
		mes "�z�͂��邳�����c�c�m�C�Y�Ɏア�B";
		mes "�z���������ݍ������Ƃ���";
		mes "�܂��ɂ��̎�!!";
		next;
		mes "[���ۂ��������N]";
		mes "�Ȃ�ł����܂�Ȃ�!!";
		mes "��A���ہA�t���C�p���Ȃ�";
		mes "�Ȃ�ł���������@����!!";
		next;
		mes "[���ۂ��������N]";
		mes "��������Γz�͂т����肵��";
		mes "����f���o���ē����Ă��܂��B";
		next;
		mes "[���ۂ��������N]";
		mes "�N�����ۂЂƂ��炢��";
		mes "�����ĕ����Ă�����������B";
		close;
	}
}

malaya.gat,270,59,4	script	�`�̌x������	570,{
	if(MALAYA_1QUE < 2) {
		emotion 19;
		mes "[�`�̌x������]";
		mes "���̗l�q���Q���������Ƃ����̂�";
		mes "��Ԃ�������ċx��ł�";
		mes "������ł����ˁH";
		close;
	}
	if(MALAYA_1QUE < 6) {
		emotion 22;
		mes "[�`�̌x������]";
		mes "���̗l�q�͏������������Ă������ǁA";
		mes "�܂����S�ł��Ȃ��̂łȂ�ׂ����";
		mes "�O��������Ȃ��悤�ɂ��Ă��������B";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,2)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[�`�̌x������]";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂��A";
			mes "�u�����ɕ߂܂�������";
			mes "�����ɋA���ė����炵���ł��B";
			mes "���������͂������Ă���݂����ł��ˁB";
			close;
		}
	case 2:
		emotion 23;
		mes "[�`�̌x������]";
		mes "����!!�@�`�͈ȏ�Ȃ�!!";
		next;
		mes "[�`�̌x������]";
		mes "��H�@���Ȃ��ł������B";
		mes "�т����肵���B";
		mes "�������Ǝv���܂�����B";
		next;
		mes "[�`�̌x������]";
		mes "���I�@�������I";
		mes "���s�҂ɒm�点�Ă���";
		mes "�ʒB������܂��B";
		next;
		menu "�ǂ�ȒʒB�ł����H",-;
		mes "[�`�̌x������]";
		mes "��Ƀ����X�^�[��������Ă���̂�";
		mes "�C��t����Ƃ̂��Ƃł��B";
		next;
		mes "[�`�̌x������]";
		mes "���Ƀ��N���N�Ƃ���";
		mes "�����X�^�[���p�ɂɏo�v����̂�";
		mes "���ӂ���Ƃ������܂����B";
		next;
		if(select("�킩����","�Ώ����@�͂Ȃ��̂��H") == 1) {
			mes "[�`�̌x������]";
			mes "��ɂ͋C��t���āI";
			close;
		}
		mes "[�`�̌x������]";
		mes "���N���N�̉H�̉���";
		mes "�������畷��������}���Ŏ��ӂ̌�����";
		mes "����悤�ɂ������������ł���B";
		next;
		emotion 20;
		mes "[�`�̌x������]";
		mes "�����ǁA�H�̉�������������������";
		mes "�قƂ�Ǖ������Ȃ�������c�c�B";
		mes "�P���Ă��钼�O�炵���ł���B";
		mes "���Ƃ͍K�^���F�邵������܂���B";
		close;
	}
}

malaya.gat,88,252,4	script	����	576,{
	if(MALAYA_1QUE < 2) {
		mes "[����]";
		mes "�|���ł��B";
		mes "�X�̗d���l�����ɍs���Ȃ���";
		mes "�Ȃ�Ȃ��̂Ɂc�c�B";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[����]";
		mes "���ւց`�B";
		mes "������������������������";
		mes "�X�̗d���l�����ɍs����݂����ł��B";
		mes "�������񂪌����Ă܂����I";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,2)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[����]";
			mes "�����O��";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "�ʔ����b�����čs���܂����B";
			next;
			mes "[����]";
			mes "�J�^�R���x�Ŏ������Ă�ƌ�����ׁI";
			mes "���ւցc�c�ʔ�������܂��񂩁H";
			mes $MalayaName$['@rand];
			mes "�Ƃ�������";
			mes "�{���ɖʔ������̂悤�ł��B";
			close;
		}
	case 2:
		mes "[����]";
		mes "�X�̗d���l�ƒ��ǂ������";
		mes "�a�C�ɂ�����Ȃ���";
		mes "�������񂪌����Ă��܂�����B";
		next;
		menu "�X�̗d���l�H",-;
		mes "[����]";
		mes "�G���J���g�l�ł��I";
		mes "�X�̑傫�Ȗ؂��ɏZ��ł���";
		mes "�d���l�ł��B";
		next;
		mes "[����]";
		mes "�j�̗d���l�����̗d���l�����邯��";
		mes "�j�̗d���l���ł��Y��炵���ł��B";
		mes "�ǂ����Ăł��傤�H";
		close;
	}
}

malaya.gat,219,92,6	script	���т��q	577,{
	if(MALAYA_1QUE < 2) {
		mes "[���т��q]";
		mes "���ꂳ�񂪁A�댯������";
		mes "�O�ŗV�ԂȂ��Č����́B";
		mes "�Ȃ�ł��낤�H";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[���т��q]";
		mes "���ꂳ�񂪁A�|�[�g�}��������";
		mes "����Ȃ���΁A�V��ł��������āI";
		next;
		mes "[���т��q]";
		mes "�ււցA�ŏ�����";
		mes "�|�[�g�}�����̊O�ɏo��C��";
		mes "�����������ǂˁB";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,2)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[���т��q]";
			mes "�o���I�E�}�q���K�ŃW�F�W�F������";
			mes "�X�q��D�����l���������";
			mes "�E���T���������񂾁B";
			next;
			mes "[���т��q]";
			mes "�����X�^�[�̖X�q��D���Ȃ��";
			mes $MalayaName$['@rand];
			mes "���Đl��";
			mes "�������Ȃ������̂��ȁH";
			next;
			mes "[���т��q]";
			mes "���I";
			mes "���̘b�͔閧�������񂾁I";
			mes "���̘b�͕����Ȃ��������Ƃ�";
			mes "���Ăق����ȁB";
			close;
		}
	case 2:
		mes "[���т��q]";
		mes "���̂܂܂��ᒬ���̖X�q��";
		mes "�N���ɓ��܂ꂿ�Ⴄ��`�B";
		next;
		mes "[���т��q]";
		mes "����A���ꂳ�񂪐���Ă��ꂽ�X�q��";
		mes "�Ȃ��Ȃ����񂾁B";
		mes "���̑O�ׂ͗̉Ƃ̐��󕨂�����X�q��";
		mes "�����Ȃ����炵���񂾂��ǁB";
		next;
		mes "[���т��q]";
		mes "���������āc�c�B";
		mes "�W�F�W�F����������ł������̂��ȁH";
		next;
		mes "[���т��q]";
		mes "���̑O�A�o���I�E�}�q���K�ɂ���";
		mes "�F�B�̏��ɗV�тɍs������";
		mes "�����Ȃ����X�q�����Ԃ��Ă���";
		mes "�W�F�W�F�����������C������c�c�B";
		close;
	}
}

malaya.gat,363,283,4	script	�Z��	582,{
	if(MALAYA_1QUE < 2) {
		mes "[�Z��]";
		mes "���ށc�c�����̎􂢂�";
		mes "�C��t���Ȃ���΂Ȃ�Ȃ�������";
		mes "�����̂��c�c�B";
		next;
		mes "[�Z��]";
		mes "�}���N�N�[�����̐j�ɂ�";
		mes "�C��t���Ȃ����B";
		mes "�ٖM�l��c�c�B";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[�Z��]";
		mes "�|�[�g�}�����ւ悤�����B";
		mes "�ٖM�l��c�c�B";
		next;
		mes "[�Z��]";
		mes "�ŋ߂͒��̗l�q��������������";
		mes "�����Ԃ��ڂ����Ă���l������������";
		mes "���̖ڂ����Ȃ��悤�ɂ��Ȃ����c�c�B";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,5)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[�Z��]";
			mes "��ɒ��������鎞�͋C��t���Ȃ����B";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "���N���N�ɂ��ꂽ�炵���B";
			close;
		}
	case 2:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[�Z��]";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂��A";
			mes "�e�B�N�o������������邱�Ƃ�";
			mes "���������Ƃ����\�𕷂������A";
			mes "�{���Ȃ�΂ɐ����ȁB";
			next;
			mes "[�Z��]";
			mes "�����e�B�N�o������";
			mes "������Ă݂������̂��B";
			close;
		}
	case 3:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[�Z��]";
			mes "�u�M�X�M�X���������܂������B";
			mes "�ŋ�";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "�u�M�X�M�X���C�W���Ă���";
			mes "�݂����Ȃ�ł��B";
			close;
		}
	case 4:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[�Z��]";
			mes "�������̊O�ɏo�邱�Ƃ�����悤�Ȃ�A";
			mes "�`���i�b�N�ɂ͋C��t���Ȃ����B";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "�`���i�b�N���x�����������āA";
			mes "�a�@�ɉ^�΂ꂽ�Ƃ����\������B";
			close;
		}
	case 5:
		mes "[�Z��]";
		mes "���̗l�q���Q���������B";
		mes "�}���N�N�[���������Ă���̂���";
		mes "����Ȃ��B";
		next;
		menu "�}���N�N�[�����H",-;
		mes "[�Z��]";
		mes "�����ƌĂ΂�Ă��郂���X�^�[���B";
		mes "�l�Ǝp�����Ă��āA�������Ă���B";
		next;
		mes "[�Z��]";
		mes "���������l�̐l�`�����A";
		mes "�j�Ŏh���􂢂�������񂾁B";
		next;
		menu "��ʂ�����@�͂Ȃ���ł����H",-;
		mes "[�Z��]";
		mes "�}���N�N�[�����݂͂��";
		mes "�Ԃ��ڂ����Ă���B";
		mes "�����ŋ�ʂ��邱�Ƃ��ł���B";
		next;
		mes "[�Z��]";
		mes "�������A�����ɂ����ӂ��邱�Ƃ�����B";
		next;
		mes "[�Z��]";
		mes "�}���N�N�[�����̐Ԃ��ڂ�";
		mes "�����ԁA���߂Ă����";
		mes "�}���N�N�[�����ɜ߂����Ă��܂��B";
		next;
		mes "[�Z��]";
		mes "��������ƂɂȂ�����";
		mes "�ڂ𒷂��݂Ȃ��悤��";
		mes "���ӂ����ق��������B";
		close;
	}
}

malaya.gat,41,127,6	script	�V�l	574,{
	if(MALAYA_1QUE < 2) {
		mes "[�V�l]";
		mes "���̂悤�ɒ����r��Ă��鎞��";
		mes "�ٖM�l������̂́A";
		mes "�������܂��΂������Ƃł͂Ȃ��̂��B";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[�V�l]";
		mes "�N���{���ɉ^���Ȃ��l���ˁB";
		mes "���ɂ���Ē����r��Ă���";
		mes "���}����邱�Ƃ��Ȃ������ɗ���Ƃ́B";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,2)) {
	case 1:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[�V�l]";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "���Ƀ[���s�[���̂Ă��炵���B";
			next;
			mes "[�V�l]";
			mes "�[���s�[�ЂƂ�";
			mes "�厖�ɂł��Ȃ����̂悤����B";
			close;
		}
	case 2:
		mes "[�V�l]";
		mes "�Â��؂�؂鎞�́A";
		mes "�r�����E���S���Z��ł��Ȃ���";
		mes "���ӂ����ق��������B";
		next;
		mes "[�V�l]";
		mes "�r�����E���S���Z��ł���؂�";
		mes "�����̒��Ŏg�p�����";
		mes "���낵�����Ƃ��N���Ă��܂��񂾂�B";
		next;
		menu "�����N�����ł����H",-;
		mes "[�V�l]";
		mes "�r�����E���S���炷���";
		mes "�Z��ł����Ƃ��������̂����R������A";
		mes "�l�Ԃɑ΂��镜�Q�S�������Ȃ�񂾁B";
		next;
		mes "[�V�l]";
		mes "���������ӂɐQ����p�ӂ�����";
		mes "�ŏ��͐Q��Ȃ��悤��";
		mes "�����߂邭�炢�����ǁA";
		mes "�₪�ĕ��Q�S�������Ȃ�";
		mes "�Q�Ă���l����������܂�";
		mes "���̏�ɍ��葱����񂾁B";
		next;
		menu "����Ȃ��Ƃ��c�c",-;
		mes "[�V�l]";
		mes "�n�n�n�A";
		mes "����ȂɐS�z���Ȃ��Ă�������B";
		mes "���ʂ̒��Ƀr�����E���S�͂��Ȃ�����B";
		close;
	}
}

malaya.gat,63,185,4	script	����	583,{
	if(MALAYA_1QUE < 2) {
		mes "[����]";
		mes "���ɂ��Ȃ��Ƙb�����Ƃ͂���܂���B";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[����]";
		mes "�q���������S�z�ł��B";
		mes "���ɕ��͋C�������Ȃ���";
		mes "�|�����Ă���̂ł͂Ȃ����Ɓc�c�B";
		close;
	}
	set '@rand,rand(6);
	switch(rand(1,4)) {
	case 1:
		mes "[����]";
		mes "���ǂ����Ă����_���T�[��";
		mes "����_���T�[�̂��b�����Ă���܂����B";
		next;
		mes "[����]";
		mes "�u�_���T�[���i���œ]�񂾂񂳁[�v";
		next;
		mes "[����]";
		mes "�ӂ��c�c�����ʔ������t�͍D���ł���";
		mes "�����Ă����邱�Ƃ��h��";
		mes "�����W���[�N�ł��ˁB";
		close;
	case 2:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[����]";
			mes "���͖ʔ����b���D���Ȃ�ł����B";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂͊G����肢�Ƃ�";
			mes "�\���������̂ŁA";
			mes "���͂��̕��ɂ��̂悤��";
			mes "�����Ă����܂����B";
			next;
			mes "[����]";
			mes "�u�f�l���G��`���Ɖ�Ƃ���������I�v";
			next;
			mes "[����]";
			mes "�ققفA�ʔ����ł��傤�H";
			close;
		}
	case 3:
		if($MalayaName$['@rand] != "" && $MalayaName$['@rand] != strcharinfo(0)) {
			mes "[����]";
			mes "���͖ʔ����b���D���ł��B";
			mes "���̑O";
			mes $MalayaName$['@rand];
			mes "�Ƃ����`���҂�";
			mes "�b�����Ă��ꂽ��ł��B";
			next;
			mes "[����]";
			switch(rand(5)) {
			case 1:
				mes "�u���b�J�[�Ɨx������[�v";
				break;
			case 2:
				mes "�u�t�F���̗l�q���ς��v";
				break;
			case 3:
				mes "����X��";
				mes "�u�C�W�h�������܂�!!�@1$�Łv";
				next;
				mes "[����]";
				mes "�ƌ����Ă��X����";
				mes "�ǂ��o���ꂽ�炵���ł��B";
				break;
			case 4:
				mes "�u�l�y���e�X���Q�Ă�ł��I�v";
				break;
			}
			next;
			mes "[����]";
			mes "�ققفA�ʔ����ł��傤�H";
			close;
		}
	case 4:
		mes "[����]";
		mes "���̊O�ɂ���΂݂Ŏq���̋�������";
		mes "��������Ȃ�A�ߊ��Ȃ���";
		mes "���ӂ��ĉ������B";
		next;
		menu "�ǂ����Ăł����H",-;
		mes "[����]";
		mes "���̊O�ɂ̓`���i�b�N�Ƃ���";
		mes "�����X�^�[���Ԃ����̎p��";
		mes "�������肵�Ă����ł��� ";
		next;
		mes "[����]";
		mes "�S�D�������s�҂�����";
		mes "�Ԃ���������グ���";
		mes "�{���̎p�ɖ߂���";
		mes "���s�҂��U�������ł���B";
		next;
		menu "���������X�^�[�ł���",-;
		mes "[����]";
		mes "�m���ɗ��s�҂̗D�����𗘗p����";
		mes "���������X�^�[�Ȃ�ł�����";
		next;
		mes "[����]";
		mes "���̐��ɖ���������q���̍���";
		mes "�����������X�^�[�Ƃ����b��������";
		mes "�������z�ł��B";
		close;
	}
}

//============================================================
// �x������X�N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_1QUE -> 0�`1
//------------------------------------------------------------
malaya.gat,266,76,3	script	�x���������f��	570,7,7,{
	switch(MALAYA_1QUE) {
	case 0:
		break;
	case 1:
		mes "[�x���������f��]";
		mes "�܂��̓����o�L�E�|����";
		mes "����Ă݂Ȃ����B";
		mes "�N�ɖ�肪�Ȃ��ƔF�߂���΁A";
		mes "���̐l��������������͂��Ȃ����낤�B";
		mes "�ʒu���N�̎����Ă���n�}�ɋL��������";
		mes "�Q�l�ɂ��Ă݂Ă���B";
		viewpoint 1,185,358,0,0x0A82FF;
		close;
	case 2:
	case 3:
	case 4:
	case 5:
		mes "[�x���������f��]";
		mes "�s���Ȏv���������Đ\����Ȃ����A";
		mes "���̐l�����̋C������";
		mes "�������Ă����Ă���Ȃ����B";
		mes "����ɋꂵ�߂��Ă��邩��";
		mes "�m��Ȃ����̂ɑ΂���x���������񂾁B";
		close;
	case 6:
		if(BaseLevel < 100) {
			mes "[�x���������f��]";
			mes "�����̐����͂ǂ������H";
			mes "���̐l������ȂɈ����Ȃ����낤�B";
			next;
			mes "[�x���������f��]";
			mes "���������A�o����ΌN�ɂ��肢������";
			mes "�d�����������񂾂��c�c";
			mes "�܂�������Ɩ����������ˁB";
			next;
			mes "�]�x�������Ɏ��͕s�����w�E���ꂽ";
			mes "�@^FF0000BaseLv100�ȏ�^000000�ɂȂ��Ă���";
			mes "�@���炽�߂āA�b�����Ă݂悤�]";
			close;
		}
		if(checkquest(7404)) {
			if(!(checkquest(7404) & 0x4)) {
				mes "[�x���������f��]";
				mes "�W�F�W�F������ގ����Ă��Ă���B";
				mes "20�C�قǑގ�����΁A";
				mes "�z���������l�����Ȃ邾�낤�B";
				close;
			}
			mes "[�x���������f��]";
			mes "���A�W�F�W�F����20�C�ގ��A";
			mes "�m���Ɋm�F�����B";
			mes "����̓W�F�W�F�����ގ��̎Q���҂�";
			mes "�n���Ă���Ƒ����ė����J�܂��B";
			next;
			mes "[�x���������f��]";
			mes "���ꂩ����W�F�W�F������";
			mes "����I�ɑގ�����\��Ȃ̂ŁA";
			mes "�ǂ���Ύ����ꏏ�ɎQ�����Ă���B";
			setquest 7405;
			getitem 6497,1;
			if(checkre())
				getexp 50000,20000;
			else
				getexp 500000,200000;
			delquest 7404;
			set $MalayaName$[1],strcharinfo(0);
			close;
		}
		switch(rand(1,4)){
		case 1:
			if($MalayaName$[0] != "" || $MalayaName$[3] != "" || $MalayaName$[5] != "") {
				mes "[�x���������f��]";
				mes "�ŋ߁A�E���Ȑ�m�Ƃ��āA";
				mes $MalayaName$[0];
				mes $MalayaName$[3];
				mes $MalayaName$[5];
				mes "�̘b��Œ��͎������肳�B";
				break;
			}
		case 2:
			if($MalayaName$[2] != "" && $MalayaName$[2] != strcharinfo(0)) {
				mes "[�x���������f��]";
				mes "�ŋ߁A�F�B�ɂȂ����l������񂾁B";
				mes $MalayaName$[2];
				mes "�Ƃ����l�����ǒm���Ă��邩�H";
				mes "���A�������N�������F�B����B";
				break;
			}
		case 3:
			mes "[�x���������f��]";
			mes "�W�v�j�[�Œm��Ȃ��ِ���";
			mes "�ӂ��肫��ɂȂ������Ƃ��邩���H";
			mes "�͂��c�c�{���ɂ������Ⴍ������c�c�B";
			mes "����Ȃ�Ō����ł���̂��ȁB";
			break;
		case 4:
			mes "[�x���������f��]";
			mes "�ɂȂ����Ɍx���ł����Ă݂邩���H";
			mes "�ň��Ȏd������B";
			mes "���z�����̏�ɏ����Ă��Ă�";
			mes "�������Ⴂ���Ȃ����c�c";
			break;
		}
		next;
		if(checkquest(7405)) {
			if(!(checkquest(7405) & 0x2)) {
				mes "[�x���������f��]";
				mes "���������A�W�F�W�F�����ގ������ǁA";
				mes "���ꂩ�������I�ɓ������Ă���";
				mes "���肾����A���̋C������Ȃ�";
				mes "�܂����Ă���B";
				close;
			}
			mes "[�x���������f��]";
			mes "�Ƃ���ŁA���̑O�̃W�F�W�F����";
			mes "�ގ������ǁA�o���I�E�}�q���K��";
			mes "�s��������l�����ɁA�������]����";
			mes "�ǂ�������B";
			mes "����A������x�Q�����Ă���Ȃ����B";
			next;
			if(select("�W�F�W�F�����ގ��ɎQ������","�f��") == 2) {
				mes "[�x���������f��]";
				mes "�������H�c�O���B";
				close;
			}
			mes "[�x���������f��]";
			mes "�����A���肪�Ƃ��B";
			mes "���ꂶ��W�F�W�F������";
			mes "^FF000020�C^000000�|���Ă���B";
			mes "�N�Ȃ�ȒP���낤�B";
			mes "���񂾂��B";
			delquest 7405;
			setquest 7404;
			close;
		}
		mes "[�x���������f��]";
		mes "�Ƃ���ŌN�ɂ��肢������";
		mes "�d��������񂾂��ǂ���Ă݂Ȃ����H";
		next;
		mes "[�x���������f��]";
		mes "�o���I�E�}�q���K�ւ̉�����W����";
		mes "�W�F�W�F�������X�I��";
		mes "�ގ����邱�Ƃ����肵���񂾁B";
		next;
		mes "[�x���������f��]";
		mes "���������̂şr�ł͓�����A";
		mes "����I�ɂ�����x�ގ����邱�Ƃ�";
		mes "�z��̊����͈͂����߂鎖���ړI���B";
		mes "�ǂ����낤�A�Q�����Ă݂Ȃ����H";
		next;
		if(select("�W�F�W�F�����ގ��ɎQ������","�f��") == 2) {
			mes "[�x���������f��]";
			mes "�������H�c�O���B";
			close;
		}
		mes "[�x���������f��]";
		mes "�����A���肪�Ƃ��B";
		mes "���ꂶ��W�F�W�F������";
		mes "^FF000020�C^000000�|���Ă���B";
		mes "�N�Ȃ�ȒP���낤�B";
		mes "���񂾂��B";
		delquest 72082;
		setquest 7404;
		close;
	}
OnTouch:
	emotion 0;
	if(MALAYA_1QUE == 0) {
		mes "[�x���������f��]";
		mes "�₟�I";
		mes "�悤�����|�[�g�}�����ցI";
		next;
		mes "[�x���������f��]";
		mes "����܂ŌN���������Ƃ̂Ȃ��悤��";
		mes "�Ɠ��ȕ��͋C�̒����݂�A";
		mes "�ב��o���I�E�}�q���K�̖���";
		mes "�s���^�h�X�t�F�X�e�B�o���ȂǁA";
		mes "���ǂ���͂����ς����B";
		mes "�ڂ����ς��ό����Ă����Ă���I";
		next;
		mes "[�x���������f��]";
		mes "�c�c�ƌ��������Ƃ��낾���A";
		mes "������Ƃ΂��藈�鎞�������������ȁB";
		next;
		mes "[�x���������f��]";
		mes "���́c�c";
		mes "�ŋ߁A���Ɉ��삪�o�v����񂾁B";
		mes "����Œ��̏Z���݂͂�ȁA���|�ƕs����";
		mes "����Ă���B";
		next;
		mes "[�x���������f��]";
		mes "���ɂ́A�l�Ԃɉ�����";
		mes "�Y��������������Ăȁc�c";
		mes "�Z���͊�̒m��Ȃ��l�ɂ͋ߊ��Ȃ�";
		mes "�悤�ɂȂ��Ă��܂����̂��B";
		next;
		mes "[�x���������f��]";
		mes "������c�c���C�͂Ȃ��̂����ǁA";
		mes "�|�[�g�}�����̏Z��������";
		mes "�O���痈���`���҂̌N������悤��";
		mes "���邾�낤�B";
		mes "���ق��A���X���O���̐l�ɂ�";
		mes "���������Ă���Ȃ���������Ȃ��B";
		next;
		mes "[�x���������f��]";
		mes "���̐l�����̌x�����������߂ɁA";
		mes "�܂��̓����o�L�E�|����";
		mes "����Ă݂Ȃ����B";
		next;
		mes "[�x���������f��]";
		mes "�����o�L�E�|���́A���̒��̎w���҂��B";
		mes "��I�ȗ͂������Ă��āA";
		mes "���̏Z���ɐM������Ă���B";
		mes "�����o�L�E�|���ɔF�߂����";
		mes "�݂�Ȃ������ƈ��S���邾�낤�B";
		next;
		mes "[�x���������f��]";
		mes "�����o�L�E�|��������ꏊ��";
		mes "�N�̎����Ă���n�}�ɋL���Ă�����B";
		mes "���̂悤�Ȏ����Ő\����Ȃ��B";
		mes "�K�₵�Ă��ꂽ���Ƃ͊��}�����B";
		viewpoint 1,185,358,0,0x0A82FF;
		set MALAYA_1QUE,1;
		setquest 7350;
		close;
	}
	end;
OnInit:
	waitingroom "�x������X",0;
	end;
}

//============================================================
// �X�̋~�ώ҃N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_1QUE -> 0�`6
//------------------------------------------------------------
malaya.gat,185,358,3	script	�w���҃����o�L�E�|��	580,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[�����o�L�E�|��]";
		mes "�C��n���ė����l���ˁB";
		mes "�Ⴋ���l��";
		mes "�悤�����A�|�[�g�}�����ցB";
		next;
		mes "[�����o�L�E�|��]";
		mes "���̓����o�L�E�|���B";
		mes "��I�ȗ͂ɂ���āA";
		mes "���̐l�X�𓱂��҂��B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�N������K�˂��̂́c�c";
		mes "�������A";
		mes "���f���Ɍ���ꂽ�̂��ˁB";
		next;
		mes "[�����o�L�E�|��]";
		mes "�킩���Ă���c�c";
		mes "���̐l�����̑ԓx�̂��Ƃ��낤�B";
		mes "���Ȃ璬�̐l�����Ɋ炪��������";
		mes "�Ȃ�Ƃ��ł��邾�낤��";
		mes "�N�����̏��ɂ悱�����B";
		mes "�Ⴄ���ˁH";
		if(MALAYA_1QUE == 0) {
			next;
			mes "[�����o�L�E�|��]";
			mes "�ȂɁB�Ⴄ�̂��H";
			mes "�ł͌N�Ǝ��̊Ԃɉ���";
			mes "��I�ȓ��������������炾�낤�ȁB";
			mes "����������̎v��������B";
		}
		next;
		mes "[�����o�L�E�|��]";
		mes "�Ⴋ���l��";
		mes "�Ƃɂ����悭���Ă��ꂽ�B";
		mes "���̐l�����̌x���S����������Ƃ�����";
		mes "�ǂ����ޓ��������ɂȂ�Ȃ��łق����B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�ޓ��͕s���Ȃ̂���B";
		mes "�ŋ߁A�������������������\��āA";
		mes "�l�X���ꂵ�߂Ă���̂��c�c�B";
		next;
		mes "[�����o�L�E�|��]";
		mes "���Ƃ����̂́A";
		mes "�{���A�X��C�A��C�Ƃ�����";
		mes "�厩�R�̎��҂��B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�������͂���܂ł��̍��Ƌ���";
		mes "���a���F���Ă����̂ɁA";
		mes "�ǂ����Đl�X���ꂵ�߂�悤��";
		mes "�������������悤�ɂȂ����̂��c�c";
		mes "�܂������킩��Ȃ��񂾁B";
		next;
		soundeffect "se_pay_grass_05.wav",0,0;
		mes "�]�����o�L�E�|���̘b�̍Œ���";
		mes "�@���������������悤�ȋC������]";
		next;
		musiceffect "120";
		sc_start3 SC_BLIND,0,0,0,0,360000,10;
		mes "�]���̊Ԃɂ�������͈Â��Ȃ�";
		mes "�@��������������]";
		next;
		soundeffect "se_moaning01.wav",0,0;
		mes "[�����o�L�E�|��]";
		mes "�ނށc�c";
		mes "�����������Ă��܂����悤���ȁB";
		next;
		cutin "malaya_ghost01",4;
		mes "^4d4dff�]�����o�L�E�|��������������";
		mes "�@�����e���ۂۂƎp���������B";
		mes "�@���ӂ̐l�X�����|�ɋ����Ă���]^000000";
		next;
		soundeffect "solace_die.wav",0,0;
		mes "[�Z��]";
		mes "�ŁA�ł��[�I";
		mes "������A������񂾁I";
		next;
		menu "�e�ɋߊ��",-,"����𔲂�",-;
		soundeffect "se_moaning01.wav",0,0;
		mes "[�����o�L�E�|��]";
		mes "�O���痈���N�̍��Ղ�";
		mes "�H���ė����悤���ȁB";
		mes "�ނ�ɂ��܂�ߊ��Ȃ��悤�ɁB";
		mes "����D����\��������B";
		next;
		emotion 0;
		cutin "malaya_ghost02",4;
		sc_end SC_BLIND;
		mes "[�����o�L�E�|��]";
		mes "��H�@����́c�c�ǂ��������Ƃ��B";
		mes "��炪���h���Ă���B";
		mes "�������������H";
		next;
		mes "[�����o�L�E�|��]";
		mes "�ӂށB�_���ȍ��ɋC������Ă���̂��H";
		mes "�܂����c�c���̍��̋C�́c�c�I";
		next;
		mes "^4d4dff�]�����o�L�E�|�����b���Ƃ���";
		mes "�@�������͖��炩�ɓ��h���Ă���B";
		mes "�@���Ȃ�������ɋߊ���";
		mes "�@�������͌˘f���p�������Ă��܂����]^000000";
		next;
		cutin "malaya_ghost02",255;
		mes "[�Z��]";
		mes "���c�c�������I";
		mes "�������������čs�������I";
		mes "�����������Ă��Ȃ��̂�";
		mes "���������ǂ����āc�c�B";
		next;
		mes "[�Z��]";
		mes "���������΁A�������������Ă����Ƃ�";
		mes "�����o�L�E�|�����_���ȍ����ǂ��Ƃ�";
		mes "�����Ă������c�c�B";
		next;
		mes "[�Z��]";
		mes "���������āc�c";
		mes "���̐l�͈������ɑ΍R�ł���";
		mes "�������͂������Ă���񂶂�Ȃ���!?";
		next;
		mes "[�Z��]";
		mes "�c�c�������I�@�����ɈႢ�Ȃ��I";
		mes "�ٍ����炷�����͂�������";
		mes "�`���҂������񂾁I";
		next;
		mes "[�Z��]";
		mes "����ŁA���̒��͋~����ɈႢ�Ȃ��I";
		mes "�����݂�Ȃɂ��m�点�Ȃ��ƁI";
		next;
		mes "�]���ӂɂ����l�X��";
		mes "�@���������l�q�ő���o�����B";
		mes "�@���̏Z���ɂ��Ȃ��̂��Ƃ�";
		mes "�@�`���Ă��鐺���������Ă���]";
		next;
		mes "[�����o�L�E�|��]";
		mes "���̎҂������Ő\����Ȃ��B";
		mes "�����A������������B";
		mes "�Ȃ�Ƌ���ŏ����ȍ��̎�����Ȃ񂾁I";
		mes "�łɐ��߂�ꂽ��������";
		mes "�N�̋C�Ɉ��|����Ă��Ȃ��Ȃ�Ƃ́B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�܂��Ɋ�Ղ�ڂ̓�����ɂ����B";
		mes "����͒��̐l�����̌x���������̂�";
		mes "�[��������o�������ȁB";
		next;
		mes "[�����o�L�E�|��]";
		mes "���̘b��m��΁A�x�����Ă����l��";
		mes "�����ƌN�����}���Ă���邾�낤�B";
		mes "�n�}�ɋL�����ꏊ�ɂ���Z�l��";
		mes "�b�������Ă݂Ă͂ǂ����ˁB";
		viewpoint 1,181,353,0,0xFFFFFF;
		viewpoint 1,228,267,1,0xFFFF00;
		viewpoint 1,295,171,2,0x0000FF;
		viewpoint 1,119,217,3,0xCCCCCC;
		viewpoint 1,326,68,4,0x00FF00;
		viewpoint 1,223,267,5,0xFF0000;
		next;
		mes "[�����o�L�E�|��]";
		mes "�Ⴋ�`���҂�B";
		mes "�N�͂��̒���";
		mes "��]�ɂȂ�邩������Ȃ��B";
		mes "���҂����Ă��炤��B";
		next;
		mes "�]���̐l�����̂��Ȃ��ɑ΂���";
		mes "�@�x���͉������悤���B";
		mes "�@���̐l�����ɘb�������Ă݂悤�]";
		setquest 201490;
		setquest 72050;
		if(MALAYA_1QUE == 1)
			delquest 7350;
		set MALAYA_1QUE,2;
		close;
	case 2:
		mes "[�����o�L�E�|��]";
		mes "�N�ɑ΂���x���S�͉����Ă���Ǝv���B";
		mes "�ނ�̂Ƃ���ɍs���āA";
		mes "�b�������Ă݂Ă͂ǂ����ˁB";
		next;
		mes "[�����o�L�E�|��]";
		mes "�N�̍��͂ƂĂ������������B";
		mes "�Èł������ȁB";
		if(checkquest(7353)&8 == 0)
			viewpoint 1,181,353,0,0xFFFFFF;
		if(checkquest(7357)&8 == 0)
			viewpoint 1,228,267,1,0xFFFF00;
		if(checkquest(7355)&8 == 0)
			viewpoint 1,295,171,2,0x0000FF;
		if(checkquest(7354)&8 == 0)
			viewpoint 1,119,217,3,0xCCCCCC;
		if(checkquest(7352)&8 == 0)
			viewpoint 1,326,68,4,0x00FF00;
		if(checkquest(7356)&8 == 0)
			viewpoint 1,223,267,5,0xFF0000;
		close;
	case 3:
		mes "[�����o�L�E�|��]";
		mes "�ǂ������񂾁H";
		mes "�����Y�݂����肻���ȕ\��ȁB";
		mes "���������Ȃ藐��Ă���B";
		mes "�����������̂��H";
		next;
		if(select("�ꕔ�n�I���������","���ł��Ȃ��ł�") == 2) {
			mes "[�����o�L�E�|��]";
			mes "�������B";
			mes "���������������玄�ɘb���Ă���B";
			mes "���ɗ��Ă鎖�Ȃ炢�ł��͂ɂȂ낤�B";
			close;
		}
		mes "[�����o�L�E�|��]";
		mes "�ӂށc�c�Ȃ�قǁB";
		mes "����Ȃ��Ƃ��������̂��B";
		mes "����͍����������ȁB";
		next;
		mes "[�����o�L�E�|��]";
		mes "���͎����A���̐l�X��";
		mes "�s������菜�����߂�";
		mes "�����ł��Ȃ����Ǝv����";
		mes "��������邱�Ƃɂ����̂����A";
		mes "�ӊO�Ə�������ςłˁc�c�B";
		mes "�v���悤�ɐi��ł��Ȃ��̂��B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�������ȁc�c";
		mes "�ނ�̊肢�������Ă���Ȃ����ˁH";
		mes "�N�̏����i����";
		mes "�����I��Ŕނ�ɂ킯�Ă�����񂾁B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�ނ炪���߂Ă���̂͐S�̈��肾�B";
		mes "�����ȕ��ЂƂɈӖ������o����";
		mes "�S�ɕ�����^���Ă���̂���B";
		next;
		mes "[�����o�L�E�|��]";
		mes "���ꂳ������Ύ��͑��v�A";
		mes "�ƐM���邻�̐S���d�v�Ȃ񂾂낤�B";
		mes "���������͑債�����ł͂Ȃ��B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�N�̌Â��������ЂƂ�";
		mes "�����ɋ���������Ă����҂�����";
		mes "���C�����߂���Ȃ�A";
		mes "����͂��������ƌ����邾�낤�B";
		next;
		mes "^4d4dff�]�����o�L�E�|���̏����̒ʂ��";
		mes "�@����炵�����𕪂��Ă����悤�B";
		mes "�@���������Ƃ��Ă������낤���]^000000";
		next;
		switch(select("����","�u���[�W�F���X�g�[��","�[���s�[")) {
		case 1:
			mes "[�����o�L�E�|��]";
			mes "����͐_���Ȑ��̎����ȁB";
			mes "�Ȃ��Ȃ������Ă��Ǝv���B";
			mes "�ӂށB�������ꂾ�����ƕ�����Ȃ��ȁB";
			mes "���ɂ������͖̂������H";
			next;
			menu "�u���[�W�F���X�g�[��",-;
			mes "[�����o�L�E�|��]";
			mes "�ق��c�c�_���Ȗ��@�Ɏg����΁H";
			mes "���Ȃ�ǂ��ȁB";
			break;
		case 2:
			mes "[�����o�L�E�|��]";
			mes "�ق��c�c�_���Ȗ��@�Ɏg����΁H";
			mes "���Ȃ�ǂ��ȁB";
			mes "�������A���ꂾ�����ƕ�����Ȃ��ȁB";
			mes "���ɂ������͖̂������H";
			next;
			menu "����",-;
			mes "[�����o�L�E�|��]";
			mes "����͐_���Ȑ��̎����ȁB";
			mes "�Ȃ��Ȃ������Ă��Ǝv���B";
			break;
		case 3:
			mes "[�����o�L�E�|��]";
			mes "���ށH�@�܂��A���́c�c�Ȃ񂾁B";
			mes "�m���ɂȂ�ł������Ƃ͌��������A";
			mes "����炵�����̂������";
			mes "���l���M�����񂹂₷���Ƃ������̂��B";
			next;
			mes "[�����o�L�E�|��]";
			mes "�_���ȗ͂����������";
			mes "����ɗǂ��ȁB";
			mes "�������傤�ǂ������̂͂Ȃ����ˁH";
			next;
			menu "�������u���[�W�F���X�g�[���c�c�H",-;
			mes "[�����o�L�E�|��]";
			mes "���O���炵�Đ��Ȃ�͂���������ȁB";
			mes "���Ȃ�͂����������̂悤���ˁB";
			mes "����Əp�҂�����Ă����΂��B�ӂށB";
			mes "�ǂ�����Ȃ����B";
			break;
		}
		next;
		mes "[�����o�L�E�|��]";
		mes "�ł́A�������������܂ł̊ԁA";
		mes "^ff0000�����ƃu���[�W�F���X�g�[��^000000��";
		mes "1�l��1���A6�l���ق�";
		mes "�p�ӂ��Ă��炦�Ȃ����낤���B";
		mes "�����Ă���𕪂��邱�Ƃ�";
		mes "�l�X�Ɉ��炬��^���Ăق����B";
		next;
		mes "[�����o�L�E�|��]";
		mes "���������Β��̐l���������";
		mes "�M���͂���Ɍ����Ȃ�A";
		mes "�N�ɐS���J���Ă���邾�낤�B";
		next;
		mes "[�����o�L�E�|��]";
		mes "�ނ�̂���ꏊ��n�}�ɋL�����B";
		mes "���܂Ȃ������񂾂�B";
		viewpoint 1,181,353,0,0xFFFFFF;
		viewpoint 1,228,267,1,0xFFFF00;
		viewpoint 1,295,171,2,0x0000FF;
		viewpoint 1,119,217,3,0xCCCCCC;
		viewpoint 1,326,68,4,0x00FF00;
		viewpoint 1,223,267,5,0xFF0000;
		delquest 7358;
		setquest 7351;
		set MALAYA_1QUE,4;
		close;
	case 4:
		mes "[�����o�L�E�|��]";
		mes "�����ƃu���[�W�F���X�g�[���B";
		mes "�N������2�𒬂̐l�����ɔz���";
		mes "�s������菜���邾�낤�B";
		next;
		mes "[�����o�L�E�|��]";
		mes "1�l��1���A";
		mes "6�l�ɔz���ė��Ăق����B";
		mes "�ނ�̂���ꏊ��n�}�ɋL�����B";
		mes "���܂Ȃ������񂾂�B";
		if(checkquest(7360)&8 == 0)
			viewpoint 1,181,353,0,0xFFFFFF;
		if(checkquest(7364)&8 == 0)
			viewpoint 1,228,267,1,0xFFFF00;
		if(checkquest(7362)&8 == 0)
			viewpoint 1,295,171,2,0x0000FF;
		if(checkquest(7361)&8 == 0)
			viewpoint 1,119,217,3,0xCCCCCC;
		if(checkquest(7359)&8 == 0)
			viewpoint 1,326,68,4,0x00FF00;
		if(checkquest(7363)&8 == 0)
			viewpoint 1,223,267,5,0xFF0000;
		close;
	case 5:
		mes "[�����o�L�E�|��]";
		mes "���̐l�X������������";
		mes "���߂����悤���ˁB";
		mes "�N������Ă��ꂽ�񂾂낤�H";
		mes "�킩���Ă����B";
		next;
		mes "[�����o�L�E�|��]";
		mes "����ŌN�͒��݂̂�Ȃ�";
		mes "����鑶�݂ɂȂ����ȁB";
		mes "�������ӂ��Ă���B";
		mes "����܂ŌN������Ă����Z����";
		mes "�����ƐS���J���Ă���邾�낤�B";
		next;
		mes "[�����o�L�E�|��]";
		mes "���������A�x��Ă��������쐬����";
		mes "�����ɂ��鑷���̃C�����_�[��";
		mes "��`���Ă���邱�ƂɂȂ����B";
		mes "�N���n���Ă��ꂽ���͍���������";
		mes "�Ȃ邩��A���͗p�ӂ��Ȃ��đ��v���B";
		next;
		mes "[�����o�L�E�|��]";
		mes "���̒��ɂ́A�܂��܂������Ă���";
		mes "�Z�����������񂢂�B";
		mes "���������Ă���Z���ɉ������";
		mes "�����Ă����Ăق����B";
		mes "��낵�����ށB";
		delquest 7365;
		setquest 201495;
		if(MALAYA_2QUE == 0)
			setquest 72070;
		if(MALAYA_3QUE == 0)
			setquest 72072;
		if(MALAYA_4QUE == 0)
			setquest 72074;
		if(MALAYA_5QUE == 0)
			setquest 72076;
		if(MALAYA_6QUE == 0)
			setquest 72078;
		if(MALAYA_7QUE == 0)
			setquest 72080;
		setquest 72082;
		setquest 72084;
		setquest 72086;
		setquest 72088;
		setquest 72092;
		setquest 72090;
		setquest 72094;
		set MALAYA_1QUE,6;
		if(checkre())
			getexp 100000,20000;
		else
			getexp 1000000,200000;
		close;
	case 6:
		switch(rand(1,4)) {
		case 1:
			if($MalayaName$[0] != "" && $MalayaName$[0] != strcharinfo(0)) {
				mes "[�����o�L�E�|��]";
				mes "�N�̂悤�ɗE���Ȗ`���҂�������B";
				mes $MalayaName$[0];
				mes "�Ƃ������O�炵�����A";
				mes "�m�荇�����ˁH";
				break;
			}
		case 2:
			if($MalayaName$[0] != "" && $MalayaName$[0] != strcharinfo(0)) {
				mes "[�����o�L�E�|��]";
				mes "�ŋߒ��Ől�C�̖`���҂�����B";
				mes $MalayaName$[0];
				mes "�Ƃ������O�炵�����A";
				mes "���C����Ȗ`���҂̂悤���ˁB";
				break;
			}
		case 3:
			if($MalayaName$[1] != "" && $MalayaName$[1] != strcharinfo(0)) {
				mes "[�����o�L�E�|��]";
				mes $MalayaName$[1];
				mes "�Ƃ����`���҂͂��̒������łȂ�";
				mes "�o���I�E�}�q���K�ł�";
				mes "�l�X�������Ă���炵���B";
				mes "�P�ǂȍ��̎����傪�����Ă��ꂵ����B";
				break;
			}
		case 4:
			mes "[�����o�L�E�|��]";
			mes "���܂Ń����o�L�E�Ƃ��Đ����Ă������A";
			mes "�N�̂悤�Ȑ����ċ�������";
			mes "���Ɍ������Ƃ��Ȃ���B";
			break;
		}
		switch(MALAYA_3QUE) {
		case 2:
			next;
			menu "�`�ŋN��������b��",-;
			mes "[�����o�L�E�|��]";
			mes "�`�̃y���[���ł���Ȃ��Ƃ��H";
			mes "�Ȃ�قǁA�Ӂ[�ށc�c�B";
			mes "�܂��͔ޏ����ǂ����Ă���Ȃɓ{��̂�";
			mes "���R��m��K�v������ȁB";
			next;
			mes "[�����o�L�E�|��]";
			mes "���ށB";
			mes "����Ȏ��̓v���[���g����Ԃ��B";
			mes "��͂菗���̐S������ɂ�";
			mes "�ԑ����ȁB����ȏ�̕��͂Ȃ��B";
			next;
			menu "�������k�ł͂Ȃ��ł�����",-;
			mes "[�����o�L�E�|��]";
			mes "�Ⴆ�΂̘b����B";
			mes "�܂��͔ޏ��̘b�𕷂��Ȃ����ɂ�";
			mes "�ǂ��ɂ��Ȃ�Ȃ��B";
			mes "����ɂ͑ł�������K�v�����邾�낤�B";
			next;
			mes "[�����o�L�E�|��]";
			mes "�����Ă��Ă�����ł��Ă�";
			mes "�����͏������B";
			mes "����ɁA�N���̏�����";
			mes "�Y��ȕ����D���Ȃ͂����B";
			mes "��肭�����񂶂�Ȃ����ˁB";
			next;
			mes "[�����o�L�E�|��]";
			mes "�悵�A�ł͂������悤�B";
			mes "^4d4dff�_��I�ȉԁA���^�ȉԁA�Y��ȉ�^000000��";
			mes "���ꂼ��3���p�ӂ��Ă���񂾁B";
			mes "�W�߂Ă����玄���ԑ��ɂ���";
			mes "�j���̋F����Ă߂Ă����悤�B";
			mes "����������Ă����Ă݂���ǂ����ȁB";
			next;
			mes "[�����o�L�E�|��]";
			mes "�܂��A�ԂȂ璬�̊O�ɍs����";
			mes "���Ƃ��Ȃ邾�낤�B";
			mes "�W�߂���܂����Ă���B";
			delquest 7396;
			setquest 7397;
			set MALAYA_3QUE,3;
			close;
		case 3:
			next;
			if(countitem(6509) < 3 || countitem(6510) < 3 || countitem(6511) < 3) {
				mes "[�����o�L�E�|��]";
				mes "�Ƃ���Łc�c";
				mes "�ԑ�����邽�߂ɂ́A";
				mes "^4d4dff�_��I�ȉԁA���^�ȉԁA�Y��ȉ�^000000��";
				mes "���ꂼ��3���K�v���B";
				mes "�p�ӂ��Ă���܂����Ă���B";
				close;
			}
			mes "[�����o�L�E�|��]";
			mes "�Ƃ���Łc�c";
			mes "���ށA�Ԃ������Ă����悤���ȁB";
			mes "����ł͎����F����Ă߂đ��˂悤�B";
			next;
			mes "�]�����o�L�E�|���͑厖�ɉԂ�";
			mes "�@���˂Ȃ���j���̋V�����n�߂��B";
			mes "�@�_���ȕ��͋C���`����Ă���]";
			misceffect 16;
			next;
			mes "[�����o�L�E�|��]";
			mes "�悵�B�ǂ����B";
			mes "�Ȃ��Ȃ��̏o�����낤�B";
			next;
			if(checkitemblank() == 0) {
				// ������
				mes "[�����o�L�E�|��]";
				mes "�ށA�A�C�e������������";
				mes "�����߂��̂悤���ȁB";
				mes "�������Ă��������x";
				mes "���Ă���Ȃ����B";
				close;
			}
			mes "[�����o�L�E�|��]";
			mes "�����A�ł͂��̎q�ɓn���Ă���B";
			mes "�S�̔����J���Ă���鎖���肨���B";
			delitem 6510,3;
			delitem 6509,3;
			delitem 6511,3;
			getitem 6506,1;
			delquest 7397;
			setquest 7398;
			set MALAYA_3QUE,4;
			close;
		case 4:
			next;
			mes "[�����o�L�E�|��]";
			mes "�Ƃ���Łc�c";
			mes "�܂��ԑ��������Ă���݂������ȁB";
			mes "�n�����ԑ���������";
			mes "�D�ɂ��鏗���Ƙb���Ă݂Ȃ����B";
			close;
		case 6:
			if(checkquest(7402)) {
				next;
				if(countitem(6509) < 3 || countitem(6510) < 3 || countitem(6511) < 3) {
					mes "[�����o�L�E�|��]";
					mes "��H";
					mes "�f�B���^�̏��ɍs���̂��H";
					mes "^4d4dff�_��I�ȉԁA���^�ȉԁA�Y��ȉ�^000000��";
					mes "3�������ė���΁A";
					mes "�j���̋F����Ă߂ĉԑ�����邼�B";
					close;
				}
				mes "[�����o�L�E�|��]";
				mes "���A�����Ă����ȁB";
				mes "���̋��{�͈���ɂ��Đ��炸�B";
				mes "���ꂶ�Ⴀ�A�ԑ��ɏj�����Ă߂悤�B";
				next;
				if(checkitemblank() == 0) {
					mes "[�����o�L�E�|��]";
					mes "�ށA�A�C�e������������";
					mes "�����߂��̂悤���ȁB";
					mes "�������Ă��������x";
					mes "���Ă���Ȃ����B";
					close;
				}
				mes "[�����o�L�E�|��]";
				mes "�����A�o�������B";
				mes "�������F�鎖�ɂ��悤�B";
				misceffect 16;
				delitem 6509,3;
				delitem 6510,3;
				delitem 6511,3;
				getitem 6506,1;
				delquest 7402;
				setquest 72065;
				close;
			}
			if(checkquest(72065)) {
				next;
				mes "[�����o�L�E�|��]";
				mes "�Ƃ���Łc�c";
				mes "���łɉԑ��͓n�����͂������B";
				mes "�����ԑ��������ăy���[���ɍs���񂾁B";
				close;
			}
			if(checkquest(7401)) {
				next;
				mes "[�����o�L�E�|��]";
				mes "�Ƃ���Łc�c";
				mes "�y���[���̂��Ƃ����������A";
				mes "�����΂�Ȃ��������݂���̂�";
				mes "�߂������Ƃ��B";
				mes "���̂��߂Ɍ��Ԃ�����Ȃ�";
				mes "���ł��͂ɂȂ낤�B";
				close;
			}
		}
		close;
	}
OnInit:
	waitingroom "�X�̋~�ώ�",0;
	end;
}

//============================================================
// �X���v�������N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_2QUE -> 0�`5
//------------------------------------------------------------
malaya.gat,169,350,5	script	�C�����_�[	475,{
	if(MALAYA_1QUE < 2) {
		mes "[�C�����_�[]";
		mes "��c�c�Ȃɂ�����B";
		mes "�p�������Ȃ�b�������Ȃ��ł����H";
		next;
		mes "�]�����͂�������x�����Ă���]";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[�C�����_�[]";
		mes "�ӂ���c�c";
		mes "�Ȃ��Ȃ����܂���ˁB";
		mes "���܂�����Ă�悤�����ǁA";
		mes "���܂ő���������B";
		next;
		mes "[�C�����_�[]";
		mes "�܂������̔炪������Ȃ��悤�ɁA";
		mes "���������C��t���邱�ƂˁB";
		emotion 32;
		next;
		mes "�]�����͉��̂��G�ΐS��I��ɂ��Ă���]";
		close;
	}
	switch(MALAYA_2QUE) {
	case 0:
		mes "[�C�����_�[]";
		mes "�͂��c�c�ޗ����Ȃ�Ƃ����Ȃ�����c�c";
		next;
		emotion 0;
		mes "[�C�����_�[]";
		mes "�I";
		next;
		mes "[�C�����_�[]";
		mes "���A����A�C���`�L������������";
		mes "���݂̂�Ȃ̐S����������";
		mes "�p�Y�l����Ȃ��B";
		mes "���ɉ����p������H";
		next;
		if(select("��������邱�ƂɂȂ����񂾂��āH","�N�ɂ͐^���o���Ȃ����낤��") == 1) {
			mes "[�C�����_�[]";
			mes "����A�悭�������ˁB";
			mes "������B���̂����������";
			mes "�{���̂���������Ă��ꂽ�́B";
			mes "����^FF0000�ޖ��̂����^000000�͖{����";
			mes "�����񂾂���I";
		} else {
			emotion 6;
			mes "[�C�����_�[]";
			mes "�Ȃɂ�A�����Ă���邶��Ȃ��I";
			mes "���R��肭������������āA";
			mes "���܂ł������Ƃ͎v��Ȃ����ƂˁI";
			next;
			mes "[�C�����_�[]";
			mes "���ĂȂ����I";
			mes "����������񂪍���Ă��ꂽ";
			mes "����^FF0000�ޖ��̂����^000000�͖{����";
			mes "�����񂾂���I";
		}
		next;
		mes "[�C�����_�[]";
		mes "���ꂩ��͎����{���̂���������āA";
		mes "�݂�Ȃ�������́B";
		mes "�悻�҂̂��Ȃ����o���ʂ͂Ȃ���B";
		mes "���̒������͎̂��̎d�������́I";
		next;
		if(select("������`�������H","���ꂶ�Ⴀ��l�Ŋ撣���āI") == 2) {
			mes "[�C�����_�[]";
			mes "�����I�@�ʂɂ��Ȃ��Ɏ�`����";
			mes "�����Ȃ��Ă�����������I";
			mes "���݂̂�Ȃ͎����������I";
			next;
			menu "���̊��ɂ͂���肪��������Ȃ����ǁc�c",-;
			mes "[�C�����_�[]";
			mes "���A���邳����ˁI";
			mes "���傤�ǂ��ꂩ��ޗ����A";
			mes "�W�߂ɍs�����Ǝv���Ă��̂�I";
			mes "�Z�����񂾂���A�ז�����Ȃ�";
			mes "�����ǂ����ɍs���āI";
			emotion 36;
			close;
		}
		mes "[�C�����_�[]";
		mes "�ǂ��������̐����񂵁H";
		mes "�ʂɂ��Ȃ��Ɏ�`���Ă����Ȃ��Ă�";
		mes "����l�łł����B";
		mes "����Ƃ����Ȃ��A�܂����݂̂�Ȃ�";
		mes "�ǂ�����������̂�����H";
		next;
		if(select("����Ȃ��ƂȂ���","�N����ς�������������") == 1) {
			mes "[�C�����_�[]";
			mes "�ӂ�A�ǂ�������ˁB";
			emotion 32;
		} else {
			mes "[�C�����_�[]";
			mes "�ȁA�Ȃɂ�B";
			mes "����Ȃ��ƌ����Ă�";
			mes "�x����Ȃ��񂾂���I";
			emotion 19;
		}
		next;
		if(BaseLevel < 100) {
			mes "[�C�����_�[]";
			mes "�c�c�܂�������B";
			mes "�����܂Ŏ�`���������Č����Ȃ�A";
			mes "���̎�`�����c�c";
			mes "��c�c�ア�H";
			mes "���Ȃ�������Ǝア��ˁc�c�B";
			next;
			mes "[�C�����_�[]";
			mes "���Ȃ��ł͂�����Ǝ��͕s����B";
			mes "�����ˁB���Ȃ��Ƃ�";
			mes "^FF0000BaseLv100�ȏ�^000000�ɂȂ��Ă���";
			mes "�܂����Ă���邩����B";
			close;
		}
		mes "[�C�����_�[]";
		mes "�c�c�܂�������B";
		mes "�����܂Ŏ�`���������Č����Ȃ�A";
		mes "��`���Ă��炨��������B";
		next;
		mes "[�C�����_�[]";
		mes "^FF0000�ޖ��̂����^000000�����ɂ́A";
		mes "^4d4dff������|�A���܁A��̏\����^000000��";
		mes "���ꂼ��6���K�v�Ȃ́B";
		mes "������W�߂Ă��Ă����H";
		next;
		mes "[�C�����_�[]";
		mes "^4d4dff������|^000000�̓o���I�E�}�q���K�ߕӂ�";
		mes "^FF0000�����|^000000�������Ă��邩��A";
		mes "�����؂��Ă��āB";
		mes "�����͓K���ō\��Ȃ���B";
		next;
		mes "[�C�����_�[]";
		mes "�����|�̓o���I�E�}�q���K��";
		mes "�x����������ق��̍�̓����ɂ����B";
		mes "���ɂ��o���I�E�}�q���K��";
		mes "�ߕӂɐ����Ă�����B";
		mes "�����ڂ͑��̖؂ƕς��Ȃ����ǁA";
		mes "�߂��Ō���ΈႢ���킩��͂���B";
		next;
		mes "[�C�����_�[]";
		mes "^4d4dff����^000000�͒��̖k�����̊C�ݕt�߂�";
		mes "���ڐ������ďW�߂�K�v�������B";
		mes "�����@���Ă�����^FF0000���̂��ڂ�^000000��";
		mes "���̂�����ɂ���́B";
		mes "�����Ŏ���Ă��āB";
		next;
		mes "[�C�����_�[]";
		mes "�Ō��^4d4dff��̏\����^000000�����ǁA";
		mes "^FF0000���퉮�̑O�ɂ���p���h�C^000000��";
		mes "��̃u���X���b�g��2�n���ƁA";
		mes "1����Ă����͂���B";
		next;
		mes "[�C�����_�[]";
		mes "�c�c������̃u���X���b�g��";
		mes "^FF0000�}�i�i���K����`���i�b�N�A���N���N^000000��";
		mes "�����Ă���́B";
		mes "���͂ȃ����X�^�[�΂��肾����A";
		mes "�������댯����B";
		next;
		mes "[�C�����_�[]";
		mes "�|���Ȃ��߂Ă��������H";
		mes "�ʂɂ��Ȃ����S�z�Ȃ킯����Ȃ����ǁA";
		mes "������`���ĉ���Ȃ�Ă��ꂽ��A";
		mes "�������������݂�������Ȃ��B";
		emotion 29;
		next;
		menu "�W�߂Ă���̂͂���őS���H",-;
		mes "[�C�����_�[]";
		mes "���H";
		mes "���A�����A������B";
		mes "����őS���c�c�B";
		next;
		mes "[�C�����_�[]";
		mes "����A���Ⴀ���͂����ő҂��Ă邩��A";
		mes "�����W�߂Ă��Ē��ՁB";
		mes "���������C�����邱�ƂˁB";
		delquest 72070;
		setquest 7366;
		set MALAYA_2QUE,1;
		close;
	case 1:
		if(countitem(6500) < 6 || countitem(6501) < 6 || countitem(6502) < 6) {
			mes "[�C�����_�[]";
			mes "���������āA�K�v�ȍޗ���";
			mes "�Y��Ă��܂����́H";
			mes "���傤���Ȃ���ˁB";
			next;
			mes "[�C�����_�[]";
			mes "^FF0000�ޖ��̂����^000000�����̂ɕK�v�ȍޗ��́A";
			mes "^4d4dff������|�A���܁A��̏\����^000000";
			mes "�e6����B";
			next;
			mes "[�C�����_�[]";
			mes "^4d4dff������|^000000�̓o���I�E�}�q���K�ߕӂ�";
			mes "�����|����A";
			mes "^4d4dff����^000000�͒��̖k���̊C�݂̍����ڂ݂���A";
			mes "^4d4dff��̏\����^000000��^FF0000���퉮�O�ɂ���p���h�C^000000��";
			mes "��̃u���X���b�g��2�n����";
			mes "1����Ă�����B";
			next;
			mes "[�C�����_�[]";
			mes "��̃u���X���b�g��";
			mes "^FF0000�}�i�i���K����`���i�b�N�A���N���N^000000��";
			mes "�����Ă��邯�ǁA��Ȃ��Ǝv������";
			mes "�������Ȃ��Ă��������H";
			close;
		}
		mes "[�C�����_�[]";
		mes "����A��������Ȃ����B";
		mes "����ł������̂͂ǂ��Ȃ���������H";
		next;
		mes "[�C�����_�[]";
		mes "�������c�c�{���ɏW�߂Ă����̂ˁB";
		mes "�������Ǝv���Ă��̂Ɂc�c�B";
		emotion 0;
		next;
		menu "�S�������Ă邩�ȁH",-;
		mes "[�C�����_�[]";
		mes "���A�����A���Ȃ���B";
		mes "���肪�Ƃ��c�c�B";
		next;
		mes "[�C�����_�[]";
		mes "���A���ꂶ�Ⴀ���͂��ꂩ��";
		mes "�W�߂Ă��ꂽ�ޗ����g���āA";
		mes "�V�����s����B";
		mes "�������ɕK�v�Ȑ_���ȋV����B";
		next;
		mes "[�C�����_�[]";
		mes "�V���͂����ɏI��邯�ǁA";
		mes "�ƂĂ��@�ׂȂ��̂�����";
		mes "�����ق��ĂāB";
		next;
		mes "[�C�����_�[]";
		mes "�V�����I�������A";
		mes "���ʂɂ����������Ă������B";
		mes "�܂��b�����Ē��ՁB";
		delitem 6501,6;
		delitem 6500,6;
		delitem 6502,6;
		delquest 7366;
		setquest 7367;
		set MALAYA_2QUE,2;
		close;
	case 2:
		mes "[�C�����_�[]";
		mes "�ӂ��c�c�B";
		mes "���ꂪ�����傤�Ǐo���オ����";
		mes "^FF0000�ޖ��̂����^000000��B";
		next;
		mes "�]�|�Ƌ�ō��ꂽ";
		mes "�@�\���^�̂���肩��́A";
		mes "�@�_���ȗ͂�������]";
		next;
		mes "[�C�����_�[]";
		mes "�ˁH�@�f���炵���ł��傤�H";
		mes "����ς肨���������͐�����I";
		mes "���ꂳ������΁A���݂̂�Ȃ�";
		mes "�Y�܂��Ă��鈫����|���Ȃ��Ȃ��ˁB";
		emotion 2;
		next;
		mes "�]�������������I����";
		mes "�@���������ȃC�����_�[�����A";
		mes "�@�����Ԃ�敾���Ă���悤�Ɍ�����]";
		next;
		mes "[�C�����_�[]";
		mes "���ꂶ�Ⴑ�̂�����";
		mes "���݂̂�Ȃɔz���Ă��Ȃ�����B";
		next;
		menu "�z���Ă��Ă������",-;
		mes "[�C�����_�[]";
		mes "���c�c�������B";
		mes "���Ȃ��ɂ͍ޗ����W�߂�������񂾂��B";
		mes "���ꂭ�炢���������B";
		next;
		mes "[�C�����_�[]";
		mes "����Ƃ����H";
		mes "����ς蒬�݂̂�Ȃ�";
		mes "�l�C����肽���́H";
		next;
		menu "���������A�����班���x��łȂ�",-;
		mes "[�C�����_�[]";
		mes "���c�c�B";
		emotion 0;
		next;
		mes "[�C�����_�[]";
		mes "�i���̐l�A�������Ă��邩�����";
		mes "�@�C�����Ă���Ă�񂾁B";
		mes "�@���������Ă���͂��Ȃ̂Ɂc�c�j";
		next;
		mes "[�C�����_�[]";
		mes "�i����ȑԓx���Ƃ��Ă������ɁA";
		mes "�@�ǂ����āc�c�H�j";
		next;
		mes "[�C�����_�[]";
		mes "�c�c�B";
		emotion 9;
		next;
		mes "[�C�����_�[]";
		mes "�c�c���A�����ˁA";
		mes "����ȂɌ����Ȃ�d���Ȃ���ˁB";
		mes "���Ȃ��ɐl�C���̋@����������B";
		mes "���������݂�Ȃɗǂ��������Ɨǂ���B";
		next;
		mes "[�C�����_�[]";
		mes "���ꂶ�Ⴈ���ƈꏏ��";
		mes "�͂���̃��X�g��n���Ă�����B";
		mes "�n�}�ɂ��L���Ă���������A";
		mes "�ԈႦ�Ȃ��悤�ɋC�����ĂˁB";
		next;
		mes "�]�C�����_�[����^FF0000�ޖ��̂����^000000��";
		mes "�@�󂯎�����B";
		mes "�@���X�g�����ɂ݂�Ȃɔz�낤�]";
		viewpoint 1,181,353,0,0xFFFFFF;
		viewpoint 1,228,267,1,0xFFFF00;
		viewpoint 1,295,171,2,0x0000FF;
		viewpoint 1,119,217,3,0xCCCCCC;
		viewpoint 1,326,68,4,0x00FF00;
		viewpoint 1,223,267,5,0xFF0000;
		getitem 6503,6;
		delquest 7367;
		setquest 7368;
		setquest 7369;
		setquest 7370;
		setquest 7371;
		setquest 7372;
		setquest 7373;
		setquest 7374;
		set MALAYA_2QUE,3;
		close;
	case 3:
		mes "[�C�����_�[]";
		mes "^FF0000�ޖ��̂����^000000��n���l�̏ꏊ��";
		mes "���X�g�ƒn�}������΂킩���B";
		mes "�݂�ȕs�����Ǝv������A";
		mes "�ł��邾�������z���Ă��ĂˁB";
		if(checkquest(7383) == 0)
			viewpoint 1,181,353,0,0xFFFFFF;
		if(checkquest(7387) == 0)
			viewpoint 1,228,267,1,0xFFFF00;
		if(checkquest(7385) == 0)
			viewpoint 1,295,171,2,0x0000FF;
		if(checkquest(7384) == 0)
			viewpoint 1,119,217,3,0xCCCCCC;
		if(checkquest(7382) == 0)
			viewpoint 1,326,68,4,0x00FF00;
		if(checkquest(7386) == 0)
			viewpoint 1,223,267,5,0xFF0000;
		close;
	case 4:
		mes "[�C�����_�[]";
		mes "�����ƑS���͂��Ă��ꂽ�̂ˁB";
		next;
		mes "[�C�����_�[]";
		mes "�c�c�B";
		emotion 9;
		next;
		mes "[�C�����_�[]";
		mes "�ЂƂ����Ă����H";
		mes "�ǂ����Ă��Ȃ���";
		mes "������`���Ă��ꂽ�́H";
		mes "����Ȃɍ������Ƃ��������̂ɁB";
		next;
		menu "�N���X�̂��߂Ɋ撣���Ă�������",-,"�X�݂̂�Ȃ�����������������",-;
		mes "[�C�����_�[]";
		mes "�����c�c�B";
		mes "�@";
		mes "���ӂӂ�";
		mes "�悻�҂̂����ɕς�����l�ˁB";
		next;
		mes "[�C�����_�[]";
		mes "���Ȃ����߂��Ă���܂ł̊ԁA";
		mes "�������󂯎�����l��";
		mes "���l�������ɗ�����B";
		next;
		mes "[�C�����_�[]";
		mes "����܂Œ���ł����̂�";
		mes "�R�̂悤�ɖ��邢�Ί�ŁA";
		mes "���Ƃ��Ȃ��ɂ���������Ă�����B";
		next;
		mes "[�C�����_�[]";
		mes "�c�c�B";
		emotion 9;
		next;
		mes "[�C�����_�[]";
		mes "�ŏ��ɂ��Ȃ��������Ƃ��́A";
		mes "�悻�҂����̒��̏󋵂����āA";
		mes "�ʔ������ł݂�Ȃ̘b��";
		mes "�����Ă܂���Ă�񂾂Ǝv���Ă��c�c�B";
		next;
		mes "[�C�����_�[]";
		mes "�ł��A������`���Ă����p��";
		mes "���݂̂�Ȃ����Ă��Ă킩������B";
		mes "���Ȃ��A�{���ɂ����l�������̂ˁB";
		next;
		mes "[�C�����_�[]";
		mes "�{���͎���l���Ⴈ���̍ޗ���";
		mes "�W�߂�̂������������́B";
		mes "����Ȏ��ɂ��Ȃ�����`���Ă���āA";
		mes "������������B";
		next;
		mes "[�C�����_�[]";
		mes "���܂Ő��ӋC�Ȏ���������";
		mes "���߂�Ȃ����B";
		mes "����ƁA�����Ă���Ă��肪�Ƃ��B";
		mes "���ꂩ������ǂ����Ă��炦�邩����H";
		next;
		menu "�������",-;
		mes "[�C�����_�[]";
		mes "�ǂ������I�@��������B";
		mes "���ꂩ���낵���ˁB";
		emotion 3;
		next;
		if(checkitemblank() == 0) {
			// ������
			mes "[�C�����_�[]";
			mes "�c�c�ו��������ς��̂悤�ˁB";
			mes "�����n����������A��������";
			mes "�������āA������x�b��������";
			mes "���傤�����B";
			close;
		}
		mes "[�C�����_�[]";
		mes "����͎�`���Ă��ꂽ�����B";
		mes "�󂯎���ĂˁB";
		delquest 7374;
		delquest 7379;
		setquest 7375;
		setquest 201500;
		set MALAYA_2QUE,5;
		getitem 6497,1;
		if(checkre()) {
			getexp 500000,0;
			getexp 500000,0;
			getexp 0,300000;
		}
		else {
			getexp 5000000,0;
			getexp 5000000,0;
			getexp 0,3000000;
		}
		next;
		mes "[�C�����_�[]";
		mes "���ƁA���͂�����";
		mes "�������Ȃ��Ƃ����Ȃ��́B";
		mes "������A�������Ԃ�����Ȃ�";
		mes "��`���ɗ��Ă����Ɗ�������B";
		next;
		mes "[�C�����_�[]";
		mes "�����������瑼�̐l�ɗ��ނ��ǁA";
		mes "�ł���΂��Ȃ��Ɏ�`���ė~�����́B";
		mes "���肢�ˁB";
		emotion 40;
		close;
	case 5:
		if(checkquest(7379)) {
			emotion 15;
			mes "[�C�����_�[]";
			mes "�S���z��I�����̂ˁB����ꂳ�܁B";
			next;
			mes "[�C�����_�[]";
			mes "�ł��c�c���܂ł�������";
			mes "�����Ă��邾���ł͑ʖڂ�ˁB";
			mes "���ǂ����͋����S�����ׂ�";
			mes "���������ł����Ȃ���B";
			next;
			mes "[�C�����_�[]";
			mes "���̂��Ƃɒ��̐l�X���C�t����";
			mes "���̂���肪����Ȃ��Ȃ����";
			mes "��������̂�����B";
			mes "�����Ȃ��ė~�������ǁc�c�B";
			next;
			if(checkitemblank() == 0) {
				mes "[�C�����_�[]";
				mes "�c�c�ו��������ς��̂悤�ˁB";
				mes "�����n����������A��������";
				mes "�������āA������x�b��������";
				mes "���傤�����B";
				close;
			}
			mes "[�C�����_�[]";
			mes "�����A���߂�Ȃ����B";
			mes "�Ƃɂ��������͂���ő��v�B";
			mes "�������肪�Ƃ��B";
			mes "����͂����B";
			setquest 7375;
			delquest 72170;
			delquest 7379;
			getitem 6497,1;
			if(checkre())
				getexp 50000,20000;
			else
				getexp 500000,200000;
			set $MalayaName$[0],strcharinfo(0);
			close;
		}
		if(checkquest(7380)) {
			if(countitem(6500) < 6 || countitem(6501) < 6 || countitem(6502) < 6) {
				mes "[�C�����_�[]";
				mes "^4d4dff������|�A���܁A��̏\����^000000��";
				mes "�e6���W�߂Ă��ĂˁB";
				next;
				mes "[�C�����_�[]";
				mes "^4d4dff������|^000000�̓o���I�E�}�q���K�ߕӂ�";
				mes "�����|����A";
				mes "^4d4dff����^000000�͒��̖k���̊C�݂̍����ڂ݂���A";
				mes "^4d4dff��̏\����^000000�̓p���h�C��";
				mes "��̃u���X���b�g��n����";
				mes "��ɓ���邱�Ƃ��ł����B";
				next;
				mes "[�C�����_�[]";
				mes "���Ȃ��Ȃ���v���Ǝv�����ǁA";
				mes "���ꂮ��������͂��Ȃ��łˁB";
				mes "�������F���Ă��܂��B";
				close;
			}
			emotion 2;
			mes "[�C�����_�[]";
			mes "�S�������Ă��ˁB";
			mes "�������肪�Ƃ��I";
			mes "����ȂɗD�����l���^���Ă��Ȃ�āA";
			mes "���A�p����������B";
			next;
			if(checkitemblank() == 0) {
				mes "[�C�����_�[]";
				mes "�c�c�ו��������ς��̂悤�ˁB";
				mes "�����n����������A��������";
				mes "�������āA������x�b��������";
				mes "���傤�����B";
				close;
			}
			mes "[�C�����_�[]";
			mes "�ǂ������疾�����܂����ĂˁB";
			mes "����͍���̂����B";
			delitem 6501,6;
			delitem 6502,6;
			delitem 6500,6;
			delquest 7380;
			setquest 7381;
			getitem 6497,1;
			if(checkre())
				getexp 50000,20000;
			else
				getexp 500000,200000;
			set $MalayaName$[0],strcharinfo(0);
			close;
		}
		if(checkquest(72170)) {
			mes "[�C�����_�[]";
			mes "�V����^FF0000�ޖ��̂����^000000��";
			mes "���݂̂�Ȃɓn���Ă��ĂˁB";
			mes "�͂���̓��X�g�ƒn�}��";
			mes "����΂킩���B";
			mes "���ꂶ�Ⴀ�A��낵���ˁI";
			if(checkquest(7383) == 0)
				viewpoint 1,181,353,0,0xFFFFFF;
			if(checkquest(7387) == 0)
				viewpoint 1,228,267,1,0xFFFF00;
			if(checkquest(7385) == 0)
				viewpoint 1,295,171,2,0x0000FF;
			if(checkquest(7384) == 0)
				viewpoint 1,119,217,3,0xCCCCCC;
			if(checkquest(7382) == 0)
				viewpoint 1,326,68,4,0x00FF00;
			if(checkquest(7386) == 0)
				viewpoint 1,223,267,5,0xFF0000;
			close;
		}
		mes "[�C�����_�[]";
		mes "���A����ɂ��́B";
		mes "���Ă��ꂽ�̂ˁB";
		emotion 12;
		next;
		mes "[�C�����_�[]";
		mes "�|�[�g�}�����͋C�ɓ������H";
		mes "�W�v�j�[�ɏ���Ē������̂�";
		mes "�Ȃ��Ȃ��y�������B";
		next;
		switch(select("�ޖ��̂����ޗ��W�߂���`��","�ޖ��̂����z�z����`��")) {
		case 1:
			if(checkquest(7381)) {
				if(!(checkquest(7381) & 0x2)) {
					mes "[�C�����_�[]";
					mes "�C�����Ă���Ă��肪�Ƃ��B";
					mes "�ł��A�����͍ޗ����\������Ă����B";
					mes "�ޗ��������Ȃ����炨�肢����ˁB";
					close;
				}
			}
			emotion 2;
			mes "[�C�����_�[]";
			mes "���x�����̍ޗ��������Ȃ���";
			mes "�����Ă����Ƃ���Ȃ́B";
			mes "���Ȃ������Ă���ď���������B";
			mes "���ꂶ�Ⴈ�肢�ł���H";
			next;
			if(select("�������","���͂ł��Ȃ��̂Ō�Ŏ�`��") == 2) {
				mes "[�C�����_�[]";
				mes "�����c�c�킩������B";
				mes "�܂���łˁB";
				close;
			}
			mes "[�C�����_�[]";
			mes "���Ⴀ�����̂悤�ɂ��肢�ˁB";
			mes "^4d4dff������|�A���܁A��̏\����^000000��";
			mes "�e6����B";
			if(checkquest(7381))
				delquest 7381;
			setquest 7380;
			next;
			mes "[�C�����_�[]";
			mes "^4d4dff������|^000000�̓o���I�E�}�q���K�ߕӂ�";
			mes "�����|����A";
			mes "^4d4dff����^000000�͒��̖k���̊C�݂̍����ڂ݂���A";
			mes "^4d4dff��̏\����^000000�̓p���h�C��";
			mes "��̃u���X���b�g��n����";
			mes "��ɓ���邱�Ƃ��ł����B";
			next;
			mes "[�C�����_�[]";
			mes "���Ȃ��Ȃ���v���Ǝv�����ǁA";
			mes "���ꂮ��������͂��Ȃ��łˁB";
			mes "�������F���Ă��܂��B";
			close;
		case 2:
			if(checkquest(7375)) {
				if(!(checkquest(7375) & 0x2)) {
					emotion 2;
					mes "[�C�����_�[]";
					mes "���̑O��^FF0000�ޖ��̂����^000000�̌��ʂ�";
					mes "�܂��������Ă����B";
					mes "�����獡�͂܂����v�B";
					mes "�ł����肪�Ƃ��A";
					mes "���̋C���������Ŋ�������B";
					close;
				}
				mes "[�C�����_�[]";
				mes "������������z���Ă����́H";
				next;
				if(select("�z��","�z��Ȃ�") == 2) {
					mes "[�C�����_�[]";
					mes "�����c�c�B";
					mes "�c�O�����ǁA";
					mes "���Ȃ��ɂ��s����������̂ˁB";
					close;
				}
				if(checkquest(7381) & 0x2) {
					mes "[�C�����_�[]";
					mes "���肪�Ƃ��B�ł��A�ޗ����Ȃ���";
					mes "�܂�^FF0000�ޖ��̂����^000000���������ĂȂ��́B";
					mes "�ǂ�������ޗ����W�߂Ă��Ă���Ȃ��H";
					close;
				}
				emotion 3;
				mes "[�C�����_�[]";
				mes "���肪�Ƃ��I";
				mes "���ꂶ�፡�������肢�����B";
				mes "�͂���̃��X�g�͂����B";
				mes "�n�}�ɂ��L���Ă�����ˁB";
				mes "�z��I������܂����ĂˁB";
				viewpoint 1,181,353,0,0xFFFFFF;
				viewpoint 1,228,267,1,0xFFFF00;
				viewpoint 1,295,171,2,0x0000FF;
				viewpoint 1,119,217,3,0xCCCCCC;
				viewpoint 1,326,68,4,0x00FF00;
				viewpoint 1,223,267,5,0xFF0000;
				delquest 7375;
				setquest 72170;
				setquest 72174;
				setquest 72182;
				setquest 72178;
				setquest 72176;
				setquest 72172;
				setquest 72180;
				getitem 6503,6;
				close;
			}
		}
	}
OnInit:
	waitingroom "�X���v������",0;
	end;
}

//============================================================
// �S��N�G�X�gNPC
//------------------------------------------------------------
malaya.gat,181,353,5	script	�V�l�i���h	574,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[�V�l�i���h]";
		mes "�c�c";
		mes "���̒��̏Z�l�ł͂Ȃ��悤����ȁB";
		mes "������b�����Ƃ͉����Ȃ��c�c�B";
		close;
	case 2:
		if(checkquest(7353) & 0x8) {
			mes "[�V�l�i���h]";
			mes "���傪�����Ă��镨�Ȃ牽�ł������A";
			mes "����̋C���������܂�Ă��镨��";
			mes "�����ЂƂ����Ă���Ȃ����H";
			next;
			mes "[�V�l�i���h]";
			mes "���͂��������͂Ȃ��B";
			mes "�㐶�̂��肢����B";
			close;
		}
		mes "[�V�l�i���h]";
		mes "���c�c�����!!";
		mes "�C�̗͂��������삪�ߊ��Ȃ��Ƃ���";
		mes "��҂ł͂Ȃ���?!";
		mes "��c�c���ɂ����̋C�𕪂��Ă���Ȃ����H";
		next;
		mes "[�V�l�i���h]";
		mes "�����Ђ������񂵂Ă���";
		mes "���삽���̂����ŁA";
		mes "����낭�ɖ���ʂ̂���c�c�B";
		next;
		mes "[�V�l�i���h]";
		mes "���̑f���炵���C�𕪂��Ă���B";
		mes "����̎������Ȃ牽�ł������I";
		mes "���ɂ���Ȃ���!?";
		next;
		menu "���������Ă�������",-;
		mes "[�V�l�i���h]";
		mes "���͗��������Ă��邳�I";
		mes "����̎������Ȃ炫���ƌ��ʂ�����B";
		mes "���͂���̋C���ς��܂�";
		mes "�����ő҂��Ă��邩��́B";
		setquest 7353;
		compquest 7353;
		viewpoint 2,1,1,0,0xFFFFFF;
		next;
		if( (
			checkquest(7352) + checkquest(7353) +
			checkquest(7354) + checkquest(7355) +
			checkquest(7356) + checkquest(7357)
		) == 48) {
			mes "�]���łɕ����̒��l����";
			mes "�@�����悤�Ȃ��肢������Ă���B";
			mes "�@�ǂ��������̂��낤���B";
			mes "�@��x�����o�L�E�|����";
			mes "�@���k���Ă݂悤�]";
			delquest 7352;
			delquest 7353;
			delquest 7354;
			delquest 7355;
			delquest 7356;
			delquest 7357;
			delquest 72050;
			setquest 7358;
			set MALAYA_1QUE,3;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			close;
		}
		mes "�]���������킯�Ăق����Ɨ��܂ꂽ�B";
		mes "�@���̒��l�ɂ��b�𕷂��Ă݂悤�]";
		close;
	case 3:
		mes "�]�i���h��������悤�Ȗڂ���";
		mes "�@����������Ă���B";
		mes "�@�����o�L�E�|���ɑ��k�ɂ������]";
		close;
	case 4:
		if(checkquest(7360) & 0x8) {
			mes "[�V�l�i���h]";
			mes "���͂̂��B�����ɘb����";
			mes "���̐��Ȃ镨�ɖ{���ɓ��ʂȗ͂�";
			mes "����Ǝv���Ă���킯�ł͂Ȃ��B";
			mes "����������Ă���΋~����A��";
			mes "�M���邱�Ƃ��A���̐S��";
			mes "�~���Ă����񂶂�B";
			next;
			mes "[�V�l�i���h]";
			mes "�Ƃ������B���������������B";
			mes "�O���̐l�Ԃ�����Ƃ�����";
			mes "�������Ă��܂Ȃ������́B";
			mes "���̍l�����Ԉ���Ă����悤����B";
			close;
		}
		if(countitem(523) < 1 || countitem(717) < 1) {
			mes "^4d4dff�]�u���[�W�F���X�g�[���Ɛ�����";
			mes "�@�n�����]^000000";
			close;
		}
		mes "[�V�l�i���h]";
		mes "����A�ǂ������񂶂�B";
		mes "�C���ς���ĉ��������̂��B";
		next;
		menu "������������n��",-;
		mes "�]�V�l�i���h�ɁA��������������";
		mes "�@�u���[�W�F���X�g�[����";
		mes "�@1���n�����]";
		next;
		mes "[�V�l�i���h]";
		mes "���c�c�����I";
		mes "���c�c���肪�Ƃ��B";
		mes "����œ����̊Ԃ͋C���y�ɂȂ�B";
		mes "�S�����������̂���Ԃ��B";
		delitem 717,1;
		delitem 523,1;
		setquest 7360;
		compquest 7360;
		viewpoint 2,1,1,0,0xFFFFFF;
		if( (
			checkquest(7359) + checkquest(7360) +
			checkquest(7361) + checkquest(7362) +
			checkquest(7363) + checkquest(7364)
		) == 48) {
			next;
			mes "�]�V�l���Ō��";
			mes "�@�S�Ĕz��I�����悤���B";
			mes "�@�����o�L�E�|���֕񍐂ɖ߂낤�]";
			delquest 7359;
			delquest 7360;
			delquest 7361;
			delquest 7362;
			delquest 7363;
			delquest 7364;
			delquest 7351;
			setquest 7365;
			set MALAYA_1QUE,5;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
		}
		close;
	case 5:
		mes "[�V�l�i���h]";
		mes "���̐��Ȃ镨�ɖ{���ɓ��ʂȗ͂�";
		mes "����Ǝv���Ă���킯�ł͂Ȃ��B";
		mes "����������Ă���΋~����A��";
		mes "�M���邱�Ƃ��A���̐S��";
		mes "�~���Ă����񂶂�B";
		next;
		mes "[�V�l�i���h]";
		mes "�������B���x�]�T�����鎞��";
		mes "���̎d������`���Ă���Ȃ����ˁH";
		mes "���͑��v�����A�߁X�l�肪����B";
		mes "�ǂ������痊�ނ킢�B";
		close;
	case 6:
		if(checkquest(7369) || checkquest(72174)) {
			mes "[�V�l�i���h]";
			mes "�����A���傩�B";
			mes "�����p�ł����ȁB";
			next;
			mes "�]�V�l�i���h�ɂ�����n�����]";
			next;
			mes "[�V�l�i���h]";
			mes "�قق��B�V��������肩�B";
			mes "���肪�Ƃ��B";
			mes "�C�����_�[�Ƃ���ɂ�";
			mes "���b�ɂȂ�̂��B";
			delitem 6503,1;
			if(checkquest(72174))
				delquest 72174;
			else
				delquest 7369;
			setquest 7383;
			viewpoint 2,1,1,0,0xFFFFFF;
			if( (
				(checkquest(7382)&1) + (checkquest(7383)&1) +
				(checkquest(7384)&1) + (checkquest(7385)&1) +
				(checkquest(7386)&1) + (checkquest(7387)&1)
			) == 6) {
				setquest 7379;
				delquest 7382;
				delquest 7383;
				delquest 7384;
				delquest 7385;
				delquest 7386;
				delquest 7387;
				if(MALAYA_2QUE == 3)
					set MALAYA_2QUE,4;
				next;
				mes "�]���ׂĂ̐l��^FF0000�ޖ��̂����^000000��n�����B";
				mes "�@�C�����_�[�̏��֖߂낤�]";
				viewpoint 2,1,1,0,0xFFFFFF;
				viewpoint 2,1,1,1,0xFFFFFF;
				viewpoint 2,1,1,2,0xFFFFFF;
				viewpoint 2,1,1,3,0xFFFFFF;
				viewpoint 2,1,1,4,0xFFFFFF;
				viewpoint 2,1,1,5,0xFFFFFF;
			}
			close;
		}
		if(checkquest(7377)) {
			mes "[�V�l�i���h]";
			mes "�����o�L�E�L�R������Ƃ���";
			mes "^FF0000�ޖ��̂����^000000�������蔤�����A";
			mes "�����Ɩ���ė������́B";
			mes "��������������W�߂鎖��";
			mes "���ɂƂ��Ă̋~���Ȃ̂����B";
			next;
			if(checkitemblank() == 0) {
				mes "[�V�l�i���h]";
				mes "����H";
				mes "�A�C�e���������ς������߂���";
				mes "�悤����̂��c�c";
				mes "�A�C�e���𐮗�������܂�����Ƃ����B";
				close;
			}
			mes "[�V�l�i���h]";
			mes "�����悯��Ύ����܂����Ă���B";
			mes "�o���I�E�}�q���K�ŕK�v�Ƃ��Ă���";
			mes "�S��͂��������������Ă���񂶂�B";
			delitem 6503,5;
			setquest 7378;
			delquest 7377;
			getitem 6497,1;
			if(checkre())
				getexp 50000,20000;
			else
				getexp 500000,200000;
			set $MalayaName$[1],strcharinfo(0);
			close;
		}
		mes "[�V�l�i���h]";
		mes "�|�[�g�}�����͔����������B";
		mes "�`���ƐV�������̂��Z������";
		mes "���a���Ƃ��Ă���B";
		next;
		mes "[�V�l�i���h]";
		mes "�ŋ߂͈���ɔY�܂��ꂽ��";
		mes "����⑽���̎�҂�����";
		mes "�撣���Ă��ꂽ��������";
		mes "���S���ĕ�点��悤�ɂȂ����B";
		mes "���肪���������B";
		next;
		if(checkquest(7376)) {
			if(select("�b������","�S�ō������ɂ���") == 1) {
				switch(rand(1,4)) {
				case 1:
					if($MalayaName$[0] != "" && $MalayaName$[0] != strcharinfo(0)) {
						mes "[�V�l�i���h]";
						mes "���l�����Ƙb���Ă���ƁA";
						mes $MalayaName$[0]+ "�Ƃ���";
						mes "���O���悭���ɂ���B";
						mes "���̐l�͏��˂�����悤���ˁB";
						close;
					}
				case 2:
					if($MalayaName$[1] != "" && $MalayaName$[1] != strcharinfo(0)) {
						mes "[�V�l�i���h]";
						mes "�ŋ߃o���I�E�}�q���K��";
						mes $MalayaName$[1]+ "�Ƃ���";
						mes "�`���҂̖��O�����ɂ���B";
						mes "�N������m�炵�߂Ă݂���ǂ����ˁB";
						close;
					}
				case 3:
					if($MalayaName$[2] != "" && $MalayaName$[2] != strcharinfo(0)) {
						mes "[�V�l�i���h]";
						mes "�J�v����m���Ă��邩�ˁB";
						mes $MalayaName$[2];
						mes "�Ƃ����`���҂��A";
						mes "�J�v������`���Ă���炵���B";
						close;
					}
				case 4:
					mes "[�V�l�i���h]";
					mes "���̖`���҂��������ꐶ����";
					mes "�z���Ă������B";
					mes "�N�����̍��̓`���Ȃ̂��ˁB";
					close;
				}
			}
			mes "[�V�l�i���h]";
			mes "��͂����Ɠn���Ă��ꂽ���H";
			mes "�����o�L�E�L�R��^FF0000�ޖ��̂����^000000��";
			mes "�����͂����B����������Ă��Ă���B";
			mes "�����͂������񂠂���������B";
			close;
		}
		if(select("�b������","������`���܂��傤��") == 1) {
			switch(rand(1,4)) {
			case 1:
				if($MalayaName$[0] != "" && $MalayaName$[0] != strcharinfo(0)) {
					mes "[�V�l�i���h]";
					mes "���l�����Ƙb���Ă���ƁA";
					mes $MalayaName$[0]+ "�Ƃ���";
					mes "���O���悭���ɂ���B";
					mes "���̐l�͏��˂�����悤���ˁB";
					close;
				}
			case 2:
				if($MalayaName$[1] != "" && $MalayaName$[1] != strcharinfo(0)) {
					mes "[�V�l�i���h]";
					mes "�ŋ߃o���I�E�}�q���K��";
					mes $MalayaName$[1]+ "�Ƃ���";
					mes "�`���҂̖��O�����ɂ���B";
					mes "�N������m�炵�߂Ă݂���ǂ����ˁB";
					close;
				}
			case 3:
				if($MalayaName$[2] != "" && $MalayaName$[2] != strcharinfo(0)) {
					mes "[�V�l�i���h]";
					mes "�J�v����m���Ă��邩�ˁB";
					mes $MalayaName$[2];
					mes "�Ƃ����`���҂��A";
					mes "�J�v������`���Ă���炵���B";
					close;
				}
			case 4:
				mes "[�V�l�i���h]";
				mes "���̖`���҂��������ꐶ����";
				mes "�z���Ă������B";
				mes "�N�����̍��̓`���Ȃ̂��ˁB";
				close;
			}
		}
		if(BaseLevel < 100) {
			mes "[�V�l�i���h]";
			mes "���ށc�c����A���̎�`��������ɂ�";
			mes "�������܂��C�Ƃ�����Ȃ��悤���B";
			mes "��������ȁB";
			mes "^FF0000BaseLv100�ȏ�^000000�ɂȂ�����";
			mes "���̎��ɂ��肢�����Ă��炨���]";
			close;
		}
		if(checkquest(7378)) {
			if(!(checkquest(7378) & 0x2)) {
				mes "[�V�l�i���h]";
				mes "�����͂���ł����[�����B";
				mes "�����A���̍�������";
				mes "���������͎����Ȃ��B";
				mes "�g�����ɂ���Ă͈���ŉ��邾�낤�B";
				next;
				mes "[�V�l�i���h]";
				mes "�\�Ȃ疾�������Ă���B";
				close;
			}
			mes "[�V�l�i���h]";
			mes "���傩�I";
			mes "�������B���C���B";
			next;
			mes "[�V�l�i���h]";
			mes "���݂�����񂶂Ⴊ�c�c";
			mes "�V�����S����A�܂��͂���";
			mes "�ق����񂶂�B";
			next;
			if(select("��`��","��`��Ȃ�") == 2) {
				mes "[�V�l�i���h]";
				mes "�������B���܂Ȃ������́B";
				mes "�ɂȎ��ɂł���`���Ă�����B";
				close;
			}
			mes "[�V�l�i���h]";
			mes "���̓S�ō�����炾�B�|�[�g�}������";
			mes "�b�艮�͘r����������ȁB";
			mes "������o���I�E�}�q���K�ɂ���";
			mes "�����o�L�E�L�R�ɓn���Ă����΂����B";
			mes "�����^FF0000�ޖ��̂����^000000�������͂����B";
			mes "��������̏��Ɏ����Ă��Ă�����B";
			if(checkitemblank() == 0) {
				next;
				mes "[�V�l�i���h]";
				mes "����H";
				mes "�A�C�e���������ς������߂���";
				mes "�悤����̂��c�c";
				mes "�A�C�e���𐮗�������܂�����Ƃ����B";
				close;
			}
			delquest 7378;
			setquest 7376;
			getitem 6504,5;
			close;
		}
		mes "[�V�l�i���h]";
		mes "�����A����͂��肪�����B";
		mes "���傤�ǒ������������Ƃ���ł̂��B";
		mes "������킢�B";
		next;
		mes "[�V�l�i���h]";
		mes "����Ɏ�`���Ăق����̂�";
		mes "�����ɂ���S�ō�������";
		mes "�o���I�E�}�q���K�ɂ���";
		mes "�����o�L�E�L�R�܂œ͂��Ăق����̂��B";
		next;
		switch(select("�S�ō������H","��`��","��`��Ȃ�")) {
		case 1:
			mes "[�V�l�i���h]";
			mes "�����B����̓o�R�i���̂������B";
			mes "�o���I�E�}�q���K�̓o�R�i���̏Z����";
			mes "�߂��ׁA�����댯�ɂ��炳��Ă���B";
			mes "���̃o�R�i���ɗL���Ȃ̂��A";
			mes "���̓S��Ȃ񂶂��B";
			next;
			mes "[�V�l�i���h]";
			mes "�o�R�i���͕q���ȈׁA���Ɏア�B";
			mes "���̓S����g���g���@����";
			mes "�o�R�i���̓r�b�N������";
			mes "���ݍ���ł�������f���o���񂶂�B";
			next;
			mes "[�V�l�i���h]";
			mes "�S��̓o���I�E�}�q���K�̏Z�l�ɂ�";
			mes "�������Ȃ��B";
			mes "���K�v�ɂȂ邩�킩��Ȃ�����ȁB";
			mes "����ɁA������b�艮��";
			mes "�o���I�E�}�q���K���|�[�g�}������";
			mes "�����D��Ă���̂��B";
			next;
			mes "[�V�l�i���h]";
			mes "�����炢������";
			mes "�����čs���Ă��̂��Ⴊ�A";
			mes "�ŋ߂͓�̒����������ĂȁB";
			mes "�^��ł����Ə�����킢�B";
			close;
		case 2:
			mes "[�V�l�i���h]";
			mes "���̓S�ō�����炾�B�|�[�g�}������";
			mes "�b�艮�͘r����������ȁB";
			mes "������o���I�E�}�q���K�ɂ���";
			mes "�����o�L�E�L�R�ɓn���Ă����΂����B";
			mes "�����^FF0000�ޖ��̂����^000000�������͂����B";
			mes "��������̏��Ɏ����Ă��Ă�����B";
			if(checkitemblank() == 0) {
				next;
				mes "[�V�l�i���h]";
				mes "����H";
				mes "�A�C�e���������ς������߂���";
				mes "�悤����̂��c�c";
				mes "�A�C�e���𐮗�������܂�����Ƃ����B";
				close;
			}
			delquest 72084;
			setquest 7376;
			getitem 6504,5;
			close;
		case 3:
			mes "[�V�l�i���h]";
			mes "�������B���܂Ȃ������́B";
			mes "�ɂȎ��ɂł���`���Ă�����B";
			close;
		}
	}
OnInit:
	waitingroom "�S��",0;
	end;
}

malaya.gat,228,267,3	script	���[����	573,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[���[����]";
		mes "�c�c";
		mes "�@";
		mes "�]�������ꂽ�]";
		close;
	case 2:
		if(checkquest(7357) & 0x8) {
			mes "[���[����]";
			mes "���A�������͏��";
			mes "�s���ɋ����Ȃ��琶���Ă��܂��c�c�B";
			mes "���̂܂܁A�S�̈�������";
			mes "���邱�Ƃ��ł��Ȃ��̂ł��傤���c�c�B";
			close;
		}
		mes "[���[����]";
		mes "���c�c";
		mes "���Ȃ����\�́c�c�B";
		next;
		mes "[���[����]";
		mes "������񂹕t���Ȃ��Ƃ������Ȃ���";
		mes "���������c�c";
		mes "��������Ɏ��Ă����Ȃ��̂�";
		mes "�ЂƂ��������܂��񂩁H";
		next;
		menu "�������͂�����Ɓc�c",-;
		mes "[���[����]";
		mes "�����ł���ˁc�c�B";
		mes "���炵�܂����B";
		mes "���Ȃ��̎������Ȃ炫����";
		mes "�����ނ��Ă���邾�낤��";
		mes "�v��������c�c�B";
		mes "���̎��͖Y��Ă��������B";
		setquest 7357;
		compquest 7357;
		viewpoint 2,1,1,1,0xFFFFFF;
		next;
		if( (
			checkquest(7352) + checkquest(7353) +
			checkquest(7354) + checkquest(7355) +
			checkquest(7356) + checkquest(7357)
		) == 48) {
			mes "�]���łɕ����̒��l����";
			mes "�@�����悤�Ȃ��肢������Ă���B";
			mes "�@�ǂ��������̂��낤���B";
			mes "�@��x�����o�L�E�|����";
			mes "�@���k���Ă݂悤�]";
			delquest 7352;
			delquest 7353;
			delquest 7354;
			delquest 7355;
			delquest 7356;
			delquest 7357;
			delquest 72050;
			setquest 7358;
			set MALAYA_1QUE,3;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			close;
		}
		mes "�]���������킯�Ăق����Ɨ��܂ꂽ�B";
		mes "�@���̒��l�ɂ��b�𕷂��Ă݂悤�]";
		close;
	case 3:
		mes "�]���[��������������";
		mes "�@�߂������Ȋ�����Ȃ���";
		mes "�@����������Ă���B";
		mes "�@�����o�L�E�|���ɑ��k�ɍs�����]";
		close;
	case 4:
		if(checkquest(7364) & 0x8) {
			mes "[���[����]";
			mes "�{���ɕK�v�Ȃ̂�";
			mes "�����S�������S�̈����ۂ��Ƃł��B";
			mes "���ꂪ�o����悤�ɂȂ��";
			mes "����Ƃ����X�ƌ���������Ǝv���܂��B";
			next;
			mes "[���[����]";
			mes "���͂����������ɗ����Ă��܂����A";
			mes "��������������ɂ���";
			mes "�����S�����Ă�悤�ɂȂ肽���ł��B";
			close;
		}
		if(countitem(523) < 1 || countitem(717) < 1) {
			mes "^4d4dff�]�u���[�W�F���X�g�[���Ɛ�����";
			mes "�@�n�����]^000000";
			close;
		}
		mes "[���[����]";
		mes "�c�c���Ȃ��ł����B";
		mes "���̗p�ł��H";
		next;
		menu "������������n��",-;
		mes "�]���[�����ɏ������Ă���������";
		mes "�@�u���[�W�F���X�g�[����";
		mes "�@1���n�����]";
		next;
		mes "[���[����]";
		mes "���c�c�����c�c�I";
		mes "���������!?";
		mes "���A���肪�Ƃ��������܂��B";
		mes "���Ȃ��̋C���������܂��B";
		mes "����ň�����|������܂���I";
		delitem 717,1;
		delitem 523,1;
		setquest 7364;
		compquest 7364;
		viewpoint 2,1,1,1,0xFFFFFF;
		if(checkquest(7363)&8 == 0) {
			next;
			mes "[���[����]";
			mes "���́c�c�����o���܂����Ƃ͎v���܂���";
			mes "���̖��ɂ�������";
			mes "���������Ȃ��ł��傤���H";
			close;
		}
		if( (
			checkquest(7359) + checkquest(7360) +
			checkquest(7361) + checkquest(7362) +
			checkquest(7363) + checkquest(7364)
		) == 48) {
			next;
			mes "�]���[�������Ō��";
			mes "�@�S�Ĕz��I�����悤���B";
			mes "�@�����o�L�E�|���֕񍐂ɖ߂낤�]";
			delquest 7359;
			delquest 7360;
			delquest 7361;
			delquest 7362;
			delquest 7363;
			delquest 7364;
			delquest 7351;
			setquest 7365;
			set MALAYA_1QUE,5;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
		}
		close;
	case 5:
		mes "[���[����]";
		mes "��������͑厖�ɂ��Ă��܂��B";
		mes "�����ˁB���肪�Ƃ��B";
		close;
	case 6:
		if(checkquest(7373) || checkquest(72182)) {
			mes "[���[����]";
			mes "����ɂ��́B";
			mes "�ǂ��V�C�ł��ˁB";
			next;
			mes "�]���[�����ɂ�����n�����]";
			next;
			mes "[���[����]";
			mes "�V���������ł��ˁB";
			mes "���肪�Ƃ��������܂��B";
			delitem 6503,1;
			if(checkquest(72182))
				delquest 72182;
			else
				delquest 7373;
			setquest 7387;
			viewpoint 2,1,1,1,0xFFFFFF;
			if( (
				(checkquest(7382)&1) + (checkquest(7383)&1) +
				(checkquest(7384)&1) + (checkquest(7385)&1) +
				(checkquest(7386)&1) + (checkquest(7387)&1)
			) == 6) {
				setquest 7379;
				delquest 7382;
				delquest 7383;
				delquest 7384;
				delquest 7385;
				delquest 7386;
				delquest 7387;
				if(MALAYA_2QUE == 3)
					set MALAYA_2QUE,4;
				next;
				mes "�]���ׂĂ̐l��^FF0000�ޖ��̂����^000000��n�����B";
				mes "�@�C�����_�[�̏��֖߂낤�]";
				viewpoint 2,1,1,0,0xFFFFFF;
				viewpoint 2,1,1,1,0xFFFFFF;
				viewpoint 2,1,1,2,0xFFFFFF;
				viewpoint 2,1,1,3,0xFFFFFF;
				viewpoint 2,1,1,4,0xFFFFFF;
				viewpoint 2,1,1,5,0xFFFFFF;
			}
			close;
		}
		switch(rand(1,4)) {
		case 1:
			if($MalayaName$[0] != "" && $MalayaName$[0] != strcharinfo(0)) {
				mes "[���[����]";
				mes "�ŋ߃E�H�A�����񂪎��̐Ȃ�";
				mes "��������" +$MalayaName$[0];
				mes "��������" +$MalayaName$[0];
				mes "�Ɛ����ς炢�Ȃ��狩��ł��܂����B";
				mes "���������ӂ���̊Ԃ�";
				mes "������������ł��傤���ˁB";
				close;
			}
		case 2:
			if($MalayaName$[1] != "" && $MalayaName$[1] != strcharinfo(0)) {
				mes "[���[����]";
				mes $MalayaName$[1]+ "����́A";
				mes "���̒��ň�Ԃ̐l�C�҂ł��B";
				mes "�ג��̃o���I�E�}�q���K�ł�";
				mes "�L���Ȃ�ł���B";
				close;
			}
		case 3:
			if($MalayaName$[2] != "" && $MalayaName$[2] != strcharinfo(0)) {
				mes "[���[����]";
				mes "���̍Ȃ����ܐQ����";
				mes $MalayaName$[2];
				mes "�Ƃ������O���Ă�ł����ł����A";
				mes "�N�Ȃ�ł��傤�c�c�B";
				close;
			}
		case 4:
			mes "[���[����]";
			mes "�ג��̃o���I�E�}�q���K�̐l������";
			mes "�{���ɗE�C������܂��B";
			mes "���͕|���ĐX�ɍs�����Ƃ��疳���Ȃ̂�";
			mes "�q���ł��畽�C�ŐX�ɗV�тɍs���܂��B";
			close;
		}
	}
}

malaya.gat,223,267,5	script	�^�����[	941,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[�^�����[]";
		mes "�����A���I";
		mes "�@";
		mes "�]���Ȃ��Ɩڂ������ƃr�b�N������";
		mes "�@���e�̌��ɉB��Ă��܂����]";
		close;
	case 2:
		if(checkquest(7356) & 0x8) {
			mes "[�^�����[]";
			mes "�^�����[�͍���";
			mes "����ɘA��čs����邩������܂���B";
			mes "�|���q���������^�����[��";
			mes "��ɗ��邩������Ȃ��̂ł��B";
			close;
		}
		mes "[�^�����[]";
		mes "�c�c�^�����[�c�c��c�c���́c�c";
		mes "�c�c���c�c��������";
		next;
		mes "[���[����]";
		mes "�������Ӌ����ĐQ��Ȃ��悤�Ȃ�ł��B";
		mes "���Ȃ��̎������̒���";
		mes "��������Ɏg�������Ȃ��̂������";
		mes "���������܂��񂩁H";
		next;
		mes "[���[����]";
		mes "���ł�������ł��B";
		mes "�����̑��肳������΁A";
		mes "���������鎖���Ȃ��Ȃ�Ǝv���̂ŁB";
		next;
		menu "�C�x�߂ɂ��Ȃ�܂����",-;
		mes "[���[����]";
		mes "����Ȃ��Ƃ͂Ȃ��ł���B";
		mes "����ɁA�Ⴆ�C�x�߂��Ƃ��Ă�";
		mes "�������S���Ă����Ηǂ���ł��B";
		mes "�ł������������͏o���Ȃ��ł��ˁB";
		mes "�C���ς������A�܂����Ă��������B";
		next;
		mes "[�^�����[]";
		mes "���́c�c�^�����[�͂����ő҂��Ă܂��B";
		mes "������A���́c�c���肢���܂��B";
		setquest 7356;
		compquest 7356;
		viewpoint 2,1,1,5,0xFFFFFF;
		next;
		if( (
			checkquest(7352) + checkquest(7353) +
			checkquest(7354) + checkquest(7355) +
			checkquest(7356) + checkquest(7357)
		) == 48) {
			mes "�]���łɕ����̒��l����";
			mes "�@�����悤�Ȃ��肢������Ă���B";
			mes "�@�ǂ��������̂��낤���B";
			mes "�@��x�����o�L�E�|����";
			mes "�@���k���Ă݂悤�]";
			delquest 7352;
			delquest 7353;
			delquest 7354;
			delquest 7355;
			delquest 7356;
			delquest 7357;
			delquest 72050;
			setquest 7358;
			set MALAYA_1QUE,3;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			close;
		}
		mes "�]���������킯�Ăق����Ɨ��܂ꂽ�B";
		mes "�@���̒��l�ɂ��b�𕷂��Ă݂悤�]";
		close;
	case 3:
		mes "�]�^�����[���D��S�ɖ������ڂ�";
		mes "�@������ƕ��e�����݂Ɍ��Ă���]";
		close;
	case 4:
		if(checkquest(7363) & 0x8) {
			if(checkquest(7364)&8 == 0) {
				mes "[�^�����[]";
				mes "�悭�킩��Ȃ�����";
				mes "���������������܂��B";
				mes "���́A��������ɂ��������̂�";
				mes "����܂��񂩁H";
				close;
			}
			mes "[�^�����[]";
			mes "�悭�킩��Ȃ�����";
			mes "���������������܂��B";
			mes "������������C�ɂȂ������A";
			mes "�^�����[�����C�ł��I";
			close;
		}
		if(countitem(523) < 1 || countitem(717) < 1) {
			mes "^4d4dff�]�u���[�W�F���X�g�[���Ɛ�����";
			mes "�@�n�����]^000000";
			close;
		}
		mes "[�^�����[]";
		mes "���c�c���A���Ă������ł����H";
		mes "���c�c����ɂ��́H";
		next;
		menu "������������n��",-;
		mes "�]�^�����[�ɏ�������������";
		mes "�@�u���[�W�F���X�g�[����";
		mes "�@1���n�����]";
		next;
		mes "[�^�����[]";
		mes "������΁c�c�I";
		mes "�킟�c�c���ꂢ�I";
		mes "���ꂩ��͂��̐΂�";
		mes "�^�����[������Ă�����ł����H";
		delitem 717,1;
		delitem 523,1;
		setquest 7363;
		compquest 7363;
		viewpoint 2,1,1,5,0xFFFFFF;
		if( (
			checkquest(7359) + checkquest(7360) +
			checkquest(7361) + checkquest(7362) +
			checkquest(7363) + checkquest(7364)
		) == 48) {
			next;
			mes "�]�^�����[���Ō�ɑS���ɔz��I�����B";
			mes "�@�����o�L�E�|���̌��ɖ߂낤�]";
			delquest 7359;
			delquest 7360;
			delquest 7361;
			delquest 7362;
			delquest 7363;
			delquest 7364;
			delquest 7351;
			setquest 7365;
			set MALAYA_1QUE,5;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
		}
		close;
	case 5:
		mes "[�^�����[]";
		mes "���������";
		mes "������΂������Ǝ����ĂȂ���";
		mes "�ƁA�����܂����B";
		mes "���������";
		mes "�������������ߊ��Ȃ��񂾂��āI";
		close;
	case 6:
		if(checkquest(7372) || checkquest(72180)) {
			mes "[�^�����[]";
			mes "���c�c����ɂ��́B";
			mes "�V���������ł����H";
			next;
			mes "�]�^�����[�ɐV����������n�����]";
			next;
			mes "[�^�����[]";
			mes "���肪�Ƃ��������܂��B";
			mes "�^�����[�͂��ꂪ�����";
			mes "��������Q���̂ł��B";
			mes "������������ł��܂��B";
			delitem 6503,1;
			if(checkquest(72180))
				delquest 72180;
			else
				delquest 7372;
			setquest 7386;
			viewpoint 2,1,1,5,0xFFFFFF;
			if( (
				(checkquest(7382)&1) + (checkquest(7383)&1) +
				(checkquest(7384)&1) + (checkquest(7385)&1) +
				(checkquest(7386)&1) + (checkquest(7387)&1)
			) == 6) {
				setquest 7379;
				delquest 7382;
				delquest 7383;
				delquest 7384;
				delquest 7385;
				delquest 7386;
				delquest 7387;
				if(MALAYA_2QUE == 3)
					set MALAYA_2QUE,4;
				next;
				mes "�]���ׂĂ̐l��^FF0000�ޖ��̂����^000000��n�����B";
				mes "�@�C�����_�[�̏��֖߂낤�]";
				viewpoint 2,1,1,0,0xFFFFFF;
				viewpoint 2,1,1,1,0xFFFFFF;
				viewpoint 2,1,1,2,0xFFFFFF;
				viewpoint 2,1,1,3,0xFFFFFF;
				viewpoint 2,1,1,4,0xFFFFFF;
				viewpoint 2,1,1,5,0xFFFFFF;
			}
			close;
		}
		mes "[�^�����[]";
		mes "���c�c����ɂ��́B";
		mes "���́c�c���������";
		mes "���c�c���肪�Ƃ��������܂��B";
		mes "��c�c�^�����[������";
		mes "����Ă���Ă��ł���ˁH";
		close;
	}
}

malaya.gat,62,274,0	script	�����ڂ�#mal01	557,{
	if(!checkquest(7366) && !checkquest(7380)) {
		mes "�]�C��������������ȈՑ��u��";
		mes "�@���ɖ��܂��Ă���]";
		close;
	}
	if(countitem(6501) >= 6) {
		mes "�]���͂����\���W�܂����]";
		close;
	}
	mes "�]�C��������������ȈՑ��u��";
	mes "�@�����ڂ݂ɐݒu����Ă���B";
	mes "�@�\�ʂɉ����ł܂��Ă���B";
	mes "�@�����W�߂悤�]";
	next;
	if(checkitemblank() == 0) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���E�����]";
		close;
	}
	progressbar 5;
	initnpctimer;
	hideonnpc strnpcinfo(0);
	getitem 6501,1;
	mes "�]�����W�߂đ܂ɂ߂��]";
	close;
OnTimer15000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	end;
}

malaya.gat,66,277,0	duplicate(�����ڂ�#mal01)	�����ڂ�#mal02	557
malaya.gat,70,282,0	duplicate(�����ڂ�#mal01)	�����ڂ�#mal03	557
malaya.gat,71,288,0	duplicate(�����ڂ�#mal01)	�����ڂ�#mal04	557
malaya.gat,75,291,0	duplicate(�����ڂ�#mal01)	�����ڂ�#mal05	557
malaya.gat,80,292,0	duplicate(�����ڂ�#mal01)	�����ڂ�#mal06	557

ma_fild01.gat,178,206,0	script	�����|#mal01	844,8,8,{
	if(!checkquest(7366) && !checkquest(7380)) {
		mes "�]�����Z�߂̍����F�������|������]";
		close;
	}
	if(countitem(6500) >= 6) {
		mes "�]������|�͂����\���W�܂����]";
		close;
	}
	mes "�]�S�̂������|������B";
	mes "�@���̒|����C�����_�[���~������";
	mes "�@������|��p�ӂł��������]";
	next;
	if(checkitemblank() == 0) {
		mes "�]�A�C�e���̎�ސ���������";
		mes "�@�����Ƃ��ł��Ȃ��B";
		mes "�@��ސ������炵�Ă���E�����]";
		close;
	}
	progressbar 3;
	initnpctimer;
	hideonnpc strnpcinfo(0);
	getitem 6500,1;
	mes "�]�K���Ȓ����ɐ؂萮���A";
	mes "�@������|����ɂ��ꂽ�]";
	close;
OnTouch:
	misceffect 362,strnpcinfo(0);
	end;
OnTimer30000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	misceffect 362,strnpcinfo(0);
	end;
}

ma_fild01.gat,225,186,0	duplicate(�����|#mal01)	�����|#mal02	844,8,8
ma_fild01.gat,230,244,0	duplicate(�����|#mal01)	�����|#mal03	844,8,8
ma_fild01.gat,174,238,0	duplicate(�����|#mal01)	�����|#mal04	844,8,8
ma_fild01.gat,180,273,0	duplicate(�����|#mal01)	�����|#mal05	844,8,8
ma_fild01.gat,179,145,0	duplicate(�����|#mal01)	�����|#mal06	844,8,8

//============================================================
// �W�F�W�F�����̗������N�G�X�gNPC
//------------------------------------------------------------
malaya.gat,295,171,3	script	���W�i���l�E�H�A��	582,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[�E�H�A��]";
		mes "���c�c�����c�c�����ɂ��c�c�B";
		mes "���̓��ɂ͂����Ƃ��O��";
		mes "�O���玝���ė����񂾂낤�I";
		mes "����ȊO�l������I";
		mes "�������ɍs���A�������ɍs���Ă���I";
		close;
	case 2:
		if(checkquest(7355) & 0x8) {
			mes "[�E�H�A��]";
			mes "�Ȃ��c�c��������Ȃ����H";
			mes "�������ЂƂ���������";
			mes "���̐S�͋~����񂾁B";
			mes "����Ȃɓ��������Ȃ����낤�B";
			close;
		}
		mes "[�E�H�A��]";
		mes "�����A�\�̐l����Ȃ����I";
		mes "�����d�����K�v�Ȃ�";
		mes "�������̒��Ō����Ă�邩��c�c";
		mes "������c�c���O�́A���́c�c";
		mes "���A���������ЂƂ���Ȃ����H";
		next;
		mes "[�E�H�A��]";
		mes "���O�������ǂ��������Ƃ���";
		mes "�\�͂��łɕ�������I";
		mes "����̋��|�Ők���Ă���";
		mes "���̎�����Ă���B";
		emotion 28;
		next;
		mes "[�E�H�A��]";
		mes "���O�̎������������ЂƂł�";
		mes "��������ɖႦ����A";
		mes "���̐k�������܂�C������񂾁B";
		mes "�Ȃ��c�c���ނ�B";
		next;
		menu "�������肵�Ă�������",-;
		mes "[�E�H�A��]";
		mes "����Ȃ��ƌ����Ă��c�c�B";
		mes "���ނ�c�c�k�����~�܂�Ȃ��񂾁B";
		mes "���O�������������������܂�";
		mes "�����ő҂��Ă邩�炳�c�c�B";
		setquest 7355;
		compquest 7355;
		viewpoint 2,1,1,2,0xFFFFFF;
		next;
		if( (
			checkquest(7352) + checkquest(7353) +
			checkquest(7354) + checkquest(7355) +
			checkquest(7356) + checkquest(7357)
		) == 48) {
			mes "�]���łɕ����̒��l����";
			mes "�@�����悤�Ȃ��肢������Ă���B";
			mes "�@�ǂ��������̂��낤���B";
			mes "�@��x�����o�L�E�|����";
			mes "�@���k���Ă݂悤�]";
			delquest 7352;
			delquest 7353;
			delquest 7354;
			delquest 7355;
			delquest 7356;
			delquest 7357;
			delquest 72050;
			setquest 7358;
			set MALAYA_1QUE,3;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			close;
		}
		mes "�]���������킯�Ăق����Ɨ��܂ꂽ�B";
		mes "�@���̒��l�ɂ��b�𕷂��Ă݂悤�]";
		close;
	case 3:
		mes "[�E�H�A��]";
		mes "�ӂ��c�c�ŋ߂͐����čs���̂�";
		mes "�ǂ����Ă���Ȃɐh���񂾁c�c�B";
		mes "����͉��̏o�Ă���";
		mes "���������ꂵ�߂�񂾁c�c�B";
		mes "�����̂ЂƂł������";
		mes "�~����̂ɁB";
		next;
		mes "[�E�H�A��]";
		mes "���O�̎���������g�p�̂����Ƃ���";
		mes "�ЂƂ���邾���ł����Ƃ����̂ɁI";
		mes "�Ȃ��A�l�������Ǝv���Ă��A";
		mes "���O�̂��́c�c�C���ł������񂾂�B";
		mes "����Ȃ����H�@���ށI";
		close;
	case 4:
		if(checkquest(7362) & 0x8) {
			mes "[�E�H�A��]";
			mes "�����A���̎���݂Ă����B";
			mes "��̐k�����O��萏����";
			mes "�悭�Ȃ��Ă���悤�ɂ݂��Ȃ����H";
			mes "�Ȃ�ƂȂ�����ȋC�����邪";
			mes "�����Ƃ����ɈႢ�Ȃ��B";
			mes "�������낤�H";
			close;
		}
		if(countitem(523) < 1 || countitem(717) < 1) {
			mes "^4d4dff�]�u���[�W�F���X�g�[���Ɛ�����";
			mes "�@�n�����]^000000";
			close;
		}
		mes "[�E�H�A��]";
		mes "��H";
		mes "�����A�������ЂƂ���Ȃ��A";
		mes "�P�`�Ȗ`���җl���B";
		mes "���̗p���H";
		next;
		menu "������������n��",-;
		mes "�]�E�H�A���ɏ�������������";
		mes "�@�u���[�W�F���X�g�[����";
		mes "�@1���n�����]";
		next;
		mes "[�E�H�A��]";
		mes "���A�����c�c�������I";
		mes "�f���炵���I";
		mes "�����A���������������Ƃ͏�k���B";
		mes "�Y��Ă���B�����Y��Ă���B";
		mes "���͂��O�͕K���߂��Ă��Ă����ƁA";
		mes "�����ƐM���đ҂��Ă����񂾂�B";
		next;
		mes "[�E�H�A��]";
		mes "���₟�A����������B";
		mes "����͂��O�̋C�̗͂̌����H";
		mes "�Ȃ�قǁB�ق��ف`�A�Ȃ�قǁB";
		mes "�m���ɗ������Ȃ��猵���Ȋ���������B";
		mes "���ꂳ������Α��v���ȁA�����ƁB";
		next;
		mes "[�E�H�A��]";
		mes "���₟�A���肪�Ƃ��I";
		mes "��ŊȒP�Ȏd���ł�����������A";
		mes "��ԍŏ��ɂ��O�ɗ��ނ��Ƃɂ����B";
		delitem 717,1;
		delitem 523,1;
		setquest 7362;
		compquest 7362;
		viewpoint 2,1,1,2,0xFFFFFF;
		if( (
			checkquest(7359) + checkquest(7360) +
			checkquest(7361) + checkquest(7362) +
			checkquest(7363) + checkquest(7364)
		) == 48) {
			next;
			mes "�]����ł��ׂĂ̒��l�ɔz��I�����B";
			mes "�@�����o�L�E�|���̌��ɖ߂낤�]";
			delquest 7359;
			delquest 7360;
			delquest 7361;
			delquest 7362;
			delquest 7363;
			delquest 7364;
			delquest 7351;
			setquest 7365;
			set MALAYA_1QUE,5;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
		}
		close;
	case 5:
		mes "[�E�H�A��]";
		mes "����[�A���O�̂������ň���ɂ�";
		mes "�ꂵ�߂��Ȃ��Ȃ������A";
		mes "���낻�뎖�ƍĊJ���邩�ȁ[�B";
		mes "���̎��͎d�����񂷂���";
		mes "�����`���Ă����I";
		mes "�͂͂͂͂́I";
		close;
	case 6:
		if(checkquest(7371) || checkquest(72178)) {
			mes "[�E�H�A��]";
			mes "�悤�A�ǂ������H�@�d���̍Ñ����H";
			next;
			mes "�]�E�H�A���ɂ�����n�����]";
			next;
			mes "[�E�H�A��]";
			mes "�������`�I�@�V��������肩�I";
			mes "�f���炵���B";
			mes "�i���Ɠ`���������邺�B���肪�Ƃ��I";
			mes "�C�����_�[���撣���Ă���悤���ȁB";
			mes "������񂨑O�ɂ����ӂ��Ă��邺�I";
			delitem 6503,1;
			if(checkquest(72178))
				delquest 72178;
			else
				delquest 7371;
			setquest 7385;
			viewpoint 2,1,1,2,0xFFFFFF;
			if( (
				(checkquest(7382)&1) + (checkquest(7383)&1) +
				(checkquest(7384)&1) + (checkquest(7385)&1) +
				(checkquest(7386)&1) + (checkquest(7387)&1)
			) == 6) {
				setquest 7379;
				delquest 7382;
				delquest 7383;
				delquest 7384;
				delquest 7385;
				delquest 7386;
				delquest 7387;
				if(MALAYA_2QUE == 3)
					set MALAYA_2QUE,4;
				next;
				mes "�]���ׂĂ̐l��^FF0000�ޖ��̂����^000000��n�����B";
				mes "�@�C�����_�[�̏��֖߂낤�]";
				viewpoint 2,1,1,0,0xFFFFFF;
				viewpoint 2,1,1,1,0xFFFFFF;
				viewpoint 2,1,1,2,0xFFFFFF;
				viewpoint 2,1,1,3,0xFFFFFF;
				viewpoint 2,1,1,4,0xFFFFFF;
				viewpoint 2,1,1,5,0xFFFFFF;
			}
			close;
		}
		if(checkquest(7391)) {
			if(countitem(6498) >= 5) {
				if(checkitemblank() == 0) {
					mes "[�E�H�A��]";
					mes "���`�H";
					mes "�������������ς��̂悤���ȁ[";
					mes "�����n���Ȃ�����A�ו���";
					mes "�������Ă���A�܂����Ă���B";
					close;
				}
				mes "[�E�H�A��]";
				mes "���A�W�߂Ă����ˁB";
				mes "���肪�Ƃ��I";
				mes "�W�F�W�F�[���s�[�͖����W�߂Ă��邩��";
				mes "�܂����������Ă����Ə������B";
				mes "����͂��炾�B";
				mes "�󂯎���Ă���B";
				delitem 6498,5;
				setquest 7392;
				delquest 7391;
				getitem 6497,1;
				if(checkre())
					getexp 50000,20000;
				else
					getexp 500000,200000;
				set $MalayaName$[1],strcharinfo(0);
				close;
			}
		}
		mes "[�E�H�A��]";
		mes "�����[�B���O���I";
		next;
		menu "�����d���͖�����",-;
		if(BaseLevel < 100) {
			mes "���͉��A���������Ď��W�i���l�Ȃ񂾁B";
			mes "�����|�[�g�}�����ł�";
			mes "�W�F�W�F�[���s�[�����W���Ă���񂾁B";
			mes "�d���Ƃ����̂͂��̌��Ȃ񂾂��c�c";
			next;
			mes "[�E�H�A��]";
			mes "���O�ɂ͂܂������������B ";
			mes "���̋ߕӂ͈ӊO�Ɗ댯������";
			mes "�������������Ȃ��Ă��炾�ȁI";
			mes "�������ȁB^FF0000BaseLv100�ȏ�^000000�ɂȂ�����";
			mes "�܂���`���ɗ��Ă����B";
			close;
		}
		if(checkquest(7391)) {
			mes "[�E�H�A��]";
			mes "��B�ǂ������H";
			mes "^FF0000�W�F�W�F�[���s�[5��^000000�����B";
			mes "���͓K�����።�邩��ȁB";
			mes "�W�܂�����܂����Ă���B";
			close;
		}
		if(checkquest(7392)) {
			if(!(checkquest(7392) & 0x2)) {
				mes "[�E�H�A��]";
				mes "���A�W�F�W�F�[���s�[���W�̌����H";
				mes "�����A�K�v�ȕ��͂��łɂ���񂾁B";
				mes "���܂�ȁI";
				mes "�����A�܂����Ă���B";
				close;
			}
			mes "[�E�H�A��]";
			mes "���B���������Ă��ꂽ���B";
			mes "�W�F�W�F�[���s�[�W�߂�";
			mes "��`���Ă����̂��H";
			next;
			if(select("�킩��܂���","���f�肵�܂�") == 2) {
				mes "[�E�H�A��]";
				mes "�������H�@�킩�����B";
				mes "���ł��d�����K�v�Ȃ痈�Ă���B";
				close;
			}
			mes "[�E�H�A��]";
			mes "������B���Ⴀ���ނ�I";
			mes "�W�F�W�F�[���s�[5���B";
			mes "�W�܂����玝���Ă��Ă���I";
			delquest 7392;
			setquest 7391;
			close;
		}
		mes "[�E�H�A��]";
		mes "���͉��͎��W�i���l�Ȃ񂾂�B";
		mes "�F��ȕ��Y����������Ă���񂾁B";
		mes "���H���̌��ޗ��ƂȂ邩��ˁB";
		mes "���\���v�͂���񂾂�B";
		next;
		mes "[�E�H�A��]";
		mes "�Ƃ����킯�ŐF�X�ƈ����Ă͂��邪�A";
		mes "�����|�[�g�}������";
		mes "�̂����̂Ƃ����΂�͂�A";
		mes "�W�F�W�F�����Ƃ��������X�^�[����";
		mes "����ł���W�F�W�F�[���s�[���ȁI";
		next;
		mes "[�E�H�A��]";
		mes "�Ƃ����킯�ł��肢�������̂�";
		mes "���̃W�F�W�F�[���s�[�W�߂��B";
		mes "^FF0000�W�F�W�F�[���s�[��5��^000000";
		mes "�W�߂ė��Ă���Ȃ����H";
		next;
		if(select("�킩��܂���","���f�肵�܂�") == 2) {
			mes "[�E�H�A��]";
			mes "�������B����Ȃ炵�傤���Ȃ��B";
			mes "��Ŏd�����K�v�ɂȂ�����";
			mes "���̎��ɂ܂����Ă���B";
			close;
		}
		delquest 72086;
		mes "[�E�H�A��]";
		mes "������B���Ⴀ���ނ�I";
		mes "�W�F�W�F�[���s�[5���B";
		mes "�W�܂����玝���Ă��Ă���I";
		setquest 7391;
		close;
	}
OnInit:
	waitingroom "�W�F�W�F�����̗�����",0;
	end;
}

//============================================================
// �p���h�C�̃V���o�[�u���C�h�N�G�X�gNPC
//------------------------------------------------------------
malaya.gat,119,217,3	script	���C�b�艮�p���h�C	538,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[�p���h�C]";
		mes "���Ⴀ�c�c�������I";
		mes "���O���Ă͈���̒��Ԃ��ȁI";
		mes "���c�c�������s��!!�@���������I";
		close;
	case 2:
		if(checkquest(7354) & 0x8) {
			mes "[�p���h�C]";
			mes "�搶�c�c�搶�c�c�I";
			mes "�l�������Ǝv���ĉ��Ƃ��Ȃ�܂��񂩁H";
			mes "�p���h�C�̎��Ȃ�ĕ����Ă����̂�";
			mes "��Ԃ��ƁA����ȕ���";
			mes "�v���Ă���̂ł����I";
			next;
			mes "[�p���h�C]";
			mes "�搶�c�c�B���肢���܂���B";
			mes "�������̂ЂƂ�ӂ���";
			mes "���ꂽ���Ă�������Ȃ��ł����I";
			mes "�搶�ɂ͎��]���܂�����c�c�B";
			close;
		}
		mes "[�p���h�C]";
		mes "���A�ǂ����I�@�����C�ł����H�@�搶�I";
		mes "�搶�̖����͂��łɍ����Ă��܂���B";
		mes "����łˁA�搶�B���́c�c";
		mes "�搶�ɂ������Ă���ł����؂�";
		mes "����1�����i�𒸂������̂ł����c�c";
		next;
		mes "[�p���h�C]";
		mes "���c�c�B�}�ɓ���ꂵ������";
		mes "�����܂���B�ւցB";
		mes "�搶����������ގ������Ƃ���";
		mes "�\�͍ŋ߂悭���Ŏ��ɂ��܂����A";
		mes "�p���h�C�͂���𕷂��O����A�搶��";
		mes "�f���炵���l���낤�Ǝv���Ă���ł��B";
		next;
		mes "[�p���h�C]";
		mes "�����B���q�̗ǂ����Ƃ������Ȃ��āH";
		mes "����A���₢�₢��I";
		mes "�p���h�C�͐搶�����ɗ���������";
		mes "�f���炵���l���Ǝv���Ă�����ł��I";
		mes "�ւցB";
		emotion 19;
		next;
		mes "[�p���h�C]";
		mes "����łł��ˁB";
		mes "�搶�̋C�����߂��Ă��镨��";
		mes "��������������΁A";
		mes "������|���Ȃ��Ȃ�Ǝv����ł���I";
		mes "�����炨�肢���܂���搶�I";
		next;
		menu "�C�Ȃ�č��߂Ă��܂����",-;
		mes "[�p���h�C]";
		mes "����ȁc�c�I";
		mes "�ǂ����Ă���ȉR������ł����I";
		mes "�搶�̓p���h�C������ɋ����Ă��Ă�";
		mes "���Ƃ��v��Ȃ��̂ł����I";
		mes "�搶�c�c�Ђǂ��ł��I";
		setquest 7354;
		compquest 7354;
		viewpoint 2,1,1,3,0xFFFFFF;
		next;
		if( (
			checkquest(7352) + checkquest(7353) +
			checkquest(7354) + checkquest(7355) +
			checkquest(7356) + checkquest(7357)
		) == 48) {
			mes "�]���łɕ����̒��l����";
			mes "�@�����悤�Ȃ��肢������Ă���B";
			mes "�@�ǂ��������̂��낤���B";
			mes "�@��x�����o�L�E�|����";
			mes "�@���k���Ă݂悤�]";
			delquest 7352;
			delquest 7353;
			delquest 7354;
			delquest 7355;
			delquest 7356;
			delquest 7357;
			delquest 72050;
			setquest 7358;
			set MALAYA_1QUE,3;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			close;
		}
		mes "�]���������킯�Ăق����Ɨ��܂ꂽ�B";
		mes "�@���̒��l�ɂ��b�𕷂��Ă݂悤�]";
		close;
	case 3:
		mes "[�p���h�C]";
		mes "�͂��c�c�{���c�c�͂��B";
		mes "�ŋ߂͈���̂����ŁA";
		mes "�F�X�炢�ł���B";
		mes "�ǂ����Ă����猻���񂾂낤�B";
		next;
		mes "[�p���h�C]";
		mes "�搶�c�c�I";
		mes "�l�������Ǝv���ĉ��Ƃ��Ȃ�܂��񂩁H";
		mes "�p���h�C�̎��Ȃ�ĕ����Ă����̂�";
		mes "��Ԃ��ƁA����ȕ���";
		mes "�v���Ă���̂ł����I";
		mes "�搶�ɂ͎��]���܂�����c�c�B";
		close;
	case 4:
		if(checkquest(7361) & 0x8) {
			mes "[�p���h�C]";
			mes "�����A�搶�̂������ŗE�C���o�����A";
			mes "��͋␻�i�̍ޗ���p�ӂ���";
			mes "�a�@�⒬�̊O�ɂ����������ȁI";
			mes "�s���������ȁc�c�����c�c�B";
			mes "����ς�a�@�͕|���c�c�B";
			close;
		}
		if(countitem(523) < 1 || countitem(717) < 1) {
			mes "^4d4dff�]�u���[�W�F���X�g�[���Ɛ�����";
			mes "�@�n�����]^000000";
			close;
		}
		mes "[�p���h�C]";
		mes "���c�c�搶�I";
		mes "�߂��Ă��Ă��ꂽ�Ƃ�������";
		mes "���҂��Ă�����ł���!?";
		mes "�p���h�C�ɕ�����^���Ă����ƁI";
		next;
		menu "������������n��",-;
		mes "�]�p���h�C�ɏ�������������";
		mes "�@�u���[�W�F���X�g�[����";
		mes "�@1���n�����]";
		next;
		mes "[�p���h�C]";
		mes "�����I�@���A�����!!";
		mes "�p���h�C�͍ŏ�����搶��";
		mes "�K���߂��Ă���ƐM���Ă��܂����I";
		mes "�����[�I�@�搶�̋C�������܂��I";
		mes "����ň���ɋ������ɍς݂܂��B";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		delitem 717,1;
		delitem 523,1;
		setquest 7361;
		compquest 7361;
		viewpoint 2,1,1,3,0xFFFFFF;
		if( (
			checkquest(7359) + checkquest(7360) +
			checkquest(7361) + checkquest(7362) +
			checkquest(7363) + checkquest(7364)
		) == 48) {
			next;
			mes "�]����őS���ɔz��I�����B";
			mes "�@�����o�L�E�|���̂��Ƃɖ߂낤�]";
			delquest 7359;
			delquest 7360;
			delquest 7361;
			delquest 7362;
			delquest 7363;
			delquest 7364;
			delquest 7351;
			setquest 7365;
			set MALAYA_1QUE,5;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
		}
		close;
	case 5:
		mes "[�p���h�C]";
		mes "�搶�I�@�₪�K�v�Ȃ�ł���B";
		mes "�p���h�C�ɂ͖��������ł��I�@�ւցB";
		mes "����̋��|����蕥������";
		mes "��Ȃ�Ă����̂��c�c�B";
		mes "�����v���Ă����̂ɁA";
		mes "����ς胂���X�^�[���|���Ȃ��c�c�B";
		close;
	case 6:
		if(checkquest(7370) || checkquest(72176)) {
			mes "[�p���h�C]";
			mes "�����A�搶�I�@����͂���������";
			mes "�C�����_�[���񂪍�����Ƃ���";
			mes "�V���������ł����I";
			mes "������p���h�C�ɁH";
			next;
			mes "�]�p���h�C�ɂ�����n�����]";
			next;
			mes "[�p���h�C]";
			mes "�������搶�I�@���肪�Ƃ��������܂��I";
			mes "����Ńp���h�C�̕����͕ۂ���܂����I";
			delitem 6503,1;
			if(checkquest(72176))
				delquest 72176;
			else
				delquest 7370;
			setquest 7384;
			viewpoint 2,1,1,3,0xFFFFFF;
			if( (
				(checkquest(7382)&1) + (checkquest(7383)&1) +
				(checkquest(7384)&1) + (checkquest(7385)&1) +
				(checkquest(7386)&1) + (checkquest(7387)&1)
			) == 6) {
				setquest 7379;
				delquest 7382;
				delquest 7383;
				delquest 7384;
				delquest 7385;
				delquest 7386;
				delquest 7387;
				if(MALAYA_2QUE == 3)
					set MALAYA_2QUE,4;
				next;
				mes "�]���ׂĂ̐l��^FF0000�ޖ��̂����^000000��n�����B";
				mes "�@�C�����_�[�̏��֖߂낤�]";
				viewpoint 2,1,1,0,0xFFFFFF;
				viewpoint 2,1,1,1,0xFFFFFF;
				viewpoint 2,1,1,2,0xFFFFFF;
				viewpoint 2,1,1,3,0xFFFFFF;
				viewpoint 2,1,1,4,0xFFFFFF;
				viewpoint 2,1,1,5,0xFFFFFF;
			}
			close;
		}
		if((checkquest(7393) & 0x4) && countitem(6508) >= 10) {
			mes "[�p���h�C]";
			mes "�搶�c�c�������ł��I";
			mes "���̋��낵���z���|����";
			mes "�����ʂ�A��̃u���X���b�g��";
			mes "��ɓ���Ă��Ă���܂����ˁB";
			next;
			mes "[�p���h�C]";
			mes "��������V�����␻�̕���쐬��";
			mes "���킵�Ă݂悤�Ǝv���܂�!!";
			mes "���܂ň�x���������ĂȂ��̂�";
			mes "���x�����킷�鎖�ɂȂ�Ǝv�����ǁc�c";
			mes "�Ō�ɂ͉ؗ�ȋ�F�̌���";
			mes "�����ł���悤�Ɋ撣��܂��c�c!!";
			next;
			if(checkitemblank() == 0) {
				mes "[�p���h�C]";
				mes "����H";
				mes "�搶�A�A�C�e���������ς�";
				mes "�����߂��ŁA�����n���܂���I";
				mes "�A�C�e���𐮗����Ă���A";
				mes "������x���Ă��������I";
				close;
			}
			mes "[�p���h�C]";
			mes "�����搶�A����͂���ł��B";
			mes "�����A����̍쐬�Ɏ��s�������́c�c";
			mes "�܂��ޗ��̓�������肢���܂��I";
			delitem 6508,10;
			setquest 7394;
			delquest 7393;
			getitem 6497,1;
			if(checkre())
				getexp 50000,20000;
			else
				getexp 500000,200000;
			set $MalayaName$[1],strcharinfo(0);
			close;
		}
		switch(rand(1,4)) {
		case 1:
			if($MalayaName$[5] != "" && $MalayaName$[5] != strcharinfo(0)) {
				mes "[�p���h�C]";
				mes $MalayaName$[5]+ "�搶��";
				mes "�ƂĂ��ƂĂ��傫�Ȕ�����";
				mes "�����炵���ł���B";
				mes "�Ȃ�ł������ǂ��Ƃ��c�c";
				break;
			}
		case 2:
			if($MalayaName$[2] != "" && $MalayaName$[2] != strcharinfo(0)) {
				mes "[�p���h�C]";
				mes "��������搶�̒��ŁA";
				mes $MalayaName$[2]+ "�搶�ȏ��";
				mes "�����҂͌������Ƃ�����܂���B";
				mes "���̕��͘J���̐_�l�ł��I";
				break;
			}
		case 3:
			if($MalayaName$[2] != "" && $MalayaName$[2] != strcharinfo(0)) {
				mes "[�p���h�C]";
				mes "���̋߂���";
				mes $MalayaName$[2]+ "�搶��";
				mes "�W�F�W�F������ގ�����p��";
				mes "�������Ƃ������ł����A";
				mes "���̔��͂́c�c";
				mes "�فc�c����Ă��܂������ł��I";
				break;
			}
		case 4:
			mes "[�p���h�C]";
			mes "�p���h�C�͂ł��ˁA";
			mes "�搶�̂悤�ɂȂ肽����ł��B";
			mes "�搶�̋����ɂ͖{���ɓ���܂��I";
			break;
		}
		next;
		switch(select("������`������","��̏\���˂�����Ăق���")) {
		case 1:
			if(BaseLevel < 100) {
				mes "[�p���h�C]";
				mes "�搶�I�@�p���h�C�ɂ͖��������ł��I";
				mes "�ւցc�c�B";
				mes "��l�O�̒b��E�l�Ƃ��ĔF�߂���ׁA";
				mes "�␻�̌�����肽����ł��I";
				mes "���ׂ̈ɕK�v�ȍޗ��̓����";
				mes "���肢�����������̂ł����c�c";
				next;
				mes "[�p���h�C]";
				mes "��ϐ\���グ�ɂ�����ł����A";
				mes "�搶�̎��͂ł͂�����Ɩ����ł��B";
				mes "�����ł��ˁA��̓I�ɂ�";
				mes "^FF0000BaseLv100�ȏ�^000000�ɂȂ�����";
				mes "���̎��ɂł����肢���܂��B";
				close;
			}
			if(checkquest(7393)) {
				if(!(checkquest(7393) & 0x4)) {
					mes "[�p���h�C]";
					mes "�a�@�ɂ͂ƂĂ����낵���z�炪���܂��B";
					mes "�p���h�C�͋߂Â��Ȃ��̂�";
					mes "�ڂ������͂悭������܂��񂪁c�c�B";
					mes "�Ƃɂ����a�@�͕|����ł��B";
					next;
					mes "[�p���h�C]";
					mes "�a�@�ɂ���^FF0000�}�i�i���K���ƃ`���i�b�N��";
					mes "10�̂���^000000�|���āA";
					mes "�ނ炪�����Ă���Ƃ���";
					mes "^FF0000��̃u���X���b�g��10��^000000";
					mes "��ɓ���Ă��ĉ������I";
					mes "�����̂͐搶�����ł��I";
					close;
				}
				if(countitem(6508) < 10) {
					mes "[�p���h�C]";
					mes "��̃u���X���b�g�͂ǂ����܂����H";
					mes "�搶�A�u���X���b�g��10�K�v�ł��B";
					mes "���肢���܂��I�@�ւցB";
					close;
				}
				mes "[�p���h�C]";
				mes "�搶�c�c�������ł��I";
				mes "���̋��낵���z���|����";
				mes "�����ʂ�A��̃u���X���b�g��";
				mes "��ɓ���Ă��Ă���܂����ˁB";
				next;
				mes "[�p���h�C]";
				mes "��������V�����␻�̕���쐬��";
				mes "���킵�Ă݂悤�Ǝv���܂�!!";
				mes "���܂ň�x���������ĂȂ��̂�";
				mes "���x�����킷�鎖�ɂȂ�Ǝv�����ǁc�c";
				mes "�Ō�ɂ͉ؗ�ȋ�F�̌���";
				mes "�����ł���悤�Ɋ撣��܂��c�c!!";
				next;
				if(checkitemblank() == 0) {
					mes "[�p���h�C]";
					mes "����H";
					mes "�搶�A�A�C�e���������ς�";
					mes "�����߂��ŁA�����n���܂���I";
					mes "�A�C�e���𐮗����Ă���A";
					mes "������x���Ă��������I";
					close;
				}
				mes "[�p���h�C]";
				mes "�����搶�A����͂���ł��B";
				mes "�����A����̍쐬�Ɏ��s�������́c�c";
				mes "�܂��ޗ��̓�������肢���܂��I";
				delitem 6508,10;
				setquest 7394;
				delquest 7393;
				getitem 6497,1;
				if(checkre())
					getexp 50000,20000;
				else
					getexp 500000,200000;
				close;
			}
			if(checkquest(7394)) {
				if(!(checkquest(7394) & 0x2)) {
					mes "[�p���h�C]";
					mes "�܂���͂����ς��c���Ă��܂��B";
					mes "�����A���������s����";
					mes "�ޗ������ׂĎg���؂��Ă��܂�����";
					mes "���̎��͂܂��ޗ��W�߂����肢���܂��B";
					next;
					mes "[�p���h�C]";
					mes "�ւցB�搶�I�@���ĂĂ��������ˁB";
					mes "����Ă��܂���!!";
					mes "�V���o�[�u���C�h����";
					mes "����Č����܂���I";
					close;
				}
				mes "[�p���h�C]";
				mes "���c�c���A�搶�B";
				mes "�p���h�C�͂ǂ������炢���ł��傤�H";
				mes "�搶����J���ďW�߂Ă��ꂽ�ޗ���";
				mes "���ׂĎg���؂����������c�c";
				mes "�낭�Ȑ��ʂ�����܂���ł����c�c�B";
				next;
				mes "[�p���h�C]";
				mes "��͂�p���h�C�͒b�艮�ɂ�";
				mes "�����ĂȂ���ł��傤���c�c�B";
				mes "��׍H�Ȃ玩�M������̂ɁI";
				next;
				if(select("�܂��ޗ����W�߂Ă����","���߂�Ɗy�ɂȂ��") == 2) {
					mes "[�p���h�C]";
					mes "�m���ɂ����ł��ˁB";
					mes "�p���h�C�ɃV���o�[�u���C�h�Ȃ��";
					mes "����킯���Ȃ�������ł��B";
					mes "�������搶�c�c����H";
					mes "�Ⴂ�܂���I";
					mes "���͐搶�ɏ������]���܂����c�c�B";
					close;
				}
				mes "[�p���h�C]";
				mes "�������搶�ł�!!";
				mes "�������肪�Ƃ��������܂��B";
				next;
				mes "[�p���h�C]";
				mes "�ł́A������a�@�ɂ���";
				mes "^FF0000�}�i�i���K���ƃ`���i�b�N��";
				mes "10�̂���^000000�|���āA";
				mes "^FF0000��̃u���X���b�g10��^000000";
				mes "�W�߂Ă��������B���肢���܂��B";
				delquest 7394;
				setquest 7393;
				next;
				mes "[�p���h�C]";
				mes "�p���h�C�͂����b�ɂȂ���ςȂ��ł��B";
				mes "�搶�ɑ��������ĐQ��܂����I";
				mes "�ւււ��B";
				close;
			}
			mes "[�p���h�C]";
			mes "�搶�I�@�p���h�C�ɂ͖��������ł��I";
			mes "��l�O�̒b��E�l�Ƃ��ĔF�߂����";
			mes "�␻�̌�����肽����ł��I";
			mes "���̖����V���o�[�u���C�h�I";
			mes "���̏����O�ȊO�A�`�����\��";
			mes "�������܂��Ă��܂���I�@�ւցB";
			next;
			mes "[�p���h�C]";
			mes "����łł��ˁA�搶�B";
			mes "���̃V���o�[�u���C�h�����ɂ�";
			mes "���͋₪�K�v�Ȃ�ł��B";
			mes "�������������I";
			next;
			mes "[�p���h�C]";
			mes "�����肷��ɂ͂ǂ������炢����";
			mes "�p���h�C�͐F�X���ׂĂ݂܂����B";
			mes "����ɂ��Ƃǂ������̕a�@��";
			mes "���@���җp�Ɏg�p����Ă���";
			mes "�u���X���b�g���␻�����������ł��B";
			next;
			mes "[�p���h�C]";
			mes "�a�@�͍��͂���������Ă��܂����A";
			mes "�����g���Ă����p��ł����";
			mes "�����͎c���Ă��邾�낤�Ǝv����";
			mes "�p���h�C�͕a�@�Ɍ������Ă݂܂����B";
			next;
			mes "[�p���h�C]";
			mes "�Ƃ��낪�ł���c�c�I";
			mes "���͂Ђǂ��L�l�ł����B";
			mes "�a�@�Ƃ������́A";
			mes "���҂𑝂₷�{�݂̂悤�ȁc�c�B";
			mes "�������񃂃��X�^�[�����āA";
			mes "���낵�����ɂȂ��Ă��̂ł��B";
			next;
			mes "[�p���h�C]";
			mes "��̃u���X���b�g��";
			mes "�����ɂ��������X�^�[��";
			mes "�����Ă���݂����ł��B";
			mes "�ł��p���h�C�ɂ̓����X�^�[��|����";
			mes "�u���X���b�g����ɓ����Ȃ��";
			mes "�ƂĂ��ł��܂���B";
			next;
			mes "[�p���h�C]";
			mes "�����Ő搶�ɂ��肢��������ł��B";
			mes "�搶�Ȃ炻�����|���āA";
			mes "��̃u���X���b�g��";
			mes "��ɓ���Ă���܂���ˁH";
			next;
			if(select("�܂�����","�ʓ|�Ȃ̂ŁA���f�肵�܂�") == 2) {
				mes "[�p���h�C]";
				mes "�ł���ˁc�c����������ł���ˁB";
				mes "���Ƃ��������Ă����Ƃ��Ă�";
				mes "�p���h�C�ɃV���o�[�u���C�h�Ȃ��";
				mes "����킯���Ȃ��ł�����ˁc�c�B";
				mes "�ł��A���������܂ŘI����";
				mes "������Ȃ��Ă��c�c�B";
				close;
			}
			mes "[�p���h�C]";
			mes "����ς�A�������搶�ł��ˁI";
			mes "�ł͕a�@�ɂ���";
			mes "^FF0000�}�i�i���K���ƃ`���i�b�N��";
			mes "10�̂���^000000�|���āA";
			mes "^FF0000��̃u���X���b�g10��^000000��";
			mes "�W�߂Ă��Ă��������I";
			delquest 72088;
			setquest 7393;
			next;
			mes "[�p���h�C]";
			mes "�搶�ɂ͓���������܂���I";
			mes "�ււցB���肢���܂�!";
			emotion 15;
			close;
		case 2:
			mes "[�p���h�C]";
			mes "��̏\���˂��K�v�ł����H�@�搶�I";
			mes "�C���Ă��������I";
			mes "���̃p���h�C������č����グ�܂��B";
			mes "��׍H�͓��ӂȂ�ł���I�@�ւցB";
			next;
			mes "[�p���h�C]";
			mes "�����ƁI�@���̑O�ɁI";
			mes "��̏\���˂͈ꕔ�n��ł�";
			mes "����ގ��Ɏg����ȂǁA";
			mes "�_���ȕ��Ƃ��Ď�舵���Ă��܂��B";
			mes "���̂��߁A^FF0000���̐l�ɓn������A";
			mes "�̂Ă��肷�邱�Ƃ��ł��܂���B^000000";
			next;
			mes "[�p���h�C]";
			mes "�K�v�ȏ�Ɏ����߂��āA�ǂ����Ă�";
			mes "����������ꍇ�ɂ́A���X�Ɉ��������";
			mes "����Ă��������ˁB";
			mes "���\�Ɉ����ăo�`��������̂�";
			mes "�������̐搶�ł����ł��傤�H�@�ւցB";
			next;
			mes "[�p���h�C]";
			mes "���āI�@��̏\���˂����ɂ́A";
			mes "�ޗ��Ƃ��ċ₪�K�v�ł��B";
			mes "�a�@�̃����X�^�[�B�������Ă���";
			mes "^4d4dff��̃u���X���b�g2��^000000��";
			mes "��̏\����1���̍ޗ��ɂȂ�܂��B";
			mes "�������܂����搶�H";
			next;
			switch(select("��̏\���ˁ@1��","��̏\���ˁ@6��","�����w�肷��","��߂�")) {
			case 1:
				set '@num,1;
				mes "[�p���h�C]";
				mes "��̏\���ˁA1�ł��ˁB";
				mes "�킩��܂����I�@�����҂��ĉ������B";
				mes "�����ɍ�ƂɂƂ肩����܂��B";
				break;
			case 2:
				set '@num,6;
				mes "[�p���h�C]";
				mes "���A�搶����������";
				mes "�C�����_�[����̂���`���ł����H";
				mes "��̏\���ˁA6�ł��ˁB";
				mes "�킩��܂����I�@�����҂��ĉ������B";
				break;
			case 3:
				mes "[�p���h�C]";
				mes "�킩��܂����搶�I";
				mes "�p���h�C����x�ɍ���̂�";
				mes "�ő�50�܂łł��I";
				mes "��̏\���˂������܂����H";
				next;
				input '@num;
				if('@num <= 0) {
					mes "[�p���h�C]";
					mes "����H�@��̏\���˂���Ȃ��ł����H";
					mes "���Ȃ��Ă����Ȃ�y�ł���̂�";
					mes "���Ȃ��ł��搶�I�@�ւցI";
					close;
				}
				if('@num > 50) {
					mes "[�p���h�C]";
					mes "��x�ɍ���̂�50�܂łł��搶�I";
					close;
				}
				if(countitem(6508) < '@num*2) {
					mes "[�p���h�C]";
					mes "�搶�B�₪�����ƍ��܂���B";
					mes "��̏\���˂�" +'@num+ "��邽�߂ɂ�";
					mes "��̃u���X���b�g��" +('@num*2)+ "��";
					mes "�K�v�ł��B";
					close;
				}
				mes "[�p���h�C]";
				mes "��̏\����" +'@num+ "�ł��ˁB";
				mes "�킩��܂����I�@�����҂��ĉ������B";
				next;
				progressbar 15;
				delitem 6508,'@num*2;
				getitem 6502,'@num;
				mes "[�p���h�C]";
				mes "��������ĉ������A�搶�I";
				mes "�f���炵���o���オ��ł��B";
				mes "����ς�p���h�C�ɂ�";
				mes "�׍H�t�̕��������Ă���̂��ȁB";
				close;
			case 4:
				mes "[�p���h�C]";
				mes "���ł��K�v�Ȏ��ɖK�˂ĉ������I";
				close;
			}
			if(countitem(6508) < '@num*2) {
				mes "[�p���h�C]";
				mes "�搶�B�₪�����ƍ��܂���B";
				mes "��̏\���˂�" +'@num+ "��邽�߂ɂ�";
				mes "��̃u���X���b�g��" +('@num*2)+ "��";
				mes "�K�v�ł��B";
				close;
			}
			next;
			progressbar 5;
			delitem 6508,'@num*2;
			getitem 6502,'@num;
			mes "[�p���h�C]";
			mes "��������ĉ������A�搶�I";
			mes "�f���炵���o���オ��ł��B";
			mes "����ς�p���h�C�ɂ�";
			mes "�׍H�t�̕��������Ă���̂��ȁB";
			close;
		}
	}
OnInit:
	waitingroom "�p���h�C�̃V���o�[�u���C�h",0;
	end;
}

//============================================================
// �y���[���̃S�[�X�g�N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_3QUE -> 0�`6
//------------------------------------------------------------
malaya.gat,326,68,2	script	�D���y�h��	100,{
	switch(MALAYA_1QUE) {
	case 0:
	case 1:
		mes "[�y�h��]";
		mes "���c�c���̑D�͉^�s���Ă��܂���B";
		mes "����A�͂́c�c�B";
		mes "�^�s�������Ă��A�ł��Ȃ���ł���B";
		close;
	case 2:
		mes "[�y�h��]";
		mes "����A���Ȃ��́c�c";
		mes "���������Ă��邾����";
		mes "���삽���������čs���Ƃ���";
		mes "���ŉ\�̖`���Ƃł���!?";
		mes "������Ǝ��̘b�𕷂��Ă���܂����H";
		next;
		if(select("����ł�","�킩��܂���") == 1) {
			mes "[�y�h��]";
			mes "�����A�f�ł��鋑��B";
			mes "�I�R���闧�����U�镑������������";
			mes "�h�邬�����ӎu�B";
			mes "�������ƌ��킴��𓾂܂��񂪁A";
			mes "�Ȃ�Ƃ������Ă��炦�܂��񂩁c�c�B";
			close;
		}
		mes "[�y�h��]";
		mes "�����A���肪�Ƃ��������܂��B";
		mes "���́A�P�������ɘb���܂���";
		mes "���̒��͍��A����̏Z�݉Ƃ�";
		mes "�Ȃ��Ă��܂��Ă���悤�ȏ󋵂ł��B";
		next;
		mes "[�y�h��]";
		mes "�������ɂ���D�A�����܂����H";
		mes "�����������D�ł����A";
		mes "���������̂����ő��~�߂����";
		mes "���݂͉^�s���~���Ă��܂��B";
		next;
		mes "[�y�h��]";
		mes "�ꌩ���ʂ̒��Ɍ����܂����A";
		mes "�F�X�Ǝ���Ă��܂��c�c�B";
		mes "�����A�����Ƃ���ɂ���";
		mes "�����ǂ������͂����������Ƃ��c�c";
		mes "�������ł��ˁB";
		next;
		menu "����قǂł��Ȃ�",-;
		mes "[�y�h��]";
		mes "����Ȃ������Ȃ���Ȃ��ł��������B";
		mes "���Ȃ��̏����i����������ɂ����";
		mes "����ɂ��΍R�ł���ƍl���Ă��܂��B";
		mes "���肢���܂��B";
		mes "�����ЂƂ����i�����������܂��񂩁H";
		next;
		mes "[�y�h��]";
		mes "�D���o���Ȃ����ɂ͎d���ɂȂ�܂���B";
		mes "�Ȃ̂ŁA���͂������ɂ��鈫�삽����";
		mes "�Λ����Ȃ���΂Ȃ�Ȃ��̂ł��B";
		mes "�������A����B�̋C�̗͂���������";
		mes "�Ȃ��Ȃ��߂��ɍs�����Ƃ��ł��܂���B";
		next;
		mes "[�y�h��]";
		mes "�����A�b�������Ȃ��Ă��܂���";
		mes "���݂܂���ł����B";
		mes "�܂��A�}�ɒm��Ȃ��l��";
		mes "�����i������Ƃ����Ă�";
		mes "�Ȃ��Ȃ�����ł���ˁB";
		next;
		menu "���߂�Ȃ���",-;
		mes "[�y�h��]";
		mes "�����A�C�ɂ��Ȃ��ł��������B";
		mes "���̂����A����ɑ΍R�ł�������";
		mes "���@���݂��������ɂ́A";
		mes "���ɂ������Ă��������ˁB";
		if(!checkquest(7352)) {
			setquest 7352;
			compquest 7352;
		}
		viewpoint 2,1,1,4,0xFFFFFF;
		next;
		if( (
			checkquest(7352) + checkquest(7353) +
			checkquest(7354) + checkquest(7355) +
			checkquest(7356) + checkquest(7357)
		) == 48) {
			mes "�]���łɕ����̒��l����";
			mes "�@�����悤�Ȃ��肢������Ă���B";
			mes "�@�ǂ��������̂��낤���B";
			mes "�@��x�����o�L�E�|����";
			mes "�@���k���Ă݂悤�]";
			delquest 7352;
			delquest 7353;
			delquest 7354;
			delquest 7355;
			delquest 7356;
			delquest 7357;
			delquest 72050;
			setquest 7358;
			set MALAYA_1QUE,3;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
			close;
		}
		mes "�]���������킯�Ăق����Ɨ��܂ꂽ�B";
		mes "�@���̒��l�ɂ��b�𕷂��Ă݂悤�]";
		close;
	case 3:
		mes "[�y�h��]";
		mes "�͂��B";
		mes "�����Ȃ�Ƃ����Ȃ��Ɓc�c�B";
		close;
	case 4:
		if(checkquest(7359) & 0x8) {
			mes "[�y�h��]";
			mes "�������l�Ńy���[���ɋ�����";
			mes "����ƑΛ����邱�Ƃ��o�������ł��B";
			mes "��́A�ǂ��ɂ��D�̒�����";
			mes "�ǂ��o�����Ƃ��ł���΁c�c�I";
			close;
		}
		if(countitem(523) < 1 || countitem(717) < 1) {
			mes "^4d4dff�]�u���[�W�F���X�g�[���Ɛ�����";
			mes "�@�n�����]^000000";
			close;
		}
		mes "[�y�h��]";
		mes "����A�ǂ����܂����H";
		mes "�����C�������܂����ǁA";
		mes "���������Ă���́c�c�B";
		next;
		mes "[�y�h��]";
		mes "�����A��͂肨���ł����I";
		mes "���ɂ����������ł���?!";
		mes "�{���ɂ��肪�Ƃ��������܂��I";
		next;
		mes "�]�y�h���ɏ�������������";
		mes "�@�u���[�W�F���X�g�[����";
		mes "�@1���n�����]";
		next;
		mes "[�y�h��]";
		mes "�`���җl�I�@���ӂ��Ă��܂��I";
		mes "����̖�肪����������A";
		mes "���̑D�Ő��E�̉ʂĂ܂�";
		mes "�����č����グ�܂�!!";
		delitem 717,1;
		delitem 523,1;
		setquest 7359;
		compquest 7359;
		viewpoint 2,1,1,4,0xFFFFFF;
		if( (
			checkquest(7359) + checkquest(7360) +
			checkquest(7361) + checkquest(7362) +
			checkquest(7363) + checkquest(7364)
		) == 48) {
			next;
			mes "�]����ł��ׂĂ̒��l�ɔz��I�����B";
			mes "�@�����o�L�E�|���̌��ɖ߂낤�]";
			delquest 7359;
			delquest 7360;
			delquest 7361;
			delquest 7362;
			delquest 7363;
			delquest 7364;
			delquest 7351;
			setquest 7365;
			set MALAYA_1QUE,5;
			viewpoint 2,1,1,0,0xFFFFFF;
			viewpoint 2,1,1,1,0xFFFFFF;
			viewpoint 2,1,1,2,0xFFFFFF;
			viewpoint 2,1,1,3,0xFFFFFF;
			viewpoint 2,1,1,4,0xFFFFFF;
			viewpoint 2,1,1,5,0xFFFFFF;
		}
		close;
	case 5:
		mes "[�y�h��]";
		mes "�������l�Ńy���[���ɋ�����";
		mes "����ƑΛ����邱�Ƃ��o�������ł��B";
		mes "��́A�ǂ��ɂ��D�̒�����";
		mes "�ǂ��o�����Ƃ��ł���΁c�c�I";
		next;
		mes "�]�D�̈�����v���o�����̂��A";
		mes "�@�y�h���̕\��ْ����Ă���]";
		close;
	case 6:
		if(checkquest(7368) || checkquest(72172)) {
			mes "[�y�h��]";
			mes "����A����ɂ��͖`���җl�B";
			mes "�����C���������ł��ˁB";
			next;
			mes "�]�y�h����^FF0000�ޖ��̂����^000000��n�����]";
			next;
			mes "[�y�h��]";
			mes "�����A�V���������ł����B";
			mes "���肪�Ƃ��������܂��B";
			mes "�{���ɏ�����܂��B";
			delitem 6503,1;
			if(checkquest(72172))
				delquest 72172;
			else
				delquest 7368;
			setquest 7382;
			viewpoint 2,1,1,4,0xFFFFFF;
			if( (
				(checkquest(7382)&1) + (checkquest(7383)&1) +
				(checkquest(7384)&1) + (checkquest(7385)&1) +
				(checkquest(7386)&1) + (checkquest(7387)&1)
			) == 6) {
				setquest 7379;
				delquest 7382;
				delquest 7383;
				delquest 7384;
				delquest 7385;
				delquest 7386;
				delquest 7387;
				if(MALAYA_2QUE == 3)
					set MALAYA_2QUE,4;
				next;
				mes "�]���ׂĂ̐l��^FF0000�ޖ��̂����^000000��n�����B";
				mes "�@�C�����_�[�̏��֖߂낤�]";
				viewpoint 2,1,1,0,0xFFFFFF;
				viewpoint 2,1,1,1,0xFFFFFF;
				viewpoint 2,1,1,2,0xFFFFFF;
				viewpoint 2,1,1,3,0xFFFFFF;
				viewpoint 2,1,1,4,0xFFFFFF;
				viewpoint 2,1,1,5,0xFFFFFF;
			}
			close;
		}
		if(BaseLevel < 100) {
			mes "[�y�h��]";
			mes "���̃y���[����";
			mes "����̏Z���ƂȂ��Ă��܂��Ă��܂��B";
			mes "�Ȃ�Ƃ����̕��ł��撣���Ă��܂���";
			mes "�������܂������Ă��܂���c�c�B";
			next;
			mes "[�y�h��]";
			mes "�����łЂƂ�`���ė~�����̂ł����c�c";
			mes "�`���җl�ł͂܂����͕s���̂悤�ł��B";
			mes "�����ł��ˁA��̓I�ɂ�";
			mes "^FF0000BaseLv100�ȏ�^000000�ɂȂ�����";
			mes "���̎��ɂł����肢���܂��B";
			close;
		}
		switch(MALAYA_3QUE) {
		case 0:
			mes "[�y�h��]";
			mes "�Ђ����I���킠��!!";
			next;
			mes "�]�y�h���͉����ɋ����A";
			mes "�@�k���Ă���]";
			next;
			if(select("����������","��������") == 2) {
				mes "�]���̏����ɂ����]";
				close;
			}
			mes "[�y�h��]";
			mes "���A���A���̌��܂�����!?";
			mes "�����삪���[���ƏW�܂���";
			mes "�ӂ��A�Ə������̂��c�c�B";
			mes "�͂��c�c�B";
			mes "����Ȃ��Ƃ΂����";
			mes "�{���ɋC���œ���܂��B";
			next;
			menu "�D�̉^�q�ɂ��ĕ���",-;
			mes "[�y�h��]";
			mes "�y���[���̓C�Y���[�h�Ƃ̒���D";
			mes "�Ȃ̂ł����c�c";
			next;
			mes "[�y�h��]";
			mes "���̃y���[����";
			mes "����̏Z���ƂȂ��Ă��܂��Ă��܂��B";
			mes "�Ȃ�Ƃ��ǂ�������";
			mes "�ďo�`�ł���悤�ɂ������̂ł���";
			mes "���̂Ƃ��낤�܂������Ă��܂���c�c�B";
			next;
			mes "[�y�h��]";
			mes "�܂��͂��̂悤�ɂȂ���";
			mes "�o�܂����b���������Ǝv���܂���";
			mes "��낵���ł��傤���H";
			next;
			if(select("�b�𕷂�","����̘b�ȂǕ��������Ȃ�") == 2) {
				mes "[�y�h��]";
				mes "�����ł����c�c�B";
				mes "����̘b�𕷂������l�Ȃ��";
				mes "���ʂ��܂������ˁc�c�B";
				close;
			}
			mes "[�y�h��]";
			mes "�b�͎������̒��ɏ��߂�";
			mes "�D��┑���鎞�ɂ����̂ڂ�܂��B";
			next;
			musiceffect "112";
			mes "[�y�h��]";
			mes "����܂ŕs����ւŐF�X�Ȓ���";
			mes "�^�q���Ă������ɂƂ��ď��߂Ă�";
			mes "����D�S���Ƃ������ƂŁA";
			mes "���͔��Ƀ��N���N���Ă��܂����B";
			next;
			mes "[�y�h��]";
			mes "���̍`���������Ƃ��A�C�Y���[�h�����";
			mes "�q�C���A�����\�肵�������Ɋ����ł���";
			mes "��тɁA���͍ō��ɋ������܂����B";
			mes "��������I�@�������I";
			mes "���Ăˁc�c�B";
			next;
			sc_start3 SC_BLIND,0,0,0,0,360000,10;
			mes "[�y�h��]";
			mes "�c�c�Ƃ��낪�A�ł��B";
			mes "�`�ɒ┑���悤�Ƌ߂Â��ƁA";
			mes "�����1�A2�ƁA�������̂悤��";
			mes "�򂪌�����B";
			next;
			mes "[�y�h��]";
			mes "�����낤�H�@�Ǝv���Ȃ�����A";
			mes "���������̊����ȍq�C��";
			mes "���ʂɂ���������܂���ł�������";
			mes "�y���[�����`�ɋ߂Â��܂����B";
			mes "����ƁA�߂Â������ɁA�������";
			mes "�ǂ�ǂ񑝂��Ă����悤�ł����B";
			next;
			soundeffect "amon_ra_stand.wav",1,3000;
			mes "[�y�h��]";
			mes "���悢�悢��[�ȗ\�������āc�c";
			mes "���͂�������D���~�߂悤�Ƃ��܂����B";
			mes "�ł����c�c�Ȃ����~�܂�Ȃ��B";
			mes "����Ȃ�΂Ƒǂ�؂낤�Ƃ��܂������A";
			mes "�ǂ������Ȃ��B";
			next;
			mes "[�y�h��]";
			mes "�v��������͂����߂Ă��A�@���Ă��A";
			mes "�R��΂��Ă��A�������傫�Ȑ���";
			mes "����ł��c�c���Ӗ��ł����B";
			mes "�����悤�̂Ȃ����|��";
			mes "���͂����k���܂����B";
			next;
			soundeffect "amon_ra_stand.wav",2,0;
			mes "[�y�h��]";
			mes "�������邤���ɂ��A�D�͍`��";
			mes "�������Đi��ōs���܂��B";
			mes "�߂Â��ɂ�A�������";
			mes "���X�ɑN���Ɍ����ė�����ł��B";
			next;
			mes "[�y�h��]";
			mes "�c�c�܂��A�ڂ������܂���";
			mes "������̒��Ő^���Ԃɐ��܂�ځc�c";
			mes "�����1��2�ł͂���܂���B";
			mes "�����̐Ԃ��ڂ�����܂����B";
			next;
			soundeffect "solace_die.wav",0,0;
			mes "[�y�h��]";
			mes "�����Ă��ꂪ�A��l�ɂ��̑D��";
			mes "���߂Ă����̂ł��B";
			next;
			mes "[�y�h��]";
			mes "�Ԃ��ڂ����A�������̂悤�ȑ̂�";
			mes "�������삪�A�����ɂЂ��߂��Ă��āc�c";
			mes "���ꂪ������Ɍ����Ă����̂ł����B";
			next;
			mes "[�y�h��]";
			mes "�Ȃ����ׂ��Ȃ��`�ɓ������y���[����";
			mes "�삽���͈�ĂɎ��͂�ŁA";
			mes "����ȉ����o������A�������񂾂�c�c";
			next;
			mes "[�y�h��]";
			mes "���̒��́A���낵�����̈��삪";
			mes "���̃y���[����苒���Ă��܂��܂����B";
			next;
			sc_end SC_BLIND;
			mes "[�y�h��]";
			mes "���Ƃ����悤�Ƃ͂����̂ł����A";
			mes "���̈���͋��낵���͂������Ă��āc�c";
			mes "�Ȃ�ƁA���E�ɓ���҂�G��邱�ƂȂ�";
			mes "������΂����Ƃ��ł���̂ł��B";
			next;
			mes "[�y�h��]";
			mes "�������x��������΂���܂����c�c�B";
			mes "�������ɂ͂ǂ����邱�Ƃ��ł��܂���B";
			mes "���ׁ̈A�D���o�����Ƃ�";
			mes "�o���Ȃ��ł���̂ł��B";
			next;
			mes "[�y�h��]";
			mes "�����M�����Ȃ��悤�ł�����";
			mes "���ڑD�̒��ɓ����Ă݂ĉ������B";
			mes "�������������Ƃ��킩��͂��ł��B";
			delquest 72072;
			setquest 7395;
			set MALAYA_3QUE,1;
			close;
		case 1:
			mes "[�y�h��]";
			mes "�����M�����Ȃ��悤�ł�����";
			mes "���ڑD�̒��ɓ����Ă݂ĉ������B";
			mes "�������������Ƃ��킩��͂��ł��B";
			close;
		case 2:
			mes "[�y�h��]";
			mes "�����B�����̗삪�H";
			mes "�C���C�����Ă����H";
			mes "���������ǂ��Ȃ��Ă����ł��傤�B";
			mes "���̎w���҃����o�L�E�|���Ȃ�";
			mes "�A�h�o�C�X������邩������܂���B";
			close;
		case 3:
			mes "[�y�h��]";
			mes "�Ȃ�قǁB";
			mes "���Ԃŏ����̗���Ԃ߂āA";
			mes "���̌�ɘb�𕷂��Ƃ����킯�ł��ˁB";
			mes "�Ȃ��Ȃ��ǂ��������Ǝv���܂��B";
			mes "�ł́A��낵�����肢���܂��B";
			close;
		case 4:
			mes "[�y�h��]";
			mes "�����o�L�E�|����";
			mes "�Ԃɏj���������Ă��ꂽ�̂ł����B";
			mes "�Ȃ�قǁB";
			mes "�ǂ����ʂ��o�鎖������Ă���܂��B";
			mes "��낵�����肢���܂��B";
			mes "���̑���Ɍ��ɐ������ĉ������I";
			close;
		case 5:
			mes "[�y�h��]";
			mes "�`���җl�I";
			mes "�ԑ���n���Ă��������܂������H";
			mes "����ł������ł������H";
			next;
			menu "�f�B���^�ɂ��Ęb��",-;
			mes "[�y�h��]";
			mes "�Ȃ�ƁI";
			mes "���̏����̗�͑厩�R�̐���";
			mes "�������̂ł����H";
			next;
			mes "[�y�h��]";
			mes "�|����ŉ��x������";
			mes "������΂����̂�����";
			mes "�Ă�����c�c";
			next;
			mes "[�y�h��]";
			mes "�������A���̐���f�B���^�l��";
			mes "���̑D������Ă�����";
			mes "�����Ă��ꂽ�̂ł���ˁH";
			mes "����͑�ϐS�����I";
			next;
			mes "[�y�h��]";
			mes "�ł���΁A�f�B���^�l�̋@����";
			mes "�����Ȃ�Ȃ��悤�A���ꂩ���";
			mes "����I�ɉԑ���͂��Ă����������";
			mes "�������ł��B";
			next;
			if(checkitemblank() == 0){
				// ������
				mes "[�y�h��]";
				mes "����H";
				mes "���������������āA";
				mes "�����n�����Ƃ��ł��܂���B";
				mes "�������𐮗����Ă���A";
				mes "������x���Ă��������B";
				close;
			}
			mes "[�y�h��]";
			mes "����͂��낢��Ə�����";
			mes "���������Ė{����";
			mes "���肪�Ƃ��������܂��B";
			mes "�債�����ł͂���܂��񂪁A";
			mes "����͎�����̂���ł��B";
			delquest 7399;
			setquest 7401;
			setquest 201505;
			set MALAYA_3QUE,6;
			getitem 6497,1;
			if(checkre()) {
				getexp 500000,0;
				getexp 500000,0;
				getexp 0,300000;
			}
			else {
				getexp 5000000,0;
				getexp 5000000,0;
				getexp 0,3000000;
			}
			set $MalayaName$[0],strcharinfo(0);
			next;
			mes "[�y�h��]";
			mes "���͍q�C�̏��������܂��B";
			mes "�^�s�ĊJ�̍ۂɂ́A������";
			mes "�C�Y���[�h�܂ł����肵�܂��B";
			close;
		case 6:
			if(checkquest(7401)) {
				if(!(checkquest(7401) & 0x2)) {
					mes "[�y�h��]";
					mes "���͂܂��A�f�B���^�l�̋@����";
					mes "�ǂ��݂����ł��I";
					mes "�@���������Ȃ�����A";
					mes "�܂����Ԃ����肢���܂��ˁB";
					next;
					menu "�D�̉^�q�󋵂𕷂�",-;
					mes "[�y�h��]";
					mes "�A���x���^�ɍs���Ȃ�ׂɂ���";
					mes "�傫�ȑD�𗘗p���ĉ������B";
					mes "���̃y���[���̓C�Y���[�h�s���ł��B";
					mes "�����͖����ł��B";
					next;
					if(select("���p����","���p���Ȃ�") == 2) {
						mes "[�y�h��]";
						mes "�����p�̍ۂɂ͌����Ă��������B";
						close;
					}
					mes "[�y�h��]";
					mes "����ł̓C�Y���[�h�Ɍ�����";
					mes "�o�q���܂��B";
					close2;
					warp "izlude.gat",195,180;
					end;
				}
				mes "[�y�h��]";
				mes "�܂����삽�����\��n�߂܂��āc�c";
				mes "����ŁA�f�B���^�l�̋@����";
				mes "���܂�ǂ��Ȃ��݂����ł��B";
				mes "����肪�����Ă����̂悤�Ȃ��̂ł�";
				mes "�ς����܂���B";
				next;
				switch(select("�D�̉^�q�󋵂𕷂�","��ςł���","���Ԃ����Ă��悤��")) {
				case 1:
					mes "[�y�h��]";
					mes "���삪�\��Ă��āA";
					mes "���͂ƂĂ��o�q�ł���悤��";
					mes "�󋵂ł͂���܂���B";
					close;
				case 2:
					mes "[�y�h��]";
					mes "���C�������肪�Ƃ��������܂��B";
					mes "����A���́c�c�o����΁c�c";
					mes "���Ԃ����āc�c����������Ɓc�c�B";
					close;
				case 3:
					mes "[�y�h��]";
					mes "�����B���肪�Ƃ��������܂��B";
					mes "����A���Ԃ����Ă����Ă��������B";
					mes "����ł́A�O��Ɠ����v�̂�";
					mes "��낵�����肢���܂��B";
					delquest 7401;
					setquest 7402;
					close;
				}
			}
			if(checkquest(7403)) {
				mes "[�y�h��]";
				mes "�f�B���^�l����l�����Ȃ�܂����B";
				mes "���͋C���ς�����̂�";
				mes "�O������������܂��B";
				mes "����A���b�ɂȂ��Ė{���ɂ��݂܂���B";
				next;
				mes "[�y�h��]";
				mes "������낵����Β���I�ɗ���";
				mes "���Ԃ��Ă����Ă��������B";
				next;
				if(checkitemblank() == 0){
					mes "[�y�h��]";
					mes "����H";
					mes "���������������āA";
					mes "�����n�����Ƃ��ł��܂���B";
					mes "�������𐮗����Ă���A";
					mes "������x���Ă��������B";
					close;
				}
				mes "[�y�h��]";
				mes "����͂���ł��B";
				mes "�󂯎���Ă��������B";
				setquest 7401;
				delquest 7403;
				getitem 6497,1;
				if(checkre())
					getexp 50000,20000;
				else
					getexp 500000,200000;
				set $MalayaName$[0],strcharinfo(0);
				close;
			}
			mes "[�y�h��]";
			mes "�O��Ɠ����v�̂ŉԂ��W�߂āB";
			mes "�����o�L�E�|���̏��Ɏ����čs���ƁA";
			mes "���炬�̉ԑ��ɂ��Ă����͂��ł��B";
			mes "������f�B���^�l�ɓn���Ă��������B";
			mes "��낵�����肢���܂��B";
			next;
			menu "�D�̉^�q�󋵂𕷂�",-;
			mes "[�y�h��]";
			mes "���삪�\��Ă��āA";
			mes "���͂ƂĂ��o�q�ł���悤��";
			mes "�󋵂ł͂���܂���B";
			close;
		}
	}
OnInit:
	waitingroom "�y���[���̃S�[�X�g",0;
	end;
}

ma_in01.gat,125,107,3	script	�썰�f�B���^	1752,4,4,{
	end;
OnTouch:
	switch(MALAYA_3QUE) {
	case 1:
		mes "�]�����̋��ɍ���������";
		mes "�@�����߂��Ă���c�c";
		next;
		mes "�]�悭����ƁA";
		mes "�@�l�̌`�����Ă���c�c�I�]";
		next;
		menu "�ŁA�o���[�[�[!!",-,"�N��!!",-;
		cutin "malaya_diwata01",2;
		mes "�]�����̎p��������������́A";
		mes "�@������ɋC�t���ƁA";
		mes "�@�՗����������ɂ݂��Ă����]";
		next;
		mes "[�f�B���^]";
		mes "�c�c���邳���c�c";
		next;
		mes "�]�S�g�������߂ŐԂ���������";
		mes "�@���������c�c";
		mes "�@�y�h���̌����Ă�������́A";
		mes "�@���̏����̂��Ƃ��낤�]";
		next;
		mes "[�f�B���^]";
		mes "�o�čs��!!";
		next;
		menu "�҂��āI�@�b���������I",-;
		mes "[�f�B���^]";
		mes "�c�c���O��Ƙb�Ȃ񂩂Ȃ��B";
		next;
		menu "���O��H",-;
		cutin "malaya_ghost01",4;
		mes "�]�U������ƌ��o���̂���삽����";
		mes "�@������Ɍ������ĕ����ė��Ă���]";
		next;
		menu "���̎��́c�c",-;
		cutin "malaya_ghost02",4;
		mes "�]�U������āA��ɕ��݊���";
		mes "�@���ő����������Ɠ����悤��";
		mes "�@�ނ�͋����͂��߂��]";
		next;
		cutin "malaya_diwata01",2;
		mes "[�f�B���^]";
		mes "�c�c�����Ă���H";
		mes "�Ȃ��c�c";
		next;
		mes "[�f�B���^]";
		mes "�c�c����A����Ȃ̊֌W�Ȃ��I";
		mes "���O���ꏏ�ɏ�����!!";
		next;
		cutin "malaya_diwata01",255;
		mes "�]�����ɏ����̐���������";
		mes "�@�s�v�c�ȗ͂�";
		mes "�@�O�ɒǂ��o����Ă��܂����]";
		setquest 7396;
		delquest 7395;
		set MALAYA_3QUE,2;
		close2;
		sc_end SC_BLIND;
		warp "malaya.gat",324,66;
		end;
	case 4:
		mes "�]�f�B���^���s���ڂ���";
		mes "�@����������߂Ă���B";
		mes "�@�p�ӂ����ԑ����c�c";
		cutin "malaya_diwata01",2;
		next;
		switch(select("���ʂ��炳���Ǝ�n��","���ɒu���Ă����Ɖ����o��","�������ɂ��Ē@��")) {
		case 1:
			mes "�]�ԑ��������Ǝ�n���Ɣޏ��́A";
			mes "�@�ˑR�̑��蕨�ɏ������Ԃ��";
			mes "�@���h���͂��߂��]";
			break;
		case 2:
			mes "�]���ɉԂ�u���ޏ��̕��֌������";
			mes "�@�ޏ��͉��������Ă��邩�킩�炸";
			mes "�@���炩�Ɍ˘f���͂��߂��]";
			break;
		case 3:
			mes "[�f�B���^]";
			mes "�ɂ��I";
			mes "�Ђǂ��c�c�B";
			mes "�ǂ����Ă�������������́H";
			mes "�M�����Ȃ��I";
			mes "���������ā[�I";
			next;
			cutin "malaya_diwata01",255;
			mes "�]�����ɏ����̐���������";
			mes "�@�s�v�c�ȗ͂�";
			mes "�@�O�ɒǂ��o����Ă��܂����]";
			close2;
			warp "malaya.gat",324,66;
			end;
		}
		next;
		cutin "malaya_diwata02",2;
		mes "[�f�B���^]";
		mes "�ԁc�c�������I�@���ꂢ�c�c�B";
		next;
		cutin "malaya_diwata01",2;
		mes "[�f�B���^]";
		mes "����́c�c�ǂ���������!?";
		mes "���Ȃ��͓G�ł͂Ȃ����Ă��ƁH";
		next;
		mes "[�f�B���^]";
		mes "����H�@�ǂ������炠�Ȃ��A";
		mes "���ʂ̐l�ԂȂ̂ˁB";
		mes "�c�c�͂��`";
		mes "���̈���ǂ��A�l�Ԃɂ͋��ނ����ɁA";
		mes "���ɂ͌������Ă�����āA";
		mes "�ǂ��������Ȃ́H";
		next;
		menu "�N�����삶��Ȃ��́H",-;
		mes "[�f�B���^]";
		mes "������ƁI";
		mes "����ȓz��Ǝ����������̂�";
		mes "������킯�H";
		mes "�M�����Ȃ��I";
		next;
		mes "[�f�B���^]";
		mes "���͑厩�R�̈̑�Ȃ鐸��";
		mes "�f�B���^��I";
		mes "��삷��҂Ȃ̂��I";
		next;
		mes "[�f�B���^]";
		mes "����Ȏ��Ƃ�����̋�ʂ�";
		mes "���Ȃ��Ȃ�āc�c";
		mes "���ꂾ���璬�͌����B";
		mes "�Ȃ񂩂܂��C���C�����Ă����I";
		next;
		mes "[�f�B���^]";
		mes "���������ā[�[�[�I";
		next;
		menu "�N�̂����őD���o�`�ł��Ȃ��񂾁I",-;
		mes "[�f�B���^]";
		mes "�����c�c";
		mes "���̂����őD���^�q�ł��Ȃ��́H";
		mes "�ǂ����āH";
		mes "�@";
		mes "�c�c�����I";
		next;
		mes "[�f�B���^]";
		mes "���������΁c�c";
		mes "���삽���ƊԈႦ�ĉ��x��";
		mes "�D�����ۂ��l�Ԃ�������΂���";
		mes "���܂����悤�ȁc�c";
		next;
		mes "[�f�B���^]";
		mes "�c�c�ł��I";
		mes "�킴�Ƃ���Ȃ��́I";
		mes "�����炪�\���̂������";
		mes "�C���������Ȃ�������āB";
		next;
		mes "[�f�B���^]";
		mes "����Ȃ̂ɂ�����A�����玟��";
		mes "�����ł���H";
		mes "�����玄���A�蓖�莟�搁����΂�";
		mes "�����Ȃ����āc�c";
		next;
		mes "[�f�B���^]";
		mes "�c�c����I�@���߂���I";
		mes "�����Ȃ�������΂��Ȃ��";
		mes "�Ђǂ����Ƃ����Ă��܂�����B";
		next;
		mes "[�f�B���^]";
		mes "���̑D�̑D���ɓ`���āB";
		mes "���l�тƌ����Ă͂Ȃ񂾂��ǁA";
		mes "���̑D�͍���A������삵��";
		mes "��������āB";
		mes "��������ɔ����邱�Ƃ�";
		mes "�Ȃ��Ȃ��B";
		next;
		mes "[�f�B���^]";
		mes "�����A�����������������ǁA";
		mes "����������Ă�Ǝ��A";
		mes "�ǂ�ǂ�C���������Ȃ����Ⴄ�񂾁B";
		next;
		cutin "malaya_diwata02",2;
		mes "[�f�B���^]";
		mes "������A���ꂩ�������I��";
		mes "���Ԃ������Ă��Ă���Ȃ����ȁH";
		next;
		mes "[�f�B���^]";
		mes "���Ԃ����Ă�ƁA�Ƃ��Ă�";
		mes "���������񂾁B";
		mes "���ւցc�c";
		next;
		mes "[�f�B���^]";
		mes "��낵���ˁI";
		delitem 6506,1;
		delquest 7398;
		setquest 7399;
		set MALAYA_3QUE,5;
		close2;
		cutin "malaya_diwata02",255;
		end;
	case 5:
		cutin "malaya_diwata02",2;
		mes "[�f�B���^]";
		mes "���삪���̑D�Ɉ��������Ȃ��悤";
		mes "������삷��ˁB";
		next;
		mes "[�f�B���^]";
		mes "�ł��A������̑�������Ă��邤����";
		mes "���̋C���������Ȃ��Ă��܂�����A";
		mes "���̎��͂܂����Ԃ������Ă���";
		mes "���傤�����I";
		close2;
		cutin "malaya_diwata02",255;
		end;
	case 6:
		if(checkquest(7401) || checkquest(7403)) {
			if(checkquest(7401) & 0x2) {
				cutin "malaya_diwata01",2;
				mes "[�f�B���^]";
				mes "�������ɍs����!!";
				mes "����H�@���Ȃ��Ȃ́H";
				mes "���̓c�ɂ̂����������������";
				mes "�܂������́I�@�����Ȃ��I";
				close2;
				cutin "malaya_diwata01",255;
				end;
			}
			cutin "malaya_diwata02",2;
			mes "[�f�B���^]";
			mes "�ٍ��̉Ԃ�����̂͊y�����B";
			mes "���������̉Ԃ�����";
			mes "����ȊÂ����肪����񂾂ˁB";
			next;
			if(select("�܂������Ă����","�Ȃ����̑D�ɏ���Ă���́H") == 1) {
				mes "[�f�B���^]";
				mes "���肪�Ƃ��B";
				mes "���Ȃ��������ė���Ԃ������";
				mes "�S������������B";
				mes "�c�c�B";
				close2;
				cutin "malaya_diwata02",255;
				end;
			}
			mes "[�f�B���^]";
			mes "��c�c";
			mes "���Ƃ��Ƃ͎R�ɏZ��ł����񂾂��ǁA";
			mes "�R�ɂ������ؔ��̒��ł����Q����";
			mes "������A���̊Ԃɂ����̑D��";
			mes "�^�΂�Ă����݂����B";
			next;
			mes "[�f�B���^]";
			mes "�����Ȃ玄�̎p�͕��ʂ̐l�Ԃɂ�";
			mes "�����Ȃ��悤�ɂ��Ă���񂾂��ǁA";
			mes "����ǂ��̑�������邱�Ƃ�";
			mes "�W�����Ă������̂�����c�c";
			mes "����őD���ɂ�����";
			mes "������������̂ˁB";
			next;
			emotion 2;
			mes "[�f�B���^]";
			mes "�ł��A�D�ł̐����������͂Ȃ���ˁI";
			mes "���̂����R�ł͌������Ƃ̂Ȃ��Ԃ�";
			mes "�����ς����邱�Ƃ��ł������́B";
			close2;
			cutin "malaya_diwata02",255;
			end;
		}
		cutin "malaya_diwata01",2;
		mes "[�f�B���^]";
		mes "����߁I�@�܂�������!?";
		mes "����H";
		mes "�Ȃ񂾁A���Ȃ��������́H";
		mes "���̎��͋@�������܂�ǂ��Ȃ���B";
		next;
		mes "�]�f�B���^�͓�����O�̂悤��";
		mes "�@��������L�ׂ��B";
		mes "�@������v�����Ă���悤���]";
		next;
		if(select("�ԑ���n��","������荇��") == 2) {
			mes "[�f�B���^]";
			mes "��߂Ă�A�C���������I";
			mes "�����A�����ł�������";
			mes "�C���C�����Ă���̂ɁI";
			mes "���Ȃ��܂Ŏ����C���C���������!?";
			next;
			cutin "malaya_diwata01",255;
			mes "�]�C���C�����Ă���f�B���^�̓{���";
			mes "�@���ɑD�̊O�ɏo����Ă��܂����]";
			close2;
			warp "malaya.gat",324,66;
			end;
		}
		cutin "malaya_diwata02",2;
		mes "[�f�B���^]";
		mes "���c�c����ς莝���ė��Ă��ꂽ�̂ˁI";
		mes "�B�ꎄ�̊y���݁A���̐S�����炮�c�c�I";
		mes "�ٍ��̉Ԃ�����`�I";
		next;
		mes "�]�f�B���^�̋C�����ǂ��Ȃ���������";
		mes "�@���ӂ̋C���������Ȃ���";
		mes "�@���͋C���悭�Ȃ��� �]";
		next;
		mes "[�f�B���^]";
		mes "�y�h���ɓ`���Ă��傤�����B";
		mes "�����̓f�B���^�����z�ɂȂ邩��";
		mes "�C�ɂ����ɍq�C���Ă�������āB";
		delitem 6506,1;
		setquest 7403;
		delquest 72065;
		next;
		cutin "malaya_diwata02",255;
		mes "�]�f�B���^�ɉԑ���n�����B";
		mes "�@�y�h���ɕ񍐂��悤�]";
		close;
	default:
		cutin "malaya_diwata01",2;
		mes "[�f�B���^]";
		mes "�܂������ȁI";
		mes "����������[!!";
		next;
		cutin "malaya_diwata01",255;
		mes "�]�����ɏ����̐���������";
		mes "�@�s�v�c�ȗ͂�";
		mes "�@�O�ɒǂ��o����Ă��܂����]";
		close2;
		warp "malaya.gat",324,66;
		end;
	}
}

ma_in01.gat,108,92,0	script	#�f�B���^���o	139,5,5,{
	if(MALAYA_3QUE == 1) {
		musiceffect "112";
		sc_start3 SC_BLIND,0,0,0,0,360000,10;
	}
	end;
}

ma_in01_jp.gat,45,154,3	script	�����o�L�E�L�R	580,{
	if(checkquest(7376)) {
		mes "[�����o�L�E�L�R]";
		mes "�����A����͂��肢���Ă����炾�ȁI";
		mes "�Ȃ�قǁA�f���炵���I";
		mes "����Ńo�R�i�����ꂵ�߂鎖���ł���B";
		next;
		if(checkitemblank() == 0) {
			mes "[�����o�L�E�L�R]";
			mes "�ނށI";
			mes "���������������̂悤�����B";
			mes "�������𐮗����Ă���A";
			mes "������x�b�������Ă���B";
			close;
		}
		mes "[�����o�L�E�L�R]";
		mes "���ꂶ�Ⴀ�A���܂Ȃ�����̂����";
		mes "���̂�����n���ė��Ă���Ȃ����ˁB";
		mes "�������b����";
		mes "����ɋ�J���Ă��邻�����ȁB";
		mes "����������čs���Η͂ɂȂ�͂����B";
		mes "���܂Ȃ������񂾂�B";
		delitem 6504,5;
		setquest 7377;
		getitem 6503,5;
		delquest 7376;
		close;
	}
	if(checkquest(72060) && countitem(523) >= 10) {
		mes "[�����o�L�E�L�R]";
		mes "���ށA���̈���̍��ɂ�";
		mes "���ׂĈ����C���h���Ă���B";
		mes "�������̕����̍��ɂ�";
		mes "�����G�l���M�[���܂܂�Ă���񂾁B";
		mes "�����ł��̃G�l���M�[�𗘗p���邽�߂�";
		mes "�����𗘗p���Ă��̂悤�ɂ���Ɓc�c";
		next;
		if(checkitemblank() == 0) {
			mes "[�����o�L�E�L�R]";
			mes "�ނށI";
			mes "���������������̂悤�����B";
			mes "�������𐮗����Ă���A";
			mes "������x�b�������Ă���B";
			close;
		}
		mes "[�����o�L�E�L�R]";
		mes "�����A�ł����B";
		mes "������o���^�C�ɗ^�����";
		mes "�����͂𓾂鎖���o���邾�낤�B";
		mes "���ꂶ�Ⴀ�A���܂Ȃ������̍���";
		mes "�h���ɓn���Ă��Ă���B";
		delitem 6507,10;
		delitem 523,10;
		setquest 7407;
		getitem 6505,10;
		delquest 72060;
		close;
	}
	mes "[�����o�L�E�L�R]";
	mes "�����A�������Z�����B";
	mes "���삪�o�v����悤�ɂȂ���";
	mes "�x�މɂ��Ȃ��Ȃ��Ă��܂����B";
	mes "�@";
	mes "����A�`���҂̕������炵�Ă����̂��B";
	next;
	mes "[�����o�L�E�L�R]";
	mes "�o���I�E�}�q���K�ɂ悤�����`���҂�B";
	mes "���͂����o���I�E�}�q���K��";
	mes "�l�Ɨ��������Ă���쓹�t";
	mes "�����o�L�E�L�R���B";
	if(checkquest(7377) || checkquest(72060) || checkquest(7407)) {
		mes "�������p���ˁB";
		next;
		switch(select("�S�̓�ɂ���","����̍��̏򉻂ɂ���")) {
		case 1:
			if(!checkquest(7377)) {
				mes "[�����o�L�E�L�R]";
				mes "��H�@�m���ɓ�̒����͂�������";
				mes "�N�ɂ͗���ł��Ȃ����B";
				mes "�������Ⴂ�����Ă���񂶂�Ȃ����H";
				close;
			}
			mes "[�����o�L�E�L�R]";
			mes "�����A�o���I�E�}�q���K�̒b�艮��";
			mes "���\�̗ǂ�������͓̂���B";
			mes "����Ŗ���|�[�g�}�����ɂ���";
			mes "�b�艮�̐��b�ɂȂ��Ă���B";
			next;
			mes "[�����o�L�E�L�R]";
			mes "�o�R�i���͑傫�ȉ��������̂��B";
			mes "��X�̓o�R�i���΍�Ƃ���";
			mes "�S�ō�������ȓ��͈�t�@���B";
			mes "���ׁ̈A�p�ɂɓ炪���Ă��܂��B";
			mes "������ւ����������K�v�Ȃ񂾁B";
			next;
			mes "[�����o�L�E�L�R]";
			mes "�Ƃɂ������肪�Ƃ��B";
			mes "���܂񂪂�����n������";
			mes "���񂾂�B";
			close;
		case 2:
			if(!checkquest(7407)) {
				mes "[�����o�L�E�L�R]";
				mes "�o���^�C���H�ׂ鍜��";
				mes "�򉻂̂��Ƃ��ȁB";
				mes "�m���ɂ���͎������������Ă��邪�A";
				mes "�ӂށB";
				mes "���̌N�ɂ͊֌W�Ȃ������ȁB";
				close;
			}
			mes "[�����o�L�E�L�R]";
			mes "�o���^�C���������󂩂��Ă��邾�낤�B";
			mes "�}���Ŏ����čs���Ă����Ȃ����B";
			close;
		}
	}
	close;
}

//============================================================
// �x�����o���^�C�N�G�X�gNPC
//------------------------------------------------------------
ma_in01.gat,122,158,0	script	�x�������h��	570,{
	if(checkquest(7407)) {
		mes "[�x�������h��]";
		mes "����̓o���^�C����т܂��ˁI";
		mes "���[��A�o�����Ă͐V�N���B";
		mes "���肪�Ƃ��������܂��I";
		next;
		if(checkweight(6497,1) == 0) {
			mes "[�x�������h��]";
			mes "����H";
			mes "���������������āA";
			mes "�����n�����Ƃ��ł��܂���B";
			mes "�������𐮗����Ă���A";
			mes "������x���Ă��������B";
			close;
		}
		mes "[�x�������h��]";
		mes "����͂���ł��B";
		mes "�o����Ζ������܂�";
		mes "����Ă��炦��Ə�����܂��B";
		delitem 6505,10;
		setquest 7408;
		delquest 7407;
		getitem 6497,1;
		if(checkre())
			getexp 50000,20000;
		else
			getexp 500000,200000;
		set $MalayaName$[2],strcharinfo(0);
		close;
	}
	mes "[�x�������h��]";
	mes "�ӂ����c�c�B";
	next;
	if(select("����������","���������Ȃ�") == 2) {
		mes "�]�����������ɂ��̏�𗣂ꂽ�B�]";
		close;
	}
	if(BaseLevel < 100) {
		mes "[�x�������h��]";
		mes "���͍��A�o���^�C�Ƃ����x������";
		mes "�a��T���Ă����̂ł����A";
		mes "��������܂���ł����B";
		mes "������ƕς�����a�Ȃ̂ŒN���ɗp�ӂ�";
		mes "��`���Ă��炢���������̂ł����c�c";
		mes "���Ȃ��ɂ͂�����Ɩ��������ł��ˁB";
		next;
		mes "[�x�������h��]";
		mes "�����ł��ˁA��̓I�ɂ�";
		mes "^FF0000BaseLv100�ȏ�^000000�ɂȂ�����";
		mes "���񂻂̎��ɂł���`���Ă��������B";
		close;
	}
	if(checkquest(7408)) {
		if(!(checkquest(7408) & 0x2)) {
			mes "[�x�������h��]";
			mes "���I";
			mes "����`�����肪�Ƃ��������܂����I";
			mes "����œ����̊ԃo���^�C��";
			mes "�ǂ��d��������ł��傤�B";
			next;
			mes "[�x�������h��]";
			mes "���A�x����������";
			mes "���������ŉ������Ă��邩���āH";
			mes "���Ⴂ���Ă͂����܂���B";
			mes "�O�̓o���^�C���������Ă���Ă�̂�";
			mes "���͕����̌x�������Ă���̂ł��B";
			close;
		}
		mes "[�x�������h��]";
		mes "�o���^�C�ɗ^���鍜��";
		mes "����Ȃ��Ȃ��Ă��܂��܂����B";
		mes "���肢���܂��B���̂����ɂǂ���";
		mes "�p�ӂ��ė��Ă���܂��񂩁H";
		next;
		if(select("��`��","��`��Ȃ�") == 2) {
			mes "[�x�������h��]";
			mes "���A����ȁc�c�B";
			close;
		}
		mes "[�x�������h��]";
		mes "���肪�Ƃ��������܂��B";
		mes "^FF0000����̍�^000000�́A�k���̉Ƃɂ���";
		mes "�e�B�N�o�������Ƃ������Ă��܂��B";
		mes "���߂Ε����Ă����ł��傤�B";
		next;
		mes "[�x�������h��]";
		mes "����������o�L�E�L�R�̏���";
		mes "�����čs����";
		mes "�o���^�C���H�ׂ���悤";
		mes "�򉻂̋V�����قǂ����Ă���܂��B";
		next;
		mes "[�x�������h��]";
		mes "����ł͏򉻂̏I�����";
		mes "^FF0000�򉻂����썰�̍�^000000��10��";
		mes "�����ė��Ă��������B";
		mes "���������Ώ򉻋V���ɂ�";
		mes "^FF0000����^000000�������������g����悤�ł��B";
		next;
		mes "[�x�������h��]";
		mes "�ł́A���҂����Ă���܂��B";
		delquest 7408;
		setquest 7406;
		close;
	}
	if(checkquest(7406) || checkquest(106176) || checkquest(72060)) {
		mes "[�x�������h��]";
		mes "����̍��́A�k���̉Ƃɂ���";
		mes "�e�B�N�o�������Ƃ������Ă��܂��B";
		mes "��낵�����肢���܂��B";
		close;
	}
	mes "[�x�������h��]";
	mes "����ɂ��́B";
	mes "���̓o���I�E�}�q���K�̌x�������Ă���";
	mes "�h���Ƃ����܂��B";
	next;
	mes "[�x�������h��]";
	mes "���́A�x�����ꏏ�ɂ��Ă���";
	mes "�o���^�C�Ƃ�������";
	mes "�a�����傤�ǒT���Ă����̂ł��B";
	mes "���̓�����ɗ����Ă����Ǝv���܂��B";
	mes "���ɗD�G�Ȍx�����ł��B";
	next;
	mes "[�x�������h��]";
	mes "�o���^�C�ł����A����";
	mes "���̑��̐��܂�ł͂Ȃ���ł��B";
	mes "�ȑO�A���̏Z�l�����ɍs�����ۂ�";
	mes "�A��̑D�œ|��Ă��錢��";
	mes "�E���ė�����ł��B";
	next;
	mes "[�x�������h��]";
	mes "�͂��߂ĉ�������̃o���^�C��";
	mes "�������삦�Ă��܂����B";
	mes "���킢�����ɁA������";
	mes "�����H�ׂĂ��Ȃ������̂ł��傤�B";
	mes "�����Ȃ�r��H�ׂ悤�Ƃ��Ă��܂����B";
	next;
	mes "[�x�������h��]";
	mes "��ւ����Ă�����ł��B";
	mes "���c�c�����c���c�c��4�c�H";
	mes "�܂��A�悭�킩��Ȃ������̂ŁA";
	mes "�����͂����܂����B";
	next;
	mes "[�x�������h��]";
	mes "����ŁA���͓�������D���Ȃ̂�";
	mes "���̌���������鎖�ɂ��܂����B";
	mes "���O���������߂܂�����B";
	mes "�]�o���^�C�]";
	mes "�ǂ��ł��B�������O�ł��傤�B";
	next;
	mes "[�x�������h��]";
	mes "�n�߂͐F�X�Ƌ�J���܂����B";
	mes "�����ɗ���ȑO�ɐl���P���P���ł�";
	mes "�󂯂Ă����̂ł��傤���c�c�B";
	mes "�ߊ��ƒ�����";
	mes "���݂��Ă����ł���B";
	next;
	mes "[�x�������h��]";
	mes "�����A���͒��߂܂���ł����B";
	mes "�ނ���o���^�C�̂��̐��i��";
	mes "�t�Ƀ`�����X���Ǝv������ł��B";
	next;
	mes "[�x�������h��]";
	mes "�x���Ɋ�������񂶂�Ȃ����A�ƂˁB";
	mes "��������Ύ��͊y���o���܂��B";
	mes "�����y���o����\��������A";
	mes "�Ƃ������Ƃ��A";
	mes "���������̌����͂ƂȂ�܂����B";
	next;
	mes "[�x�������h��]";
	mes "�����Ńe�B�N�o�������Ƃł���";
	mes "�����̍s���ɏڂ����搶��";
	mes "���k���ɍs������ł��B";
	mes "�����Œ�Ă��ꂽ�̂�";
	mes "^FF0000�򉻂����썰�̍�^000000�Ƃ����̂�";
	mes "�o���^�C�ɐH�ׂ����邱�Ƃł��B";
	next;
	mes "[�x�������h��]";
	mes "�Ȃ�ł������H�ׂ��";
	mes "����̋C��T�m���A���Ȃ�͂�";
	mes "�����ގ��ł���悤�ɂȂ邻���ł��B";
	next;
	mes "[�x�������h��]";
	mes "�_���͌����ɂ��܂������܂����B";
	mes "�򉻂����썰�̍���H�ׂ��o���^�C��";
	mes "�l�Ԃ��P�����ƂȂ��A";
	mes "�f���������T�m���A������������";
	mes "�ǂ������Ă����悤�ɂȂ����̂ł��B";
	next;
	mes "[�x�������h��]";
	mes "�����A�������͕K�v�Ȃ̂ŁA";
	mes "������p�ӂ��Ă�";
	mes "�����ɑ���Ȃ��Ȃ��Ă��܂��܂��B";
	next;
	mes "[�x�������h��]";
	mes "�����������قǂ��傤��";
	mes "�o���^�C�ɗ^���鍜��";
	mes "����Ȃ��Ȃ��Ă��܂��܂����B";
	mes "���肢���܂��B���̂����ɂǂ���";
	mes "�p�ӂ��ė��Ă���܂��񂩁H";
	next;
	if(select("��`��","��`��Ȃ�") == 2) {
		mes "[�x�������h��]";
		mes "���A����ȁc�c�B";
		close;
	}
	mes "[�x�������h��]";
	mes "���肪�Ƃ��������܂��B";
	mes "^FF0000����̍�^000000�́A�k���̉Ƃɂ���";
	mes "�e�B�N�o�������Ƃ������Ă��܂��B";
	mes "���߂Ε����Ă����ł��傤�B";
	next;
	mes "[�x�������h��]";
	mes "����������o�L�E�L�R�̏���";
	mes "�����čs����";
	mes "�o���^�C���H�ׂ���悤";
	mes "�򉻂̋V�����قǂ����Ă���܂��B";
	next;
	mes "[�x�������h��]";
	mes "����ł͏򉻂̏I�����";
	mes "^FF0000�򉻂����썰�̍�^000000��10��";
	mes "�����ė��Ă��������B";
	mes "���������Ώ򉻋V���ɂ�";
	mes "^FF0000����^000000�������������g����悤�ł��B";
	next;
	mes "[�x�������h��]";
	mes "�ł́A���҂����Ă���܂��B";
	delquest 72090;
	setquest 7406;
	close;
OnInit:
	waitingroom "�x�����o���^�C",0;
	end;
}

ma_fild01.gat,238,257,2	script	�x�����o���^�C	972,{
	mes "[�o���^�C]";
	mes "�K���D�����D�c�c�B";
	mes "�@";
	mes "�]���Ȃ����x�����Ă���]";
	close;
}

//============================================================
// �}���X�̎q���T���N�G�X�gNPC
//------------------------------------------------------------
ma_in01_jp.gat,42,155,7	script	�}���X	579,{
	if(MALAYA_1QUE < 6) {
		mes "�]�S�z�����Ȋ�ŕw�l�������Ă���]";
		close;
	}
	if(BaseLevel < 100) {
		mes "[�}���X]";
		mes "���c�c���́c�c�B";
		mes "�����A�Ȃ�ł�����܂���B";
		mes "���Ȃ��͋������Ɍ����Ȃ��ł��ˁB";
		mes "���߂�Ȃ����B�]�T���Ȃ��āc�c�B";
		next;
		mes "�]������`���ė~����������";
		mes "�@���̎����ł͕͗s���̂悤���B";
		mes "�@^FF0000BaseLv100�ȏ�^000000�ɂȂ��Ă���";
		mes "�@���炽�߂āA�b�����Ă݂悤�]";
		close;
	}
	if(checkquest(7388)) {
		mes "[�}���X]";
		mes "�����ƈ���ɘf�킳���";
		mes "���̐X��f�r���Ă���Ǝv���܂��B";
		mes "���肢���܂��B";
		mes "�q������������";
		mes "^4d4dff���Ԃ��̃V���c^000000��";
		mes "�n���Ă����ĉ������B";
		next;
		mes "[�}���X]";
		mes "���Ԃ��̃V���c��";
		mes "�����X�^�[��ގ������";
		mes "��ɓ���邱�Ƃ��ł��܂��B";
		mes "�̂͂������񎝂��Ă�����ł����ǁA";
		mes "�S���D���Ă��܂����̂ł��c�c�B";
		next;
		mes "[�}���X]";
		mes "�������͂悭�����ꏊ�̂��Ƃ�";
		mes "�m���Ă���݂����Ȃ�ł����ǁA";
		mes "�����ɍs���Ă�������Ȃ���ł��B";
		next;
		mes "[�}���X]";
		mes "�ꂩ���ɂ����Ƃ���";
		mes "�����Ȃ��q�����Ȃ̂�";
		mes "�������Ă��܂��Ă���̂���";
		mes "����܂���B";
		next;
		mes "[�}���X]";
		mes "�������̘b�𕷂���";
		mes "������l�̖���";
		mes "�����Ă������ȏꏊ��";
		mes "�T���Ă��Ă��炦�܂��񂩁H";
		close;
	}
	if(checkquest(7389)) {
		mes "[�}���X]";
		mes "�߂��ė��܂����ˁB";
		mes "�q���͂������l��";
		mes "�����ɉƂɋA���Ă��܂����B";
		next;
		if(checkweight(6497,1) == 0) {
			mes "[�}���X]";
			mes "��������悤�Ǝv�����̂ł����c�c";
			mes "�A�C�e���������ς��������̂悤�ŁB";
			mes "�������𐮗����Ă���A";
			mes "������x�b�������Ă��������܂����H";
			close;
		}
		mes "[�}���X]";
		mes "���Ԃ��̃V���c�́A";
		mes "���g���߂�ׂ��ꏊ�ɓ����Ă���܂��B";
		mes "�����̎q�������ɋM�d�ȕ���";
		mes "���肪�Ƃ��������܂����B";
		mes "����͐S�΂���̂���ł��B";
		setquest 7390;
		delquest 7389;
		getitem 6497,1;
		if(checkre())
			getexp 50000,20000;
		else
			getexp 500000,200000;
		set $MalayaName$[1],strcharinfo(0);
		close;
	}
	if(checkquest(7390)) {
		if(!(checkquest(7390) & 0x2)) {
			mes "[�}���X]";
			mes "���Ԃ��̃V���c���������";
			mes "�ƂɋA���ƕ��������q��������";
			mes "�|�����̒m�炸�ɂȂ��Ă��܂��āA";
			mes "�X�Œx���܂ŗV��ł���̂ł��c�c�B";
			next;
			mes "[�}���X]";
			mes "�����ǁA�����ŗV�ԂƂ�������";
			mes "�X�ɓ��邭�炢�����Ȃ��ł����A";
			mes "�����猾���Ă������Ȃ��ł��傤�B";
			mes "�����A�X�ł܂����q�ɂȂ�悤�Ȃ�";
			mes "���̎��͂܂����Ȃ���";
			mes "���肢���邩������܂���B";
			close;
		}
	}
	mes "[�}���X]";
	mes "�����̖�����������Ȃ���ł��B";
	mes "�X�֗V�тɍs�����܂܁A";
	mes "�|�[�g�}�����̎���ɂ�";
	mes "�߂��ĂȂ��݂����Ȃ�ł��B";
	next;
	mes "[�}���X]";
	mes "�����o�L�E�L�R�ɑ{���𗊂񂾂̂ł���";
	mes "�l�肪�s�����Ă��邹���ŁA";
	mes "�Ȃ��Ȃ��{�����i�܂Ȃ��āc�c";
	mes "�@";
	mes "���肢���܂��A�ǂ�������";
	mes "�T���Ă��Ă��������Ȃ��ł��傤���B";
	next;
	switch(select("�킩��܂���","���͖Z�����ł�","����A���Ȃ炻����")) {
	case 1:
		mes "[�}���X]";
		mes "�����炭���͈���ɘf�킳���";
		mes "�X��f�r���Ă���͂��ł��B";
		next;
		mes "[�}���X]";
		mes "�����􂢂ɂ������Ă���Ƃ�����";
		mes "���̂܂ܘA��ė��邱�Ƃ�";
		mes "�ł��Ȃ��Ǝv���܂��B";
		next;
		mes "[�}���X]";
		mes "�Ȃ̂ŁA������Ɩʓ|��������܂��񂪁A";
		mes "^4d4dff���Ԃ��̃V���c^000000��";
		mes "��ɓ���Ė��ɓn���ĉ������B";
		mes "���̃V���c�������Ă����";
		mes "�s�v�c�ȗ͂��h��߂�ׂ��ꏊ��";
		mes "�����Ă����̂ł��B";
		next;
		mes "[�}���X]";
		mes "���Ԃ��̃V���c��";
		mes "�X�ɐ��ރ����X�^�[��ގ������";
		mes "��ɓ���邱�Ƃ��ł��܂��B";
		mes "�̂͂������񎝂��Ă�����ł����ǁA";
		mes "�S���D���Ă��܂����̂ł��c�c�B";
		next;
		mes "[�}���X]";
		mes "�ǂ�������T���o���Ă��������B";
		mes "���肢���܂��B";
		next;
		mes "[�}���X]";
		mes "�������͂悭�����ꏊ�̂��Ƃ�";
		mes "�m���Ă���݂����Ȃ�ł����ǁA";
		mes "�����ɍs���Ă�������Ȃ���ł��B";
		next;
		mes "[�}���X]";
		mes "�ꂩ���ɂ����Ƃ���";
		mes "�����Ȃ��q�����Ȃ̂�";
		mes "�������Ă��܂��Ă���̂���";
		mes "����܂���B";
		next;
		mes "[�}���X]";
		mes "�������̘b�𕷂���";
		mes "������l�̖���";
		mes "�����Ă������ȏꏊ��";
		mes "�T���Ă��Ă��炦�܂��񂩁H";
		if(checkquest(72092)) {
			delquest 72092;
			setquest 7388;
		} else {
			delquest 7390;
			setquest 7388;
		}
		close;
	case 2:
		mes "[�}���X]";
		mes "�����ł����c�c�B";
		mes "���̕��ɂ��肢���Ă݂܂��B";
		mes "�����A���킢�������c�c�B";
		close;
	case 3:
		mes "[�}���X]";
		mes "���͎O�q�̖��������ł��B";
		mes "���ł����܂ɊԈႦ���Ⴄ���炢�ŁB";
		mes "���ӂӁc�c�B";
		next;
		mes "[�}���X]";
		mes "�����A�Ȃ����킩��Ȃ���ł�����";
		mes "�X�ɗV�тɍs���ƕK���N����";
		mes "���ɖ����ċA���ė���Ȃ���ł��B";
		mes "�{���ɍ��������ł��c�c�B";
		close;
	}
OnInit:
	waitingroom "�}���X�̎q���T��",0;
	end;
}

ma_in01_jp.gat,38,158,7	script	���̎q	576,{
	mes "[���̎q]";
	mes "���̂ˁA���̂ˁB�X�͕|������";
	mes "�������낢�������������񂠂��!!";
	mes "������悭�V�тɍs���񂾂��ǁA";
	mes "�Ȃ������ɖ������Ⴄ��ł��c�c�B";
	next;
	mes "[���̎q]";
	mes "�ł��A���������ɖ����킯�ł�";
	mes "�Ȃ�������v�`�B";
	mes "�K���N�������q�ɂȂ�̂�B";
	next;
	mes "[���̎q]";
	mes "���̖k���̕��ɍs����";
	mes "����������ƈ���ł���́B";
	mes "�����ƕ����Ă���ƁA";
	mes "�ǂ������痈���̂�";
	mes "�킩��Ȃ��Ȃ����Ⴄ�́B";
	close;
}

ma_in01_jp.gat,39,158,7	script	���̎q	576,{
	mes "[���̎q]";
	mes "�������V�тɂ����Ă�̂�";
	mes "�Ȃ�Ŗ��q�ɂȂ����Ⴄ�񂾂�`�B";
	next;
	mes "[���̎q]";
	mes "���̓�̋���n���";
	mes "�����ꓹ������́B";
	mes "���̋߂��Ŗ�����";
	mes "�����Ă���������Ƃ������B";
	next;
	mes "[���̎q]";
	mes "�����ЂƂ���n�������Ƃ�����́B";
	mes "�������ɂ͕ςȕǂ݂����Ȃ̂�";
	mes "��������B";
	close;
}

ma_fild01.gat,251,93,3	script	���ɖ������q��#mal01	576,{
	if(checkquest(7388)) {
		if(countitem(12700) < 1) {
			mes "[���т��q]";
			mes "���������Ă��Ȃ������q�H";
			mes "�ق�Ƃ�����̃C�^�Y����";
			mes "���ɂȂ����Ⴄ�I";
			next;
			mes "[���т��q]";
			mes "����Ȏ��ɗ��Ԃ��̃V���c�������";
			mes "�����Ƀ|�[�g�}�����܂ŋA���̂Ɂ`�B";
			close;
		}
		mes "[���т��q]";
		mes "���[�I�@�܂������炾�I";
		mes "�܂��������ɖ����悤��";
		mes "�C�^�Y�����ꂽ�I";
		next;
		menu "�ǂ������̂�����",-;
		mes "[���т��q]";
		mes "�ƂɋA�肽���̂ɁA�����Ɏז������";
		mes "���܂��߂鎖���o���Ȃ��́c�c�B";
		mes "�����߂�Ȃ���";
		mes "���ꂳ�񂪐S�z�����Ⴄ�c�c�B";
		mes "����Ȏ��ɗ��Ԃ��̃V���c���������";
		mes "�����|�[�g�}�����ɋA���̂Ɂ`�B";
		next;
		menu "���Ԃ��̃V���c��n��",-;
		mes "[���т��q]";
		mes "�ق�ƁH";
		mes "�킟�I���肪�Ƃ��`�I";
		mes "���ꂪ����ΉƂɋA���I";
		next;
		mes "[���т��q]";
		mes "�Ђ���Ƃ���";
		mes "���ꂳ��ɗ��܂ꂽ�́H";
		mes "�S�z���Ă����̂��ȁc�c�B";
		mes "�����A���Ă��ꂳ��Ɏӂ�Ȃ���I";
		mes "�{���ɂ��肪�Ƃ��I";
		delitem 12700,1;
		setquest 7389;
		delquest 7388;
		if(strnpcinfo(2) == "mal01") {
			if(rand(2) == 0)
				hideoffnpc "���ɖ������q��#mal02";
			else
				hideoffnpc "���ɖ������q��#mal03";
		} else if(strnpcinfo(2) == "mal02") {
			if(rand(2) == 0)
				hideoffnpc "���ɖ������q��#mal01";
			else
				hideoffnpc "���ɖ������q��#mal03";
		} else {
			if(rand(2) == 0)
				hideoffnpc "���ɖ������q��#mal01";
			else
				hideoffnpc "���ɖ������q��#mal02";
		}
		hideonnpc strnpcinfo(0);
		close;
	}
	if(checkquest(7389)) {
		mes "[���т��q]";
		mes "�V���c�A���肪�Ƃ��������܂����I";
		mes "��������������A��[�B";
		close;
	}
	mes "[���т��q]";
	mes "���������Ȃ��B�܂����ɖ��������ȁH";
	mes "�����͉������낤�c�c�B";
	mes "�m���O�Ԗڂ̖؂ŃO���O������āA";
	mes "���z���o�Ă�����ɂ܂������s����";
	mes "�Ƃɂ��͂��Ȃ̂Ɂc�c�B";
	next;
	mes "[���т��q]";
	mes "�ǂ����Ă����`";
	mes "�������甲���o���Ȃ��Ȃ�񂾂�B";
	mes (Sex? "���Z": "���o")+ "����͒m���Ă��܂����H";
	next;
	mes "[���т��q]";
	mes "�Ȃɂ������l�B������";
	mes "���̎ז������Ă���̂��ȁH";
	close;
OnInit:
	if(strnpcinfo(2) == "mal01") {
		hideonnpc "���ɖ������q��#mal01";
		hideonnpc "���ɖ������q��#mal02";
		hideonnpc "���ɖ������q��#mal03";
		hideoffnpc "���ɖ������q��#mal0" +rand(1,3);
	}
	end;
}
ma_fild01.gat,114,141,3	duplicate(���ɖ������q��#mal01)	���ɖ������q��#mal02	576
ma_fild01.gat,130,314,3	duplicate(���ɖ������q��#mal01)	���ɖ������q��#mal03	576

//============================================================
// ���l�̗F�B�J�v���N�G�X�gNPC
//------------------------------------------------------------
ma_fild02.gat,241,39,5	script	�J�v���E�u�f�B�f�B	572,{
	if(checkquest(7409)) {
		if(!(checkquest(7409) & 0x4)) {
			mes "[�u�f�B�f�B]";
			mes "�\���V�̃u�M�X�M�X��";
			mes "���d�u�����āI";
			mes "�u�f�B�f�B���܂��F�B�̂��߂�";
			mes "�̂���悤�ɁB�ӂ���Ӂ`";
			close;
		}
		mes "[�u�f�B�f�B]";
		mes "�������A���l�I";
		mes "�u�M�X�M�X�̐���ȋ�������";
		mes "�����܂ŕ��������I";
		mes "�u�f�B�f�B�͂܂��F�B�ׂ̈�";
		mes "�̂��Ă������̂�!?";
		next;
		mes "[�u�f�B�f�B]";
		mes "�u�f�B�f�B��������l����B";
		mes "�������I�@���̂������������B";
		mes "���l�������Ă����炢���Ǝv���B";
		next;
		if(checkweight(6497,1) == 0) {
			mes "[�u�f�B�f�B]";
			mes "���l�I";
			mes "�A�C�e���������ς������߂��I";
			mes "���炪�n���Ȃ��`";
			mes "����������܂����ā`�B";
			close;
		}
		mes "[�u�f�B�f�B]";
		mes "�D�����J�v���A���l�B�̗F�B�B";
		mes "�܂�����Ƃ��ł���΂����Ǝv���B";
		mes "����͗F�B�̂��߂̏j���B";
		mes "�ӂ킠�����`�I�@�ӂ���Ӂ`�I";
		setquest 7410;
		delquest 7409;
		getitem 6497,1;
		if(checkre())
			getexp 50000,20000;
		else
			getexp 500000,200000;
		set $MalayaName$[2],strcharinfo(0);
		close;
	}
	mes "[�u�f�B�f�B]";
	mes "�ӂ��ӂ�Ӂ`�B";
	mes "�u�f�B�f�B�͗D�����J�v���`YO�I";
	mes "�j���ɂ��D�����J�v���`YO!!";
	mes "�����ɂ��D�����J�v���`YO!!!";
	mes "�݂�ȂɗD�����J�v���`YO!!!!";
	next;
	mes "[�u�f�B�f�B]";
	mes "�����̌N��";
	mes "�u�f�B�f�B�̉̕����ɗ����H";
	mes "����Ƃ��u�f�B�f�B�̑��k��";
	mes "�̂��Ă����́H";
	next;
	switch(select("�N�͒N�H","���k���������ƁH","���ɗp�͖���")) {
	case 1:
		mes "[�u�f�B�f�B]";
		mes "�u�f�B�f�B�͉̍D���ȃJ�v���B";
		mes "�J�v���͐X�ɏZ�ދ��l�B�̂��Ƃ����B";
		mes "���܂ɐX�ŗV�Ԏq��������";
		mes "���炩���Ĉ�������J�v�������邯�ǁA";
		mes "�u�f�B�f�B�͂����ŉ̂������B";
		next;
		mes "[�u�f�B�f�B]";
		mes "�J�v���݂͂�Ȑl�ԑ�D���I";
		mes "�݂��^FF0000�����l�Ԃ̘b�A����B";
		mes "���̐l�Ԃ̉\�A�݂�ȂɍL�܂�B^000000";
		next;
		mes "[�u�f�B�f�B]";
		mes "���̑O�A�����|�����l�Ԃ̘b�A�����B";
		mes "���̘b�A�X���ɍL�܂����B";
		mes "�l�ԁA�X���Ől�C�ɂȂ����B";
		mes "�l�ԁA�������B�J�v���A�������B";
		next;
		mes "[�u�f�B�f�B]";
		mes "�J�v���͐l�ԂƗF�B�Ȃ肽���B";
		mes "�ł��J�v���A�p���������艮�����B";
		mes "�l�ԂɌ�����Ƃ����ɉB���B";
		next;
		mes "[�u�f�B�f�B]";
		mes "�u�f�B�f�B�͒p���������Ȃ��B";
		mes "�F�B�̂��߂ɉ́A�̂��B";
		next;
		mes "[�u�f�B�f�B]";
		mes "���A�n�A�r�A�{�A�؁A";
		mes "�݂�Ȏ��̉̊��ł����B";
		mes "�݂�ȗF�B�B";
		next;
		mes "[�u�f�B�f�B]";
		mes "�ł��A�Жڂ̃u�M�X�M�X�����Ⴄ�B";
		mes "�������̗F�B�C�W����B";
		mes "�{���ɑ����炵���B";
		mes "�ł��A�u�f�B�f�B�ア�B";
		next;
		mes "[�u�f�B�f�B]";
		mes "�Жڂ��|�����ǁA";
		mes "�����������Ă��鞞�_�ƂĂ��|���B";
		mes "���A�F�B�ɉ̂𕷂��������̂ɁA";
		mes "�����̂����ł݂�ȐX�A����Ȃ��B";
		next;
		mes "[�u�f�B�f�B]";
		mes "������u�f�B�f�B�����ŉ̂��B";
		mes "���l�����ς������ʂ�B";
		mes "�u�f�B�f�B�͗��l�B�̗F�B�B";
		mes "���Ȃ����u�f�B�f�B�̗F�B���B";
		close;
	case 2:
		if(BaseLevel < 100) {
			mes "[�u�f�B�f�B]";
			mes "�u�M�X�M�X�ɋ�������̂��H";
			mes "����͐X�̖\���V���I";
			mes "�u�f�B�f�B�̗F�B���C�W����I";
			next;
			mes "[�u�f�B�f�B]";
			mes "�c�O�����ǃu�f�B�f�B��";
			mes "�̂����ȊO�͉����ł��Ȃ��B";
			mes "���_������������";
			mes "�u�f�B�f�B�ǂ��ɂ��ł��Ȃ��B";
			mes "�u�f�B�f�B�ア�B";
			next;
			mes "[�u�f�B�f�B]";
			mes "���l�̌N�������B�����B";
			mes "�������B�߂����B������̂��B";
			mes "�ӂ��ȂӁ`�@�ȂȂ��Ӂ`";
			next;
			mes "�]�u�M�X�M�X�̑ގ���";
			mes "�@��`���Ă����������A";
			mes "�@���x��������Ȃ��悤���B";
			mes "�@^FF0000BaseLv100�ȏ�^000000�ɂȂ��Ă���";
			mes "�@���炽�߂āA�b�����Ă݂悤�]";
			close;
		}
		if(checkquest(7410)) {
			if(!(checkquest(7410) & 0x2)) {
				mes "[�u�f�B�f�B]";
				mes "���l�A�u�f�B�f�B�̗F�B�I";
				mes "�u�M�X�M�X��";
				mes "�����܂œ������悤���B";
				mes "���A���A�n�A�r�A�{�̗F�B��";
				mes "�����ƋA���Ă���I";
				next;
				mes "[�u�f�B�f�B]";
				mes "�����ǃu�f�B�f�B�s���B";
				mes "�Жڂ̉����͂����ƋA���ė���B";
				mes "���̎��������Ă����H";
				next;
				mes "[�u�f�B�f�B]";
				mes "���l�`�u�f�B�f�B�̗F�B�`";
				mes "�ӂ��ӂ�Ӂ`";
				mes "�{���ɁA���肪�Ƃ��`";
				close;
			}
			mes "[�u�f�B�f�B]";
			mes "�e�؂ȗ��l�B";
			mes "�u�M�X�M�X�܂������B";
			mes "�ǂ������炢���H�@�ǂ��悤�H";
			next;
			mes "[�u�f�B�f�B]";
			mes "�u�f�B�f�B�̂��ƁA�����͓{��o���B";
			mes "�����ǁA���݂̂�Ȃ͊�ԁB";
			mes "�Ȃ̂Ńu�f�B�f�B��ρB�������B";
			next;
			if(select("�u�M�X�M�X��ގ�����","���낵���b�ł���") == 2) {
				mes "[�u�f�B�f�B]";
				mes "��������B�{������B";
				mes "�u�M�X�M�X�̂�����";
				mes "�u�f�B�f�B�̗F�B���́A�����Ȃ��B";
				mes "�{���ɉ��Ƃ��������B";
				close;
			}
			mes "[�u�f�B�f�B]";
			mes "�u�M�X�M�X��";
			mes "���d�u�����Ă����̂��H�I";
			mes "������͐X�̒�����B";
			mes "10�C���|���΁A�����Ƃт����肷���B";
			mes "���肪�Ƃ����l�I�@���肢��I";
			delquest 7410;
			setquest 7409;
			close;
		}
		mes "[�u�f�B�f�B]";
		mes "�����炵���u�M�X�M�X�I";
		mes "����͐X�̖\���V�I";
		mes "�u�f�B�f�B�̗F�B�C�W����I";
		next;
		mes "[�u�f�B�f�B]";
		mes "�c�O�����ǃu�f�B�f�B��";
		mes "�̂����ȊO�͉����ł��Ȃ��B";
		mes "���_��������������";
		mes "�u�f�B�f�B�ǂ��ɂ��ł��Ȃ��B";
		mes "�u�f�B�f�B�ア�B";
		next;
		mes "[�u�f�B�f�B]";
		mes "�u�M�X�M�X�I�@�����炵����I";
		next;
		if(select("�u�M�X�M�X��ގ�����","���낵���b�ł���") == 2) {
			mes "[�u�f�B�f�B]";
			mes "��������B�{������B";
			mes "�u�M�X�M�X�̂�����";
			mes "�u�f�B�f�B�̗F�B���́A�����Ȃ��B";
			mes "�{���ɉ��Ƃ��������B";
			close;
		}
		mes "[�u�f�B�f�B]";
		mes "�u�M�X�M�X��";
		mes "���d�u�����Ă����̂��H�I";
		mes "������͐X�̒�����B";
		mes "10�C���|���΁A�����Ƃт����肷���B";
		mes "���肪�Ƃ����l�I�@���肢��I";
		delquest 72094;
		setquest 7409;
		close;
	case 3:
		mes "[�u�f�B�f�B]";
		mes "�����`���҂�`";
		mes "�u�f�B�f�B���̂��`";
		mes "�C��t���Ăˁ`";
		mes "�܂����Ăˁ`";
		mes "����Ȃ�`";
		next;
		mes "[�u�f�B�f�B]";
		mes "�ӂ��ӂ�Ӂ`";
		mes "�D�����P�ǂȃJ�v���̏j���`";
		mes "�J�v������̃v���[���g�`";
		mes "�ӂ���Ӂ`";
		close;
	}
OnInit:
	waitingroom "���l�̗F�B�J�v��",0;
	end;
}

//============================================================
// �V�C�Ō�t�ƕa�@�N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_4QUE -> 0�`29
//------------------------------------------------------------
malaya.gat,55,72,4	script	�Ō�t	569,{
	if(MALAYA_1QUE < 6) {
		mes "[�Ō�t]";
		mes "���̒��̐l�����͂悻�҂�";
		mes "���܂�ɂ��x���������ł��B";
		emotion 7;
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t]";
		mes "�������R�͂���Ǝv���܂����A";
		mes "���������b���Ă���Ă������̂Ɂc�c";
		close2;
		cutin "malaya_nurseA01",255;
		end;
	}
	if(BaseLevel < 100) {
		mes "[�Ō�t]";
		mes "���������āc�c";
		mes "���̕a�@�ɓ������ł����H";
		mes "���܁A�����ɂ͓���Ȃ�";
		mes "�݂����Ȃ�ł��B";
		next;
		mes "�]�N�G�X�g��i�s����ɂ�";
		mes "�@Base���x���������Ȃ��悤�ł��B";
		mes "�@^FF0000Base���x��100^000000�ȏ�ɂȂ�����";
		mes "�@�ēx�b�������Ă��������]";
		close;
	}
	switch(MALAYA_4QUE) {
	case 0:
		mes "[�Ō�t]";
		mes "���������āc�c";
		mes "���̕a�@�ɓ������ł����H";
		cutin "malaya_nurseA01",2;
		next;
		if(select("�����ł�","�Ⴂ�܂�") == 2) {
			mes "[�Ō�t]";
			mes "���c�c�����ł����B";
			emotion 28;
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t]";
		mes "�悩�����`";
		mes "�����炸���ƁA�N���ʂ肩����Ȃ�����";
		mes "�҂��Ă�����ł���`";
		cutin "malaya_nurseA02",2;
		next;
		switch(select("�a�@�̂��Ƃ𕷂�","�l��҂��Ă������R�𕷂�","��������")) {
		case 1:
			mes "[�Ō�t]";
			mes "�����́A���̒��ŗB��̕a�@�ł��B";
			mes "�����āA�������������΂߂邱�ƂɂȂ�";
			mes "�E��ł�����܂��B";
			cutin "malaya_nurseA03",2;
			next;
			mes "[�Ō�t]";
			mes "�����O�ɐݗ����ꂽ";
			mes "�V�����a�@����";
			mes "�����Ă����̂ł����c�c";
			mes "���ȕ��͋C�Ƃ������A";
			mes "�c�Ƃ��Ă���悤��";
			mes "�����Ȃ���ł���ˁB";
			emotion 4;
			next;
			menu "�l��҂��Ă������R�𕷂�",-;
			mes "[�Ō�t]";
			mes "���̒��ɊŌ�t���K�v�Ȃ̂�";
			mes "���З��Ăق����Ƃ����A�����󂯂āA";
			mes "�L���a�@����̃X�J�E�g��f����";
			mes "�����̂ł����ǁc�c";
			next;
			mes "[�Ō�t]";
			mes "���ɖ����Ȃ���";
			mes "����ƒ������Ǝv������A";
			mes "�����J���Ȃ���ł���B";
			emotion 28;
			break;
		case 2:
			mes "[�Ō�t]";
			mes "���̒��ɊŌ�t���K�v�Ȃ̂�";
			mes "���З��Ăق����Ƃ����A�����󂯂āA";
			mes "�L���a�@����̃X�J�E�g��f����";
			mes "�����̂ł����ǁc�c";
			cutin "malaya_nurseA03",2;
			next;
			mes "[�Ō�t]";
			mes "���ɖ����Ȃ���";
			mes "����ƒ������Ǝv������A";
			mes "�����J���Ȃ���ł���B";
			emotion 28;
			next;
			menu "�a�@�̂��Ƃ𕷂�",-;
			mes "[�Ō�t]";
			mes "�����́A���̒��ŗB��̕a�@�ł��B";
			mes "�����āA�������������΂߂邱�ƂɂȂ�";
			mes "�E��ł�����܂��B";
			next;
			mes "[�Ō�t]";
			mes "�����O�ɐݗ����ꂽ";
			mes "�V�����a�@����";
			mes "�����Ă����̂ł����c�c";
			mes "���ȕ��͋C�Ƃ������A";
			mes "�c�Ƃ��Ă���悤��";
			mes "�����Ȃ���ł���ˁB";
			emotion 4;
			break;
		case 3:
			mes "[�Ō�t]";
			mes "���Z�����悤�ł��ˁB";
			mes "����Ȃ�A���̂��Ƃ�";
			mes "�C�ɂ��Ȃ��ł����ł��B";
			emotion 28;
			cutin "malaya_nurseA03",2;
			close2;
			cutin "malaya_nurseA03",255;
			end;
		}
		next;
		mes "[�Ō�t]";
		mes "���������킯�ŁA";
		mes "�����a�@�ɓ��肽����ł����ǁc�c";
		mes "��`���Ă�����Ă������ł����H";
		cutin "malaya_nurseA04",2;
		next;
		mes "[�Ō�t]";
		mes "���͊J���Ȃ����A";
		mes "�ו��͏d�����I";
		mes "���͎��āA���������܂���B";
		cutin "malaya_nurseA03",2;
		next;
		mes "[�Ō�t]";
		mes "�����Ȃ�Ƃ킩���Ă�����A";
		mes "�����₷���C�𗚂��ė����̂Ɂc�c�B";
		emotion 28;
		next;
		if(select("��`��","��`��Ȃ�") == 2) {
			mes "[�Ō�t]";
			mes "���Z�����悤�ł��ˁB";
			mes "����Ȃ�A���̂��Ƃ�";
			mes "�C�ɂ��Ȃ��ł����ł��B";
			emotion 28;
			cutin "malaya_nurseA03",2;
			close2;
			cutin "malaya_nurseA03",255;
			end;
		}
		mes "[�Ō�t]";
		mes "����Ȑe�؂ȕ��Ƃ���ł���Ȃ�āA";
		mes "���̐��̒����܂��܂�";
		mes "�̂Ă����̂ł͂���܂���ˁB";
		emotion 28;
		next;
		mes "[�Ō�t���Y]";
		mes "���͂��̕a�@�̊Ō�t�ɂȂ�\���";
		mes "���Y�Ƃ����܂��B";
		mes "���̏�Ԃł́A�����邩";
		mes "���Ǝ҂ɂȂ�̂��킩��܂��񂪁c�c";
		next;
		mes "[�Ō�t���Y]";
		mes "���������a�@�ɓ��肽���̂ł����c�c";
		mes "���̑O�ɁA";
		mes "���̔炪�ނ��Ă��܂���";
		mes "�C�𗚂����Ƃ��ł��܂���B";
		mes "��������ی�ł�����̂�";
		mes "�T���Ă��Ă���܂��񂩁H";
		emotion 26;
		cutin "malaya_nurseA04",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�����ł��ˁA";
		mes "^0000FF�����������^000000��2��";
		mes "�����Ă��Ă��炦��Ə�����܂��B";
		next;
		mes "�]^0000FF�����������^000000��2�����Ă��āA";
		mes "�@�Ō�t���Y�ɓn�����]";
		delquest 72074;
		setquest 11284;
		set MALAYA_4QUE,1;
		cutin "malaya_nurseA04",255;
		close;
	case 1:
		if(countitem(930) < 2) {
			mes "[�Ō�t���Y]";
			mes "���������a�@�ɓ��肽���̂ł����c�c";
			mes "���̑O�ɁA���̔炪�ނ��Ă��܂���";
			mes "�C�𗚂����Ƃ��ł��Ȃ��̂ŁA";
			mes "��������ی�ł�����̂�";
			mes "�T���Ă��Ă���܂��񂩁H";
			emotion 26;
			cutin "malaya_nurseA03",2;
			next;
			mes "[�Ō�t���Y]";
			mes "�����ł��ˁA";
			mes "^0000FF�����������^000000��2��";
			mes "�����Ă��Ă��炦��Ə�����܂��B";
			next;
			mes "�]^0000FF�����������^000000��2�����Ă��āA";
			mes "�@�Ō�t���Y�ɓn�����]";
			cutin "malaya_nurseA03",255;
			close;
		}
		mes "[�Ō�t���Y]";
		mes "���c�c";
		mes "����������т������Ă���";
		mes "���ꂽ��ł��ˁB";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "����ł́A";
		mes "���̉ؗ�ȊŌ�t�f�r���[�̂��߂ɁI";
		mes "�������I";
		next;
		mes "[�Ō�t���Y]";
		mes "���邮��`";
		mes "������ƁB";
		next;
		mes "�]�Ō�t���Y�����̏��u��";
		mes "�@�I�����悤���B";
		mes "�@������x�b�������Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		delitem 930,2;
		delquest 11284;
		setquest 72100;
		set MALAYA_4QUE,2;
		close;
	case 2:
		mes "[�Ō�t���Y]";
		mes "�����ɗǂ��Ȃ�킯�ł�";
		mes "����܂��񂯂ǁA";
		mes "�ɂ݂͎��܂��Ă��܂����B";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�ł́I";
		mes "����l�ł͊J�����܂���ł������A";
		mes "�ꏏ�ɔ��������Ă݂܂��傤�I";
		next;
		mes "�]�a�@�̔����J���Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		delquest 72100;
		setquest 11285;
		set MALAYA_4QUE,3;
		close;
	case 3:
		mes "[�Ō�t���Y]";
		mes "����l�ł͊J�����܂���ł������A";
		mes "�ꏏ�ɔ��������Ă݂܂��傤�I";
		cutin "malaya_nurseA01",2;
		next;
		mes "�]�a�@�̔����J���Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		close;
	case 4:
		mes "[�Ō�t���Y]";
		mes "�����Ă������Ă��A";
		mes "���ɓ��������Ƃ��Ă�";
		mes "���͊J���܂���ˁB";
		cutin "malaya_nurseA03",2;
		emotion 19,"";
		next;
		mes "[�Ō�t���Y]";
		mes "���������ł��ˁ`";
		mes "�a�@�������ꂽ�̂Ȃ�A";
		mes "�����Ă΂ꂽ�̂�";
		mes "�Ȃ񂾂�����ł��傤�H";
		next;
		mes "[�Ō�t���Y]";
		mes "�悵�B";
		mes "��������ȏ�䖝�ł��܂���I";
		emotion 6;
		next;
		mes "[�Ō�t���Y]";
		mes "���͖{���ɘA�����Ă݂܂��B";
		mes "���̊ԂɁA���̐l��";
		mes "���̕a�@�̂��Ƃ�";
		mes "�����Ă��炦�܂��񂩁H";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "���傤�ǁA�߂��ɏ��������܂��ˁB";
		mes "������ƕ����Ă��Ă��炦�܂����H";
		next;
		mes "�]�߂��ɂ��钬�̏�����";
		mes "�@�a�@�̘b�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		delquest 11286;
		setquest 11287;
		set MALAYA_4QUE,5;
		close;
	case 5:
		mes "[�Ō�t���Y]";
		mes "���͖{���ɘA�����Ă݂܂��B";
		mes "���̊ԂɁA���̐l��";
		mes "���̕a�@�̂��Ƃ�";
		mes "�����Ă��炦�܂��񂩁H";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�����߂��ɏ��������܂��ˁB";
		mes "������ƕ����Ă��Ă��炦�܂����H";
		next;
		mes "�]�߂��ɂ��钬�̏�����";
		mes "�@�a�@�̘b�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		close;
	case 6:
		mes "[�Ō�t���Y]";
		mes "���������܂������H";
		emotion 1;
		cutin "malaya_nurseA02",2;
		next;
		menu "�����ɕ������b��`����",-;
		mes "[�Ō�t���Y]";
		mes "���������ł��ˁB";
		mes "�{���ɘA��������A";
		mes "�������ɂ��̕a�@����";
		mes "�����Ă����̂ł����ǁc�c";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�킴�킴���̒����玄���Ă�ł܂�";
		mes "�{�����R�����Ƃ��v���܂��񂵁A";
		mes "���܂��܁A���̏�����";
		mes "�m��Ȃ�����������������܂���ˁB";
		next;
		mes "[�Ō�t���Y]";
		mes "���͂�����x�{���ɘA������";
		mes "�ڂ��������Ă݂܂��B";
		mes "���݂܂��񂪁A���x�͂��ׂ�";
		mes "��t���̉Ƃɂ���j����";
		mes "�b�𕷂��Ă݂Ă���܂��񂩁H";
		next;
		mes "�]���������ɂ���Ƃ̒�ɂ���A";
		mes "�@���̒j���ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		delquest 11288;
		setquest 11289;
		set MALAYA_4QUE,7;
		close;
	case 7:
		mes "[�Ō�t���Y]";
		mes "���͂�����x�{���ɘA������";
		mes "�ڂ��������Ă݂܂��B";
		mes "���݂܂��񂪁A���x�͂��ׂ�";
		mes "��t���̉Ƃɂ���j����";
		mes "�b�𕷂��Ă݂Ă���܂��񂩁H";
		cutin "malaya_nurseA01",2;
		next;
		mes "�]���������ɂ���Ƃ̒�ɂ���A";
		mes "�@���̒j���ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		close;
	case 8:
		mes "[�Ō�t���Y]";
		mes "���قł����H";
		mes "�͂��`";
		mes "�����ƒm���Ă���΁A";
		mes "�����Ԃ��҂��Ȃ��ł悩�����̂ɁI";
		emotion 32;
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�c�c";
		mes "����ŁA���́c�c";
		next;
		mes "[�Ō�t���Y]";
		mes "�\����Ȃ���ł����ǁA";
		mes "�����ɂ��Ă��܂艓���܂�";
		mes "�ړ��ł��Ȃ��̂ŁA";
		mes "���̑���ɗ��ق܂�";
		mes "�s���Ă��Ă��炦�܂��񂩁H";
		mes "���肢���܂��B";
		emotion 19;
		cutin "malaya_nurseA03",2;
		next;
		mes "[�Ō�t���Y]";
		mes "���͉ו��Ԃ����Ȃ���A";
		mes "���̎��Âł����Ă����܂��B";
		next;
		mes "�]�Ō�t���Y�̑���ɁA";
		mes "�@���ق̋߂�����Ƃ���";
		mes "�@�h�N�^�[�ɉ�ɍs�����]";
		cutin "malaya_nurseA03",255;
		delquest 11290;
		setquest 11291;
		set MALAYA_4QUE,9;
		close;
	case 9:
		mes "[�Ō�t���Y]";
		mes "�����ɂ��Ă��܂艓���܂�";
		mes "�ړ��ł��Ȃ��̂ŁA";
		mes "���̑���ɗ��ق܂�";
		mes "�s���Ă��Ă��炦�܂��񂩁H";
		emotion 19;
		cutin "malaya_nurseA03",2;
		next;
		mes "[�Ō�t���Y]";
		mes "���͉ו��Ԃ����Ȃ���A";
		mes "���̎��Âł����Ă����܂��B";
		next;
		mes "�]�Ō�t���Y�̑���ɁA";
		mes "�@���ق̋߂�����Ƃ���";
		mes "�@�h�N�^�[�ɉ�ɍs�����]";
		cutin "malaya_nurseA03",255;
		close;
	case 10:
		mes "[�Ō�t���Y]";
		mes "���قɍs���Ă�����ł��ˁB";
		mes "�Ȃɂ��킩��܂������H";
		cutin "malaya_nurseA02",2;
		next;
		menu "�`����`����",-;
		mes "[�Ō�t���Y]";
		mes "���ł����H";
		mes "����ŕa�@�ɓ���܂��ˁI";
		mes "�ł́A�������������g����";
		mes "�����J���܂��傤�I";
		next;
		mes "�]�a�@�̌����g���āA";
		mes "�@�����J���Ă݂悤�]";
		cutin "malaya_nurseA02",255;
		delquest 11292;
		setquest 72105;
		set MALAYA_4QUE,11;
		close;
	case 11:
		mes "[�Ō�t���Y]";
		mes "���ł����H";
		mes "����ŕa�@�ɓ���܂��ˁI";
		mes "�ł́A�������������g����";
		mes "�����J���܂��傤�I";
		cutin "malaya_nurseA02",2;
		next;
		mes "�]�a�@�̌����g���āA";
		mes "�@�����J���Ă݂悤�]";
		cutin "malaya_nurseA02",255;
		close;
	case 12:
		mes "[�Ō�t���Y]";
		mes "�����H";
		mes "�����܂��ĂȂ��ł��ˁB";
		mes "�ł��A���͊J���܂��񂵁c�c";
		mes "�ǂ��������Ƃł��傤�H";
		emotion 1;
		emotion 1,"";
		cutin "malaya_nurseA04",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�͂��`";
		mes "�h�N�^�[�����Ă����܂�";
		mes "�҂����Ȃ��̂��Ȃ��c�c�H";
		cutin "malaya_nurseA03",2;
		next;
		mes "[�H�H�H]";
		mes "�c�c";
		cutin "malaya_nurseA03",255;
		next;
		mes "[�H�H�H]";
		mes "�������c�c";
		emotion 1,"";
		emotion 1;
		next;
		mes "[�H�H�H]";
		mes (Sex? "��������": "���΂���")+ "�A";
		mes "�a�@�ɂ͓���Ȃ���B";
		next;
		mes "[�Ō�t���Y]";
		mes "����H";
		next;
		mes "[�H�H�H]";
		mes "�ӂӂӂӁc�c";
		next;
		mes "[�H�H�H]";
		mes "���O�������킯�ɂ͂����Ȃ��̂��I";
		mes "�a�@�ɗ������Ƃ�";
		mes "���ꂳ��ɂ΂��Ɠ{���邩��ȁB";
		next;
		switch(select("�a�@�ɓ���Ȃ����Ƃɂ���","�{����H","�p��������","�����Ƃ��Ă���")) {
		case 1:
			mes "[�H�H�H]";
			mes "�ׂ̉ƂɏZ��ł��邨�k����";
			mes "�a�@�̎���ŁA���������Ȃ���";
			mes "�_�̂悤�ȕ���";
			mes "�n�ʂɓ˂��h���Ă����̂��B";
			mes "�����ƃP�b�J�C���Ă���ȁB";
			next;
			mes "[�H�H�H]";
			mes "�ӂӂӂӁc�c";
			mes "����ׂ肷���Ă��܂����悤���ȁB";
			mes "�a�@�ɂ��邱�Ƃ��o���Ȃ��悤��";
			mes "�{�N�͐g���B���̂��B";
			break;
		case 2:
			mes "[�H�H�H]";
			mes "�O�ɂ��ꂳ�񂪌����Ă��̂��B";
			mes "�ׂ̂��o����";
			mes "���̕a�@�ɓ��@���Ă����炵���B";
			mes "�މ@�͂ł��Ȃ��������ǁc�c";
			next;
			mes "[�H�H�H]";
			mes "���ɂ��A���̕a�@�ɓ��@�����l������";
			mes "�������Ƃ���R�������炵����B";
			next;
			mes "[�H�H�H]";
			mes "������A���ꂳ���";
			mes "�{�N�������ɗ���̂��֎~���Ă�̂��B";
			break;
		case 3:
			mes "[�H�H�H]";
			mes "����͂ł��Ȃ��̂��B";
			mes "�O���o���Ă��K��@���ꂽ����I";
			mes "�m���Ă邩�H";
			mes "���K��@�����ƂƂĂ��ɂ��̂����I";
			break;
		case 4:
			mes "[�H�H�H]";
			mes "�ӂӂӂӁc�c";
			close;
		}
		next;
		mes "�]���͕a�@�̓����߂��ɂ���";
		mes "�@���ނ�̕����畷������B";
		mes "�@���ނ�𒲂ׂĂ݂悤�]";
		misceffect 18,"���ނ�";
		delquest 11293;
		setquest 11294;
		set MALAYA_4QUE,13;
		close;
	case 13:
		mes "�]���͕a�@�̓����߂��ɂ���";
		mes "�@���ނ�̕����畷������B";
		mes "�@�߂��𒲂ׂĂ݂悤�]";
		misceffect 18,"���ނ�";
		close;
	case 14:
		mes "[�Ō�t���Y]";
		mes "�_�ƕa�@�ɓ���Ȃ��̂ƁA";
		mes "�����֌W������̂ł��傤���H";
		mes "�ЂƂ܂��A�a�@�̎��ӂ𒲂ׂ�";
		mes "�������ȂƂ��낪�Ȃ���";
		mes "�m�F���������悳�����ł��ˁB";
		cutin "malaya_nurseA01",2;
		close2;
		cutin "malaya_nurseA01",255;
		end;
	case 15:
		mes "[�Ō�t���Y]";
		mes "���k���񂪎h�����_��";
		mes "���ꂪ�\���Ă�������ł����H";
		mes "���`��c�c";
		mes "���������ǂ��������̂Ȃ̂��A";
		mes "���k����̏��ɍs����";
		mes "�����Ă���܂��񂩁H";
		cutin "malaya_nurseA04",2;
		next;
		mes "[�Ō�t���Y]";
		mes "���͂����ŕa�@�̗l�q�����Ă��܂��B";
		mes "���́c�c";
		mes "�܂��A�����ɂ��̂ŁA";
		mes "�ꏏ�ɍs�������ɂȂ���ł��B";
		next;
		if(select("�s��","�s���Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "���c�c�s���Ă���Ȃ���ł����H";
			mes "�����ɂ��Ă����ɂ��������܂����B";
			close2;
			cutin "malaya_nurseA04",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�ł́A���肢���܂��B";
		mes "���̕a�@�ɗ���r���ŁA";
		mes "���̐��ɂ��閯�Ƃ�";
		mes "���k����������C�����܂��B";
		next;
		mes "[�Ō�t���Y]";
		mes "���ꂩ��A���ނ�ɂ���L�~�I";
		mes "�����ƂɋA��Ȃ���";
		mes "���ꂳ��Ɍ��������Ⴄ���I";
		next;
		mes "�]�|�[�g�}�����̐��̖��Ƃɂ���";
		mes "�@�V�k�ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA04",255;
		delquest 11296;
		setquest 11297;
		set MALAYA_4QUE,16;
		close;
	case 16:
	case 17:
		mes "[�Ō�t���Y]";
		mes "�ł́A���肢���܂��B";
		mes "���̕a�@�ɗ���r���ŁA";
		mes "���̐��ɂ��閯�Ƃ�";
		mes "���k����������C�����܂��B";
		cutin "malaya_nurseA04",2;
		next;
		mes "�]�|�[�g�}�����̐��̖��Ƃɂ���";
		mes "�@�V�k�ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA04",255;
		close;
	case 18:
		mes "[�Ō�t���Y]";
		mes "�ǂ��ł����H";
		mes "���k����ɂ͉�܂������H";
		cutin "malaya_nurseA02",2;
		next;
		mes "[�Ō�t���Y]";
		mes "���������A���k����̂Ƃ����";
		mes "�s���Ă�����Ă���ԂɁA";
		mes "������������Ǝv����";
		mes "������������A�J������ł���B";
		next;
		mes "[�Ō�t���Y]";
		mes "���̒ɂ݂����܂��Ă����̂�";
		mes "�����Ă݂܂������A";
		mes "�K�i����������Ă��āA";
		mes "2�K�ɂ͍s���܂���ł����B";
		cutin "malaya_nurseA03",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�Ƃ肠�������ɓ���܂��傤���B";
		mes "2�K�ɍs���Ȃ���΁A";
		mes "�Ӗ��͂Ȃ��̂ł����ǁc�c�B";
		emotion 28;
		delquest 11299;
		setquest 11300;
		set MALAYA_4QUE,19;
		next;
		if(select("�a�@�ɓ���","����Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "�a�@�ɓ���܂��傤��I";
			close2;
			cutin "malaya_nurseA03",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�����A�s���܂��傤�B";
		close2;
		cutin "malaya_nurseA03",255;
		warp "ma_dun01.gat",33,110;
		end;
	case 19:
		mes "[�Ō�t���Y]";
		mes "�Ƃ肠�������ɓ���܂��傤���B";
		mes "2�K�ɍs���Ȃ���΁A";
		mes "�Ӗ��͂Ȃ��̂ł����ǁc�c�B";
		emotion 28;
		cutin "malaya_nurseA01",2;
		next;
		if(select("�a�@�ɓ���","����Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "�a�@�ɓ���܂��傤��I";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�����A�s���܂��傤�B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "ma_dun01.gat",33,110;
		end;
	case 20:
		mes "[�Ō�t���Y]";
		mes "��������Ă���2�K��";
		mes "�s�������̂ł�����ǁA";
		mes "�K�i�����Ă��Ă��炦�܂����H";
		cutin "malaya_nurseA01",2;
		next;
		if(select("�a�@�ɓ���","����Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "���ɗp���������ł����H";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�����A�s���܂��傤�B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "ma_dun01.gat",33,110;
		end;
	case 21:
		mes "[�Ō�t���Y]";
		mes "�����ł����H";
		mes "���ɂ������Ȃ����A";
		mes "���������K�i�̂������";
		mes "�T���Ă݂Ă���܂��񂩁B";
		cutin "malaya_nurseA01",2;
		next;
		if(select("�a�@�ɓ���","����Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "���ɗp���������ł����H";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "���肢���܂��ˁB";
		close2;
		cutin "malaya_nurseA01",255;
		warp "ma_dun01.gat",33,110;
		end;
	case 22:
		mes "[�Ō�t���Y]";
		mes "�����ƊŌ�t�H";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�����́A���������܂�������";
		mes "�C�������������̂ŁA";
		mes "�߂Â��܂���ł����B";
		next;
		mes "[�Ō�t���Y]";
		mes "���I";
		mes "�a�@�̎���ɂ�����u���Ă���";
		mes "���k����Ȃ�A";
		mes "�����m���Ă��邩���I";
		mes "�����ɍs���Ă��炦�܂����H";
		next;
		mes "�]�|�[�g�}�����̐��̖��Ƃɂ���";
		mes "�@�V�k�ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		delquest 11303;
		setquest 11304;
		set MALAYA_4QUE,23;
		close;
	case 23:
		mes "[�Ō�t���Y]";
		mes "�a�@�̎���ɂ�����u���Ă���";
		mes "���k����Ȃ�A";
		mes "�����m���Ă��邩���I";
		mes "�����ɍs���Ă��炦�܂����H";
		cutin "malaya_nurseA01",2;
		next;
		mes "�]�|�[�g�}�����̐��̖��Ƃɂ���";
		mes "�@�V�k�ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		close;
	case 24:
		mes "[�Ō�t���Y]";
		mes "�V���[�}���ł����c�c";
		mes "���̃V���[�}���ɂ��b�𕷂�������";
		mes "�ǂ������ł��ˁB";
		cutin "malaya_nurseA01",2;
		close2;
		cutin "malaya_nurseA01",255;
		end;
	case 25:
		mes "[�Ō�t���Y]";
		mes "����I";
		mes "�������C�z�������܂����ǁA";
		mes "������������ł����H";
		cutin "malaya_nurseA01",2;
		next;
		menu "�V���[�}���̎D������",-;
		mes "[�Ō�t���Y]";
		mes "�V���[�}���ł����c�c";
		mes "�������I";
		mes "���̃V���[�}���̎D��";
		mes "�K�i�߂��ɂ�����������";
		mes "�\���Ă݂܂��傤��B";
		emotion 5;
		next;
		mes "[�Ō�t���Y]";
		mes "������������A�s�g�ȋC�z��";
		mes "�h���ł���邩������܂����I";
		delquest 11306;
		setquest 11307;
		set MALAYA_4QUE,26;
		close2;
		cutin "malaya_nurseA01",255;
		end;
	case 26:
		mes "[�Ō�t���Y]";
		mes "���̃V���[�}���̎D��";
		mes "�K�i�߂��ɂ�����������";
		mes "�\���Ă݂܂��傤��B";
		emotion 5;
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "������������A�s�g�ȋC�z��";
		mes "�h���ł���邩������܂����I";
		close2;
		cutin "malaya_nurseA01",255;
		end;
	case 27:
		mes "[�Ō�t�}�G��]";
		mes "�Ȃ�Ƃ��A�����؂ꂽ��ˁB";
		mes "�c�c�����ɁA�ޏ���2�K��";
		mes "�s�����Ă��܂�����B";
		cutin "malaya_nurseB",2;
		next;
		mes "�]�Ō�t�͐[�X��";
		mes "�@���ߑ���f�����]";
		next;
		mes "[�Ō�t�}�G��]";
		mes "���Ȃ�������";
		mes "���낤�낵�Ă��鎞����";
		mes "���₵���Ǝv���Ă������ǁc�c";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�܂����A����Ȃ��Ƃ�";
		mes "���ł����Ȃ�ĂˁB";
		emotion 9;
		next;
		mes "[�Ō�t�}�G��]";
		mes "�r�����E���S��";
		mes "�ގ�����`�����X�������̂ɁA";
		mes "�ז������Ă��ꂽ��ˁB";
		next;
		switch(select("�r�����E���S�H","�N�H")) {
		case 1:
			mes "[�Ō�t�}�G��]";
			mes "�r�����E���S�́A";
			mes "���̕a�@�ɐ��݂��Ă���";
			mes "�ƂĂ����͂ȃ����X�^�[��B";
			next;
			mes "[�Ō�t�}�G��]";
			mes "�����c�c";
			mes "�����X�^�[�Ƃ�������";
			mes "�􂢁A�a�̉��g�c�c";
			mes "���邢�́A�؂ɐ��݂�";
			mes "�d���������Ƃ����`���������B";
			next;
			mes "[�Ō�t�}�G��]";
			mes "������ɂ��Ă��A";
			mes "�ޏ������̕a�@�̊��҂�";
			mes "�ꂵ�߂Ă���̂͊m���ł��傤�ˁB";
			next;
			menu "�N�H",-;
			mes "[�Ō�t�}�G��]";
			mes "���̂��ƁH";
			mes "�V�������̕a�@�ɕ��C���Ă���";
			mes "�Ō�t��B";
			mes "�����Ƃ��A���҂̊Ō����";
			mes "�u���������v�̂����Ȃ񂾂��ǁB";
			next;
			mes "[�Ō�t�}�G��]";
			mes "���팻�ہc�c�_��I�ȗ͂ɂ����";
			mes "�����N�����ꂽ�ُ��";
			mes "���ÂƂł�������";
			mes "�킩���Ă��炦�邩����H";
			next;
			mes "[�Ō�t�}�G��]";
			mes "�ǂ����A�r�����E���S��";
			mes "�h������Ă����Ō�t�c�c";
			mes "�܂�A���ɐ��肷�܂���";
			mes "���Ȃ��𗘗p�����悤�ˁB";
			mes "�v�����ȏ�Ɍ�����c�c�B";
			break;
		case 2:
			mes "[�Ō�t�}�G��]";
			mes "���̂��ƁH";
			mes "�V�������̕a�@�ɕ��C���Ă���";
			mes "�Ō�t��B";
			mes "�����Ƃ��A���҂̊Ō����";
			mes "�u���������v�̂����Ȃ񂾂��ǁB";
			cutin "malaya_nurseB",2;
			next;
			mes "[�Ō�t�}�G��]";
			mes "���팻�ہc�c�_��I�ȗ͂ɂ����";
			mes "�����N�����ꂽ�ُ��";
			mes "���ÂƂł�������";
			mes "�킩���Ă��炦�邩����H";
			next;
			mes "[�Ō�t�}�G��]";
			mes "�ǂ����A�r�����E���S��";
			mes "�h������Ă����Ō�t�c�c";
			mes "�܂�A���ɐ��肷�܂���";
			mes "���Ȃ��𗘗p�����悤�ˁB";
			mes "�v�����ȏ�Ɍ�����c�c�B";
			next;
			menu "�r�����E���S�H",-;
			mes "[�Ō�t�}�G��]";
			mes "�r�����E���S�́A";
			mes "���̕a�@�ɐ��݂��Ă���";
			mes "�ƂĂ����͂ȃ����X�^�[��B";
			next;
			mes "[�Ō�t�}�G��]";
			mes "�����c�c";
			mes "�����X�^�[�Ƃ�������";
			mes "�􂢁A�a�̉��g�c�c";
			mes "���邢�́A�؂ɐ��݂�";
			mes "�d���������Ƃ����`���������B";
			next;
			mes "[�Ō�t�}�G��]";
			mes "������ɂ��Ă��A";
			mes "�ޏ������̕a�@�̊��҂�";
			mes "�ꂵ�߂Ă���̂͊m���ł��傤�ˁB";
			break;
		}
		next;
		menu "�a�@�ŋN�����Ă��邱�Ƃɂ��ĕ���",-;
		mes "[�Ō�t�}�G��]";
		mes "�����A�����N��������";
		mes "�S����m���Ă�킯����Ȃ����ǁc�c";
		next;
		mes "[�Ō�t�}�G��]";
		mes "���̕a�@�́A�r�����E���S��";
		mes "�h�����؂Ō��Ă�ꂽ�݂����Ȃ́B";
		mes "�ޏ��͎���Ă�����@���҂�";
		mes "�����������āA�͂�D���Ă����悤�ˁB";
		next;
		mes "[�Ō�t�}�G��]";
		mes "���́A���@���҂�2�K��";
		mes "�W�߂��Ă��邱�Ƃ�˂��~�߁A";
		mes "�r�����E���S��1�K�ɍ~�肽����";
		mes "�K�i�Ɍ��E�𒣂��āA����ȏ�";
		mes "�ޏ����͂𑝂��̂�h���ł����́B";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�_�����ʂ�A�r�����E���S��";
		mes "2�K�ɖ߂ꂸ����Ă�����B";
		mes "���̂܂ܕa�@���򉻂���";
		mes "���肾�������ǁc�c";
		mes "�ޏ����߂��Ă��܂����ȏ�A";
		mes "�ȒP�ɂ͂����Ȃ��ł��傤�ˁB";
		next;
		mes "[�Ō�t�}�G��]";
		mes "���Ȃ��ɂ�";
		mes "�ޏ����ē����Ă��܂���";
		mes "�ӔC������Ă��炤���B";
		mes "�������A���͂��Ă�����ˁH";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�r�����E���S�͈����̗͂�";
		mes "�B��Ă����B";
		mes "����2�K�ɍs�������ł́A";
		mes "�|���ǂ��납�키���Ƃ���";
		mes "�ł��Ȃ��͂���B";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�����r�����E���S�����т��񂹂邩��";
		mes "�K�i�̂Ƃ���Řb�������Ă��傤�����B";
		mes "�ޏ��̎n���͔C������B";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�����n���Ă�����B";
		mes "�r�����E���S�ގ���";
		mes "���ɗ���������Ȃ�����B";
		if(checkitemblank() < 3) {
			mes "�c�c�Ǝv�������ǁA���ĂȂ��݂����ˁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "�܂����ĂˁB";
			close2;
			cutin "malaya_nurseB",255;
			end;
		}
		if((MaxWeight - Weight) < 1000) {
			mes "�c�c�Ǝv�������ǁA���ĂȂ��݂����ˁB";
			mes "�A�C�e���̏d�ʂ����炵�Ă���";
			mes "�܂����ĂˁB";
			close2;
			cutin "malaya_nurseB",255;
			end;
		}
		getitem 6499,3;
		getitem 6497,5;
		getitem 617,1;
		if(checkre()) {
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 500000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,500000;
		}
		else {
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 5000000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,5000000;
		}
		delquest 11308;
		setquest 11309;
		setquest 201515;
		set MALAYA_4QUE,28;
		next;
		mes "[�Ō�t�}�G��]";
		mes "�r�����E���S�͎苭�����B";
		mes "�������菀���𐮂��Ă���";
		mes "���Ă��傤�����B";
		close2;
		cutin "malaya_nurseB",255;
		end;
	case 28:
	case 29:
		if(MALAYA_4QUE == 28) {
			mes "[�Ō�t�}�G��]";
			mes "�a�@���򉻂���";
			mes "���肾�������ǁc�c";
			mes "�ޏ����߂��Ă��܂����ȏ�A";
			mes "�ȒP�ɂ͂����Ȃ��ł��傤�ˁB";
			cutin "malaya_nurseB",2;
			next;
			mes "[�Ō�t�}�G��]";
			mes "���Ȃ��ɂ�";
			mes "�ޏ����ē����Ă��܂���";
			mes "�ӔC������Ă��炤���B";
			mes "�������A���͂��Ă�����ˁH";
		}
		else {
			mes "[�Ō�t�}�G��]";
			mes "�r�����E���S�̗͂͗\�z�ȏ�ˁB";
			mes "���܂��ɔޏ��̋C�����������B";
			cutin "malaya_nurseB",2;
		}
		next;
		mes "[�Ō�t�}�G��]";
		mes "�r�����E���S�͈����̗͂�";
		mes "�B��Ă����B";
		mes "����2�K�ɍs�������ł́A";
		mes "�|���ǂ��납�키���Ƃ���";
		mes "�ł��Ȃ��͂���B";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�����r�����E���S�����т��񂹂邩��";
		mes "�K�i�̂Ƃ���Řb�������Ă��傤�����B";
		mes "�ޏ��̎n���͔C������B";
		next;
		if(select("�a�@�ɓ���","��߂�") == 2) {
			mes "[�Ō�t�}�G��]";
			mes "�����c�c";
			close2;
			cutin "malaya_nurseB",255;
			end;
		}
		mes "[�Ō�t�}�G��]";
		mes "���ɓ���̂ˁB";
		close2;
		cutin "malaya_nurseB",255;
		warp "ma_dun01.gat",33,110;
		end;
	}
OnInit:
	waitingroom "�V�C�Ō�t�ƕa�@",0;
	end;
}

ma_dun01.gat,35,108,4	script	�Ō�t	569,{
	switch(MALAYA_4QUE) {
	case 19:
		mes "�]�a�@�����A���������";
		mes "�@�����X�^�[���p�j���Ă���B";
		mes "�@�Ō�t���Y�́A���̒���";
		mes "�@���Ă����Ƃ����̂��낤���H�]";
		next;
		mes "[�Ō�t���Y]";
		mes "���������Ă����Ƃ���A";
		mes "�K�i����������Ă��܂����B";
		mes "2�K�ɍs�������̂ł�����ǁA";
		mes "�K�i�����Ă��Ă��炦�܂����H";
		delquest 11300;
		setquest 11301;
		set MALAYA_4QUE,20;
		cutin "malaya_nurseA01",2;
		next;
		if(select("��������O�ɏo��","�a�@�̉��Ɍ�����") == 2) {
			mes "[�Ō�t���Y]";
			mes "���肢���܂��B";
			mes "2�K�ւ̊K�i�́A���̌�����";
			mes "�쓌�ɂ���܂��B";
			next;
			mes "�]�쓌�ɂ���2�K�ւ̊K�i�t�߂�";
			mes "�@���ׂ悤�]";
			cutin "malaya_nurseA01",255;
			close;
		}
		mes "[�Ō�t���Y]";
		mes "�O�ɏo���ł����H";
		mes "�킩��܂����B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "malaya.gat",58,76;
		end;
	case 20:
		mes "[�Ō�t���Y]";
		mes "2�K�ɍs�������̂ł�����ǁA";
		mes "�K�i�����Ă��Ă��炦�܂����H";
		cutin "malaya_nurseA01",2;
		next;
		if(select("��������O�ɏo��","�a�@�̉��Ɍ�����") == 2) {
			mes "[�Ō�t���Y]";
			mes "���肢���܂��B";
			next;
			mes "�]�쓌�ɂ���2�K�ւ̊K�i�t�߂�";
			mes "�@���ׂ悤�]";
			cutin "malaya_nurseA01",255;
			close;
		}
		mes "[�Ō�t���Y]";
		mes "�O�ɏo���ł����H";
		mes "�킩��܂����B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "malaya.gat",58,76;
		end;
	case 21:
		mes "[�Ō�t���Y]";
		mes "�����ł����H";
		mes "���ɂ������Ȃ����A";
		mes "���������K�i�̂������";
		mes "�T���Ă݂Ă���܂��񂩁B";
		cutin "malaya_nurseA01",2;
		next;
		if(select("��������O�ɏo��","�a�@�̉��Ɍ�����") == 2) {
			mes "[�Ō�t���Y]";
			mes "���肢���܂��B";
			next;
			mes "�]�쓌�ɂ���2�K�ւ̊K�i�t�߂�";
			mes "�@�����������ׂ悤�]";
			cutin "malaya_nurseA01",255;
			close;
		}
		mes "[�Ō�t���Y]";
		mes "�O�ɏo���ł����H";
		mes "�킩��܂����B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "malaya.gat",58,76;
		end;
	case 22:
		mes "[�Ō�t���Y]";
		mes "�����ƊŌ�t�H";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�����́A���������܂�������";
		mes "�C�������������̂ŁA";
		mes "�߂Â��܂���ł����B";
		next;
		mes "[�Ō�t���Y]";
		mes "���I";
		mes "�a�@�̎���ɂ�����u���Ă���";
		mes "���k����Ȃ�A";
		mes "�����m���Ă��邩���I";
		mes "�����ɍs���Ă��炦�܂����H";
		delquest 11303;
		setquest 11304;
		set MALAYA_4QUE,23;
		next;
		if(select("���k����ɘb�𕷂��ɍs��","�a�@����o�Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "�܂��a�@�ɉ������p�ł����H";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "���k���񂩂�b�𕷂���";
		mes "���Ă��������ˁB";
		next;
		mes "�]�|�[�g�}�����̐��̖��Ƃɂ���";
		mes "�@�V�k�ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		close2;
		warp "malaya.gat",58,76;
		end;
	case 23:
		mes "[�Ō�t���Y]";
		mes "�a�@�̎���ɂ�����u���Ă���";
		mes "���k����Ȃ�A";
		mes "�����m���Ă��邩���I";
		mes "�����ɍs���Ă��炦�܂����H";
		cutin "malaya_nurseA01",2;
		next;
		if(select("���k����ɘb�𕷂��ɍs��","�a�@����o�Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "�܂��a�@�ɉ������p�ł����H";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "���k���񂩂�b�𕷂���";
		mes "���Ă��������ˁB";
		next;
		mes "�]�|�[�g�}�����̐��̖��Ƃɂ���";
		mes "�@�V�k�ɘb�𕷂��Ă݂悤�]";
		cutin "malaya_nurseA01",255;
		close2;
		warp "malaya.gat",58,76;
		end;
	case 24:
		mes "[�Ō�t���Y]";
		mes "�V���[�}���ł����c�c";
		mes "���̃V���[�}���ɂ��b�𕷂�������";
		mes "�ǂ������ł��ˁB";
		cutin "malaya_nurseA01",2;
		next;
		if(select("�V���[�}���ɘb�𕷂��ɍs��","�a�@����o�Ȃ�") == 2) {
			mes "[�Ō�t���Y]";
			mes "�܂��a�@�ɉ������p�ł����H";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�V���[�}������b�𕷂���";
		mes "���Ă��������ˁB";
		close2;
		cutin "malaya_nurseA01",255;
		warp "malaya.gat",58,76;
		end;
	case 25:
		mes "[�Ō�t���Y]";
		mes "����I";
		mes "�������C�z�������܂����ǁA";
		mes "������������ł����H";
		cutin "malaya_nurseA01",2;
		next;
		menu "�V���[�}���̎D������",-;
		mes "[�Ō�t���Y]";
		mes "�V���[�}���̎D�ł����c�c";
		mes "�������I";
		mes "���̃V���[�}���̎D��";
		mes "�K�i�߂��ɂ�����������";
		mes "�\���Ă݂܂��傤��B";
		next;
		mes "[�Ō�t���Y]";
		mes "������������A�s�g�ȋC�z��";
		mes "�h���ł���邩������܂����I";
		delquest 11306;
		setquest 11307;
		set MALAYA_4QUE,26;
		next;
		if(select("��������O�ɏo��","�a�@�̉��Ɍ�����") == 2) {
			mes "[�Ō�t���Y]";
			mes "���肢���܂��B";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�O�ɏo���ł����H";
		mes "�킩��܂����B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "malaya.gat",58,76;
		end;
	case 26:
		mes "[�Ō�t���Y]";
		mes "���̃V���[�}���̎D��";
		mes "�K�i�߂��ɂ�����������";
		mes "�\���Ă݂܂��傤��B";
		cutin "malaya_nurseA01",2;
		next;
		mes "[�Ō�t���Y]";
		mes "������������A�s�g�ȋC�z��";
		mes "�h���ł���邩������܂����I";
		next;
		if(select("��������O�ɏo��","�a�@�̉��Ɍ�����") == 2) {
			mes "[�Ō�t���Y]";
			mes "���肢���܂��B";
			close2;
			cutin "malaya_nurseA01",255;
			end;
		}
		mes "[�Ō�t���Y]";
		mes "�O�ɏo���ł����H";
		mes "�킩��܂����B";
		close2;
		cutin "malaya_nurseA01",255;
		warp "malaya.gat",58,76;
		end;
	case 27:
		mes "[�Ō�t�}�G��]";
		mes "��������a�@�̊O�ɏo�܂��傤�B";
		mes "�����A�����I";
		cutin "malaya_nurseB",2;
		close2;
		cutin "malaya_nurseB",255;
		warp "malaya.gat",58,76;
		end;
	case 28:
	case 29:
		if(MALAYA_4QUE == 28) {
			mes "[�Ō�t�}�G��]";
			mes "�a�@���򉻂���";
			mes "���肾�������ǁc�c";
			mes "�ޏ����߂��Ă��܂����ȏ�A";
			mes "�ȒP�ɂ͂����Ȃ��ł��傤�ˁB";
			cutin "malaya_nurseB",2;
			next;
			mes "[�Ō�t�}�G��]";
			mes "���Ȃ��ɂ�";
			mes "�ޏ����ē����Ă��܂���";
			mes "�ӔC������Ă��炤���B";
			mes "�������A���͂��Ă�����ˁH";
		}
		else {
			mes "[�Ō�t�}�G��]";
			mes "�܂��r�����E���S�̋C�z��";
			mes "���S�ɏ����Ă͂��Ȃ��悤�ˁB";
			cutin "malaya_nurseB",2;
		}
		next;
		mes "[�Ō�t�}�G��]";
		mes "�r�����E���S�͈����̗͂�";
		mes "�B��Ă����B";
		mes "����2�K�ɍs�������ł́A";
		mes "�|���ǂ��납�키���Ƃ���";
		mes "�ł��Ȃ��͂���B";
		next;
		mes "[�Ō�t�}�G��]";
		mes "�����r�����E���S�����т��񂹂邩��";
		mes "�K�i�̂Ƃ���Řb�������Ă��傤�����B";
		mes "�ޏ��̎n���͔C������B";
		next;
		if(select("��������O�ɏo��","�a�@�̉��Ɍ�����") == 2) {
			mes "[�Ō�t�}�G��]";
			mes "�������ł�����A";
			mes "�K�i�̂Ƃ���ɂ�������Ⴂ�B";
			close2;
			cutin "malaya_nurseB",255;
			end;
		}
		mes "[�Ō�t�}�G��]";
		mes "�O�ɏo��̂ˁH";
		mes "�킩������B";
		close2;
		cutin "malaya_nurseB",255;
		warp "malaya.gat",58,76;
		end;
	}
}

ma_dun01.gat,152,23,4	script	�������؂̖_	858,{
	switch(MALAYA_4QUE) {
	case 19:
		mes "�]�Ȃ�������ȂƂ����";
		mes "�@�؂̖_������]";
		close;
	case 20:
		mes "�]�a�@�̊O�ɂ�����������";
		mes "�@�����͗l�̓������؂̖_���]";
		next;
		if(select("�_����������","���̂܂܂ɂ��Ă���") == 2) {
			mes "�]���Ȃ��͖؂̖_�ɂ͎��G�ꂸ";
			mes "�@���̏����ɂ����]";
			close;
		}
		mes "�]�c�c�����Ȃ��B";
		mes "�@�͂����߂Ă݂Ă��A";
		mes "�@�܂����������Ȃ��B";
		mes "�@���Ȃ��́A�_������������]";
		next;
		mes "�]����������̂���肾�낤���H";
		mes "�@�����������͂𒲂ׂĂ݂悤�]";
		delquest 11301;
		setquest 11302;
		set MALAYA_4QUE,21;
		close;
	case 21:
		mes "�]�a�@�̊O�ɂ�����������";
		mes "�@�����͗l�̓������؂̖_���B";
		mes "�@����������̂���肾�낤���H";
		mes "�@�����������͂𒲂ׂĂ݂悤�]";
		close;
	case 26:
		mes "�]�a�@�̊O�ɂ�����������";
		mes "�@�����͗l�̓������؂̖_���B";
		mes "�@�Ō�t���Y�́A�����C�z�������";
		mes "�@�����Ă����]";
		next;
		if(select("�V���[�}���̎D��\��","����ς�\��Ȃ�") == 2) {
			mes "�]���Ȃ��́A���̏����ɂ����]";
			close;
		}
		mes "�]�؂̖_�ɃV���[�}���̎D��\�����B";
		mes "�@����߂Ă����C�z��";
		mes "�@��܂����悤�ȋC������]";
		next;
		mes "[�Ō�t���Y]";
		mes "�c�c���c�c��";
		cutin "malaya_nurseA05",2;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�H";
		emotion 1,"";
		cutin "malaya_nurseA05",255;
		next;
		mes "[�Ō�t���Y]";
		mes "�ł����A�ł���";
		cutin "malaya_nurseA05",2;
		next;
		mes "[�Ō�t���Y]";
		mes "�ł����A�ł���";
		mes "�ł����ł����ł����ł����ł����ł���";
		mes "�ł����ł����ł����ł����ł����ł���";
		mes "�ł����ł����ł����ł����ł����ł���";
		mes "�ł����ł����ł����ł����ł����ł���";
		mes "�ł����ł����ł����ł����ł����ł���";
		next;
		mes "[�Ō�t���Y]";
		mes "����܂Ȃ��܂��肪������";
		next;
		mes "[�Ō�t���Y]";
		mes "��������";
		next;
		mes "�]�Ō�t���Y�̓���";
		mes "�@�d�����P����������]";
		next;
		mes "�]���̒��������񂳂��悤��";
		mes "�@��ɂɏP���A���ɕG�������]";
		next;
		mes "[�Ō�t���Y]";
		mes "���܂����܂����܂����܂�";
		mes "�����Ƃ����Ƃ����Ƃ�����";
		mes "�悱���悱���悱���悱��";
		next;
		mes "[�Ō�t���Y]";
		mes "�����ނ������ނ������ނ������ނ�";
		next;
		mes "�]�͂��z�������c�c";
		mes "�@���񂾂񎋊E���ڂ₯�n�߂��]";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		mes "�c�c���܂��́c�c�H";
		mes "�����c�c�c�c";
		mes "�c�c���c�c��";
		next;
		mes "[�H�H�H]";
		mes "�����܂ł�I";
		cutin "malaya_nurseA05",255;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i���A�Ō�t���c�c";
		mes "�@�����ЂƂ�c�c�H�j";
		next;
		mes "[�Ō�t]";
		mes "���̎q���痣��Ȃ���!!";
		cutin "malaya_nurseB",2;
		next;
		mes "�]�Ō�t���Y�Ɍ�������";
		mes "�@�����Ȃ���肪����������B";
		mes "�@�Ō�t���Y�̒��ӂ����A";
		mes "�@���Ȃ��͋�ɂ����������]";
		next;
		mes "[�Ō�t]";
		mes "�����͎��ɔC����";
		mes "���Ȃ��͕a�@�̊O�ɓ����Ȃ����B";
		mes "�����A�����I";
		next;
		mes "�]��قǂ܂ł̋�ɂ�";
		mes "�@�ӎ����r�؂ꂻ���ɂȂ�Ȃ���";
		mes "�@���Ȃ��͕����o�����]";
		cutin "malaya_nurseB",255;
		next;
		mes "�]�Ō�t���Y�̐����A";
		mes "�@�ǂ��܂ł��ǂ������Ă���悤��";
		mes "�@���̒��Ŕ������Ă����]";
		delquest 11307;
		setquest 11308;
		set MALAYA_4QUE,27;
		close2;
		warp "malaya.gat",58,76;
		end;
	default:
		if(MALAYA_4QUE < 27) {
			mes "�]�a�@�̊O�ɂ�����������";
			mes "�@�����͗l�̓������؂̖_���]";
			close;
		}
		mes "�]����肩���";
		mes "�@���̋C�z���������Ȃ��]";
		close;
	}
}

malaya.gat,48,76,4	script	�a�@��	844,{
	switch(MALAYA_4QUE) {
	case 3:
		mes "�]�͂����ς��������������A";
		mes "�@�܂�ŕǂ������Ă��邩�̂悤��";
		mes "�@�܂����������Ȃ��]";
		next;
		mes "�]��������A���ɓ���������";
		mes "�@�͂���ꂽ�肵�Ă݂Ă�";
		mes "�@�܂����������Ȃ��B";
		mes "�@�ЂƂ܂��A�Ō�t���Y�Ƙb�����]";
		delquest 11285;
		setquest 11286;
		set MALAYA_4QUE,4;
		close;
	case 4:
		mes "�]�����Ă������Ă�";
		mes "�@���͂܂����������Ȃ��B";
		mes "�@�ЂƂ܂��A�Ō�t���Y�Ƙb�����]";
		close;
	case 11:
		mes "�]���̌����Ɍ�����ꂽ�B";
		mes "�@�����񂷂ƁA�����ȉ�������";
		mes "�@�������������育�������������B";
		mes "�@�ǂ����A�����献�͂�������";
		mes "�@���Ȃ������悤���]";
		next;
		mes "�]�����������Ă��Ȃ��̂�";
		mes "�@�����J���Ȃ��̂�";
		mes "�@�ǂ��������ƂȂ̂��낤�H";
		mes "�@�Ō�t���Y�ɘb�������悤�]";
		delquest 72105;
		setquest 11293;
		set MALAYA_4QUE,12;
		close;
	case 12:
		mes "�]�ǂ����A�����献�͂�������";
		mes "�@���Ȃ������悤���B";
		mes "�@�����������Ă��Ȃ��̂�";
		mes "�@�����J���Ȃ��̂�";
		mes "�@�ǂ��������ƂȂ̂��낤�H";
		mes "�@�Ō�t���Y�ɘb�������悤�]";
		close;
	default:
		if(MALAYA_4QUE < 19) {
			mes "�]�a�@�̓�������B";
			mes "�@���͔����܂��Ă���悤���]";
			close;
		}
		mes "�]���Ɍ��͂������Ă��Ȃ��悤���]";
		next;
		if(select("�a�@�ɓ���","����Ȃ�") == 2) {
			mes "�]���Ȃ��͕a�@�̔����痣�ꂽ�]";
			close;
		}
		mes "�]�a�@�̔����J���A���ɓ������]";
		close2;
		warp "ma_dun01.gat",33,110;
		end;
	}
}

malaya.gat,64,78,4	script	���̏�	583,{
	if(MALAYA_1QUE < 6) {
		mes "[���̏�]";
		mes "�c�c";
		next;
		mes "�]�������T��悤�Ȗڂ���";
		mes "�@���Ă���B";
		mes "�@�x������Ă���悤���]";
		close;
	}
	if(MALAYA_4QUE == 6) {
		mes "[���̏�]";
		mes "�V��������Ō�t�c�c�ł����H";
		mes "�����c�c";
		mes "�a�@��������Ă���̂�";
		mes "�Ō�t������Ȃ�Ă������Ƃ�";
		mes "����̂�����H";
		next;
		mes "�]���̏�������b�𕷂����B";
		mes "�@�a�@�ɐV�����Ō�t������Ƃ���";
		mes "�@�b�͕����Ă��Ȃ��炵���B";
		mes "�@�Ō�t���Y�ɓ`���悤�]";
		close;
	}
	mes "[���̏�]";
	mes "�`���҂���ł����H";
	mes "�ŋ߁A���̒���K���";
	mes "�`���҂������܂����ˁB";
	next;
	mes "[���̏�]";
	mes "���͂��̒��Ő��܂�炿�܂�������";
	mes "�`���҂����̘b�𕷂��Ă���ƁA";
	mes "�ǂ��������֗��s����̂�";
	mes "�������낻�����Ȃ��Ďv���܂��B";
	if(MALAYA_4QUE == 5) {
		next;
		if(select("�a�@�̂��Ƃ𕷂�","�b���I����") == 2) {
			mes "[���̏�]";
			mes "�������؍݂��Ă��������ˁB";
			close;
		}
		mes "[���̏�]";
		mes "�a�@�ł����H";
		mes "�����O���������Ă��܂�����B";
		mes "�Ȃɂ����̂��������݂����ŁA";
		mes "�a�@�̘b�ɂȂ��";
		mes "�����m���Ă��钬�̐l��";
		mes "�݂�Ȍ��������ł��B";
		next;
		mes "[���̏�]";
		mes "�����a�@�̂����b�ɂȂ����̂�";
		mes "�������ɂ��Ȃ��������炢�ł��B";
		mes "�����v���o�͂���܂��񂪁A";
		mes "���ʁA�C�ɂ���悤�Ȃ��Ƃ�";
		mes "����܂���ł����B";
		next;
		menu "�Ō�t�̂��Ƃ𕷂�",-;
		mes "[���̏�]";
		mes "�V��������Ō�t�c�c�ł����H";
		mes "�����c�c";
		mes "�a�@��������Ă���̂�";
		mes "�Ō�t������Ȃ�Ă������Ƃ�";
		mes "����̂�����H";
		next;
		mes "�]���̏�������b�𕷂����B";
		mes "�@�a�@�ɐV�����Ō�t������Ƃ���";
		mes "�@�b�͕����Ă��Ȃ��炵���B";
		mes "�@�Ō�t���Y�ɓ`���悤�]";
		delquest 11287;
		setquest 11288;
		set MALAYA_4QUE,6;
		close;
	}
	close;
}

malaya.gat,62,37,4	script	���̒j	582,{
	if(MALAYA_1QUE < 6) {
		mes "[���̒j]";
		mes "�������Ȃ��炾�ȁB";
		mes "���̒��ɉ����p���ˁH";
		next;
		mes "�]�������T��悤�Ȗڂ���";
		mes "�@���Ă���B";
		mes "�@�x������Ă���悤���]";
		close;
	}
	if(MALAYA_4QUE == 8) {
		mes "[���̒j]";
		mes "�a�@��������Ă���́A";
		mes "�h�N�^�[�͗��قɔ��܂��Ă���񂾁B";
		mes "�����A�������Ă����̂ŁA";
		mes "���̒����̗��ق̋߂��ɂ���";
		mes "�h�N�^�[�̂Ƃ���܂ŁA";
		mes "�Ō�t��A��čs���Ă���Ȃ����H";
		next;
		mes "�]�a�@�̃h�N�^�[��";
		mes "�@���ق̋߂��ɂ���炵���B";
		mes "�@�Ō�t���Y�ɂ��̂��Ƃ�`���悤�]";
		close;
	}
	mes "[���̒j]";
	mes "�ӂނӂށB";
	mes "���̒�����킴�킴�����̂��ˁB";
	mes "���Ԃ�����悤�Ȃ�A";
	mes "���̃p�C�i�b�v���_���";
	mes "���Ă����Ȃ����ˁB";
	next;
	mes "[���̒j]";
	mes "���������痣�ꂿ�Ⴂ�邪�A";
	mes "���̘b�𕷂����Ă����Ȃ�";
	mes "�p�C�i�b�v����H�킹�Ă�邩�炳�B";
	if(MALAYA_4QUE == 7) {
		next;
		menu "���܂�ɂł͂Ȃ�",-;
		mes "[���̒j]";
		mes "�������A�c�O���ȁB";
		mes "�����p���ł�����̂����H";
		next;
		if(select("�a�@�̂��Ƃ𕷂�","�b���I����") == 2) {
			mes "[���̒j]";
			mes "���Ԃ��ł�����܂����Ă����B";
			close;
		}
		mes "[���̒j]";
		mes "�����̕a�@�̂��Ƃ��c�c�B";
		next;
		mes "[���̒j]";
		mes "�����O�Ɏ��̂������ĂȁA";
		mes "���̌�A�����ꂿ�܂����񂾁B";
		mes "���̃C���[�W�𑹂Ȃ�����A";
		mes "�O���痈���l��";
		mes "���܂�b���킯�ɂ������Ȃ��ĂȁB";
		next;
		menu "�Ō�t�̂��Ƃ𕷂�",-;
		mes "[���̒j]";
		mes "����!!";
		mes "�Ō�t�ɉ�����̂�?!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��قǂ���a�@�̑O�ɂ��܂�����B";
		mes "���͖{���ɘA�����Ă���͂��ł����ǁB";
		next;
		mes "[���̒j]";
		mes "�����������̂��B";
		mes "�}���ŗ��Ă���Ɨv�����Ă����񂾁B";
		mes "��̊Ō�t���������Ă���Ƃ́I";
		mes "���₠�A�悩�����B";
		next;
		menu "��̊Ō�t�Ƃ́H",-;
		mes "[���̒j]";
		mes "���̕a�@���ĊJ�����邽�߂�";
		mes "�킴�킴���҂������Ȃ񂾁B";
		mes "�����A�h�N�^�[�����ɒm�点�Ȃ��ƁB";
		next;
		mes "[���̒j]";
		mes "�a�@��������Ă���́A";
		mes "�h�N�^�[�͗��قɔ��܂��Ă���񂾁B";
		mes "�����A�������Ă����̂ŁA";
		mes "���̒����̗��ق̋߂��ɂ���";
		mes "�h�N�^�[�̂Ƃ���܂ŁA";
		mes "�Ō�t��A��čs���Ă���Ȃ����H";
		next;
		mes "�]�a�@�̃h�N�^�[��";
		mes "�@���ق̋߂��ɂ���炵���B";
		mes "�@�Ō�t���Y�ɂ��̂��Ƃ�`���悤�]";
		delquest 11289;
		setquest 11290;
		set MALAYA_4QUE,8;
		close;
	}
	close;
}

malaya.gat,210,200,5	script	�h�N�^�[�v��	865,{
	if(MALAYA_1QUE < 6) {
		mes "[�h�N�^�[�v��]";
		mes "�c�c";
		next;
		mes "�]�x������Ă���悤���]";
		close;
	}
	switch(MALAYA_4QUE) {
	case 9:
		mes "[�h�N�^�[�v��]";
		mes "����H";
		mes "�N���V���������Ō�t�ł����H";
		next;
		if(select("�����ł�","�Ⴂ�܂�") == 1) {
			mes "[�h�N�^�[�v��]";
			mes "�҂��Ă��܂����B";
			mes "����ł����d���̑O�Ɂc�c";
			mes "�܂��͎��݂��Ă��������B";
			mes "�����͊��҂������ĖZ�����̂ł��I";
			mes "�����A�������ւ��āI";
			close;
		}
		mes "[�h�N�^�[�v��]";
		mes "�����ƁA���݂܂���I";
		mes "�V�C�̊Ō�t�����邱�ƂɂȂ��Ă���";
		mes "���Ⴂ���Ă��܂��܂����B";
		next;
		menu "������������",-;
		mes "[�h�N�^�[�v��]";
		mes "�Ō�t�̑���ɗ��Ă��ꂽ��ł����B";
		mes "�킴�킴���肪�Ƃ��������܂��B";
		mes "�{���͂������";
		mes "���Ă��炤�͂��ł������A";
		mes "�r���ŊԈ����";
		mes "�`����Ă��܂����̂�������܂���ˁB";
		next;
		mes "[�h�N�^�[�v��]";
		mes "�a�@�������Ȃ��Ă��܂��Ă���́A";
		mes "�����Ƃ��̗��قŔ��܂�Ȃ���";
		mes "�f�@���Ă����ł��B";
		next;
		mes "[�h�N�^�[�v��]";
		mes "�c�c�a�@�����ɖ߂������Ă�";
		mes "���̊��҂����o���킯�ɂ��������A";
		mes "�w���҂�{���ɂ��������āA";
		mes "�悤�₭�l��h�����Ă�������̂ł��B";
		next;
		mes "[�h�N�^�[�v��]";
		mes "�Ō�t�ɂ͐\����Ȃ��̂ł����A";
		mes "�����̐f�@���I���܂�";
		mes "���͂����𗣂���܂���B";
		mes "�����悩������A";
		mes "�N���Ō�t�ɕa�@�̌���";
		mes "�͂��Ă���܂��񂩁H";
		next;
		mes "[�h�N�^�[�v��]";
		mes "�����āA";
		mes "�u�D���Ȃ悤�Ɏd�������Ă��������v";
		mes "�Ɠ`���Ă��������B";
		mes "���肢���܂��B";
		next;
		mes "[�h�N�^�[�v��]";
		mes "�Ӗ����킩��܂��񂩁H";
		mes "�Ō�t���]���ʂ�̐l�Ȃ�A";
		mes "���������΁A�`���͂��ł��B";
		next;
		mes "[�h�N�^�[�v��]";
		mes "����ȏ�́c�c";
		mes "���Ȃ��̂悤�Ȑe�؂Ȑl�ɁA";
		mes "���̒��̂悭�Ȃ��Ƃ����";
		mes "�m��ꂽ������܂���̂Łc�c";
		next;
		mes "�]�Ō�t���Y�ɕa�@�̌���n���A";
		mes "�@�h�N�^�[�v���̓`����`���悤�]";
		delquest 11291;
		setquest 11292;
		set MALAYA_4QUE,10;
		close;
	case 10:
		mes "[�h�N�^�[�v��]";
		mes "�Ō�t�ɂ͐\����Ȃ��̂ł����A";
		mes "�����̐f�@���I���܂ŁA";
		mes "���͂����𗣂���܂���B";
		mes "�����悩������A";
		mes "�N���Ō�t�ɕa�@�̌���";
		mes "�͂��Ă���܂��񂩁H";
		next;
		mes "[�h�N�^�[�v��]";
		mes "�����āA";
		mes "�u�D���Ȃ悤�Ɏd�������Ă��������v";
		mes "�Ɠ`���Ă��������B";
		mes "���肢���܂��B";
		next;
		mes "�]�Ō�t���Y�ɕa�@�̌���n���A";
		mes "�@�h�N�^�[�v���̓`����`���悤�]";
		close;
	default:
		mes "[�h�N�^�[�v��]";
		mes "�ނނށc�c";
		mes "���c�c�d�����I���Ȃ��c�c";
		mes "����l�Œ����イ�̊��҂�f��Ȃ��";
		mes "�ƂĂ�����Ȃ����A�肪���Ȃ��I";
		next;
		mes "[�h�N�^�[�v��]";
		mes "��H";
		mes "��҂��Ȃ����قɂ���̂����āH";
		mes "���قɂ������Ă�������Ȃ����I";
		close;
	}
}

malaya.gat,53,68,4	script	���ނ�	844,{
	switch(MALAYA_4QUE) {
	case 13:
		mes "[�H�H�H]";
		mes "�ߊ��ȁI";
		mes (Sex? "����": "����")+ "����I";
		mes "�Ȃ��A�{�N�������ɂ��邱�Ƃ�";
		mes "�m���Ă���̂��H";
		emotion 23;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes (Sex? "����": "����")+ "���񂶂�Ȃ��I";
		emotion 6,"";
		next;
		switch(select("�a�@�ɓ���Ȃ����Ƃɂ���","�{����H","�N���H","���k����̂��Ƃ𕷂�","�����Ƃ��Ă���")) {
		case 1:
			mes "[�H�H�H]";
			mes "�ׂ̉ƂɏZ��ł��邨�k����";
			mes "�a�@�̎���ŁA���������Ȃ���";
			mes "�_�̂悤�ȕ���";
			mes "�n�ʂɓ˂��h���Ă����̂��B";
			mes "�����ƃP�b�J�C���Ă���ȁB";
			next;
			mes "[�H�H�H]";
			mes "�ӂӂӂӁc�c";
			mes "����ׂ肷���Ă��܂����悤���ȁB";
			mes "�a�@�ɂ��邱�Ƃ��o���Ȃ��悤��";
			mes "�{�N�͐g���B���̂��B";
			break;
		case 2:
			mes "[�H�H�H]";
			mes "�O�ɂ��ꂳ�񂪌����Ă��̂��B";
			mes "�ׂ̂��o����";
			mes "���̕a�@�ɓ��@���Ă����炵���B";
			mes "�މ@�͂ł��Ȃ��������ǁc�c";
			next;
			mes "[�H�H�H]";
			mes "���ɂ��A���̕a�@�ɓ��@�����l������";
			mes "�������Ƃ���R�������炵����B";
			next;
			mes "[�H�H�H]";
			mes "������A���ꂳ���";
			mes "�{�N�������ɗ���̂��֎~���Ă�̂��B";
			break;
		case 3:
			mes "[�H�H�H]";
			mes "���ꂾ���͋������Ȃ��̂��B";
			mes "�O���o���Ă��K��@���ꂽ����I";
			mes "�m���Ă邩�H";
			mes "���K��@�����ƂƂĂ��ɂ��̂����I";
			break;
		case 4:
			mes "[�H�H�H]";
			mes "�����ׂ̗ɏZ��ł���";
			mes "���k����Ȃ񂾂��ǁA";
			mes "�������O�ɕa�@�̎����";
			mes "�������Ă����̂��B";
			next;
			mes "[�H�H�H]";
			mes "�����ɂ���̂��΂�Ȃ��悤��";
			mes "�������猩�Ă�������";
			mes "�������Ă��邩�킩��Ȃ��������ǁA";
			mes "���k���񂪋A�������";
			mes "�������Ă����������������";
			mes "�_�̂悤�Ȃ��̂��������̂��B";
			next;
			mes "[�H�H�H]";
			mes "�R���Ǝv���Ȃ�A";
			mes "�a�@�̎���𒲂ׂĂ݂�΂����̂��B";
			mes "�������_������񂾂���I";
			next;
			mes "�]�a�@�̎���ɂ���Ƃ���";
			mes "�@�_�𒲂ׂĂ݂悤�]";
			delquest 11294;
			setquest 11295;
			set MALAYA_4QUE,14;
			close;
		case 5:
			mes "[�H�H�H]";
			mes "�ӂӂӂӁc�c";
			emotion 29;
			close;
		}
		next;
		mes "[�H�H�H]";
		mes "�{�N�������ɂ��邱�Ƃ͓��������B";
		mes "���ɂ��ꂳ��ɂ͐�΂Ɍ���Ȃ��ŁI";
		mes "�����������c�c";
		close;
	case 14:
		mes "[�H�H�H]";
		mes "�����ɂ���̂��΂�Ȃ��悤��";
		mes "�������猩�Ă�������";
		mes "�������Ă��邩�킩��Ȃ��������ǁA";
		mes "���k���񂪋A�������";
		mes "�������Ă����������������";
		mes "�_�̂悤�Ȃ��̂��������̂��B";
		next;
		mes "[�H�H�H]";
		mes "�R���Ǝv���Ȃ�A";
		mes "�a�@�̎���𒲂ׂĂ݂�΂����̂��B";
		mes "�������_������񂾂���I";
		next;
		mes "�]�a�@�̎���ɂ���Ƃ���";
		mes "�@�_�𒲂ׂĂ݂悤�]";
		close;
	case 15:
		mes "[�H�H�H]";
		mes "�ߊ��ȁI";
		mes (Sex? "����": "����")+ "����I";
		mes "�Ȃ��A�{�N�������ɂ��邱�Ƃ�";
		mes "�m���Ă���̂��H";
		emotion 23;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes (Sex? "����": "����")+ "���񂶂�Ȃ��B";
		emotion 6,"";
		close;
	default:
		if(MALAYA_4QUE < 16) {
			mes "�]�����̑��ނ炾�B";
			mes "�@�G��Ƒ���������鉹������]";
			close;
		}
		mes "�]�����ȑ��Ղ��c���Ă���B";
		mes "�@���͒N�����Ȃ��悤���]";
		close;
	}
}

malaya.gat,40,52,4	script	�������؂̖_#ma1	858,{
	if(MALAYA_4QUE == 14) {
		mes "�]��Ȍ`�������؂̖_��";
		mes "�@�n�ʂɓ˂����Ă��Ă���B";
		mes "�@�s�v�c�ȋC�z��������]";
		next;
		if(select("�_����������","���̂܂܂ɂ��Ă���") == 2) {
			mes "�]���Ȃ��͖؂̖_�ɂ͎��G�ꂸ";
			mes "�@���̏����ɂ����]";
			close;
		}
		if(rand(3) == 0) {
			if(checkitemblank() == 0) {
				mes "�]����ȏ�A�A�C�e���������Ƃ�";
				mes "�@�ł��܂���B";
				mes "�@�A�C�e���̎�ސ������炵�Ă���";
				mes "�@�ēx�A���ׂĂ��������]";
				close;
			}
			if(checkweight(6497,1) == 0) {
				mes "�]����ȏ�A�A�C�e���������Ƃ�";
				mes "�@�ł��܂���B";
				mes "�@�A�C�e���̏d�ʂ����炵�Ă���";
				mes "�@�ēx�A���ׂĂ��������]";
				close;
			}
			mes "�]�؂̖_�������������B";
			mes "�@�悭����Ƃ���肪�\���Ă���B";
			mes "�@";
			mes "�@�s�v�c�ȋC�z����܂���";
			mes "�@�悤�ȋC������]";
			if(rand(2) == 0)
				getitem 6497,1;
			else {
				delquest 11295;
				setquest 11296;
				set MALAYA_4QUE,15;
				getitem 6497,1;
				next;
				mes "�]���̂����͉����낤�H";
				mes "�@�ЂƂ܂��A���Y�̂Ƃ���ɖ߂낤�]";
			}
		} else {
			mes "�]�؂̖_�������������B";
			mes "�@�s�v�c�ȋC�z����܂���";
			mes "�@�悤�ȋC������]";
		}
		initnpctimer;
		close;
	}
	mes "�]��Ȍ`�������؂̖_��";
	mes "�@�n�ʂɓ˂����Ă��Ă���]";
	close;
OnTimer1000:
	hideonnpc strnpcinfo(0);
	end;
OnTimer16000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	end;
}

malaya.gat,31,42,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma2	858
malaya.gat,34,36,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma3	858
malaya.gat,40,32,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma4	858
malaya.gat,50,85,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma5	858
malaya.gat,46,93,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma6	858
malaya.gat,36,98,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma7	858
malaya.gat,48,79,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma8	858
malaya.gat,50,46,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma9	858
malaya.gat,59,84,4	duplicate(�������؂̖_#ma1)	�������؂̖_#ma10	858

malaya.gat,114,183,3	script	���̋Ȃ������V�k	575,{
	switch(MALAYA_4QUE) {
	case 17:
		mes "[���̋Ȃ������V�k]";
		mes "���̕a�@�ɂ͂����Ɖ�������I";
		next;
		menu "�؂̖_��������",-;
		mes "[���̋Ȃ������V�k]";
		mes "��H";
		mes "���̖_�́c�c";
		emotion 23;
		next;
		mes "[���̋Ȃ������V�k]";
		mes "������������!!";
		emotion 23;
		next;
		mes "[���̋Ȃ������V�k]";
		mes "���A���A�L�T�}!!";
		mes "�Ȃ񂿂�[���Ƃ����Ă��ꂽ�񂶂�I";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "����̓��c�𕕂��邽�߂�";
		mes "����肾�����̂ɁI";
		mes "����𔲂�����A�܂����c��";
		mes "�������͂��߂Ă��܂��I";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "���V�͌����̂���I";
		mes "�a�@�̑��ɉf�������c�̉e���B";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "�c�c���@���҂͒N��l�Ƃ���";
		mes "�A���Ă��Ȃ������B";
		mes "�����炭�A���c�͊��ҒB�Ɉ���������";
		mes "�����̗Ƃɂ��Ă����ɈႢ�Ȃ��B";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "���̖����A�����悤�Ɂc�c";
		mes "�c�c�c�c";
		next;
		mes "�]�a�@�̑O�ɂ͊Ō�t���Y��";
		mes "�@��l�ő҂��Ă���͂����B";
		mes "�@�V�k�̌����ʂ�Ȃ�΁A";
		mes "�@�u���c�v���a�@����";
		mes "�@�o�Ă��邩������Ȃ��B";
		mes "�@�}���ŕa�@�ɖ߂낤�]";
		delquest 11298;
		setquest 11299;
		set MALAYA_4QUE,18;
		close;
	case 18:
		mes "�]�a�@�̑O�ɂ͊Ō�t���Y��";
		mes "�@��l�ő҂��Ă���͂����B";
		mes "�@�V�k�̌����ʂ�Ȃ�΁A";
		mes "�@�u���c�v���a�@����";
		mes "�@�o�Ă��邩������Ȃ��B";
		mes "�@�}���ŕa�@�ɖ߂낤�]";
		close;
	case 23:
		mes "[���̋Ȃ������V�k]";
		mes "����H";
		mes "���܂�����́A�������c�c�H";
		mes "�c�c�N����������̂��H";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "�a�@�̒��̂����H";
		mes "�c�c�����炭�A���̃V���[�}����";
		mes "��������̂���낤�B";
		mes "�V���[�}����";
		mes "���̖k�̕��ɂ���͂�����B";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "����قǗL���ł͂Ȃ����A";
		mes "���̃V���[�}���̍��";
		mes "�����̌��ʂ͊m�����Ⴜ�B";
		next;
		mes "�]�|�[�g�}�����̖k�ɂ���Ƃ���";
		mes "�@�V���[�}���ɘb�𕷂��ɍs�����]";
		delquest 11304;
		setquest 11305;
		set MALAYA_4QUE,24;
		close;
	case 24:
		mes "[���̋Ȃ������V�k]";
		mes "�V���[�}����";
		mes "���̖k�̕��ɂ���͂�����B";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "����قǗL���ł͂Ȃ��̂��Ⴊ�A";
		mes "���̃V���[�}���̍��";
		mes "�����̌��ʂ͊m�����Ⴜ�B";
		next;
		mes "�]�|�[�g�}�����̖k�ɂ���Ƃ���";
		mes "�@�V���[�}���ɘb�𕷂��ɍs�����]";
		close;
	}
	mes "[���̋Ȃ������V�k]";
	mes "���ققفB";
	next;
	mes "[���̋Ȃ������V�k]";
	mes "���H";
	mes "����ȏ�H�ׂ����B";
	next;
	mes "[���̋Ȃ������V�k]";
	mes "��������Ȃ��H";
	mes "���V���Ⴂ�����";
	mes "���ŕ]���̔��l�������̂���B";
	if(MALAYA_4QUE == 16) {
		next;
		mes "[���̋Ȃ������V�k]";
		mes "�Ⴄ�H";
		mes "���܂Ȃ��˂��B";
		mes "�傫�����Řb���Ă���񂩂ˁB";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "�a�@�̂��Ƃ���ƁH";
		mes "���`�A�������������A�a�@���B";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "��c�c�a�@�H";
		mes "�a�@����ƁI";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "���������̕a�@�͎���Ă���I";
		mes "�ƂĂ��������̂�";
		mes "�߂���Ă���̂��Ⴀ�I";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "���V�̖����A���c�ɘA��čs�����";
		mes "���܂����̂���B";
		mes "�����āc�c��������";
		mes "�ߊ���Ă͂Ȃ�ʂ��B";
		next;
		if(select("�a�@�̂��Ƃ𕷂�","���̂��Ƃ𕷂�") == 2) {
			mes "[���̋Ȃ������V�k]";
			mes "���̖��́A���𗎂Ƃ��قǂ�";
			mes "�a�ł͂Ȃ������B";
			mes "�����̕��ׂ������̂���c�c";
			next;
			mes "[���̋Ȃ������V�k]";
			mes "���̕a�@�ɂ͂����Ɖ�������I";
			mes "�����ƃ��V�̖����A";
			mes "���c�ɂ��ꂽ�ɈႢ�Ȃ��̂���I";
			close;
		}
		mes "[���̋Ȃ������V�k]";
		mes "�a�@�̐ݗ������܂������ɂ́A";
		mes "�݂�Ȋ�񂾂��̂����B";
		mes "�傫�ȕa�@�̂��钬�܂�";
		mes "�s���Ȃ��Ă��A";
		mes "���Â��󂯂���悤�ɂȂ�ƂȁB";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "���Ⴊ�A�ǂ������킯��";
		mes "�a�@�Ŏ��Â��󂯂��҂�";
		mes "�]�v�Ɉ����Ȃ��Ă������̂���B";
		mes "��͂�c�c���̌Ö؂�؂���";
		mes "�a�@�����z�����̂�";
		mes "�ǂ��Ȃ������ɈႢ�Ȃ��B";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "�a�@�����������ƋC�Â����҂�";
		mes "�w���җl�ɒ�ɂ��s�����̂���B";
		mes "�����A�������Ă���Ȃ������c�c";
		next;
		mes "[���̋Ȃ������V�k]";
		mes "�������Ă��邤���ɁA";
		mes "���@���Ă����l������";
		mes "���X�ɖS���Ȃ����Ɠ`����ꂽ�B";
		mes "���̖��Ɠ����悤�Ɂc�c";
		next;
		mes "�]�a�@������Ă����";
		mes "�@�V�k�͌����Ă���B";
		mes "�@�������؂̖_�����̘V�k��";
		mes "�@�����Ă݂悤�]";
		delquest 11297;
		setquest 11298;
		set MALAYA_4QUE,17;
	}
	close;
}

malaya.gat,276,367,4	script	���̋Ȃ������V���[�}��	782,{
	if(MALAYA_1QUE < 6) {
		mes "[���̋Ȃ������V���[�}��]";
		mes "�c�c�c�c";
		next;
		mes "�]������ɋC�Â��Ă��Ȃ��悤���]";
		close;
	}
	mes "[���̋Ȃ������V���[�}��]";
	mes "���ށc�c";
	mes "������c�c";
	next;
	mes "[���̋Ȃ������V���[�}��]";
	mes "�����s�g�ȋC�z��";
	mes "���ʂ����犴����c�c";
	if(MALAYA_4QUE == 24) {
		next;
		mes "[���̋Ȃ������V���[�}��]";
		mes "�c�c";
		mes "��������Ȃ��Ă������B";
		mes "���ꂪ�K�v�ɂȂ邶��낤�B";
		next;
		mes "[���̋Ȃ������V���[�}��]";
		mes "���̎D�͂ȁA";
		mes "�����͂𕕂����߂邱�Ƃ�";
		mes "�ł���̂���B";
		next;
		mes "[���̋Ȃ������V���[�}��]";
		mes "����߂ċ��͂Ȍ��ʂ����䂦";
		mes "�g���������΁A�Ђ�����������낤�B";
		mes "�c�c�����A���ʂ��ɂ͕K�v�Ȃ��̂���B";
		mes "�����Ă����������B";
		next;
		mes "[���̋Ȃ������V���[�}��]";
		mes "���v����B";
		mes "�����͕K�v�Ȃ��B";
		mes "����͂��̒��̈��ʂȂ̂���c�c";
		next;
		mes "�]�V���[�}���̎D���󂯎�����B";
		mes "�@�Ō�t���Y�̂Ƃ���ɖ߂낤�]";
		delquest 11305;
		setquest 11306;
		set MALAYA_4QUE,25;
		close;
	}
	if(MALAYA_4QUE == 25) {
		next;
		mes "�]�Ō�t���Y�̂Ƃ���ɖ߂낤�]";
		close;
	}
	close;
}

ma_dun01_jp.gat,108,176,0	script	#mirror2	844,{
	mes "�]���ɂ͌��̐��E���f��������Ă���B";
	mes "�@�߂Â��Ζ߂邱�Ƃ��ł��������]";
	close;
}

ma_dun01_jp.gat,108,49,0	script	#mirror1	844,{
	mes "�]���ɂ͌��̐��E���f��������Ă���B";
	mes "�@�߂Â��Ζ߂邱�Ƃ��ł��������]";
	close;
}

//============================================================
// �X�̒��̔閧�N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_5QUE -> 0�`15
//------------------------------------------------------------
malaya.gat,305,281,3	script	�x������	570,7,7,{
	if(MALAYA_1QUE < 2) {
		mes "�]�x�������͌x�����̂悤���B";
		mes "�@��������Ă��ꂻ���ɂȂ��]";
		close;
	}
	if(MALAYA_1QUE < 6) {
		mes "[�x������]";
		mes "�|�[�g�}�����̊O�ɂ�";
		mes "^3131FF�o���I�E�}�q���K^000000�Ƃ���";
		mes "�����Ȓn�悪����܂��B";
		mes "�����Ɣ�ׂď�����";
		mes "���R�ɋ߂����������Ă��܂��B";
		next;
		mes "[�x������]";
		mes "�����ǁA������";
		mes "���낵�������X�^�[������̂ŁA";
		mes "�����s���̂Ȃ�C��t���ĉ������B";
		close;
	}
	if(BaseLevel < 100) {
		mes "[�x������]";
		mes "�ŋ߂͐l�m�ꂸ���𗣂��l������";
		mes "�����Ă��܂��B";
		mes "���Ȃ����_��̕��T����";
		mes "�X�ɍs�����Ƃ��Ă����ł����H";
		next;
		mes "[�x������]";
		mes "�������c�c���̂��Ȃ��̎��͂ł�";
		mes "����Ǝv���܂��B";
		mes "�X�̓����œ|��Ă��܂������c�c�B";
		next;
		mes "�]�x�������Ɏ��͕s�����w�E���ꂽ�B";
		mes "�@^FF0000BaseLv100�ȏ�^000000�ɂȂ��Ă���";
		mes "�@���炽�߂āA�b�����Ă݂悤�]";
		close;
	}
	switch(MALAYA_5QUE) {
	case 0:
		mes "[�x������]";
		mes "�ŋ߂͐l�m�ꂸ���𗣂��";
		mes "�l�������Ă��܂��B";
		mes "���Ȃ����_��̕��T����";
		mes "�X�ɍs�����Ƃ��Ă����ł����H";
		next;
		if(select("��H","�������A�Ⴂ�܂�") == 2) {
			mes "[�x������]";
			mes "�����ł����c�c�B";
			close;
		}
		mes "[�x������]";
		mes "����H�@��T���ł͖����̂ł����H";
		next;
		mes "[�x������]";
		mes "�ŋ߁A���̐l�����̊Ԃł�";
		mes "�X�ɂ������󂪉B����Ă���Ƃ�";
		mes "�E���T���L�܂��Ă��܂��B";
		next;
		mes "[�x������]";
		mes "�����ŉ\�b�����Ă���l������";
		mes "������̘b�����Ă��܂��B";
		mes "��������������Ȃ�";
		mes "��x�b�𕷂��Ƃ����ł��傤�B";
		delquest 72076;
		setquest 2271;
		set MALAYA_5QUE,1;
		close;
	case 1:
		mes "[�x������]";
		mes "�����ŉ\�b�����Ă���l������";
		mes "������̘b�����Ă��܂��B";
		mes "��������������Ȃ�";
		mes "��x�b�𕷂��Ƃ����ł��傤�B";
		close;
	default:
		mes "[�x������]";
		mes "��͂��̘b��";
		mes "�����̃E���T��������ł��傤���B";
		close;
	}
OnTouch:
	if(MALAYA_1QUE == 6 && MALAYA_5QUE < 1) {
		emotion 0,"";
		emotion 0;
	}
	end;
OnInit:
	waitingroom "�X�̒��̔閧",0;
	end;
}

malaya.gat,276,288,5	script	�b�D���ȏZ��	582,{
	if(MALAYA_1QUE < 6) {
		mes "�]�Z�������͂ƂĂ��x�����Ȃ���A";
		mes "�@�������������Řb�����Ă���]";
		close;
	}
	switch(MALAYA_5QUE) {
	case 1:
		emotion 0,"�b�D���ȏZ��";
		mes "[�b�D���ȏZ��]";
		mes "�X�Ŗ��q�ɂȂ����񂶂�Ȃ����ȁB";
		mes "����ȏ����Ȓ���";
		mes "����B���l������Ǝv�����H";
		next;
		emotion 19,"�������ȏZ��";
		mes "[�������ȏZ��]";
		mes "�����X�^�[�ɂ��ꂽ�̂ł́H";
		mes "�[���X�̉��ɂ͓����傫�ȗ���";
		mes "�Z��ł�Ƃ��k����񂪌����Ă���B";
		next;
		emotion 22,"�����q�҂̏Z��";
		mes "[�����q�҂̏Z��]";
		mes "�Ⴄ�A���̘b���悭�����񂾁B";
		next;
		mes "[�����q�҂̏Z��]";
		mes "���O��^3131FF�g�g�C^000000�͒m���Ă���ȁB";
		mes "^3131FF����^000000�ɏZ��ł���q����B";
		mes "���������̑O�A�X��";
		mes "�s���Ă��̂�m���Ă��邩�H";
		next;
		emotion 23,"�b�D���ȏZ��";
		emotion 23,"�������ȏZ��";
		mes "[�b�D���ȏZ��]";
		mes "�{����!?�@�����ɋA���ė����̂��H";
		next;
		emotion 0,"�����q�҂̏Z��";
		mes "[�����q�҂̏Z��]";
		mes "�����A�������������̂�";
		mes "���̂��ς���^3131FF�g�g�C^000000��";
		mes "���̌�A�Ƃ���O�ɏo�Ă��Ȃ��񂾂�B";
		next;
		emotion 1,"�������ȏZ��";
		mes "[�������ȏZ��]";
		mes "�ǂ����Ă�����H";
		next;
		emotion 0,"�����q�҂̏Z��";
		mes "[�����q�҂̏Z��]";
		mes "���܂��Ă邾��B";
		mes "����������������ɈႢ�Ȃ��B";
		next;
		emotion 23,"�b�D���ȏZ��";
		emotion 23,"�������ȏZ��";
		mes "[�b�D���ȏZ��]";
		mes "�܂���!?";
		mes "�����^3131FF�g�g�C^000000�͂��������ɁH";
		next;
		emotion 22,"�����q�҂̏Z��";
		mes "[�����q�҂̏Z��]";
		mes "����͂܂����Ǝv���B";
		mes "^3131FF�g�g�C^000000�̓z��";
		mes "�Ƃɖ߂��Ă���̂��������ǁA";
		mes "���ɂ������Ă��Ȃ������񂾁B";
		next;
		emotion 1,"�������ȏZ��";
		mes "[�������ȏZ��]";
		mes "���Ⴀ^3131FF�g�g�C^000000�͉Ƃ�";
		mes "�������Ă���̂�����H";
		next;
		emotion 9,"�����q�҂̏Z��";
		mes "[�����q�҂̏Z��]";
		mes "���̐l�����ɂ΂�Ȃ��悤";
		mes "�����ɕ�������ė��邽�߂�";
		mes "�v������ĂĂ���񂾂낤�B";
		mes "�N�ɂ��΂�Ȃ����";
		mes "���ׂĂ̕��Ƃ��߂ł��邩��ȁB";
		next;
		emotion 0,"�b�D���ȏZ��";
		mes "[�b�D���ȏZ��]";
		mes "�Ȃ�قǁI";
		mes "����Ȃ�m���ɂ��܂������I";
		next;
		emotion 14,"�������ȏZ��";
		mes "[�������ȏZ��]";
		mes "����B�����Ȃ��`�`�B";
		mes "���Ȃ�s�J�s�J�ɖ�����";
		mes "�N�������������鎩�M������̂ɁI";
		next;
		emotion 9,"�����q�҂̏Z��";
		mes "[�����q�҂̏Z��]";
		mes "�����玄������^3131FF�g�g�C^000000�̓z��";
		mes "���܂��������ĕ�݂̍菈��";
		mes "�����o��������Ȃ����I�@�ǂ������H";
		next;
		emotion 0,"�b�D���ȏZ��";
		mes "[�b�D���ȏZ��]";
		mes "�����A�C�f�B�A���I";
		next;
		emotion 9,"�b�D���ȏZ��";
		mes "[�b�D���ȏZ��]";
		mes "�����A^3131FF�g�g�C^000000�̓z��";
		mes "�ȒP�ɂ���������Ă���邩�H";
		mes "�z�͕��Ƃ��߂��悤��";
		mes "���Ă���Ƃ����̂Ɂc�c�B";
		next;
		emotion 28,"�������ȏZ��";
		mes "[�������ȏZ��]";
		mes "���Ⴀ�������͕�T���ł͂Ȃ�";
		mes "^3131FF�g�g�C^000000�����������@��";
		mes "���x�͍l���Ȃ��Ƃ����Ȃ��̂��ȁH";
		next;
		emotion 28,"�������ȏZ��";
		mes "[�������ȏZ��]";
		mes "���`�`������������ɓ����̂���";
		mes "�{���ɂނ������`�`!!";
		delquest 2271;
		setquest 2272;
		set MALAYA_5QUE,2;
		close;
	case 2:
		mes "�]����ȏ�̏��͂Ȃ��������B";
		mes "�@�g�g�C�Ƃ����l��T���Ă݂悤�]";
		close;
	default:
		mes "�]���̏Z��������";
		mes "�@�[���Ȋ�����Ȃ���";
		mes "�@�����b���Ă���]";
		close;
	}
}
malaya.gat,278,288,3	duplicate(�b�D���ȏZ��)	�������ȏZ��	583
malaya.gat,276,286,7	duplicate(�b�D���ȏZ��)	�����q�҂̏Z��	582

ma_in01.gat,47,101,3	script	�g�g�C	577,7,7,{
	switch(MALAYA_5QUE) {
	case 3:
		if(countitem(506) < 1){
			mes "[�g�g�C]";
			mes "���R�͌�Ő������邩��";
			mes "�܂��͖ڂ������Ă���Ȃ��H";
			mes "�����I�̒���^3131FF�΃|�[�V����^000000��";
			mes "�c���Ă���͂��Ȃ񂾁B";
			mes "�������ǁA����������Ă��Ă�B";
			close;
		}
		mes "[�g�g�C]";
		mes "����A�܂������ɂ���́H";
		mes "�΃|�[�V�����͂������H";
		mes "�O�������Ȃ��Ăǂ��ɂ��Ȃ肻���B";
		next;
		if(select("�΃|�[�V������n��","�n���Ȃ�") == 2) {
			mes "[�g�g�C]";
			mes "������I";
			mes "�Ӓn������Ȃ�I";
			close;
		}
		mes "[�g�g�C]";
		mes "�΃|�[�V�������B���肪�Ƃ��I";
		mes "�悵�B������������āc�c";
		mes "�S�N�S�N�c�c";
		mes "�c�c";
		mes "�p�`�p�`�c�c�p�`�p�`�c�c";
		mes "�����B�������I";
		delitem 506,1;
		delquest 72150;
		setquest 72155;
		set MALAYA_5QUE,4;
		close;
	case 4:
		emotion 0;
		mes "[�g�g�C]";
		mes "������!!�@�ڂ�������I";
		mes "������I";
		next;
		emotion 9,"";
		emotion 21;
		mes "[�g�g�C]";
		mes "�ӂ��c�c�B";
		mes "���[�悩�������B";
		mes "���肪�Ƃ��I";
		next;
		mes "[�g�g�C]";
		mes "����ŁA���������Č����������H�@��H";
		mes "�{�N������������Ƃ��B";
		mes "������������͉��̘b�Ȃ́H";
		next;
		menu "�Z�����b���Ă������e�𕷂�����",-;
		emotion 18;
		mes "[�g�g�C]";
		mes "�������āH";
		mes "��������āA�{�N����������!?";
		mes "�������Ă��!�H";
		next;
		emotion 32;
		mes "[�g�g�C]";
		mes "�ǂ����Ĉ��";
		mes "����Ȃ킯�̂킩��Ȃ��b�Ɂc�c";
		mes "�͂͂��B�͂͂́c�c";
		mes "�͂��c�c�B";
		next;
		mes "[�g�g�C]";
		mes "�c�c�B";
		next;
		mes "[�g�g�C]";
		mes "�X�ɂ́A����߂܂��邽�߂�";
		mes "�s������������B";
		mes "��Ȃ񂩌������Ƃ��Ȃ��B";
		mes "������c�c�B";
		next;
		emotion 9;
		mes "[�g�g�C]";
		mes "�܂�������Ȃ��ƂɂȂ�Ȃ�āc�c�B";
		next;
		menu "����������������",-;
		mes "[�g�g�C]";
		mes "���킢����������Ă���";
		mes "�������炵�悤�Ǝv���Ă��񂾁B";
		next;
		emotion 18;
		mes "[�g�g�C]";
		mes "���̒��ɕX�Ƃ����������̂�";
		mes "���A�̂悤�Ȃ���ł���H";
		mes "���̂ЂƂ��呛�����Ȃ���";
		mes "������̂��y�����āI";
		next;
		mes "[�g�g�C]";
		mes "����ŁA���ʂ̒����Ⴀ";
		mes "�݂�Ȃ����܂�����Ȃ��Ǝv����";
		mes "�G�h�[�ƈꏏ�ɐX�ɓ������񂾁B";
		mes "�X�Ȃ璿���������������񂢂邩��ˁB";
		next;
		mes "[�g�g�C]";
		mes "���A�G�h�[�͂��킢����������񂾂�B";
		mes "���ƂȂ����Ĉ��g������厖�ȗF�B�B";
		mes "������Ɖ��a�ȂƂ��낪������";
		mes "���ɂł������i����񂾂�ˁB";
		next;
		emotion 9;
		mes "[�g�g�C]";
		mes "���̓��A�X�Œ���T���Ă�������";
		mes "�X�̉��[���܂œ����������肩��";
		mes "�G�h�[�̓��������悭�i���Ă��B";
		mes "�����A�����̎��������̎���";
		mes "����ȂɋC�ɂ��Ă��Ȃ������񂾁B";
		next;
		mes "[�g�g�C]";
		mes "�ł��ˁB���΂炭���Ă��G�h�[��";
		mes "�S�R����܂Ȃ������񂾁B";
		mes "�������ɂ�����Ƃ��������ȁA�Ǝv����";
		mes "�d���Ȃ��U��Ԃ��Ă݂��񂾂�B";
		mes "���̎����c�c�B";
		next;
		musiceffect "42";
		mes "�]�g�g�C�͑��̒N���ɕ�����Ȃ��悤";
		mes "�@�g���񂹂Ď����ł����₢���]";
		next;
		mes "[�g�g�C]";
		mes "�����������񂾁B";
		next;
		menu "����!?",-;
		mes "[�g�g�C]";
		mes "���܂Ő����Ă����Ȃ���";
		mes "����قǑ傫�Ȍ��͏��߂Č�����B";
		next;
		mes "[�g�g�C]";
		mes "�傫�Ȍ����_�̂悤�ɕ����Ă��āc�c";
		mes "���X�ɂԂ牺�����Ă����̂�";
		mes "���c�c���ȁB�ł��������݂����ȁc�c�B";
		next;
		mes "[�g�g�C]";
		mes "���̂����������������";
		mes "���H�@�̂悤�Ȃ��̂����ꗎ���Ă��B";
		next;
		mes "[�g�g�C]";
		mes "�������ꗎ������ɂ�";
		mes "�r�̂悤�Ȑ����܂肪�����āA";
		mes "����Ղ���ՁA�h��Ă��񂾁c�c�B";
		next;
		mes "[�g�g�C]";
		mes "�Ƃɂ����킯���A�킩��Ȃ�������B";
		next;
		menu "�P���Ȃ������H",-;
		emotion 28;
		mes "[�g�g�C]";
		mes "����B";
		mes "���͂��̎��A�{�N�̑厖�ȃG�h�[��";
		mes "�͈�t�����̑�������ł���Ă��񂾁B";
		mes "���i�͉��a�ł����i����̂ɁB";
		mes "�������Ń{�N�͓����؂ꂽ���ǁA";
		mes "�����G�h�[�́c�c�G�h�[�́c�c�B";
		next;
		mes "[�g�g�C]";
		mes "�ڂ͂��̎��ɂ��ꂽ�B";
		mes "�ǂ�����ċA���Ă����̂���";
		mes "��������܂�o���ĂȂ��B";
		next;
		menu "�����͂Ȃ񂾂����̂���",-;
		mes "[�g�g�C]";
		mes "���`��A��ԓ����I�������̂́A";
		mes "�w���ɑ傫�Ȕ����悹�Ă���";
		mes "���Ƃ����ǁc�c";
		mes "�{�N�͌������Ƃ����������Ƃ�";
		mes "�Ȃ��悤�ȉ����������B";
		next;
		mes "[�g�g�C]";
		mes "�����������̉���������";
		mes "�����ċA���Ă����l��";
		mes "���܂肢�Ȃ��񂶂�Ȃ����ȁB";
		next;
		mes "[�g�g�C]";
		mes "�����B^FF0000���̒B�l^000000�Ȃ�";
		mes "������m���Ă��邩������Ȃ���B";
		mes "����̋߂��ɂ���Ǝv����B";
		mes "�C�ɂȂ�Ȃ�A�����Ă݂���ǂ��B";
		next;
		mes "[�g�g�C]";
		mes "�����A�G�h�[�B";
		mes "�G�h�[�c�c�B";
		mes "���肢�����疳���ł��āc�c�B";
		musiceffect "149";
		delquest 72155;
		setquest 2273;
		set MALAYA_5QUE,5;
		close;
	case 5:
		mes "[�g�g�C]";
		mes "�{�N�̂��킢���G�h�[�c�c�B";
		mes "���肢������ǂ��������ł��āc�c�B";
		mes "�G�h�[!!�@���킠�����I";
		emotion 28;
		close;
	case 6:
		mes "[�g�g�C]";
		mes "�G�h�[�I�@�G�`�`�`�h�`�`�`!!";
		mes "�{�N��������ׂɎ��ʂȂ�āB";
		mes "���킠������!!";
		emotion 28;
		close;
	case 7:
		mes "[�g�g�C]";
		mes "�G�h�[�c�c�G�h�[�c�c�B";
		mes "�����H";
		mes "�����Ƒ��������ꏊ�����������āH";
		next;
		mes "[�g�g�C]";
		mes "���[��c�c���[��c�c�B";
		mes "���܂�o���ĂȂ��Ȃ��B";
		next;
		mes "[�g�g�C]";
		mes "���Ȃ艜�[���X����������";
		mes "�o���I�E�}�q���K���ʂ�z���Ă����ȁB";
		mes "^3131FF���̉�^000000�����������C������B";
		mes "�o���Ă���̂͂��̂��炢�B";
		close;
	case 8:
	case 9:
	case 10:
	case 11:
		mes "[�g�g�C]";
		mes "�G�h�[�ɉ�����B�G�h�[�c�c�B";
		mes "���킠����!!";
		close;
	case 12:
		emotion 28;
		mes "[�g�g�C]";
		mes "�G�h�[�ɉ�����B�G�h�[�c�c�B";
		mes "���킠����!!";
		next;
		mes "[�G�h�[]";
		mes "�����I�@����!!";
		donpcevent "��#totoi::OnStart";
		next;
		emotion 23;
		mes "[�g�g�C]";
		mes "!?";
		mes "�G�h�[�I�@�G�h�[�Ȃ�!?";
		mes "��������������!!!!!!�@�Ȃ��!?";
		mes "�{���ɁH�@�{��!!�@�G�h�[!!";
		mes "�G�h�[�I�@������I�@�M�����Ȃ�!!";
		next;
		mes "[�g�g�C]";
		mes "���Ȃ����G�h�[�������Ă��ꂽ�́H";
		mes "�{���ɂ��肪�Ƃ��I";
		mes "���̉����Ɖ��Ȃ������H";
		next;
		menu "���v�B�N���X�ɂ͓�x�Ƌ߂Â��Ȃ��ł�",-;
		mes "[�g�g�C]";
		mes "����!!";
		mes "���ւցB�G�h�[�B";
		mes "�X�͊댯����������s���Ȃ���I";
		next;
		mes "[�G�h�[]";
		mes "�c�c";
		next;
		mes "[�g�g�C]";
		mes "���Ǒ��ɂ��V�ԏꏊ�͂����ς����邩��";
		mes "�S�z���Ȃ��łˁI";
		next;
		mes "[�G�h�[]";
		mes "��������!!";
		next;
		mes "[�g�g�C]";
		mes "�{���ɂ��肪�Ƃ�" +(Sex? "���Z": "���o")+ "�����I";
		next;
		mes "[�g�g�C]";
		mes "�{�N���傫���Ȃ�����A";
		mes "���o�����݂������Y���";
		mes "�D���������ɂȂ肽���ȁ`�I";
		mes "�˂��˂��A�Ȃ�邩�Ȃ��H";
		next;
		menu "�c�c���������ď��̎q�H",-;
		mes "[�g�g�C]";
		mes "��������I";
		mes "�悭�j�̎q�ƊԈ���邯�ǁc�c�B";
		mes "���O���g�g�C������Ȃ̂��Ȃ��H";
		next;
		mes "[�g�g�C]";
		mes "�܂����ꂳ��̂����̒��ɂ�������";
		mes "�{�N�����܂�Ɍ��C����������A";
		mes "���e���j�̎q���Ɗ��Ⴂ����";
		mes "����Ȗ��O�ɂ���������񂾁B";
		mes "���͂́B";
		next;
		mes "[�g�g�C]";
		mes "�厖�ȗF�B��";
		mes "�����Ă���Ă��肪�ƁB";
		mes "������������Ȃ�����c�c�B";
		mes "�I�𒲂ׂĂ݂邩��A";
		mes "���������������x�b�������ĂˁB";
		delquest 2278;
		setquest 2279;
		set MALAYA_5QUE,13;
		close;
	case 13:
		mes "[�g�g�C]";
		mes "�������I";
		next;
		mes "[�g�g�C]";
		mes "����̓{�N�̂��ꂳ��";
		mes "���ꂽ���Ȃ񂾂��ǁA";
		mes "�{�N�͉��Ɏg���̂�";
		mes "�悭�킩��Ȃ�����B���ւցB";
		mes "���ɗ��Ƃ����񂾂��ǁB";
		next;
		if(checkitemblank() == 0) {
			mes "[�g�g�C]";
			mes "����A�A�C�e���������ς�����H";
			mes "��ސ������炵�Ă���";
			mes "������x�b�����āI";
			close;
		}
		if(checkweight(6497,5) == 0) {
			mes "[�g�g�C]";
			mes "����A�A�C�e���������ς�����H";
			mes "�d�ʂ����炵�Ă���";
			mes "������x�b�����āI";
			close;
		}
		getitem 6497,5;
		delquest 2279;
		setquest 2280;
		set MALAYA_5QUE,14;
		mes "[�g�g�C]";
		mes "���ꂶ�Ⴀ�B";
		mes "�g�g�C�ɉ�����Ȃ�����";
		mes "�܂��V�тɗ��ĂˁI";
		next;
		mes "[�G�h�[]";
		mes "�������������I";
		hideonnpc "��#totoi";
		close;
	case 14:
	case 15:
		mes "[�g�g�C]";
		mes "�G�h�[�͗V�тɍs���Ă邩��";
		mes "���̓{�N�ЂƂ�Ȃ񂾁B";
		mes "�˂��B�����������낢";
		mes "��������͂Ȃ�����??";
		close;
	default:
		mes "�]�u���u���k���Ă���]";
		if(MALAYA_5QUE == 2) {
			next;
			if(select("����@���Ă݂�","���̂܂܂ɂ��Ă���") == 2) {
				mes "�]���N�́A�����ɋ�����悤��";
				mes "�@�G������Đk���Ă���]";
				close;
			}
			emotion 23;
			mes "[�g�g�C]";
			mes "�q�I�@�q�C�C!!�@�q�C�C�C�b�I";
			mes "���A����ȁI�@�������ɍs��!!";
			next;
			menu "���v�H",-;
			mes "[�g�g�C]";
			mes "����c�c�l�c�c�H�@���A�N�H";
			next;
			mes "�]�q���͂���������߂Ă��邪";
			mes "�@�����l�q�����������]";
			next;
			mes "[�g�g�C]";
			mes "�����ɒN������ł���H�@�N�H";
			next;
			menu "�Z�����畷�����b������",-;
			mes "[�g�g�C]";
			mes "��H�@���̘b�����Ă��!?";
			mes "����Ȃ��Ƃ�荡�A�ڂ������Ȃ����āB";
			mes "�������ǂ܂��̓{�N�̖ڂ�";
			mes "�����Ă���Ȃ��H";
			next;
			menu "�Ȃ��ڂ��c�c�H",-;
			mes "[�g�g�C]";
			mes "���R�͌�Ő��������B";
			mes "�܂��͐�ɖڂ������̂�";
			mes "��`���Ă���Ȃ��H";
			mes "�����I�̒���^3131FF�΃|�[�V����^000000��";
			mes "�c���Ă���͂��Ȃ񂾁B";
			mes "�������ǁA����������Ă��Ă�B";
			delquest 2272;
			setquest 72150;
			set MALAYA_5QUE,3;
		}
		close;
	}
OnTouch:
	if(MALAYA_5QUE < 4)
		emotion 23;
	end;
}

ma_in01.gat,43,101,7	script	��#totoi	81,{
	end;
OnStart:
	initnpctimer;
	hideoffnpc "��#totoi";
	end;
OnTimer300000:
OnInit:
	hideonnpc "��#totoi";
	end;
}

ma_in01.gat,44,105,3	script	�I	844,{
	if(MALAYA_5QUE == 3) {
		mes "�]���Ȃ��͒I���J����";
		mes "�@�΃|�[�V������T�����]";
		next;
		mes "�]���������]";
		next;
		mes "�]���������]";
		mes "�]���������]";
		next;
		mes "�]�o�^�o�^�]";
		next;
		mes "�]��̕r������������Ȃ��B";
		mes "�@�����ŗp�ӂ��邵���Ȃ��������]";
		close;
	}
	mes "�]�I������]";
	close;
}

malaya.gat,290,152,5	script	���̒B�l	578,{
	switch(MALAYA_5QUE) {
	case 5:
		mes "[���̒B�l]";
		mes "�Ђィ�����I�@�ӂ��������I";
		mes "���͎��̒B�l�B";
		mes "����̓��[���~�b�h�K�b�c������";
		mes "�������~�m�^�E���X��";
		mes "���肾���œ|���Ă��܂����B";
		mes "�����ƁB�����p���ȁH";
		next;
		if(select("�g�g�C���畷�����b������","���ɗp�͖���") == 2) {
			mes "[���̒B�l]";
			mes "�����H�@�N�I�@�ǂ��ɍs����?!";
			close;
		}
		mes "[���̒B�l]";
		mes "�Ȃ񂾂���!?";
		mes "�������������Ƃ�����l������H";
		next;
		mes "[���̒B�l]";
		mes "�傰���Ȏ����������Ⴂ���Ȃ���B";
		mes "�����X�^�[�Ȃ�|�[�g�}��������";
		mes "������ł�����񂾁B";
		mes "���̂��炢�łт����肷��Ȃ�H";
		next;
		menu "�w���ɔ����悹�������炵��",-;
		mes "[���̒B�l]";
		mes "�w���ɔ����悹���������ƁI";
		mes "����ȉ������ǂ��ɂ���Ƃ�����!?";
		mes "���͎��̒B�l�����A";
		mes "����ȉ����͌������Ƃ��Ȃ��B";
		next;
		mes "[���̒B�l]";
		mes "�����B�����Ƃ��̎q��";
		mes "���̕ӂɂ���R���h����";
		mes "�����Č��ԈႦ���񂾂낤�B";
		next;
		mes "[���̒B�l]";
		mes "��l���o�J�ɂ��Ă͂����Ȃ���B";
		mes "�����ƁA���̎��̒B�l�̊֐S��";
		mes "�Ƃ��߂������񂾂낤�B";
		mes "�S���A��������̂��߂ł���B";
		mes "�Ђィ������!!�@�ӂ��������I";
		next;
		if(select("�g�g�C��M����","�g�g�C���^��") == 2) {
			mes "[���̒B�l]";
			mes "�q�������͂悭";
			mes "�����������L���Șb����������B";
			mes "���̎q�������������񂾂낤�B";
			set MALAYA_5QUE,6;
			close;
		}
	case 6:
		if(MALAYA_5QUE == 6) {
			mes "[���̒B�l]";
			mes "�Ȃ񂾁A�܂������̂��B";
			next;
			if(select("������T���Ă݂�I","�����͂��Ȃ��悤�ł�") == 2) {
				mes "[���̒B�l]";
				mes "�S���q���̂������炾��B";
				close;
			}
		}
		mes "[���̒B�l]";
		mes "�ق��H�@�����܂Ō����Ȃ�";
		mes "�����؋��������ė��Ă���B";
		next;
		mes "[���̒B�l]";
		mes "�������ȁB�����Ă�����݂̂͂�";
		mes "���g�̍��Ղ�";
		mes "���炩�̌`�ŕK���c���Ă���B";
		mes "�g�C�����g�킸�ɐ������鎖��";
		mes "�s�\���낤�H";
		mes "�ӂӂӁB�܂��������������B";
		emotion 29;
		next;
		mes "[���̒B�l]";
		mes "���̎q�������������Ƃ����ꏊ��";
		mes "^FF0000����̕W�{^000000��10��";
		mes "�̏W���ė��Ă���B";
		mes "�W�߂Ă��Ă��ꂽ��";
		mes "���̒��ɉ����̍��Ղ����邩";
		mes "���ׂ悤����Ȃ����B";
		next;
		mes "[���̒B�l]";
		mes "�Y��ȏ����̎��";
		mes "���̂悤�ȕ���G�点��͔̂E�тȂ���";
		mes "�܂��c�c����B";
		mes "�N�Ȃ�Ȃ�Ƃ����Ă���邾��H";
		delquest 2273;
		setquest 2274;
		set MALAYA_5QUE,7;
		close;
	case 7:
		if(countitem(6519) < 10) {
			mes "[���̒B�l]";
			mes "�ǂ������B�W�{�͂܂����H";
			mes "����Ƃ��N�ɂ͓���������ȁB";
			close;
		}
		delitem 6519,10;
		delquest 2274;
		setquest 2275;
		set MALAYA_5QUE,8;
		mes "[���̒B�l]";
		mes "�ނށB���̍���!!�����B";
		mes "�́c�c�͂��B���A�m���ɁB";
		mes "�������񂾕W�{�̂悤���ȁB";
		mes "�Ƃ肠�������B�����ɕW�{��u����";
		mes "����悭����ė��Ă���B";
		emotion 76;
		close;
	case 8:
		mes "[���̒B�l]";
		mes "�ł͕W�{�𒲂ׂĂ݂悤�B";
		next;
		mes "�]���������]";
		next;
		mes "�]���������]";
		mes "�]���������]";
		next;
		mes "�]���������]";
		mes "�]�i���A�L���j�]";
		mes "�]���������]";
		next;
		mes "[���̒B�l]";
		mes "�ށc�I�@���A�����!!";
		next;
		mes "[���̒B�l]";
		mes "�����I�@���I�@���I�@���I�@�ق�����!!";
		next;
		mes "[���̒B�l]";
		mes "������ƌN�I";
		mes "�����ɗ��Ă����G���Ă݂�I";
		delquest 2275;
		setquest 72160;
		set MALAYA_5QUE,9;
		hideoffnpc "#buwaya_soil";
		close;
	case 9:
		mes "[���̒B�l]";
		mes "�������̕W�{�𒼐ڐG���Ă݂�I";
		hideoffnpc "#buwaya_soil";
		close;
	case 10:
		mes "[���̒B�l]";
		mes "�}���Ōx��������";
		mes "�u�����������ĊJ�������Ƃ�";
		mes "�m�点��񂾁B";
		mes "�x��������";
		mes "���̖k���̒n��ɂ���͂����B";
		close;
	default:
		if(MALAYA_5QUE < 11) {
			mes "[���̒B�l]";
			mes "�Ђィ�����I�@�ӂ��������I";
			mes "���͎��̒B�l�I";
			mes "�E���Ȏ��ɕ|�����͂Ȃ���";
			mes "�ɓx�̐l���m��Ȃ񂾁c�c�B";
			close;
		}
		mes "[���̒B�l]";
		mes "�������c�c�B";
		close;
	}
}

malaya.gat,291,152,3	script	#buwaya_soil	557,{
	if(MALAYA_5QUE != 9) {
		mes "�]�����Ђǂ��L�����̂�����]";
		close;
	}
	mes "�]���������]";
	next;
	mes "�]���������]";
	mes "�]�̂�̂�]";
	next;
	mes "�]���������]";
	mes "�]�̂�̂�]";
	mes "�]���������]";
	next;
	mes "�]���ɉ������������";
	mes "�@���G���`����Ă����]";
	next;
	menu "�Ȃ�ł��������",-;
	mes "[���̒B�l]";
	mes "�ق��I�@���̑傫���ď�v�ȕ��́I";
	next;
	mes "[���̒B�l]";
	mes "�����^3131FF�u����^000000�̎����I";
	mes "�܂����B����Ȃ��Ƃ��I";
	next;
	menu "�u�����H",-;
	mes "[���̒B�l]";
	mes "�������I�@�u�������B";
	mes "�����B�����c�c���������Ȃ��Ă������B";
	mes "���A���󂷂���B";
	emotion 75,"���̒B�l";
	next;
	mes "[���̒B�l]";
	mes "�c�c";
	mes "�c�c�c�c";
	mes "�X�[�A�n�@�`�B";
	mes "�ӂ����B";
	emotion 54,"���̒B�l";
	next;
	mes "[���̒B�l]";
	mes "���ށB����ł��B";
	mes "���̎q�������ƌ���";
	mes "�w���ɔ����悹�������Ƃ����̂�";
	mes "�u�����ɊԈႢ�Ȃ��B";
	next;
	mes "[���̒B�l]";
	mes "�̘̂b�ł��܂�o���Ă��Ȃ���";
	mes "�����̂��ꂳ��̂��������";
	mes "������������ɂ��ꂽ�Ƃ���";
	mes "�b�𕷂������Ƃ�����B";
	mes "���̂��΂����񂾁B";
	next;
	mes "[���̒B�l]";
	mes "�u�������ʂ�߂����ꏊ�ɂ�";
	mes "�ǂ�Ȑ����̂��c��Ȃ��ƌ����b���B";
	mes "���̃g�g�C�Ƃ����q��";
	mes "�{���ɉ^���ǂ������ȁB";
	next;
	menu "�̂��炢����ł����H",-;
	mes "[���̒B�l]";
	mes "�����A��̑O��";
	mes "�\�b�Ƃ��ĐF�X�Ȏ������������̂���";
	mes "�ŋ߂͑S�R�����Ȃ��Ȃ��Ă����ȁB";
	mes "�~���ł����Ă����񂾂낤���B";
	next;
	mes "[���̒B�l]";
	mes "�Ƃɂ����A���̂悤�ȋ��낵��������";
	mes "�������ĊJ�����Ƃ������Ƃł����";
	mes "��X�������̊Ԃ�";
	mes "�C��t���������ǂ��������ȁB";
	mes "���̐l�����ɂ��X�̉��ɂ�";
	mes "����Ȃ��悤���ӂ��Ă������B";
	next;
	mes "[���̒B�l]";
	mes "�悵�B���܂Ȃ����N�A";
	mes "���̌x�������̏��ɍs����";
	mes "�u���������������Ƃ������Ƃ�";
	mes "�m�点�Ă���Ȃ����B";
	next;
	mes "[���̒B�l]";
	mes "�������̃n���^�[������";
	mes "�A�����Ƃ��ēz��|�����@��";
	mes "���ׂČ��邱�Ƃɂ��悤�B";
	hideonnpc "#buwaya_soil";
	delquest 72160;
	setquest 2276;
	set MALAYA_5QUE,10;
	close;
OnInit:
	hideonnpc "#buwaya_soil";
	end;
}

ma_fild02.gat,155,235,3	script	�����̍���#01	557,{
	if(MALAYA_5QUE == 7) {
		if(countitem(6519) >= 10) {
			mes "�]�W�{�͂�������ȏ�";
			mes "�@�W�߂Ȃ��Ă��ǂ��������]";
			close;
		}
		mes "�]�y�Ƒ��Ȃǂ��������Ă���";
		mes "�@�����̍��Ղ�������]";
		next;
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@����ȏ㎝���Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă��玎�����]";
			close;
		}
		if(rand(3) == 0) {
			mes "�]����L���ɖڂ܂���������";
			mes "�@���܂��̏W���ł��Ȃ������]";
			sc_start3 SC_POISON,0,0,0,0,5000,10;
			close;
		}
		mes "�]�����̉��������܂�";
		mes "�@�_�炩�����̕W�{��";
		mes "�@���Ȃ��͂������ƍ̏W�����]";
		getitem 6519,1;
		initnpctimer;
		hideonnpc strnpcinfo(0);
		close;
	}
	end;
OnTimer20000:
	stopnpctimer;
	hideoffnpc strnpcinfo(0);
	end;
}
ma_fild02.gat,143,142,3	duplicate(�����̍���#01)	�����̍���#02	557
ma_fild02.gat,266,155,3	duplicate(�����̍���#01)	�����̍���#03	557
ma_fild02.gat,221,91,3	duplicate(�����̍���#01)	�����̍���#04	557
ma_fild02.gat,205,85,3	duplicate(�����̍���#01)	�����̍���#05	557
ma_fild02.gat,300,98,3	duplicate(�����̍���#01)	�����̍���#06	557
ma_fild02.gat,100,275,3	duplicate(�����̍���#01)	�����̍���#07	557

malaya.gat,290,340,3	script	�x������	571,{
	if(MALAYA_1QUE < 6) {
		mes "�]�x�������͉s���ڂ�";
		mes "�@���Ȃ����ɂ݂Ȃ���x�����Ă���]";
		close;
	}
	switch(MALAYA_5QUE) {
	case 10:
		mes "[�x������]";
		mes "����⃂���X�^�[�ւ̑Ή���";
		mes "���܁A�������͖Z�����񂾁B";
		next;
		mes "[�x������]";
		mes "�����A�x���͖��S�̑̐��ŗՂ�ł���B";
		mes "���S���ă|�[�g�}�������y����ł���B";
		next;
		if(select("�u�����̎���m�点��","��b���I����") == 2)
			close;
		mes "[�x������]";
		mes "�Ȃ�!?�@�u���������āH";
		mes "�\�ł������������Ƃ������������A";
		mes "�{���Ɏ��݂����Ƃ́I�@���Ƃ��������B";
		next;
		mes "[�x������]";
		mes "���������B";
		mes "���̎������͒��̒���";
		mes "�قƂ�ǂ̐�͂�z�u������Ԃ��B";
		next;
		mes "[�x������]";
		mes "�Ƃ����ĐX��S�ʗ����֎~��";
		mes "���邱�Ƃ͗e�Ղł͂Ȃ��c�c�B";
		mes "�X�ŐH�Ƃ��W�߂�";
		mes "���v�𗧂ĂĂ���l������̂��B";
		mes "�������ɂȂ��Ă��܂��c�c�B";
		next;
		mes "[�x������]";
		mes "�������I�@���܂Ȃ����N";
		mes "�|�[�g�}�����̂��߂�";
		mes "�����͂�݂��Ă���邩�ˁH";
		next;
		if(select("�C���ĉ�����","���f�肵�܂�") == 2) {
			mes "[�x������]";
			mes "�΂���!?";
			mes "���̂܂܂ł͒��̐l������";
			mes "���c�ɂ���Ă��܂��B";
			mes "�悭�l�������Ă���B";
			close;
		}
		mes "[�x������]";
		mes "���������I�@���肪�Ƃ��B";
		mes "�ł͂��肢�����Ă��炨���B";
		next;
		mes "[�x������]";
		mes "���̏Z�������̐�������";
		mes "�ő���m�ۂ��邽�߂ɂ�";
		mes "�u�������o�v�������ȏꏊ��";
		mes "�c�����Ȃ���΂Ȃ�Ȃ��B";
		mes "���ׂ̈ɂ́A�u�����̏Z����";
		mes "������̂���Ԃ������낤�B";
		next;
		mes "[�x������]";
		mes "�N�ɂ͂���^3131FF�����e^000000��n���Ă����B";
		mes "�܂��͂ǂ����ɂ���ł��낤";
		mes "�u�����̏Z����T���Ă��Ăق����B";
		next;
		mes "[�x������]";
		mes "����炵���ꏊ����������";
		mes "^3131FF��Ɍ����ĉ����e�������Ă���B^000000";
		mes "���̌�A��X�x��������";
		mes "���}�𗊂�Ɍ������悤�ɂ���B";
		next;
		mes "[�x������]";
		mes "���ꂮ����C��t���Ă���B";
		mes "�������F��B";
		delquest 2276;
		setquest 2277;
		set MALAYA_5QUE,11;
		close;
	case 11:
		mes "[�x������]";
		mes "�܂��͂ǂ����ɂ���ł��낤";
		mes "�u�����̏Z����T���Ă��Ăق����B";
		mes "����炵���ꏊ����������";
		mes "^3131FF��Ɍ����ĉ����e�������Ă���B^000000";
		mes "���̌�A��X�x��������";
		mes "���}�𗊂�Ɍ������悤�ɂ���B";
		close;
	case 12:
	case 13:
		mes "�]�܂��̓g�g�C�̂��Ƃ�";
		mes "�@�G�h�[��A��Ă����Ă����悤�]";
		close;
	case 14:
		mes "[�x������]";
		mes "�����Ɍx����������u�����̏Z����";
		mes "�`�B���Ă��������B";
		mes "�悭����Ă��ꂽ�B";
		next;
		mes "[�x������]";
		mes "�u���������Ɍ�������͒��B�Ȃ�";
		mes "�ۑ�͐F�X���邪";
		mes "�����Ɍ����đ傫������O�i������B";
		next;
		mes "[�x������]";
		mes "�����A����͉�X�x���������";
		mes "���ӂ̋C�������B";
		mes "�u�����ގ��ɂ����͂��Ă����Ȃ�";
		mes "���ł����Ă���B";
		mes "�ł́A�܂�����Ƃɂ��悤�B";
		if(checkre()) {
			getexp 500000,0;
			getexp 500000,0;
			getexp 0,300000;
		}
		else {
			getexp 5000000,0;
			getexp 5000000,0;
			getexp 0,3000000;
		}
		delquest 2280;
		setquest 201520;
		set MALAYA_5QUE,15;
		close;
	case 15:
		if(checkquest(2281)) {
			if(checkquest(2281) & 0x4) {
				mes "[�x������]";
				mes "�ȂɁI�@�u������{���ɓ|���Ƃ́I";
				mes "�f���炵���B�N�̂�������";
				mes "���̏Z�l�����������̊�";
				mes "���S�ł���悤�ɂȂ����B";
				next;
				mes "[�x������]";
				mes "�����܂����f�ł��Ȃ��B";
				mes "��2�A��3�̃u������";
				mes "���X�ڌ��񍐂���Ă���̂��B";
				mes "����܂����͂��Ă���B";
				next;
				mes "[�x������]";
				mes "����͍���̓����̂��炾�B";
				mes "�{���ɂ���J�������B���肪�Ƃ��B";
				delquest 2281;
				getitem 6497,3;
				close;
			}
			mes "[�x������]";
			mes "�u�����ގ��̎���͂ǂ����H";
			next;
			if(select("���߂܂�","�w�͂��Ă���Œ��ł�") == 2) {
				mes "[�x������]";
				mes "�ƂĂ��댯�ȔC���Ȃ̂�";
				mes "���ꂮ����T�d�ɐi�߂Ăق����B";
				mes "�K�����Ԃƃp�[�e�B�[��g���";
				mes "�����ɒ���ł���B";
				close;
			}
			mes "[�x������]";
			mes "�������B���߂�Ƃ����̂��B";
			mes "�u�����͂ƂĂ����낵�������Ƃ���";
			mes "�m���Ă���B";
			mes "�N��������Ȃ��̂������͂Ȃ��B";
			mes "���͂���C�ɂȂ��Ă��ꂽ��";
			mes "���ł��܂����������Ă���B";
			delquest 2281;
			close;
		}
		mes "[�x������]";
		mes "�o���I�E�t�H���X�g�̐[���X��";
		mes "�u�������������ꂽ�炵���B";
		next;
		if(BaseLevel < 130) {
			mes "[�x������]";
			mes "�u�����͂ƂĂ����낵��������";
			mes "���̌N�̎�ɂ͗]�邾�낤�B";
			mes "^FF0000BaseLv130�ȏ�^000000�ɂȂ�����";
			mes "�܂����Ă���B";
			close;
		}
		mes "[�x������]";
		mes "�m���Ă���Ǝv�����A";
		mes "�x�����͊F�A����⃂���X�^�[��";
		mes "�|���ɑ��͂������Ă���B";
		next;
		mes "[�x������]";
		mes "���̉e���ɂ��u�����̑ގ��ɂ�";
		mes "�O���̗͂��؂�邵���Ȃ���Ԃ��B";
		mes "�u�����͂ƂĂ����낵����������";
		mes "�`�����Ă���B";
		mes "�����ɂ͂�������̗͂��K�v���B";
		mes "�u�����ގ��ɋ��͂��Ă���Ȃ����H";
		next;
		if(select("���͂���","���͂��Ȃ�") == 2) {
			mes "[�x������]";
			mes "�u�����͂ƂĂ����낵�������Ƃ���";
			mes "�m���Ă���B";
			mes "�N��������Ȃ��̂������͂Ȃ��B";
			mes "���͂���C�ɂȂ��Ă��ꂽ��";
			mes "���ł��܂����������Ă���B";
			close;
		}
		mes "[�x������]";
		mes "�������B���肪�Ƃ��I";
		mes "�������b�ɂ��ƃu�����́A";
		mes "�w���ɂ��锠�Ől��߂܂���";
		mes "�H�ׂĂ��܂��Ƃ������낵���������B";
		next;
		mes "[�x������]";
		mes "�ƂĂ��댯�ȔC���Ȃ̂�";
		mes "���ꂮ����T�d�ɐi�߂Ăق����B";
		mes "�K�����Ԃƃp�[�e�B�[��g���";
		mes "�����ɒ���ł���B";
		setquest 2281;
		close;
	default:
		mes "[�x������]";
		mes "�������⃂���X�^�[�ւ̑Ή���";
		mes "���܁A�������͖Z�����񂾁B";
		next;
		mes "[�x������]";
		mes "�����A�x���͖��S�̑̐��ŗՂ�ł���B";
		mes "���S���ă|�[�g�}�������y����ł���B";
		close;
	}
}

ma_fild02.gat,307,245,0	script	#todog1	139,3,3,{
	if(MALAYA_5QUE == 11) {
		hideoffnpc "��#buwaya";
		mes "[�ǂ����炩�������鉹]";
		mes "���������I�I";
		close;
	}
	end;
}
ma_fild02.gat,320,241,0	duplicate(#todog1)	#todog2	139,3,3
ma_fild02.gat,317,250,0	duplicate(#todog1)	#todog3	139,3,3

ma_fild02.gat,312,259,3	script	��#buwaya	81,{
	mes "[��]";
	mes "��������!!";
	if(MALAYA_5QUE == 11) {
		next;
		mes "�]���͂���������߂Ȃ���";
		mes "�@�����ɖi���Ă���]";
		next;
		if(select("���𒲂ׂ�","�����Ă���") == 2) {
			mes "�]�������ڂɂ��̏���������]";
			close;
		}
		mes "�]�����ɖi���Ă��錢�������グ���";
		mes "�@��ւ��ڂɂ͂����Ă����B";
		mes "�@";
		mes "�@�u�g�g�C�Ƃ��܂ł��ꏏ�v";
		mes "�@�ƁA������Ă���]";
		next;
		menu "�܂����A�G�h�[!?",-;
		emotion 33;
		mes "[��]";
		mes "�����I";
		mes "�N�[���B�N�[���B";
		next;
		mes "�]�G�h�[�A�ƌĂԂ�����̐���";
		mes "�@�������ĐK����傫���U��͂��߂��]";
		next;
		mes "[��]";
		mes "��������!!";
		next;
		mes "�]�ǂ����G�h�[�͖����������悤���B";
		mes "�@��Ńg�g�C�ɒm�点�Ă����悤�]";
		next;
		emotion 5;
		mes "[�G�h�[]";
		mes "����!!�@�������I";
		mes "�������������I";
		next;
		emotion 26;
		mes "�]�G�h�[�͖k�֌�������";
		mes "�@�Ȃ����i�������Ă���B";
		mes "�@�����`���悤�Ƃ��Ă�̂��낤���]";
		next;
		menu "���������āA���̐�Ƀu�������H",-;
		emotion 33;
		mes "[�G�h�[]";
		mes "�������������I";
		next;
		mes "�]�ǂ���炱�̐�ɁA";
		mes "�@�u�����̏Z��������悤���B";
		mes "�@�x�����ɒm�点�Ȃ��Ɓ]";
		next;
		mes "�]���Ȃ���";
		mes "�@�x����������󂯎���������e��";
		mes "�@��Ɍ������Đ����悭�����グ���]";
		next;
		mes "^FF0000�]�q���E�E�E�E�E�]^000000";
		misceffect 709,"";
		hideoffnpc "�x������#buwaya";
		next;
		mes "[�x������]";
		mes "����J�l�ł��I";
		mes "�܂�������ȏꏊ��";
		mes "�u�������Z��ł����Ƃ́I";
		mes "�����A�x�������ɓ`���Ă����܂��I";
		hideonnpc "�x������#buwaya";
		next;
		mes "�]������ڂ��ʂ��������o�����B";
		mes "�@�܂��̓g�g�C�̂��Ƃ�";
		mes "�@�G�h�[��A��Ă����Ă����悤�]";
		next;
		mes "[�G�h�[]";
		mes "��������!!";
		hideonnpc "��#buwaya";
		delquest 2277;
		setquest 2278;
		set MALAYA_5QUE,12;
	}
	close;
OnInit:
	hideonnpc "��#buwaya";
	end;
}

ma_fild02.gat,305,268,3	script	�x������#buwaya	570,{
	end;
OnInit:
	hideonnpc "�x������#buwaya";
	end;
}

//============================================================
// �o�R�i���̓`���N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_6QUE -> 0�`7
//------------------------------------------------------------
malaya.gat,280,331,4	script	�̂��j	578,{
	if(MALAYA_6QUE < 6) {
		mes "[�̂��j]";
		mes "�΂ɏZ��ł��间�̂��b���`";
		mes "�����̗��ɂȂ��Ă��܂��� ";
		mes "����V�k�̂��b���`";
		next;
		mes "[�̂��j]";
		mes "�ً��ɗ�������";
		mes "���q��҂��Ȃ���A";
		mes "���̌���90�񏸂��";
		mes "���̑��q���߂��ė���`";
		next;
		mes "[�̂��j]";
		mes "����89��A";
		mes "����90��A";
		mes "����190��c�c";
		next;
		mes "[�̂��j]";
		mes "���̌������̑��q��D������`";
		mes "���̋��낵�����m�����̑��q��";
		mes "���ݍ��񂶂܂�������A";
		mes "�������̌��ɔ���^���悤�`";
		next;
		mes "[�̂��j]";
		mes "�����{��p���B������";
		mes "���ׂĂ̒n�ɖ\�J�������";
		mes "���Ɛl�����̉��Ŏ����}�����`";
		next;
		mes "[�̂��j]";
		mes "�V�k�̎􂢂Ō����{��`";
		mes "�V�k��ǂ��o���Č����Ԃ߂Ȃ��Ɓ`";
		mes "�V�k�������Ȃ����";
		mes "�V�k�������Ȃ���΁c�c";
		next;
		mes "[�̂��j]";
		mes "�\���������Ă���`";
		mes "�V�k���΂ɐg�𓊂����`";
		mes "���ɂȂ����V�k���������ݍ���ŁA";
		mes "���̓����̒������ݍ��ނ��낤�`";
		close;
	}
	mes "[�̂��j]";
	mes "�o�R�i���ɂ��Ă̓`����";
	mes "���ׂĉR�������ƌ����̂ł����H";
	mes "�܂肠�Ȃ��́A���̐�c�����݂�Ȃ�";
	mes "�R���������ƌ����Ă���̂ł��ˁH";
	next;
	mes "[�̂��j]";
	mes "�ӂ����Ȃ��ł��������B";
	mes "���̒��͐̂���̗��j�̏��";
	mes "���Ă��Ă��܂��B";
	mes "���Ȃ��̂悤�ȊO���痈���l�Ԃ̘b��";
	mes "�h���Ԃ��鎄�����ł͂���܂���B";
	mes "�A���ĉ������B";
	close;
}

malaya.gat,275,333,5	script	�̂���	579,{
	if(MALAYA_6QUE < 6) {
		mes "[�̂���]";
		mes "�΂ɏZ��ł���o�R�i���A";
		mes "���ɂȂ����V�k�̘b�B";
		next;
		mes "[�̂���]";
		mes "����90�񏸂�Ɩ߂��ė����";
		mes "�����Ă������q��";
		mes "�������S�񏸂��Ă��߂�Ȃ������`";
		mes "�����V�k�̑��q�����ݍ��񂾁`";
		next;
		mes "[�̂���]";
		mes "����A����A�V�k�̎􂢂��󂯎��`";
		mes "�{��o���������~�点���J�ƍ^����";
		mes "���̂��ׂĂ����̋��|�Ɉ��ݍ��܂ꂽ�`";
		next;
		mes "[�̂���]";
		mes "����A����A�V�k��ǂ��o�����̂�";
		mes "�{��������߂Ă���`";
		mes "�V�k���΂Ŏ��񂾁`";
		next;
		mes "[�̂���]";
		mes "�o�R�i���ɂȂ肨�O�����ݍ���ŁA";
		mes "���𔱂��邽�߂ɂ�������";
		mes "����ė��邾�낤�`";
		mes "�������ʓ��������";
		mes "�����ꏏ�Ɏ��ʂ��낤�`";
		close;
	}
	mes "[�̂���]";
	mes "�`�������ׂĉR���ƌ�����ł����H";
	mes "�ǂ����Ă���Ȃ��Ƃ��������ł����H";
	mes "�������������ƐM���Ă������Ƃ��A";
	mes "�Ȃ����Ȃ����ȒP�ɉR����";
	mes "������̂ł����H";
	mes "����Ȃ̐M������킯������܂���B";
	next;
	mes "[�̂���]";
	mes "�������ȃo�R�i���c�c�B";
	mes "���Ȃ��̂悤�Ȑl�̓o�R�i����";
	mes "���܂��΂����̂ɁI";
	close;
}

malaya.gat,290,329,4	script	���|�ɋ����Ă��鏭�N	577,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_6QUE < 6) {
		mes "[���|�ɋ����Ă��鏭�N]";
		mes "���낵���o�R�i������������";
		mes "�������ݍ���ŁA���ɕ��Q����";
		mes "����炵���ł���B";
		mes "�|���ł��A�����ĉ������c�c�B";
		close;
	}
	mes "[���|�ɋ����Ă��鏭�N]";
	mes "�o�R�i���̓`����";
	mes "�S���R���ƌ�����ł����H";
	mes "�ł̓o�R�i�����U���Ȃ�ł����H";
	next;
	mes "[���|�ɋ����Ă��鏭�N]";
	mes "����Ȃ��ŗF�B�ƃo�R�i���̌΂�";
	mes "�V�тɍs���܂��B";
	mes "���v�Ȃ�ł���ˁH";
	mes "�`���͉R���ƌ����܂�����ˁH";
	close;
}

malaya.gat,264,338,4	script	���|�ɋ����Ă��鏗��	576,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_6QUE < 6) {
		mes "[���|�ɋ����Ă��鏗��]";
		mes "�o�R�i���͑����������炵���ł��B";
		mes "�����肽���Ȃ瑁�����@���ĉ������I";
		next;
		switch(select("������������ł����H","�o�R�i���Ƃ́H")) {
		case 1:
			mes "[���|�ɋ����Ă��鏗��]";
			mes "���񂾘V�k���o�R�i����";
			mes "����ς�������Ƃ�";
			mes "���łɂ����m�ł����H";
			next;
			mes "[���|�ɋ����Ă��鏗��]";
			mes "�`���ɂ��ƘV�k��";
			mes "�����ɍs�������q��҂��Ȃ���";
			mes "��ɋC���g���Ă����̂�";
			mes "���ɕq���炵���ł��B";
			next;
			mes "[���|�ɋ����Ă��鏗��]";
			mes "����Ńo�R�i�������o��";
			mes "�ƂĂ����B���Ă��܂��B";
			mes "�l�X����ɓ��A�t���C�p���Ȃǂ�";
			mes "�@���̂͂��̂��߂ł��B";
			close;
		case 2:
			mes "[���|�ɋ����Ă��鏗��]";
			mes "�΂ɏZ��ł���|�������ł��B";
			mes "�������P�����ė��邩������Ȃ��̂�";
			mes "���������Ă��܂��B";
			next;
			mes "[���|�ɋ����Ă��鏗��]";
			mes "�o�R�i���͌������ݍ��ނ��Ƃ�";
			mes "�����ɂȂ��Ă���Ƃ����\�ł��̂�";
			mes "�������������ݍ���ŁA���̂��Ƃ�";
			mes "�Y��Ăق����ł��c�c�B";
			close;
		}
	}
	mes "[���|�ɋ����Ă��鏗��]";
	mes "���̐l�����͂��Ȃ��̎���";
	mes "�����Ă��܂��B";
	mes "�o�R�i���̓`�����R���ƌ����āc�c";
	next;
	mes "[���|�ɋ����Ă��鏗��]";
	mes "�Ȃ����̐l���������܂����Ƃ���́H";
	mes "���Ȃ��̂ق���������������I";
	close;
}

malaya.gat,272,339,5	script	�V�����肢�t	575,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_6QUE < 6) {
		mes "[�V�����肢�t]";
		mes "�o�R�i���𑞂�ł͂����܂���B";
		mes "����ɑ΂��鑞���݂��o�R�i����";
		mes "�{�������ɑ��������Ă����ł��B";
		next;
		mes "[�V�����肢�t]";
		mes "���񂾘V�k�̍��݂��Ԃ߂邽�߂�";
		mes "���N���̎����ɂȂ�Ɨ������������A";
		mes "�s�����s���Ă��邪�A";
		mes "�ǂ�ǂ�傫���Ȃ��Ă��邻�̓{���";
		mes "�ǂ����Ă��Ԃ߂���@������܂���B";
		next;
		mes "[�V�����肢�t]";
		mes "���̂܂܂ł͊댯�ł��B";
		mes "���ɂ͂킩��܂��B";
		mes "���������o�R�i���͌������ݍ����";
		mes "���𔱂��ɂ���͂��ł��B";
		close;
	}
	mes "[�V�����肢�t]";
	mes "�`�����R�I";
	mes "�Ȃ�Ƃ����o�`������ȁc�c";
	next;
	mes "[�V�����肢�t]";
	mes "�����A���Ȃ��̂����Ńo�R�i����";
	mes "�{�肪����ɑ傫���Ȃ����I";
	mes "�����N������邱�ƂɂȂ�΁A";
	mes "����͑S�����Ȃ��̐ӔC���I";
	close;
}

malaya.gat,285,332,4	script	�`���ɏڂ����V�l	574,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(BaseLevel < 120) {
		mes "[�`���ɏڂ����V�l]";
		mes "�N�͎�����`���ɂ͂܂�";
		mes "�͕s���̂悤���ȁB";
		mes "�\�������Ȃ��Ă���";
		mes "������x�K�˂ė��Ă���B";
		next;
		mes "�]^FF0000BaseLv120�ȏ�^000000�ɂȂ��Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	switch(MALAYA_6QUE) {
	case 0:
		mes "[�`���ɏڂ����V�l]";
		mes "�Ƃ��Ƃ������o�R�i����";
		mes "���̒��܂ŕ񕜂����ɂ���c�c�B";
		mes "�o�R�i�����Ԃ߂Ȃ��ẮB";
		mes "����ȏ�̍Ђ���h�����߂ɁB";
		next;
		if(select("�ڂ�������","���̏�𗣂��") == 2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "[�`���ɏڂ����V�l]";
		mes "�������炸���Ɠ��ɍs�����Ƃ����";
		mes "����΂ɁA�o�R�i���Ƃ���������";
		mes "�Z��ł���B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���̃o�R�i���ɂ́A�������̒���";
		mes "�Â�����`���`���������ĂȁB";
		mes "�O���痈���҂͒m��ʂ��낤����A";
		mes "�����`��������ĕ������悤�B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "������S�N�O�A���ɏo�����q�̋A���";
		mes "�҂V�k���������B";
		mes "���q�͌���90�񏸂������ɋA���";
		mes "�����Ă������A���S�񌎂������Ă�";
		mes "�A���Ă��Ȃ��B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�V�k�͎v�����B";
		mes "���q�͌��Ɉ��ݍ��܂ꂽ�̂��A�ƁB";
		mes "�V�k�͌���������B";
		mes "���Ɏd�Ԃ������邽�߁A��������";
		mes "������B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�����m�������͂Ђǂ��{��A";
		mes "�p���B���ƁA���������J�����̒���";
		mes "�l�X���P�����B";
		mes "�l�X�́A����������V�k�̑��݂�m��A";
		mes "�V�k��ӂ߁A������ǂ��o�����Ƃ����B";
		mes "���̓{��������߂邽�߂ɂȁB";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�V�k�͐�]���A�΂Ɏ���g�𓊂����B";
		mes "���͎��܂�A�l�X�͈��g���āA";
		mes "�b�͂���ŏI��������Ɏv��ꂽ�B";
		mes "�c�c�������A�����ł͂Ȃ������̂��B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�V�k�͍��݂̂��܂�A�o�R�i���Ƃ���";
		mes "���Ɏp��ς����̂��B";
		mes "���ƒ��Ɛl��H�炤���ɂȁB";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�c�c���΂炭�̊Ԃ͌������݁A";
		mes "���̐l�����Ɏ��]����C��������";
		mes "�Ȃ��������낤�B";
		mes "�������A�Ό����o�قǍ��݂͑傫��";
		mes "�Ȃ����B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���̂��߂ɉ����ɂȂ����Ǝv���H";
		mes "���̒����ԁA�V�k�̓��̒�������";
		mes "�x�z���Ă����Ǝv���H";
		mes "�{��ƕ��Q����B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�������̂Ă����ƒ��ɑ΂���";
		mes "�Y��鎖���ł��Ȃ��قǂ̉��O�c�c�B";
		mes "�V�k�͒��̐l�����̗��ȐS�̂�����";
		mes "�c�O�Ȏ����}���Ȃ���΂Ȃ�Ȃ������B";
		mes "������Ԃ߂Ȃ��Ƃ����Ȃ��񂾂�B";
		mes "���������̒��̐l�Ԃ��ˁB";
		next;
		menu "�ǂ�����ĈԂ߂�H",-;
		mes "[�`���ɏڂ����V�l]";
		mes "�V�k�͑��q�ւ̈��Ɉ��Ă���l�ŁA";
		mes "�����Ƒ��q�̋A���҂��Ă����B";
		mes "������A�S�N�O�̑��q�̍s����";
		mes "���ׂāA���̈�i�����ł�";
		mes "���d�ɒu�������Ԃ߂�΁A";
		mes "�����ƐÂ܂��Ă����͂����B";
		next;
		mes "�]���ӂɂ����Z��������";
		mes "�@����߂����]";
		next;
		mes "[���̐l����]";
		mes "����Ȗ����ȁI";
		next;
		mes "[���̐l����]";
		mes "�S�N���O�̐l�̂��Ƃ𒲂ׂ�Ȃ��";
		mes "�����ł��I";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�������A�S�N�O�̐l�̍��Ղ�";
		mes "�T���Ƃ����͖̂��d��������Ȃ��c�c�B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "����ǂ���Ă݂鉿�l��";
		mes "����̂ł͂Ȃ����H";
		mes "�������́A�V�k�̓{��ƍ��݂�";
		mes "�Ԃ߂���@��T���`����";
		mes "����̂ł͂Ȃ����H";
		next;
		mes "[���̐l����]";
		mes "�c�c�c�c�B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�c�c���̎҂�B";
		mes "�������͎������̐�c���Ƃ����߂�";
		mes "����Ȃ��Ă͂Ȃ�Ȃ��B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�������A��������Ȃ��b�ł͂��邪�A";
		mes "�������ɂ͂��̂��߂̗͂��Ȃ��c�c�B";
		mes "�����Ă���A���B���c�c�B";
		next;
		if(select("�͂ɂȂ�","�f��") == 2) {
			mes "[�`���ɏڂ����V�l]";
			mes "�����A�N�̍l���Ă��邱�Ƃ��������B";
			mes "����͐l�ł͂Ȃ��B";
			mes "�����Ȃ̂�����c�c�B";
			mes "����ł����͘V�k�̐S�̗D������";
			mes "�M���Ă���̂��B";
			next;
			mes "[�`���ɏڂ����V�l]";
			mes "�C���ς������A";
			mes "�܂��b�����Ă���c�c�B";
			close;
		}
		mes "[�`���ɏڂ����V�l]";
		mes "���肪�����c�c�B";
		mes "����ł͂܂��A���̑�������";
		mes "^FF0000�Δł̌���^000000��������ė���";
		mes "����邩�H";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "����^FF0000�Δł̌���^000000�́A";
		mes "�V�k�̑��q���c���������B";
		mes "�������Ђǂ��Č��^��m�邱�Ƃ�";
		mes "�ł��Ȃ����ȁB";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���ɉ����ē�̕��ɍs����";
		mes "�`�߂��Ɏ��̑��������邩��A";
		mes "����ė��Ă���B";
		mes "���񂾂��B";
		next;
		mes "�]�`���ɏڂ����V�l�̑�������";
		mes "�@^FF0000�Δł̌���^000000��������Ă��悤�B";
		mes "�@�����͍`�߂��ɂ���炵���]";
		set MALAYA_6QUE,1;
		delquest 72078;
		setquest 1174;
		close;
	case 1:
		mes "[�`���ɏڂ����V�l]";
		mes "^FF0000�Δł̌���^000000�������ė��Ă���";
		mes "���ɉ����ē�̕��ɍs����";
		mes "�`�߂��Ɏ��̑��������邩��A";
		mes "������ė��Ă���B";
		next;
		mes "�]�`���ɏڂ����V�l�̑�������";
		mes "�@^FF0000�Δł̌���^000000��������Ă��悤�B";
		mes "�@�����͍`�߂��ɂ���炵���]";
		close;
	case 2:
		mes "[�`���ɏڂ����V�l]";
		mes "�����ɐΔł�������ė������B";
		mes "�����ɕK�v�ƂȂ镨�ł͂Ȃ����A";
		mes "�V�k�̑��q�̑��Ղ�ǂ������Ȃ�";
		mes "�肪����̈���B";
		mes "�Ȃ����Ȃ��l�ɑ�؂Ɏ����Ă��Ă���B";
		mes "�����Ƒ傫�ȗ͂ɂȂ�͂����B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���Ď������c�c";
		mes "�`���ɂ��ƁA�V�k�̑��q��";
		mes "�Б����s���R�ŁA������������Ȃ���";
		mes "�؋�𔄂邳���炢�̏��l������";
		mes "�悤���B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�o���I�E�t�H���X�g�̖k������";
		mes "�[�����Ɉ�l�ŏZ��ł���j���A";
		mes "�V�k�̑��q��������؋��";
		mes "�����Ă���Ƃ����b������B";
		next;
		menu "�o���I�E�t�H���X�g�H",-;
		mes "[�`���ɏڂ����V�l]";
		mes "�������瓌�ɍs���ƁA";
		mes "�o���I�E�}�q���K�Ƃ�����������B";
		mes "���̖k�ɂ���̂��A";
		mes "�o���I�E�t�H���X�g���B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���Ȃ��翂ȏꏊ������A";
		mes "���̂悤�ȘV�l�ɍs����";
		mes "�ꏊ�ł͂Ȃ��Ăȁc�c";
		mes "�N���s���āA�b�𕷂��Ă���";
		mes "����Ȃ����H";
		next;
		if(select("�����󂯂�","�f��") == 2) {
			mes "[�`���ɏڂ����V�l]";
			mes "�������c�c";
			mes "�c�O�����A���v�͂ł���c�c�B";
			mes "�C���ς������A�܂��b�������Ă���B";
			close;
		}
		mes "[�`���ɏڂ����V�l]";
		mes "�N�͖{���ɐS�D������҂��c�c";
		mes "�o���I�E�t�H���X�g�̐�����";
		mes "����n��ƁA^0000FF�|�[�g�}�����ڏZ��^000000��";
		mes "����͂����B";
		mes "�������̂��߂ɂ��܂Ȃ��c�c�B";
		mes "�K�^���F��B";
		next;
		mes "�]�o���I�E�t�H���X�g�̐���";
		mes "�@����n�����Ƃ���ɂ���";
		mes "�@^0000FF�|�[�g�}�����ڏZ��^000000����A";
		mes "�@�b�𕷂��Ă��悤�]";
		set MALAYA_6QUE,3;
		delquest 1175;
		setquest 1176;
		close;
	case 3:
		mes "[�`���ɏڂ����V�l]";
		mes "�o���I�E�t�H���X�g�̐�����";
		mes "����n��ƁA^0000FF�|�[�g�}�����ڏZ��^000000��";
		mes "����͂����B";
		next;
		menu "�o���I�E�t�H���X�g�ւ̍s�����𕷂�",-;
		mes "[�`���ɏڂ����V�l]";
		mes "�������瓌�ɍs���ƁA";
		mes "�o���I�E�}�q���K�Ƃ�����������B";
		mes "���̖k�ɂ���̂��A";
		mes "�o���I�E�t�H���X�g���B";
		mes "�K�^���F��B";
		next;
		mes "�]�o���I�E�t�H���X�g�̐���";
		mes "�@����n�����Ƃ���ɂ���";
		mes "�@^0000FF�|�[�g�}�����ڏZ��^000000����A";
		mes "�@�b�𕷂��Ă��悤�]";
		close;
	case 4:
	case 5:
		mes "[�`���ɏڂ����V�l]";
		mes "�V�k�̑��q���A���l�ł�";
		mes "�Ȃ������\��������H";
		mes "�ނނށc�c";
		mes "�ƂȂ�ƁA�ނ͂�������";
		mes "���҂������̂��H";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���܂Ȃ����A���q�����̌��������";
		mes "�o���I�E�}�q���K�ɍs���āA";
		mes "�^���̈�Ђł������A";
		mes "�����Ă��Ă���Ȃ����B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�o���I�E�}�q���K�́A";
		mes "���̒��̓��ɂ���B";
		mes "���񂾂��B";
		close;
	case 6:
		mes "[�`���ɏڂ����V�l]";
		mes "����͖{���Ȃ̂��H";
		mes "�����o�R�i�����V�k�ɉ����A";
		mes "�`�����ł����グ�Ă����Ƃ́c�c";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "���܂Łc�c���̂��ׂĂ̏Z����";
		mes "���̉����ɗx�炳��Ă����̂��c�c";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�������߂炤���R���Ȃ��Ȃ����I";
		mes "�o�R�i��������O��";
		mes "�o�R�i���̏Z�ތ΂ɍs���ēz��";
		mes "�|���Ȃ���΁B";
		mes "�N��M���Ă������񂾂ȁH";
		next;
		if(select("����́c�c","�������ł��I") == 1) {
			mes "[�`���ɏڂ����V�l]";
			mes "�ނށc�c";
			mes "�܂��s���Ȃ��Ƃ�";
			mes "�c���Ă���̂��H";
			next;
			mes "[�`���ɏڂ����V�l]";
			mes "�킩�����B";
			mes "���̌��_�Ɏ��M��������";
			mes "��������悤�ɂȂ�����A";
			mes "������x�b�������Ă���B";
			next;
			mes "[�`���ɏڂ����V�l]";
			mes "�����ȁc�c";
			mes "�N�́A��������������";
			mes "�T���o�����^���ɁA";
			mes "���M�������ėǂ��Ǝv�����B";
			close;
		}
		mes "[�`���ɏڂ����V�l]";
		mes "�N���o�R�i���̌΂�";
		mes "�o���ł���悤�ɒ�����";
		mes "�悭�b���Ă����B";
		mes "�K��������ގ����Ă���B";
		next;
		if(checkitemblank() == 0) {
			mes "[�`���ɏڂ����V�l]";
			mes "��������悤�Ǝv�������A";
			mes "��������̃A�C�e���������Ă���";
			mes "�悤���ȁB";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă���B";
			close;
		}
		if(checkweight(6499,3) == 0) {
			mes "[�`���ɏڂ����V�l]";
			mes "��������悤�Ǝv�������A";
			mes "��������̃A�C�e���������Ă���";
			mes "�悤���ȁB";
			mes "�A�C�e���̏d�ʂ����炵�Ă���";
			mes "������x�b�������Ă���B";
			close;
		}
		if(BaseLevel < 140) {
			mes "[�`���ɏڂ����V�l]";
			mes "�o�R�i���͋��낵����������B";
			mes "���S�̏��������Ă��璧�ނ̂��Ⴜ�B";
			next;
			mes "�]^FF0000BaseLv140�ȏ�^000000�ɂȂ��Ă���";
			mes "�@�o�R�i���ɒ������]";
			next;
		}
		mes "[�`���ɏڂ����V�l]";
		mes "���ꂩ��A����͂��炾�B";
		mes "�������̂��߂ɐ^����";
		mes "�T���o���Ă���āA";
		mes "�{���ɂ��肪�Ƃ��B";
		set MALAYA_6QUE,7;
		delquest 1179;
		setquest 201525;
		getitem 6499,3;
		if(checkre()) {
			getexp 500000,0;
			getexp 500000,0;
			getexp 0,300000;
		}
		else {
			getexp 5000000,0;
			getexp 5000000,0;
			getexp 0,3000000;
		}
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�����c�c";
		mes "�`�����R���������Ƃ�";
		mes "�󂯓�����Ȃ��҂�";
		mes "�������邾�낤�B";
		mes "�N�ɐS�������t�𗁂т���҂�";
		mes "���邩������Ȃ��B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�����A�ǂ����ނ��������";
		mes "����Ăق����c�c";
		mes "�������͂����ƁA�o�R�i����";
		mes "�[���،h�̔O������ė����B";
		mes "�����ɂ͍l����ς����Ȃ�";
		mes "�҂�����B";
		next;
		mes "[�`���ɏڂ����V�l]";
		mes "�ނ�ɂ͎��Ԃ��K�v�Ȃ̂��B";
		mes "�ǂ����A�N�̗D�����S��";
		mes "�ނ�������Ă���Ă���c�c�B";
		close;
	case 7:
		if(MALAYA_7QUE < 15) {
			mes "[�`���ɏڂ����V�l]";
			mes "�����悩������";
			mes "��������`���Ă���Ȃ����H";
			mes "�o�R�i���̂����ł݂��";
			mes "�S�ɗ]�T���Ȃ����Ă��邩��c�c";
			next;
		}
		mes "[�`���ɏڂ����V�l]";
		mes "�S�N�̊�";
		mes "�M���ė����`����";
		mes "���ׂĉR�������Ƃ́c�c";
		mes "�K��������ގ����Ă���B";
		if(BaseLevel < 140) {
			next;
			mes "[�`���ɏڂ����V�l]";
			mes "�o�R�i���͋��낵����������B";
			mes "���S�̏��������Ă��璧�ނ̂��Ⴜ�B";
			next;
			mes "�]^FF0000BaseLv140�ȏ�^000000�ɂȂ��Ă���";
			mes "�@�o�R�i���ɒ������]";
		}
		close;
	}
OnInit:
	waitingroom "�o�R�i���̓`��",0;
	end;
}

malaya.gat,304,100,4	script	�V�l�̑���	576,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	switch(MALAYA_6QUE) {
	case 0:
		mes "[�V�l�̑���]";
		mes "���ꂿ���̓o�R�i����";
		mes "���ƂȂ����ł����";
		mes "�M���Ă��܂��B";
		mes "�{���ɂł����ł����ˁH";
		close;
	case 1:
		mes "[�V�l�̑���]";
		mes "^FF0000�Δł̌���^000000�ł����H";
		mes "���ꂿ��񂪎����Ă������āH";
		mes "���Ɏg���񂾂�c�c";
		mes "�Ƃ肠�������n�����܂��ˁB";
		next;
		mes "�]�Δł̌��Ђ���ɓ��ꂽ�B";
		mes "�@^FF0000�`���ɏڂ����V�l^000000�̂Ƃ����";
		mes "�@�߂낤�]";
		set MALAYA_6QUE,2;
		delquest 1174;
		setquest 1175;
		close;
	case 2:
		mes "[�V�l�̑���]";
		mes "�Δł̌��ЁA�����Ƃ��n��";
		mes "���܂�����ˁH";
		next;
		mes "�]�Δł̌��Ђ��󂯎�����̂�";
		mes "�@^FF0000�`���ɏڂ����V�l^000000�̂Ƃ����";
		mes "�@�߂낤�]";
		close;
	default:
		mes "[�V�l�̑���]";
		mes "�o�R�i���̂�����";
		mes "���̕��͋C���Â��ł��B";
		close;
	}
}

ma_fild02.gat,40,240,4	script	�|�[�g�}�����ڏZ��	578,{
	switch(MALAYA_6QUE) {
	case 3:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���̂悤�ȕ�翂ȏꏊ�܂ŗ���Ƃ�";
		mes "���������ł��ˁH";
		mes "�ŋ߂̃|�[�g�}�����͂ǂ��ł����H";
		mes "�΂ɏZ��ł�������o�R�i����";
		mes "�����������Ă��邻���ŁA";
		mes "�s���Ȃ��č����Ă��܂��B";
		next;
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���̂悤�ȕ�翂ȏꏊ�܂ŗ���Ƃ�";
		mes "���������ł��ˁH";
		mes "�ŋ߂̃|�[�g�}�����͂ǂ��ł����H";
		mes "�΂ɏZ��ł�������o�R�i����";
		mes "�����������Ă��邻���ŁA";
		mes "�s���Ȃ��č����Ă��܂��B";
		next;
		mes "[�|�[�g�}�����ڏZ��]";
		mes "�؋�𔄂��Ă���";
		mes "�����炢�̏��l�ł����H";
		mes "���`��c�c";
		mes "���l�ł͂���܂��񂪁c�c�B";
		next;
		mes "�]�|�[�g�}�����ڏZ���́A�J�o������";
		mes "�@�ؒ���̐l�`�����o�����]";
		next;
		mes "[�|�[�g�}�����ڏZ��]";
		mes "�؋�Ƃ͂���̂��Ƃł����H";
		mes "���̖؋�ɂ��ẮA";
		mes "�ǂ̂悤�Ɏ󂯎�����̂��A";
		mes "�̕��������Ƃ�����܂��B";
		next;
		switch(select("�؋���󂯎�����b�𕷂�","�Δł̌��Ђɂ��Ēm���Ă��邱�Ƃ𕷂�","�����炢�̏��l�̐��̂́H")) {
		case 1:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "�S�N�߂��O�̏o�����ł����A";
			mes "�܂��A�ȒP�Șb�ł��B";
			next;
			mes "[�|�[�g�}�����ڏZ��]";
			mes "^0000FF���ɑ����𕉂��A^000000";
			mes "^0000FF������ւ��ɂ����j��^000000";
			mes "^0000FF�Ƃɓ|�ꂱ��ł��܂����B^000000";
			next;
			mes "[�|�[�g�}�����ڏZ��]";
			mes "^0000FF���̐�c�����Â��{�����Ƃ���A^000000";
			mes "^0000FF����ɂƖ������̖؋��^000000";
			mes "^0000FF����Ă��ꂽ�����ł��B^000000";
			mes "^0000FF���̌セ�̐l�́A������������^000000";
			mes "^0000FF�Ȃ���o���I�E�}�q���K��^000000";
			mes "^0000FF���������Ƃ̂��Ƃł��B^000000";
			next;
			menu "�o���I�E�}�q���K�ɁH",-;
			mes "[�|�[�g�}�����ڏZ��]";
			mes "�`����ė���b�ł͂����ł��B";
			mes "���l�ł͂Ȃ��A�g���Â��ꂽ�A";
			mes "�����������������h�Ȍ���������";
			mes "��m�������ƕ����Ă��܂��B";
			mes "�����A�����̘̂b�ł�����ˁB";
			mes "�^�����Ƃ͂��񑩂ł��܂���B";
			next;
			mes "�]�`���ɏڂ����V�l�̘b�ł́A";
			mes "�@�V�k�̑��q�͂����炢�̏��l�������B";
			mes "�@�������A�|�[�g�}�����ڏZ����";
			mes "�@�؋�����ꂽ�̂͐�m�������Ƃ����B";
			mes "�@�b���H������Ă���̂͂Ȃ����낤�]";
			next;
			mes "�]�V�k�̑��q�����������Ƃ���";
			mes "�@�o���I�E�}�q���K�ŁA���q��";
			mes "�@���̂ƍs�����킩�邩������Ȃ��B";
			mes "�@�o���I�E�}�q���K�ɍs���Ă݂悤�]";
			set MALAYA_6QUE,4;
			delquest 1176;
			setquest 1177;
			close;
		case 2:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "���Ȃ�Â��Δłł��ˁB";
			mes "�c�O�ł����A���߂Č��镨�ł��B";
			mes "�����̕�����������Ă���݂���";
			mes "�ł����A�܂������ǂݎ��܂���B";
			next;
			mes "�]�|�[�g�}�����ڏZ���́A�Δł̌��Ђ�";
			mes "�@���ẮA�����m��Ȃ��悤���B";
			mes "�@�؋�ɂ��ĕ����Ă݂悤�]";
			close;
		case 3:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "���`��c�c�B";
			mes "�͂����Ĕނ͏��l�������̂ł��傤���H";
			mes "���̂悤�Șb�͂܂����������Ă��Ȃ�";
			mes "�ł��˂��c�c�B";
			next;
			mes "[�|�[�g�}�����ڏZ��]";
			mes "���̖؋�́A�������ƕ����Ă��܂��B";
			mes "�������̂��߂ɔނ��������ƁB";
			mes "�����Ă������i�����ꂽ�A�Ƃ���";
			mes "�b�͕����ĂȂ��ł���B";
			next;
			mes "�]�|�[�g�}�����ڏZ���́A�؋�����ꂽ";
			mes "�@�l���ɂ��āA���l�ł������Ƃ�";
			mes "�@�����Ă��Ȃ��悤���B";
			mes "�@�؋�ɂ��ĕ����Ă݂悤�]";
			close;
		}
	case 4:
	case 5:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "����ɂ��́B";
		mes "�������p�ł����H";
		next;
		switch(select("�؋���󂯎�����b�𕷂�","�Δł̌��Ђɂ��Ēm���Ă��邱�Ƃ𕷂�","�����炢�̏��l�̐��̂́H")) {
		case 1:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "����ł́A���`����Ă���b��";
			mes "������x������蕷�����Ă����܂��B";
			mes "�悭�����ĉ������ˁB";
			mes "�Y�ꂿ��_���ł���B";
			next;
			mes "[���`����Ă���b]";
			mes "^0000FF���ɑ����𕉂��A^000000";
			mes "^0000FF������ւ��ɂ����j��^000000";
			mes "^0000FF�Ƃɓ|�ꂱ��ł��܂����B^000000";
			mes "^0000FF���̐�c�����Â��{�����Ƃ���A^000000";
			mes "^0000FF����ɂƖ������̖؋��^000000";
			mes "^0000FF����Ă��ꂽ�����ł��B^000000";
			next;
			mes "[���`����Ă���b]";
			mes "^0000FF���̌セ�̐l�́A�o���I�E�}�q���K��^000000";
			mes "^0000FF���������Ƃ̂��Ƃł��B^000000";
			next;
			mes "�]�V�k�̑��q�����������Ƃ���";
			mes "�@�o���I�E�}�q���K�ŁA���q��";
			mes "�@���̂ƍs�����킩�邩������Ȃ��B";
			mes "�@�o���I�E�}�q���K�ɍs���Ă݂悤�]";
			close;
		case 2:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "���Ȃ�Â��Δłł��ˁB";
			mes "�c�O�ł����A���߂Č��镨�ł��B";
			mes "�����̕�����������Ă���݂���";
			mes "�ł����A�܂������ǂݎ��܂���B";
			next;
			mes "�]�|�[�g�}�����ڏZ���́A�Δł̌��Ђ�";
			mes "�@���ẮA�����m��Ȃ��悤���]";
			close;
		case 3:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "���`��c�c";
			mes "�͂����Ĕނ͏��l�������̂ł��傤���H";
			mes "���̂悤�Șb�͂܂����������Ă��Ȃ�";
			mes "�ł��˂��c�c�B";
			next;
			mes "[�|�[�g�}�����ڏZ��]";
			mes "�����������h�Ȍ����������A";
			mes "��m�������ƕ����Ă��܂��B";
			next;
			mes "[�|�[�g�}�����ڏZ��]";
			mes "����ɁA���̖؋�͖������̂��߂�";
			mes "�ނ��������ƕ����Ă��܂��B";
			mes "�����Ă������i�����ꂽ�A�Ƃ���";
			mes "�b�͕����ĂȂ��ł���B";
			next;
			mes "�]�|�[�g�}�����ڏZ���́A�؋�����ꂽ";
			mes "�@�l���ɂ��āA���l�ł͂Ȃ��A";
			mes "�@��m�������ƕ����Ă���悤���]";
			next;
			mes "�]�`���ɏڂ����V�l�̘b��";
			mes "�@�H������Ă���̂͂Ȃ����낤�]";
			close;
		}
	default:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���̂悤�ȕ�翂ȏꏊ�܂ŗ���Ƃ�";
		mes "���������ł��ˁH";
		mes "�ŋ߂̃|�[�g�}�����͂ǂ��ł����H";
		mes "�΂ɏZ��ł�������o�R�i����";
		mes "�����������Ă��邻���ŁA";
		mes "�s���Ȃ��č����Ă��܂��B";
		close;
	}
}

ma_fild01.gat,165,237,4	script	�|�[�g�}�����ڏZ��	582,{
	switch(MALAYA_6QUE) {
	case 4:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "�؋�ł����H";
		mes "�؋�ɂ܂��̘b������܂����c�c";
		mes "����𕷂����߂�";
		mes "�����܂ŗ����̂ł����H";
		next;
		if(select("�V�тɗ���","���̘̐b�𕷂����ĉ�����") == 1) {
			mes "[�|�[�g�}�����ڏZ��]";
			mes "�����ł����B";
			mes "���ɉ������鑺�ł͂���܂��񂪁A";
			mes "�̂�т肵�Ă����Ă��������ˁI";
			close;
		}
		mes "[�|�[�g�}�����ڏZ��]";
		mes "�̘b�Ȃ̂�";
		mes "�S���͊o���Ă��܂����H";
		next;
		mes "[�̘b]";
		mes "�����́A5�l�̌��q�����b�o�R�i����";
		mes "�킢�𒧂񂾁B";
		mes "����ȃo�R�i���𑊎�ɁA5�l�͗͂�";
		mes "���킹�Đ킢�A�v���I�ȏ���^�����B";
		next;
		mes "[�̘b]";
		mes "�������A���q����4�l�����𗎂Ƃ��A";
		mes "�c��1�l�����ɑ����𕉂��āA";
		mes "�키���Ƃ��ł��Ȃ��Ȃ����B";
		next;
		mes "[�̘b]";
		mes "�v�����𕉂����o�R�i���́A";
		mes "��������g���B�����̂��A";
		mes "�l�Ԃɉ����Č��q��ǂ����B";
		mes "�������䂵�����q�́A�o�R�i���̋��Ђ�";
		mes "�������邽�߂̖������̖؋�𒤂����B";
		next;
		mes "[�|�[�g�}�����ڏZ��]";
		mes "��̂��̂悤�ȓ��e�ł��B";
		mes "�����Ƃ����I�����Ȃ��c�c�B";
		next;
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���q���c���Ă����L�^���A";
		mes "���̑��ɂ���܂��B";
		mes "�Ȃ��|�[�g�}�����ł͂Ȃ��A";
		mes "���̂悤�ȉ������ɂ����";
		mes "�����Ďc�����̂���";
		mes "�킩��܂��񂪁B";
		next;
		menu "���̋L�^�Ƃ��������������ł�",-;
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���́A�ڂ̑O�ɂ����ɁA";
		mes "�L�^���c����Ă���܂��B";
		mes "�������A�L�^�̑厖�ȕ�����";
		mes "������Ă��܂��Ă���̂ŁA";
		mes "���e���m�F���邱�Ƃ͓����";
		mes "�v���܂��B";
		next;
		mes "�]�O�ɂ����𒲍����Ă݂悤�]";
		set MALAYA_6QUE,5;
		delquest 1177;
		setquest 1178;
		close;
	case 5:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���̑O�ɂ����ɂ͉����̌��q��";
		mes "�c�����L�^�����܂�Ă���܂��B";
		next;
		switch(select("���q�̂��̌�ɂ��ĕ���","�̘b��������x����")) {
		case 1:
			mes "[�|�[�g�}�����ڏZ��]";
			mes "���q�̂��̌�A�ł����c�c�B";
			mes "�O�ɂ��������Ƃ���A���̘̐b��";
			mes "�����Ƃ����I��肪����܂���B";
			mes "���q�̂��̌���A�`�����Ă��Ȃ�";
			mes "�̂ŁA�N���m��Ȃ��Ǝv���܂��B";
			close;
		case 2:
			mes "[�̘b]";
			mes "�����́A5�l�̌��q�����b�o�R�i����";
			mes "�킢�𒧂񂾁B";
			mes "����ȃo�R�i���𑊎�ɁA5�l�͗͂�";
			mes "���킹�Đ킢�A�v���I�ȏ���^�����B";
			next;
			mes "[�̘b]";
			mes "�������A���q����4�l�����𗎂Ƃ��A";
			mes "�c��1�l�����ɑ����𕉂��āA";
			mes "�키���Ƃ��ł��Ȃ��Ȃ����B";
			next;
			mes "[�̘b]";
			mes "�v�����𕉂����o�R�i���́A";
			mes "��������g���B�����̂��A";
			mes "�l�Ԃɉ����Č��q��ǂ����B";
			mes "�������䂵�����q�́A�o�R�i���̋��Ђ�";
			mes "�������邽�߂̖������̖؋�𒤂����B";
			close;
		}
	case 6:
	case 7:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "�̘b���܂�����������ł����H";
		mes "����ł����b�����܂���I";
		next;
		mes "[�̘b]";
		mes "�����́A5�l�̌��q�����b�o�R�i����";
		mes "�킢�𒧂񂾁B";
		mes "����ȃo�R�i���𑊎�ɁA5�l�͗͂�";
		mes "���킹�Đ킢�A�v���I�ȏ���^�����B";
		next;
		mes "[�̘b]";
		mes "�������A���q����4�l�����𗎂Ƃ��A";
		mes "�c��1�l�����ɑ����𕉂��āA";
		mes "�키���Ƃ��ł��Ȃ��Ȃ����B";
		next;
		mes "[�̘b]";
		mes "�v�����𕉂����o�R�i���́A";
		mes "��������g���B�����̂��A";
		mes "�l�Ԃɉ����Č��q��ǂ����B";
		mes "�������䂵�����q�́A�o�R�i���̋��Ђ�";
		mes "�������邽�߂̖������̖؋�𒤂����B";
		close;
	default:
		mes "[�|�[�g�}�����ڏZ��]";
		mes "���������ă|�[�g�}��������";
		mes "�����̂ł����H";
		mes "�|�[�g�}�����̂��Ƃ�";
		mes "�C�ɂȂ�̂ł����A�����X�^�[��";
		mes "���������ɂ���̂łȂ��Ȃ�";
		mes "�s�����Ƃ��ł��܂���B";
		close;
	}
}

ma_fild01.gat,172,233,1	script	��	844,{
	if(MALAYA_6QUE < 5) {
		mes "�]�����炵�����̂����܂ꂽ�₪����B";
		mes "�@�������A�厖�ȕ����������Ă���";
		mes "�@�ǂݎ�邱�Ƃ��ł��Ȃ��]";
		close;
	}
	else if(MALAYA_6QUE == 5) {
		mes "�]�����炵�����̂����܂ꂽ�₪����B";
		mes "�@�������A�厖�ȕ����������Ă���";
		mes "�@�ǂݎ�邱�Ƃ��ł��Ȃ��]";
		next;
		mes "�]�����Ă����Δł̌��Ђ�";
		mes "�@��̂ւ��݂ɖ��ߍ���ł݂�ƁA";
		mes "�@�p�Y���̃s�[�X�̂悤�ɂ͂܂����B";
		mes "�@�Ȃ�Ƃ����e��ǂނ��Ƃ��ł���]";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "�o�R�i���Ƃ̐킢�Œv�����������A";
		mes "�����܂ŗ��邱�ƂɂȂ����B";
		mes "���̎����ł��邱�Ƃ́A";
		mes "�z�����ꂻ���ȏ��ɖ؋��";
		mes "�u�����Ƃ����Ȃ��B";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "^0000FF�o�R�i��^000000�������E�����߂�";
		mes "^0000FF�q����V�k�ɉ���^000000�T���Ă���B";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "�z���v���I�ȕ��������Ă��邩��A";
		mes "���̗͂��z�����A�{���̗͂����߂�";
		mes "�ɂ́A�S�N�߂����Ԃ������邾�낤�B";
		mes "������������͌x������悤�ɁB";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "����A�Ăуo�R�i�����\������";
		mes "���邾�낤�B";
		mes "�������A�S�N�Ƃ������Ԃ�";
		mes "�\���ł��낤�B";
		mes "�����D�ꂽ�N����";
		mes "�K���z��|���Ă����B";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "���������̔ނ��M���Ă���B";
		next;
		mes "�]�u�V�k�v�́A���q�ɕ��Q���悤��";
		mes "�@���Ă����o�R�i��������������";
		mes "�@�ł���A�u���̈������q�v�́A";
		mes "�@�{���̓o�R�i����|�����Ƃ���";
		mes "�@���q�̈�l�������悤���]";
		next;
		mes "�]�V�k�ɉ������o�R�i�����A";
		mes "�@���q�ɕ��Q���邽�߂ɗ������R���A";
		mes "�@�|�[�g�}�����Œ����ԓ`���Ƃ���";
		mes "�@���`����Ă��Ă����̂��]";
		next;
		mes "�]�o�R�i���͂����̋��\�ȉ��b��";
		mes "�@�߂��Ȃ����Ƃ�m�����B";
		mes "�@�|�[�g�}������^0000FF�`���ɏڂ����V�l^000000��";
		mes "�@�}���ł��̎�����m�点�悤�]";
		set MALAYA_6QUE,6;
		delquest 1178;
		setquest 1179;
		close;
	}
	else if(MALAYA_6QUE >= 6) {
		mes "�]�S�N�O�A���q������";
		mes "�@�L�^������]";
		next;
		if(select("�����ǂ܂Ȃ�","������x�ǂ�ł݂�") == 1) {
			if(MALAYA_6QUE == 6) {
				mes "�]���e�͏\���ɋL�����Ă���B";
				mes "�@�|�[�g�}������^0000FF�`���ɏڂ����V�l^000000��";
				mes "�@���ׂ�����`���悤�]";
				close;
			}
			mes "�]���e�͏\���ɋL�����Ă���]";
			close;
		}
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "�o�R�i���Ƃ̐킢�Œv�����������A";
		mes "�����܂ŗ��邱�ƂɂȂ����B";
		mes "���̎����ł��邱�Ƃ́A";
		mes "�z�����ꂻ���ȏ��ɖ؋��";
		mes "�u�����Ƃ����Ȃ��B";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "^0000FF�o�R�i��^000000�������E�����߂�";
		mes "^0000FF�q����V�k�ɉ���^000000�T���Ă���B";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "�z���v���I�ȕ��������Ă��邩��A";
		mes "���̗͂��z�����A�{���̗͂����߂�";
		mes "�ɂ́A�S�N�߂����Ԃ������邾�낤�B";
		mes "������������͌x������悤�ɁB";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "����A�Ăуo�R�i����";
		mes "�\���������邾�낤�B";
		mes "�������A�S�N�Ƃ������Ԃ�";
		mes "�\���ł��낤�B";
		mes "�����D�ꂽ�N����";
		mes "�K���z��|���Ă����B";
		next;
		mes "[�S�N�O�Ɍ��q���������񂾓��e]";
		mes "���������̔ނ��M���Ă���B";
		if(MALAYA_6QUE == 6) {
			next;
			mes "�]�u�V�k�v�́A���q�ɕ��Q���悤��";
			mes "�@���Ă����o�R�i��������������";
			mes "�@�ł���A�u���̈������q�v�́A";
			mes "�@�{���̓o�R�i����|�����Ƃ���";
			mes "�@���q�̈�l�������悤���]";
			next;
			mes "�]�V�k�ɉ������o�R�i�����A";
			mes "�@���q�ɕ��Q���邽�߂ɗ������R���A";
			mes "�@�|�[�g�}�����Œ����ԓ`���Ƃ���";
			mes "�@���`����Ă��Ă����̂��]";
			next;
			mes "�]�o�R�i���͂����̋��\�ȉ��b��";
			mes "�@�߂��Ȃ����Ƃ�m�����B";
			mes "�@�|�[�g�}������^0000FF�`���ɏڂ����V�l^000000��";
			mes "�@�}���ł��̎�����m�点�悤�]";
		}
		close;
	}
}

//============================================================
// �������Z���ƃo�R�i���N�G�X�gNPC
//- Registry -------------------------------------------------
// MALAYA_7QUE -> 0�`15
//------------------------------------------------------------
malaya.gat,286,269,4	script	�������Ă���j	578,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	mes "[�������Ă���j]";
	mes "�o�R�i���̋]���ɂȂ����l��";
	mes "���l���邩�m���Ă��܂����H";
	mes "���ЂƂ肾���ł��킢�܂��I";
	close;
}

malaya.gat,276,269,5	script	���������Ă��鏭��	579,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	mes "[���������Ă��鏭��]";
	mes "�o�R�i���ɗ����������̂�";
	mes "�ƂĂ��댯�ł��B";
	mes "�����{��𔃂��ƁA�q����V�l�܂�";
	mes "�댯�ɂȂ�܂��B";
	close;
}

malaya.gat,276,262,4	script	�������Ă��鏭�N	577,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	mes "[�������Ă��鏭�N]";
	mes "�o�R�i���ɂ�������ƗF�B��";
	mes "�D���܂����c�c�B";
	mes "�K�����Q���܂��I";
	close;
}

malaya.gat,283,265,4	script	����	580,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(BaseLevel < 120) {
		mes "[����]";
		mes "�������K�v�ȏ󋵂ł���";
		mes "���Ȃ��ł͂܂��͕s���̂悤�ł��B";
		mes "�\�������Ȃ��Ă���";
		mes "������x���Ă��������B";
		next;
		mes "�]^FF0000BaseLv120�ȏ�^000000�ɂȂ��Ă���";
		mes "�@�܂����悤�]";
		close;
	}
	switch(MALAYA_7QUE) {
	case 0:
		if(MALAYA_6QUE == 0) {
			mes "[����]";
			mes "�o�R�i���ɗ����������ׂ��Ȃ̂��A";
			mes "����܂Œʂ�A�v����[�߁A";
			mes "�J��ׂ��Ȃ̂��c�c";
			mes "���ɔY��ł��܂��B";
			next;
			mes "[����]";
			mes "�o�R�i���͂����m�ł����H";
			mes "����H���ƌ����Ă��间�ł��B";
			mes "���̒��ɓ`���o�R�i����";
			mes "�`����m�肽���ꍇ�ɂ́A";
			mes "^FF0000�`���ɏڂ����V�l^000000����b��";
			mes "�����Ƃ����ł��傤�B";
			next;
			mes "[����]";
			mes "�ŋ߁A�Z���̎��H�������A������";
			mes "�������Ă���܂��āc�c";
			mes "���̐l�X�̊Ԃł́A�o�R�i����";
			mes "�P��ꂽ�̂ł͂Ȃ����A�Ɖ\�����";
			mes "����̂ł��B";
		}
		else if(MALAYA_6QUE == 7) {
			mes "[����]";
			mes "�`�������ׂĉR�H";
			mes "�����ɒ��̐l�����݂�Ȃ�";
			mes "�x�炳�ꂽ�悤�ł��ˁc�c�B";
			next;
			mes "[����]";
			mes "�ŋ߁A�Z���̎��H�������A������";
			mes "�������Ă���܂��āc�c";
			mes "���̐l�X�̊Ԃł́A�o�R�i����";
			mes "�P��ꂽ�̂ł͂Ȃ����A��";
			mes "�\����Ă��܂��B";
		}
		else {
			mes "[����]";
			mes "�o�R�i���ɗ����������ׂ��Ȃ̂��A";
			mes "����܂Œʂ�A�v����[�߁A";
			mes "�J��ׂ��Ȃ̂��c�c";
			mes "���ɔY��ł��܂��B";
			next;
			mes "[����]";
			mes "�Ƃ����̂��A�ŋ߁A�Z���̎��H������";
			mes "�A�����Ĕ������Ă���܂��āc�c";
			mes "���̐l�X�̊Ԃł́A�o�R�i����";
			mes "�P��ꂽ�̂ł͂Ȃ����A�Ɖ\�����";
			mes "����̂ł��B";
		}
		next;
		mes "[����]";
		mes "�����A�{���Ƀo�R�i���ɂ��ꂽ�̂��A";
		mes "����Ƃ��P���Ȏ��H�Ȃ̂���";
		mes "���f���邱�Ƃ��ł��܂���B";
		next;
		mes "[����]";
		mes "�����ł��肢�Ȃ̂ł����c�c";
		mes "�o���I�E�}�q���K�̎��ӂ�";
		mes "���H�҂����̏����i���p�ɂ�";
		mes "��������Ă��܂��B";
		next;
		mes "[����]";
		mes "^0000FF���H�҂̏����i^000000��";
		mes "���������Ƃ����ꏊ�������܂��̂ŁA";
		mes "����������o���A���H�҂̉Ƒ���";
		mes "�n���Ă��������Ȃ��ł��傤���H";
		next;
		if(select("�f��","�����󂯂�") == 1) {
			mes "[����]";
			mes "�m���ɂ��Ȃ��ɗ��ނ̂�";
			mes "�Ԉ���Ă���̂�������Ȃ��c�c�B";
			mes "�����A��X�ł͗͂�����Ȃ��̂ł��B";
			mes "�C���ς������A������x�b��������";
			mes "���������B";
			mes "���肢���܂��B";
			close;
		}
		mes "[����]";
		mes "���肪�Ƃ��������܂��B";
		mes "�����i��T���ė~�������H�҂�";
		mes "4�l���܂��B";
		next;
		mes "[����]";
		mes "^0000FF���H�҂̏����i^000000��";
		mes "���������Ƃ����ꏊ�������܂��ˁB";
		mes "��������܂���";
		mes "^0000FF���H�����N�̕��e^000000��";
		mes "�n���Ă��������B";
		next;
		mes "�]��������A���H�҂̏����i��";
		mes "�@��������ꂽ�ꏊ�𕷂����B";
		mes "�@�o���I�E�}�q���K�ɍs����";
		mes "�@�T���Ă݂悤�]";
		set MALAYA_7QUE,1;
		delquest 72080;
		setquest 1180;
		close;
	case 1:
		mes "[����]";
		mes "�o���I�E�}�q���K��";
		mes "^FF0000���H�҂̏����i^000000�������o����";
		mes "^0000FF���H�����N�̕��e^000000��";
		mes "�n���Ă��������B";
		close;
	case 2:
		mes "[����]";
		mes "�o���I�E�}�q���K��";
		mes "^FF0000���H�҂̏����i^000000�������o����";
		mes "^0000FF���H���������̗F�B^000000��";
		mes "�n���Ă��������B";
		close;
	case 3:
		mes "[����]";
		mes "�o���I�E�}�q���K��";
		mes "^FF0000���H�҂̏����i^000000�������o����";
		mes "^0000FF���H�����j���̑��q^000000��";
		mes "�n���Ă��������B";
		close;
	case 4:
		mes "[����]";
		mes "�o���I�E�}�q���K��";
		mes "^FF0000���H�҂̏����i^000000�������o����";
		mes "^0000FF���H�������N�̕�e^000000��";
		mes "�n���Ă��������B";
		close;
	case 5:
		mes "[����]";
		mes "���Ȃ����͂��Ă��ꂽ���H�҂̏����i��";
		mes "���ׂĂ݂��Ƃ���A�������";
		mes "����Ȑ����ɏP��ꂽ���Ղ�";
		mes "����܂����c�c�B";
		next;
		mes "[����]";
		mes "���H�҂����͑S���o�R�i����";
		mes "���ꂽ�ɈႢ����܂���B";
		next;
		mes "�]���ӂɂ����Z��������";
		mes "�@�ǂ�߂����]";
		next;
		mes "[���̐l����]";
		mes "�o�R�i����ގ����悤�I";
		mes "�������̎�ŉ�����ގ����悤�I";
		next;
		mes "[����]";
		mes "����ȏ�o�R�i�����Ԃ߂�s����";
		mes "�s�����Ƃ͖��Ӗ��ł��ˁc�c�B";
		next;
		mes "[����]";
		mes "�������B";
		mes "�Ⴂ�肢�t���A�u���̗l�q���������v";
		mes "�u���Ȃ��̏������K�v���v��";
		mes "�����Ă��܂����B";
		mes "�b�𕷂��ɍs���Ă��炦�܂����H";
		next;
		if(checkitemblank() == 0) {
			mes "[����]";
			mes "���H�҂̏����i��͂��Ă��ꂽ";
			mes "��������悤�Ǝv���܂������A";
			mes "�A�C�e���̎�ސ�����������悤�ł��B";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "[����]";
		mes "����͎��H�҂̏����i��";
		mes "�͂��Ă��ꂽ����ł��B";
		mes "��X�́A�o�R�i���Ɛ키���߂�";
		mes "������i�߂Ă����܂��B";
		set MALAYA_7QUE,6;
		delquest 1184;
		setquest 1185;
		getitem 12700,5;
		close;
	case 6:
		mes "[����]";
		mes "�Ⴂ�肢�t���A�u���̗l�q���������v";
		mes "�u���Ȃ��̏������K�v���v��";
		mes "�����Ă��܂����B";
		mes "�b�𕷂��ɍs���Ă��炦�܂����H";
		close;
	case 7:
		mes "[����]";
		mes "�����́A�������������ɋ��낵�����Ƃ�";
		mes "��R�N�����Ƃ������Ƃł��B";
		mes "�ǂ������Ȃ��̗͂ŁA��������";
		mes "�͂����߂��܂��悤�Ɂc�c";
		close;
	case 8:
		mes "[����]";
		mes "�肢�t�̎菕�������Ă��ꂽ�̂ł��ˁB";
		mes "���肪�Ƃ��������܂��B";
		mes "�ޏ����K�v�Ƃ��Ă��镨�́A";
		mes "���̎҂ɓ͂������܂��傤�B";
		next;
		mes "[����]";
		mes "������A�������ɏ������Ȃ����";
		mes "�Ȃ�Ȃ����Ƃ�����܂��B";
		next;
		mes "[����]";
		mes "�o�R�i�����������P�����ė��邩��";
		mes "�m��Ȃ��̂ŁA���̓����Ɠ��A�߂���";
		mes "���Ƃ�����ݒu���Ȃ���΂Ȃ�܂���B";
		mes "���̂���`�������Ȃ��ɂ��肢������";
		mes "�Ǝv���Ă��܂��B";
		next;
		mes "[����]";
		mes "���Ƃ�����ݒu����ꏊ�̋߂���";
		mes "��ƈ�������z�u���Ă����܂����B";
		mes "���Ƃ�����5�����A���Ԃ�1��������";
		mes "����āA���Ƃ����������";
		mes "���������܂��񂩁H";
		next;
		if(select("�f��","�����󂯂�") == 1) {
			mes "[����]";
			mes "�����牽�܂ł��Ȃ��ɗ��肫��ŁA";
			mes "��Ȃ��̂ł����c�c";
			mes "�ǂ����͂�݂��Ă��������B";
			mes "�C���ς��܂�����A";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "[����]";
		mes "�ŏ��̗��Ƃ����́A���̓����߂�";
		mes "�o���I�E�}�q���K�̎��ӂɐݒu����";
		mes "�\��ł��B";
		mes "^0000FF�����ȍ�ƈ�^000000��ҋ@�����Ă������̂�";
		mes "��������ނɘb�����Ă��������B";
		set MALAYA_7QUE,9;
		delquest 1187;
		setquest 1188;
		close;
	case 9:
		mes "[����]";
		mes "�ŏ��̗��Ƃ����́A���̓����߂�";
		mes "�o���I�E�}�q���K�̎��ӂɐݒu����";
		mes "�\��ł��B";
		mes "^0000FF�����ȍ�ƈ�^000000��ҋ@������";
		mes "�������̂ŁA�ނɘb�����Ă��������B";
		close;
	case 10:
		mes "[����]";
		mes "��Ԗڂ̗��Ƃ�����";
		mes "�o���I�E�}�q���K����";
		mes "�o�R�i���̌΂Ɍq����ꏊ�̋߂���";
		mes "�ݒu����̂��悳�����ł��B";
		mes "������^0000FF�s�������ȍ�ƈ�^000000������̂�";
		mes "�͂ɂȂ��Ǝv���܂��B";
		close;
	case 11:
		mes "[����]";
		mes "�O�Ԗڂ̗��Ƃ�����";
		mes "�o�R�i���΂̓�����";
		mes "�ݒu���悤�Ǝv���܂��B";
		mes "^0000FF��������ƈ�^000000������̂�";
		mes "�͂ɂȂ��Ǝv���܂��B";
		close;
	case 12:
		mes "[����]";
		mes "�l�Ԗڂ̗��Ƃ������A";
		mes "�o�R�i���΂̓�����";
		mes "�ݒu���悤�Ǝv���܂��B";
		mes "������^0000FF�J�T�ȍ�ƈ�^000000������̂�";
		mes "�͂ɂȂ��Ǝv���܂��B";
		close;
	case 13:
		mes "[����]";
		mes "�ܔԖڂ̗��Ƃ������A";
		mes "�o�R�i���΂̓�����";
		mes "�ݒu���������悳�����ł��B";
		mes "^0000FF�������Ă����ƈ�^000000������̂�";
		mes "�͂ɂȂ��Ǝv���܂��B";
		close;
	case 14:
		mes "[����]";
		mes "���Ƃ����̐ݒu�����ׂ�";
		mes "�I������悤�ł��ˁB";
		mes "����������傤�ǃo�R�i���Ɋւ���";
		mes "��c���I���܂����B";
		next;
		mes "[����]";
		mes "��X�́A�o�R�i���ɗ������������Ƃ�";
		mes "���߂܂����B";
		mes "���Ȃ����z�̏Z�ތ΂ɓ˓�����";
		mes "�ȂɂƂ��������ɗ͂�݂��Ă��������B";
		next;
		if(checkitemblank() == 0) {
			mes "[����]";
			mes "����܂ł̂�����A�Ǝv���܂������A";
			mes "�A�C�e���̎�ސ�����������悤�ł��B";
			mes "�A�C�e���̎�ސ������炵�Ă���";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "[����]";
		mes "����́A���Ȃ��ł����A";
		mes "����܂ŋ��͂��Ă��ꂽ����ł��B";
		mes "�ǂ������[�߂��������B";
		set MALAYA_7QUE,15;
		delquest 1193;
		setquest 201530;
		if(checkre()) {
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 500000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,500000;
		}
		else {
			for(set '@i,0;'@i<6;set '@i,'@i+1)
				getexp 5000000,0;
			for(set '@i,0;'@i<2;set '@i,'@i+1)
				getexp 0,5000000;
		}
		getitem 6497,5;
		if(BaseLevel < 140) {
			next;
			mes "[����]";
			mes "�����o�R�i���̗͔͂��ɋ��͂ł��B";
			mes "���̂��Ȃ��̗͂ŗ����������ɂ�";
			mes "�����������ł��傤�B";
			mes "�o�R�i���ɒ��ޑO�ɁA";
			mes "���������͂����Ă��������B";
			next;
			mes "�]^FF0000BaseLv140�ȏ�^000000�ɂȂ��Ă���";
			mes "�@�o�R�i���ɒ������]";
		}
		close;
	case 15:
		if(MALAYA_6QUE < 7) {
			mes "[����]";
			mes "�o�R�i���̏Z�ތ΂ւ̓˓���";
			mes "����������ł��B";
			mes "�]�T�����邤����^0000FF�`���ɏڂ����V�l^000000��";
			mes "�菕�������Ă��������܂��񂩁H";
			mes "�����ƁA���Ȃ��̗͂�K�v��";
			mes "���Ă���Ǝv���܂��B";
			close;
		}
		mes "[����]";
		mes "�o�R�i���΂ɂ���^�z�[���A";
		mes "�o�R�i���̐��ݏ��ɍs�����߂�";
		mes "���͂��Ă����ł��傤�B";
		next;
		if(BaseLevel < 140) {
			mes "[����]";
			mes "�����o�R�i���̗͔͂��ɋ��͂ł��B";
			mes "���̂��Ȃ��̗͂ŗ����������ɂ�";
			mes "�����������ł��傤�B";
			mes "�o�R�i���ɒ��ޑO�ɁA";
			mes "���������͂����Ă��������B";
			next;
			mes "�]^FF0000BaseLv140�ȏ�^000000�ɂȂ��Ă���";
			mes "�@�o�R�i���ɒ������]";
			close;
		}
		mes "[����]";
		mes "���܂ł̋]���҂����̂��߂ɂ�";
		mes "�o�R�i����K���ގ����Ă��������B";
		close;
	}
OnInit:
	waitingroom "�������Z���ƃo�R�i��",0;
	end;
}

ma_fild01.gat,69,180,0	script	�΂�#01	844,{
	if(MALAYA_7QUE == 1) {
		if(checkquest(72225) & 0x8) {
			mes "�]���H�҂̏����i��";
			mes "�@���H�����N�̕��e�ɑ����͂��悤�]";
			close;
		}
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		mes "�]�΂݂̒�����";
		mes "�@���H�҂̏����i���������]";
		getitem 6520,1;
		setquest 72225;
		compquest 72225;
		close;
	}
	end;
}

ma_fild01.gat,44,69,0	script	�΂�#02	844,{
	if(MALAYA_7QUE == 2) {
		if(checkquest(72230) & 0x8) {
			mes "�]���H�҂̏����i��";
			mes "�@���H���������̗F�B�ɑ����͂��悤�]";
			close;
		}
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		mes "�]�΂݂̒�����";
		mes "�@���H�҂̏����i���������]";
		getitem 6520,1;
		setquest 72230;
		compquest 72230;
		close;
	}
	end;
}

ma_fild01.gat,173,94,0	script	�΂�#03	844,{
	if(MALAYA_7QUE == 3) {
		if(checkquest(72235) & 0x8) {
			mes "�]���H�҂̏����i��";
			mes "�@���H�����j���̑��q�ɑ����͂��悤�]";
			close;
		}
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		mes "�]�΂݂̒�����";
		mes "�@���H�҂̏����i���������]";
		getitem 6520,1;
		setquest 72235;
		compquest 72235;
		close;
	}
	end;
}

ma_fild01.gat,294,94,0	script	�΂�#04	844,{
	if(MALAYA_7QUE == 4) {
		if(checkquest(72240) & 0x8) {
			mes "�]���H�҂̏����i��";
			mes "�@���H�������N�̕�e�ɑ����͂��悤�]";
			close;
		}
		if(checkitemblank() == 0) {
			mes "�]�A�C�e���̎�ސ���������";
			mes "�@�����Ƃ��ł��Ȃ��B";
			mes "�@��ސ������炵�Ă���E�����]";
			close;
		}
		mes "�]�΂݂̒�����";
		mes "�@���H�҂̏����i���������]";
		getitem 6520,1;
		setquest 72240;
		compquest 72240;
		close;
	}
	end;
}

malaya.gat,269,267,5	script	���H�����N�̕��e	582,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_7QUE == 1) {
		if(checkquest(72225) & 0x8) {
			mes "�]���H�����N�̕��e��";
			mes "�@^FF0000���H�҂̏����i^000000��n�����]";
			next;
			mes "[���H�����N�̕��e]";
			mes "����́c�c���q�������Ă������̂�";
			mes "�ԈႢ����܂���B";
			mes "���q�͉����Ɂc�c�B";
			next;
			mes "�]�j�͗܂��䖝���Ă���c�c�]";
			next;
			mes "�]���H�҂����̏����i�T���𑱂��悤�B";
			mes "�@�o���I�E�}�q���K��";
			mes "�@^FF0000���H�҂̏����i^000000�������o���A";
			mes "�@^0000FF���H���������̗F�B^000000�ɓn�����]";
			delitem 6520,1;
			set MALAYA_7QUE,2;
			delquest 72225;
			delquest 1180;
			setquest 1181;
			close;
		}
		mes "[���H�����N�̕��e]";
		mes "^FF0000���H�҂̏����i^000000��T���Ă���H";
		mes "���������āc�c";
		mes "�����̎q�͂����A���Ă��Ȃ���";
		mes "����������ł����H";
		close;
	}
	else if(MALAYA_7QUE >= 2) {
		mes "[���H�����N�̕��e]";
		mes "�������ȁc�c���̎q���c�c";
		next;
		mes "�]�j�͗܂�K���ɉ䖝���Ă���c�c�]";
		if(MALAYA_7QUE != 2)
			close;
		next;
		mes "�]���H�҂����̏����i�T���𑱂��悤�B";
		mes "�@�o���I�E�}�q���K��";
		mes "�@^FF0000���H�҂̏����i^000000�������o���A";
		mes "�@^0000FF���H���������̗F�B^000000�ɓn�����]";
		close;
	}
	mes "[���H�����N�̕��e]";
	mes "���肢�ł��A�����̎q����";
	mes "�T���Ă��������B";
	mes "�o�R�i���ɂ��ꂽ�Ƃ͎v���܂���B";
	mes "�����Ƃǂ����ɂ���͂��ł��B";
	close;
}

malaya.gat,265,274,5	script	���H���������̗F�B	577,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_7QUE == 2) {
		if(checkquest(72230) & 0x8) {
			mes "�]���H���������̗F�B��";
			mes "�@^FF0000���H�҂̏����i^000000��n�����]";
			next;
			mes "[���H���������̗F�B]";
			mes "����͖l���v���[���g����";
			mes "�I���`�������ǁc�c";
			mes "�l�̗F�B�͂ǂ��ɂ���́H";
			mes "�A��ė��Ă�A�����A��ė��Ă�I";
			next;
			mes "�]�F�B���������q���������Ă���]";
			next;
			mes "�]���H�҂����̏����i�T���𑱂��悤�B";
			mes "�@�o���I�E�}�q���K��";
			mes "�@^FF0000���H�҂̏����i^000000�������o���A";
			mes "�@^0000FF���H�����j���̑��q^000000�ɓn�����]";
			delitem 6520,1;
			set MALAYA_7QUE,3;
			delquest 72230;
			delquest 1181;
			setquest 1182;
			close;
		}
		mes "[���H���������̗F�B]";
		mes "^FF0000���H�҂̏����i^000000��";
		mes "�T���Ă���́H";
		mes "�l�̗F�B�͋A���Ă����I";
		close;
	}
	else if(MALAYA_7QUE >= 3) {
		mes "[���H���������̗F�B]";
		mes "�l�̗F�B��A��ė��āB";
		mes "�����A��ė��Ă�c�c";
		mes "�l�̗F�B�͐����Ă����B";
		mes "�����A���Ă��Ȃ��Ȃ�ĉR���I";
		next;
		mes "�]�F�B���������q���������Ă���]";
		if(MALAYA_7QUE != 3)
			close;
		next;
		mes "�]���H�҂����̏����i�T���𑱂��悤�B";
		mes "�@�o���I�E�}�q���K��";
		mes "�@^FF0000���H�҂̏����i^000000�������o���A";
		mes "�@^0000FF���H�����j���̑��q^000000�ɓn�����]";
		close;
	}
	mes "[���H���������̗F�B]";
	mes "�l�̗F�B��T���āI";
	mes "�ꏏ�Ƀ{�[���V�т����Ă����̂�";
	mes "�}�ɂ��Ȃ��Ȃ����񂾁c�c�B";
	close;
}

malaya.gat,270,278,4	script	���H�����j���̑��q	578,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_7QUE == 3) {
		if(checkquest(72235) & 0x8) {
			mes "�]���H�����j���̑��q��";
			mes "�@^FF0000���H�҂̏����i^000000��n�����]";
			next;
			mes "[���H�����j���̑��q]";
			mes "����͊m���ɂ�������̂����ǁc�c";
			mes "�܂����c�c��������I";
			next;
			mes "�]�j�͋����o�����c�c�]";
			next;
			mes "�]���H�҂����̏����i�T���𑱂��悤�B";
			mes "�@�o���I�E�}�q���K��";
			mes "�@^FF0000���H�҂̏����i^000000�������o���A";
			mes "�@^0000FF���H�������N�̕�e^000000�ɓn�����]";
			delitem 6520,1;
			set MALAYA_7QUE,4;
			delquest 72235;
			delquest 1182;
			setquest 1183;
			close;
		}
		mes "[���H�����j���̑��q]";
		mes "��������̏����i��T����";
		mes "����̂ł����H";
		mes "�ǂ����Ă�������ł͂Ȃ������i���c�c";
		mes "��������͐����Ă���͂��ł��I";
		mes "���������T���Ă��������I";
		close;
	}
	else if(MALAYA_7QUE >= 4) {
		mes "[���H�����j���̑��q]";
		mes "�ǂ����Ă���Ȃ��ƂɁc�c";
		next;
		mes "�]�j�͋����Ă���c�c�]";
		if(MALAYA_7QUE != 4)
			close;
		next;
		mes "�]���H�҂����̏����i�T���𑱂��悤�B";
		mes "�@�o���I�E�}�q���K��";
		mes "�@^FF0000���H�҂̏����i^000000�������o���A";
		mes "�@^0000FF���H�������N�̕�e^000000�ɓn�����]";
		close;
	}
	mes "[���H�����j���̑��q]";
	mes "�������񂪃o�R�i���ɎE�����";
	mes "���܂����Ȃ�āA�M�����܂���B";
	mes "���������T���Ă��������I";
	close;
}

malaya.gat,265,284,4	script	���H�������N�̕�e	579,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_7QUE == 4) {
		if(checkquest(72240) & 0x8) {
			mes "�]���H�������N�̕�e��";
			mes "�@^FF0000���H�҂̏����i^000000��n�����]";
			next;
			mes "[���H�������N�̕�e]";
			mes "����͂����̎q�̃u���V�����ǁc�c";
			mes "���Ȃ����ǂ����āc�c�H";
			mes "�c�c�����Ɂc�c�P��ꂽ�H";
			next;
			mes "[���H�������N�̕�e]";
			mes "���c�c";
			mes "�����̎q�̐�����������c�c";
			mes "�����̎q���߂��Ă���O��";
			mes "�ƂɋA��Ȃ��ƁB";
			mes "�������󂩂��Ă��邾�낤����";
			mes "���т̗p�ӂ����Ă����Ȃ�����c�c�B";
			next;
			mes "�]��e�͐��_�I�ȃV���b�N��";
			mes "�@�󂯂Ă��܂����悤���c�c�]";
			next;
			mes "�]���H�҂̏����i�T�����I�����̂�";
			mes "�@�����ɕ񍐂��悤�]";
			delitem 6520,1;
			set MALAYA_7QUE,5;
			delquest 72240;
			delquest 1183;
			setquest 1184;
			close;
		}
		mes "[���H�������N�̕�e]";
		mes "�����̎q�̏����i��T���Ă���H";
		mes "�ǂ��������Ƃł����H";
		mes "�����̎q�͂����A���Ă��Ȃ���";
		mes "�������Ƃł����H";
		close;
	}
	else if(MALAYA_7QUE >= 5) {
		mes "[���H�������N�̕�e]";
		mes "�����̎q�̐����������܂��B";
		mes "�������܂��Ă݂Ă��������B";
		mes "���ꂳ��ƌĂ�ł��鐺��";
		mes "�������܂���ˁH";
		if(MALAYA_7QUE != 5)
			close;
		next;
		mes "�]��e�͐��_�I�ȃV���b�N��";
		mes "�@�󂯂Ă��܂����悤���c�c�]";
		next;
		mes "�]���H�҂̏����i�T�����I�����̂�";
		mes "�@�����ɕ񍐂��悤�]";
		close;
	}
	mes "[���H�������N�̕�e]";
	mes "�����̎q��T���Ă��������B";
	mes "�߂��܂Ŕ������𗊂񂾂̂�";
	mes "�܂��A���ė��Ȃ���ł��c�c";
	close;
}

malaya.gat,289,364,4	script	�Ⴂ�肢�t	583,{
	if(MALAYA_1QUE < 6) {
		mes "�]���Ȃ����x�����Ă���]";
		close;
	}
	if(MALAYA_7QUE == 6) {
		mes "[�Ⴂ�肢�t]";
		mes "���̐����̊ԂɁA";
		mes "���̗͂���܂��Ă��܂��B";
		mes "���̋߂��Ń����X�^�[���������̂��A";
		mes "�o�R�i���̋]���҂��������̂�";
		mes "���̂����ł��B";
		next;
		mes "[�Ⴂ�肢�t]";
		mes "�����X�^�[�����̌������";
		mes "���̗͂�߂��V�����s���̂ŁA";
		mes "�o���I�E�}�q���K�̎��ӂɂ���";
		mes "^FF0000�e�B�N�o����^000000��15�C";
		mes "�ގ����Ă��������B";
		next;
		if(select("�f��","�����󂯂�") == 1) {
			mes "[�Ⴂ�肢�t]";
			mes "�����f���Ƃ������Ƃ͏��m���Ă��܂��B";
			mes "�ł����A�������͂��Ȃ���";
			mes "���肢���邵������܂���c�c�B";
			mes "�͂�݂��Ă��������Ȃ��ł��傤���H";
			mes "�C���ς��܂�����A";
			mes "������x�b�������Ă��������B";
			close;
		}
		mes "[�Ⴂ�肢�t]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł́A�\���󂠂�܂��񂪁A";
		mes "�}���ł��������܂����H";
		mes "���̂܂܊��S�Ɍ����p���B����";
		mes "���܂�����傫�ȍЂ����N���܂��B";
		set MALAYA_7QUE,7;
		delquest 1185;
		setquest 1186;
		close;
	}
	else if(MALAYA_7QUE == 7) {
		if(checkquest(1186) & 0x4) {
			mes "[�Ⴂ�肢�t]";
			mes "^FF0000�e�B�N�o����^000000��ގ�����";
			mes "�悤�ł��ˁB";
			mes "����ŋV�����n�߂��܂��B";
			next;
			if(checkitemblank() == 0) {
				mes "[�Ⴂ�肢�t]";
				mes "������A�Ǝv���܂������A";
				mes "�A�C�e���̎�ސ�����������悤�ł��B";
				mes "�A�C�e���̎�ސ������炵�Ă���";
				mes "������x�b�������Ă��������B";
				close;
			}
			mes "[�Ⴂ�肢�t]";
			mes "����͂���ł��B";
			mes "�K�v�ȕi��������̂ŁA�����l��";
			mes "�񍐂����Ă��������܂����H";
			set MALAYA_7QUE,8;
			delquest 1186;
			setquest 1187;
			getitem 12699,5;
			close;
		}
		mes "[�Ⴂ�肢�t]";
		mes "�o���I�E�}�q���K�̎��ӂɂ���";
		mes "^FF0000 �e�B�N�o����^000000��15�C";
		mes "�ގ����Ă��������B";
		next;
		mes "[�Ⴂ�肢�t]";
		mes "�}���ł��������B";
		mes "���̂܂܊��S�Ɍ����p���B����";
		mes "���܂�����傫�ȍЂ����N���܂��B";
		close;
	}
	else if(MALAYA_7QUE == 8) {
		mes "[�Ⴂ�肢�t]";
		mes "����ŋV�����n�߂��܂��B";
		mes "�K�v�ȕi��������̂ŁA�����l��";
		mes "�񍐂����Ă��������܂����H";
		close;
	}
	else if(MALAYA_7QUE >= 9) {
		mes "[�Ⴂ�肢�t]";
		mes "�������S�Ɏp���B�����A";
		mes "���������P������ł��傤�B";
		mes "�����̋]���҂��ł�͂��ł��B";
		close;
	}
	mes "[�Ⴂ�肢�t]";
	mes "���̗͂���܂��Ă��܂��B";
	mes "���̋߂��Ń����X�^�[���������̂��A";
	mes "�o�R�i���̋]���҂��������̂��A";
	mes "���̂����ł��B";
	close;
}

ma_fild01.gat,54,253,4	script	�����ȍ�ƈ�	582,{
	if(MALAYA_7QUE == 9) {
		mes "[�����ȍ�ƈ�]";
		mes "���̎�O�ɗ��Ƃ�����ݒu����B";
		mes "�������琔����ɍs���Č��Ă���B";
		if(!checkquest(72200)) {
			setquest 72200;
			compquest 72200;
		}
		close;
	}
	else if(MALAYA_7QUE == 10) {
		mes "[�����ȍ�ƈ�]";
		mes "�o���I�E�}�q���K����";
		mes "�o�R�i���̌΂ɂȂ���ꏊ�̋߂���";
		mes "^0000FF�s�������ȍ�ƈ�^000000������B";
		mes "�����ɍs���Ĉꏏ�ɗ��Ƃ�����";
		mes "�ݒu���Ă���B";
		close;
	}
	else if(MALAYA_7QUE >= 11) {
		mes "[�����ȍ�ƈ�]";
		mes "�����ɗ��Ƃ����������";
		mes "�΂�Ă��܂��B";
		mes "�������痣��Ă���B";
		close;
	}
	mes "[�����ȍ�ƈ�]";
	mes "�����l����A���݂������Ƃ����邩��";
	mes "�����ő҂��Ă��Ă���ƌ���ꂽ�B";
	close;
}
ma_fild01.gat,54,244,0	script	#bako2	139,2,2,{
	if(MALAYA_7QUE == 9) {
		if(checkquest(72200) & 0x8) {
			mes "�]������ӂɗ��Ƃ�����";
			mes "�@�ݒu����̂��ǂ��������]";
			next;
			misceffect 0;
			mes "[�����ȍ�ƈ�]";
			mes "�����������";
			mes "���̂悤�ɁI";
			next;
			misceffect 0;
			mes "[�����ȍ�ƈ�]";
			mes "�@���΁I";
			next;
			misceffect 49;
			mes "�]�����ȍ�ƈ��Ƌ��͂��A";
			mes "�@���Ƃ�����ݒu�����]";
			next;
			mes "[�����ȍ�ƈ�]";
			mes "�ł����ȁB";
			next;
			mes "[�����ȍ�ƈ�]";
			mes "�o���I�E�}�q���K����";
			mes "�o�R�i���̌΂ɂȂ���ꏊ�̋߂���";
			mes "^0000FF�s�������ȍ�ƈ�^000000������B";
			mes "�����ɍs���Ĉꏏ�ɗ��Ƃ�����";
			mes "�ݒu���Ă���B";
			set MALAYA_7QUE,10;
			delquest 72200;
			delquest 1188;
			setquest 1189;
			close;
		}
	}
	else if(MALAYA_7QUE == 10) {
		// ������
		mes "�]�����ɗ��Ƃ�����ݒu�����]";
		next;
		mes "[�����ȍ�ƈ�]";
		mes "�����ɗ��Ƃ����������";
		mes "�΂�Ă��܂��B";
		mes "�������痣��Ă���B";
		next;
		mes "[�����ȍ�ƈ�]";
		mes "�o���I�E�}�q���K����";
		mes "�o�R�i���̌΂ɂȂ���ꏊ�̋߂���";
		mes "^0000FF�s�������ȍ�ƈ�^000000������B";
		mes "�����ɍs���Ĉꏏ�ɗ��Ƃ�����";
		mes "�ݒu���Ă���B";
		close;
	}
	end;
}

ma_fild01.gat,236,119,5	script	�s�������ȍ�ƈ�	577,{
	if(MALAYA_7QUE == 10) {
		mes "[�s�������ȍ�ƈ�]";
		mes "�����Ɍ����@��Ȃ���΂Ȃ�Ȃ��H";
		mes "�����@��Ȃ���΂����Ȃ��̂��H";
		mes "�Ȃ�ł���Ȗʓ|�Ȃ��Ƃ��c�c";
		next;
		mes "[�s�������ȍ�ƈ�]";
		mes "�܂��A�������ƏI��点�邩�B";
		mes "�c�c�Ȃ��A���񂽁I";
		mes "���̂Ƃ��납�炿����Ɠ쓌��";
		mes "�i��ł݂Ă���B";
		if(!checkquest(72205)) {
			setquest 72205;
			compquest 72205;
		}
		close;
	}
	else if(MALAYA_7QUE == 11) {
		mes "[�s�������ȍ�ƈ�]";
		mes "�o�R�i���̌΂ɍs���r����";
		mes "^0000FF��������ƈ�^000000�����邩��";
		mes "�����ɍs���Ă݂ȁB";
		close;
	}
	else if(MALAYA_7QUE >= 12) {
		mes "[�s�������ȍ�ƈ�]";
		mes "����Əo���オ�������Ƃ�����";
		mes "�ǂ����ăA�s�[�����Ă���񂾁I";
		mes "�������ɍs���Ă���I";
		close;
	}
	mes "[�s�������ȍ�ƈ�]";
	mes "�����l����A���݂������Ƃ����邩��";
	mes "�����ő҂��Ă��Ă���ƌ���ꂽ�񂾁B";
	mes "�������ɂ��Ȃ��c�c";
	close;
}
ma_fild01.gat,242,116,0	script	#bako3	139,2,2,{
	if(MALAYA_7QUE == 10) {
		if(checkquest(72205) & 0x8) {
			mes "�]������ӂɗ��Ƃ�����";
			mes "�@�ݒu����̂��ǂ��������]";
			next;
			mes "[�s�������ȍ�ƈ�]";
			mes "�����A�ʓ|�������c�c";
			mes "�c�c�c�c�B";
			next;
			misceffect 0;
			mes "[�s�������ȍ�ƈ�]";
			mes "��͂��������āA";
			mes "�@��I";
			next;
			misceffect 0;
			mes "[�s�������ȍ�ƈ�]";
			mes "�ꐶ�����Ɍ@��I";
			next;
			misceffect 49;
			mes "�]�s�������ȍ�ƈ��Ƌ��͂��A";
			mes "�@���Ƃ�����ݒu�����]";
			next;
			mes "[�s�������ȍ�ƈ�]";
			mes "�����Ԃ�s���D�����A";
			mes "�Ƃ肠�����ł������炢������B";
			next;
			mes "[�s�������ȍ�ƈ�]";
			mes "�o�R�i���̌΂ɍs���r����";
			mes "^0000FF��������ƈ�^000000�����邩��";
			mes "�����ɍs���Ă݂ȁB";
			set MALAYA_7QUE,11;
			delquest 72205;
			delquest 1189;
			setquest 1190;
			close;
		}
	}
	else if(MALAYA_7QUE == 11) {
		mes "�]�����ɗ��Ƃ�����ݒu�����]";
		next;
		mes "[�s�������ȍ�ƈ�]";
		mes "���Ƃ�������������ݒu����Ă��邩";
		mes "�����̑̂Ŋm�F������肩�H";
		mes "�����������痣���I";
		next;
		mes "[�s�������ȍ�ƈ�]";
		mes "�o�R�i���̌΂ɍs���r����";
		mes "^0000FF��������ƈ�^000000�����邩��";
		mes "�����ɍs���Ă݂ȁB";
		close;
	}
	end;
}

ma_scene01.gat,177,89,4	script	��������ƈ�	578,{
	if(MALAYA_7QUE == 11) {
		mes "[��������ƈ�]";
		mes "�����ɗ��Ƃ�����ݒu�����ł����H";
		mes "�����l�����̂悤�ɁH";
		mes "���Ƃ������ł�����A����ł��ˁH";
		next;
		mes "[��������ƈ�]";
		mes "��A�킩��܂����I";
		mes "����ł͎��̈ʒu���班��";
		mes "�쓌�ɐi��ł��炦�܂����H";
		if(!checkquest(72210)) {
			setquest 72210;
			compquest 72210;
		}
		close;
	}
	else if(MALAYA_7QUE == 12) {
		mes "[��������ƈ�]";
		mes "�������牜�ɐi�݁A���ɍs����";
		mes "^0000FF�J�T�ȍ�ƈ�^000000������͂�������";
		mes "�s���Ă݂Ă��������B";
		close;
	}
	else if(MALAYA_7QUE >= 13) {
		mes "[��������ƈ�]";
		mes "�������ɍs���Ă��������I";
		mes "���Ȃ��̂����Ńo�R�i����";
		mes "���ꂽ��ǂ������ł����B";
		mes "�|����ł���I";
		close;
	}
	mes "[��������ƈ�]";
	mes "�����l�ɂ����ő҂��Ă��Ă����";
	mes "�w������܂����B";
	mes "����ȕ|���Ƃ���Ɂc�c";
	mes "�����A�肽���c�c�B";
	close;
}
ma_scene01.gat,179,85,0	script	#bako4	139,2,2,{
	if(MALAYA_7QUE == 11) {
		if(checkquest(72210) & 0x8) {
			mes "�]������ӂɗ��Ƃ�����";
			mes "�@�ݒu����̂��ǂ��������]";
			next;
			mes "[��������ƈ�]";
			mes "�܂�������������";
			mes "���܂��Ă����肵�Ȃ��ł���ˁH";
			mes "�c�c�c�c�B";
			next;
			misceffect 0;
			mes "[��������ƈ�]";
			mes "�X�R�b�v�������āA�@��I";
			next;
			misceffect 0;
			mes "[��������ƈ�]";
			mes "�������@��I";
			next;
			misceffect 49;
			mes "�]��������ƈ��Ƌ��͂��A";
			mes "�@���Ƃ�����ݒu�����]";
			next;
			mes "[��������ƈ�]";
			mes "�ǂ������c�c";
			mes "�������Ȃ��ݒu�ł��āc�c";
			next;
			mes "[��������ƈ�]";
			mes "�������牜�ɐi�݁A���ɍs����";
			mes "^0000FF�J�T�ȍ�ƈ�^000000������͂�������";
			mes "�s���Ă݂Ă��������B";
			set MALAYA_7QUE,12;
			delquest 72210;
			delquest 1190;
			setquest 1191;
			close;
		}
	}
	else if(MALAYA_7QUE == 12) {
		mes "�]�����ɗ��Ƃ�����ݒu�����]";
		next;
		mes "[��������ƈ�]";
		mes "�����������痣��ĉ������I";
		mes "�o�R�i���ɗ��Ƃ������Ƃ΂��";
		mes "���܂�����ǂ������ł����I";
		next;
		mes "[��������ƈ�]";
		mes "�������牜�ɐi�݁A���ɍs����";
		mes "^0000FF�J�T�ȍ�ƈ�^000000������͂�������";
		mes "�s���Ă݂Ă��������B";
		emotion 4,"";
		close;
	}
	end;
}

ma_scene01.gat,141,118,4	script	�J�T�ȍ�ƈ�	582,{
	if(MALAYA_7QUE == 12) {
		mes "[�J�T�ȍ�ƈ�]";
		mes "���Ƃ�����ݒu�������H";
		mes "�Ӂ[��c�c���Ⴀ�A��������";
		mes "������Ɩk���ɕ����Ă݂āB";
		mes "�͂����c�c���ł���Ȃ��Ƃ�";
		mes "���܂��񂾁c�c�B";
		if(!checkquest(72215)) {
			setquest 72215;
			compquest 72215;
		}
		close;
	}
	else if(MALAYA_7QUE == 13) {
		mes "[�J�T�ȍ�ƈ�]";
		mes "���̓���H���ď�̕��܂ŏオ���čs����";
		mes "^0000FF�������Ă����ƈ�^000000������͂��B";
		mes "�s���Ă݂���H";
		mes "�ǂ����݂�ȁA�o�R�i����";
		mes "�E�����񂾂낤���ǁc�c�B";
		close;
	}
	else if(MALAYA_7QUE >= 14) {
		mes "[�J�T�ȍ�ƈ�]";
		mes "�������Ă��o�R�i���͍U�߂ė���̂�";
		mes "�ǂ����Ă���ȋ�J�����Ȃ����";
		mes "�Ȃ�Ȃ��񂾁c�c�B";
		close;
	}
	mes "[�J�T�ȍ�ƈ�]";
	mes "�����l������ƌ���������";
	mes "�����ɂ��邯�ǁc�c�B";
	mes "������点�������Ƃł�";
	mes "����̂��ȁB";
	mes "�ӂ��c�c";
	close;
}
ma_scene01.gat,138,122,0	script	#bako5	139,2,2,{
	if(MALAYA_7QUE == 12) {
		if(checkquest(72215) & 0x8) {
			mes "�]������ӂɗ��Ƃ�����";
			mes "�@�ݒu����̂��ǂ��������]";
			next;
			misceffect 0;
			mes "[�J�T�ȍ�ƈ�]";
			mes "�Ԃ𒣂�A";
			mes "�Ԃ��I";
			next;
			misceffect 0;
			mes "[�J�T�ȍ�ƈ�]";
			mes "���̂悤�ɖԂ��I";
			next;
			misceffect 49;
			mes "�]�J�T�ȍ�ƈ��Ƌ��͂��A";
			mes "�@���Ƃ�����ݒu�����]";
			next;
			mes "[�J�T�ȍ�ƈ�]";
			mes "�͂����c�c";
			mes "���ꂪ�{����";
			mes "���ɗ��񂾂낤���c�c";
			next;
			mes "[�J�T�ȍ�ƈ�]";
			mes "���̓���H���ď�̕��܂ŏ���čs����";
			mes "^0000FF�������Ă����ƈ�^000000������͂��B";
			mes "�s���Ă݂���H";
			set MALAYA_7QUE,13;
			delquest 72215;
			delquest 1191;
			setquest 1192;
			close;
		}
	}
	else if(MALAYA_7QUE == 13) {
		mes "�]�����ɗ��Ƃ�����ݒu�����]";
		next;
		mes "[�J�T�ȍ�ƈ�]";
		mes "���Ƃ����Ȃ񂩂����Ă��c�c";
		mes "�����Ǝv�����悤�ɂ�";
		mes "�쓮���Ȃ��񂾂낤�ȁc�c�B";
		close;
	}
	end;
}

ma_scene01.gat,175,170,5	script	�������Ă����ƈ�	578,{
	if(MALAYA_7QUE == 13) {
		mes "[�������Ă����ƈ�]";
		mes "�Ȃ�قǁI";
		mes "�����������͂��āA���̂������";
		mes "���Ƃ��������̂ł��ˁI";
		mes "�Ȃ񂾂����N���N���Ă��܂��ˁI";
		mes "����ł͖k���ɏ����i���";
		mes "���������܂����H";
		if(!checkquest(72220)) {
			setquest 72220;
			compquest 72220;
		}
		close;
	}
	else if(MALAYA_7QUE == 14) {
		mes "[�������Ă����ƈ�]";
		mes "���Ƃ�����S���ݒu��������A";
		mes "�����l�ɕ񍐂����ł����H";
		mes "����`�A�y�������I";
		close;
	}
	else if(MALAYA_7QUE >= 15) {
		mes "[�������Ă����ƈ�]";
		mes "�l���������Ŋy�����ł��B";
		mes "�B��ė��Ƃ�����������c�c�B";
		mes "�����I�@�N���Ɍ��������Ȃ�܂��I";
		mes "���̑O�ɗ��Ƃ��������邼�I";
		mes "�͂͂͂́`!!";
		emotion 19,"";
		close;
	}
	mes "[�������Ă����ƈ�]";
	mes "�Ȃ�ƒ����l���璼�X�ɁA������";
	mes "�҂悤�ɂƎw�������������܂����I";
	mes "�����r�b�N������悤�ȃC�x���g�ł�";
	mes "�����ł����ˁH";
	mes "������`�I";
	close;
}
ma_scene01.gat,171,174,0	script	#bako6	139,2,2,{
	if(MALAYA_7QUE == 13) {
		if(checkquest(72220) & 0x8) {
			mes "�]������ӂɗ��Ƃ�����";
			mes "�@�ݒu����̂��ǂ��������]";
			next;
			mes "[�������Ă����ƈ�]";
			mes "���킠�I";
			mes "�����͗��Ƃ�����ݒu����̂�";
			mes "�{���ɂ����ꏊ�ł��ˁB";
			next;
			misceffect 0;
			mes "[�������Ă����ƈ�]";
			mes "��𓊂��܂���I";
			mes "�ق���I";
			next;
			misceffect 0;
			mes "[�������Ă����ƈ�]";
			mes "����󂯎���Ă��������`!!";
			next;
			misceffect 49;
			mes "�]�������Ă����ƈ��Ƌ��͂��A";
			mes "�@���Ƃ�����ݒu�����]";
			next;
			mes "[�������Ă����ƈ�]";
			mes "�ł����I�@�ق猩�Ă��������I";
			mes "�ł��܂�����I";
			mes "�������Ȃ��B";
			mes "���h�ȗ��Ƃ����ł���`�`�I";
			next;
			mes "�]���Ƃ��������ׂĐݒu�����B";
			mes "�@�����ɕ񍐂��悤�]";
			set MALAYA_7QUE,14;
			delquest 72220;
			delquest 1192;
			setquest 1193;
			close;
		}
	}
	else if(MALAYA_7QUE == 14) {
		mes "�����ɗ��Ƃ�����ݒu�����B";
		next;
		mes "[�������Ă����ƈ�]";
		mes "�����ɗ����Ă݂Ă��������I";
		mes "�C�ɂȂ��Ďd���Ȃ���ł��A";
		mes "�ǂ��Ȃ�̂����c�c�B";
		mes "�����Ɗy�����ł���ˁI";
		close;
	}
	end;
}

//============================================================
// �s���^�h�X�t�F�X�e�B�o��NPC
//------------------------------------------------------------
ma_in01_jp.gat,45,148,1	script	�C�X�R#pin	577,{
	if($MalayaFes01 >= 100 && $MalayaFes02 >= 100 && $MalayaFes03 >= 30) {
		mes "[�C�X�R]";
		mes "���������������A";
		mes "���ł��s���^�h�X�t�F�X�e�B�o����";
		mes "�n�߂��܂���B";
		mes "�J�Â��Ă������ł����H";
		next;
		if(select("�s���^�h�X�t�F�X�e�B�o�����J�Â���","������Ƒ҂���") == 2) {
			// ������
			close;
		}
		emotion 3;	//�́[��
		donpcevent "�C�X�R#pin::OnStart";
		mes "[�C�X�R]";
		mes "�`���҂̂��Z����A���o���񂽂���";
		mes "��`���Ă��ꂽ�������ŁA";
		mes "�t�F�X�e�B�o���ɕK�v�ȕi����";
		mes "�����邱�Ƃ��ł��܂����B";
		next;
		emotion 3;	//��
		mes "[�C�X�R]";
		mes "�G�w�w�c�c�B";
		mes "�����^7A96E0�s���^�h�X�t�F�X�e�B�o��^000000��";
		mes "�J�Â��邱�Ƃ��ł��܂��B";
		close;
	}
	emotion 53;
	mes "[�C�X�R]";
	mes "�������A�ǂ����悤�c�c�B";
	mes "�t�F�X�e�B�o���܂ŊJ�Â܂�";
	mes "�������Ԃ��Ȃ��̂Ɂc�c�B";
	next;
	switch(select("�ǂ������́H","�ǂ̂��炢�W�܂����́H","�ޗ��������Ă�����")) {
	case 1:
		mes "[�C�X�R]";
		mes "�o���I�E�}�q���K�ɂ�";
		mes "�Â�����`�����Ă���";
		mes "^7A96E0�s���^�h�X�t�F�X�e�B�o��^000000�Ƃ���";
		mes "���Ղ������ł��B";
		mes "�l�͂��̏��������Ă�����ł����A";
		next;
		emotion 57;
		mes "[�C�X�R]";
		mes "�|�[�g�}�����܂ł������ɍs�����A��A";
		mes "�����Ȃ�ڂ̑O�Ɍ��ꂽ";
		mes "^FF8440�u�M�X�M�X^000000������";
		mes "�ޗ���D���Ă��܂�����ł��c�c�B";
		next;
		mes "[�C�X�R]";
		mes "�����o�L�E�L�R�ɑ��k���悤��";
		mes "�����܂ŗ����̂ł����A";
		mes "���������C���Ă��ꂽ���d����";
		mes "���s�����Ȃ�Č����o���Ȃ��āc�c�B";
		next;
		mes "[�C�X�R]";
		mes "�ޗ��𔃂��Ȃ��������͖�����";
		mes "�l��l�ł͍ޗ����W�߂��܂���B";
		mes "�����A�ǂ����悤�c�c�B";
		mes "���̂܂܂���A���̃t�F�X�e�B�o����";
		mes "�J�Âł��܂���c�c�B";
		next;
		menu "�ޗ��̓��e�́H",-;
		mes "[�C�X�R]";
		mes "�D��ꂽ�ޗ��́A";
		mes "�����Ȃ����100��";
		mes "��̏\����100��";
		mes "����30�ł��B";
		next;
		menu "����͂Ȃ������H",-;
		emotion 54;
		mes "[�C�X�R]";
		mes "����͂��܂���ł������A�ޗ����Ȃ���";
		mes "^7A96E0�s���^�h�X�t�F�X�e�B�o��^000000���c�c";
		mes "�ǂ����悤�c�c�B";
		close;
	case 2:
		mes "[�C�X�R]";
		mes "�`���҂̂��Z����A���o���񂽂���";
		mes "�ޗ����W�߂Ă��Ă���Ă��邯�ǁA";
		next;
		mes "[�C�X�R]";
		mes "�܂�";
		mes "�����Ȃ����" +$MalayaFes01+ "��";
		mes "��̏\����" +$MalayaFes02+ "��";
		mes "����" +$MalayaFes03+ "��";
		mes "�����W�܂��Ă��Ȃ���ł��B";
		next;
		emotion 54;
		mes "[�C�X�R]";
		mes "�͂����c�c�܂�����܂���B";
		mes "^7A96E0�s���^�h�X�t�F�X�e�B�o��^000000��";
		mes "�J�Âł��邩�ȁc�c�B";
		close;
	case 3:
		emotion 3;
		mes "[�C�X�R]";
		mes "���H�@�{���H";
		mes "��`�I�@���肪�Ƃ�!!";
		mes strcharinfo(0)+(Sex? "���Z": "���o")+ "����!!";
		mes "���������ė��Ă��ꂽ��ł����H";
		next;
		switch(select("�����Ȃ����(^FF0000" +(100-$MalayaFes01)+ "�s��^000000)","��̏\����(^FF0000" +(100-$MalayaFes02)+ "�s��^000000)","����(^FF0000" +(30-$MalayaFes03)+ "�s��^000000)")) {
		case 1:
			set '@itemid,6497;
			set '@itemname$,getitemname('@itemid);
			set '@temp,100-$MalayaFes01;
			mes "[�C�X�R]";
			mes getitemname('@itemid)+ "�������ė���";
			mes "���ꂽ��ł��ˁH";
			next;
			mes "[�C�X�R]";
			mes "������Ƒ҂��ĉ������ˁB";
			mes "�����Ɓc�c�B";
			next;
			if($MalayaFes01 >= 100) {
				// �K��
				mes "[�C�X�R]";
				mes getitemname('@itemid)+ "��";
				mes "�K�v�Ȑ����W�܂�܂����B������`�I";
				close;
			}
			mes "[�C�X�R]";
			mes getitemname('@itemid)+ "�͍�";
			mes '@temp+ "����܂���B";
			mes "���������ė��Ă��ꂽ��ł����H";
			break;
		case 2:
			set '@itemid,6502;
			set '@itemname$,getitemname('@itemid);
			set '@temp,100-$MalayaFes02;
			mes "[�C�X�R]";
			mes getitemname('@itemid)+ "�������ė���";
			mes "���ꂽ��ł��ˁH";
			next;
			mes "[�C�X�R]";
			mes "������Ƒ҂��ĉ������ˁB";
			mes "�����Ɓc�c�B";
			next;
			if($MalayaFes02 >= 100) {
				// �K��
				mes "[�C�X�R]";
				mes getitemname('@itemid)+ "��";
				mes "�K�v�Ȑ����W�܂�܂����B������`�I";
				close;
			}
			mes "[�C�X�R]";
			mes getitemname('@itemid)+ "�͍�";
			mes '@temp+ "����܂���B";
			mes "���������ė��Ă��ꂽ��ł����H";
			break;
		case 3:
			set '@itemname$,"����";
			set '@temp,30-$MalayaFes03;
			mes "[�C�X�R]";
			mes "�����������ė��Ă��ꂽ��ł��ˁH";
			next;
			mes "[�C�X�R]";
			mes "������Ƒ҂��ĉ������ˁB";
			mes "�����Ɓc�c�B";
			next;
			if($MalayaFes03 >= 30) {
				// �K��
				mes "[�C�X�R]";
				mes getitemname('@itemid)+ "��";
				mes "�K�v�Ȑ����W�܂�܂����B������`�I";
				close;
			}
			mes "[�C�X�R]";
			mes "�����͍�" +'@temp+ "����܂���B";
			mes "�ǂ̐����������ė��Ă���܂������H";
			next;
			switch(
				select(	"�ԐF�̐���(^FF0000" +countitem(975)+ "^000000)",
						"���F�̐���(^FF0000" +countitem(976)+ "^000000)",
						"�F�̐���(^FF0000" +countitem(978)+ "^000000)",
						"�ΐF�̐���(^FF0000" +countitem(979)+ "^000000)",
						"�g�F�̐���(^FF0000" +countitem(980)+ "^000000)",
						"���F�̐���(^FF0000" +countitem(981)+ "^000000)",
						"���F�̐���(^FF0000" +countitem(982)+ "^000000)",
						"���F�̐���(^FF0000" +countitem(983)+ "^000000)"
				)
			) {
			case 1: set '@itemid,975; break;
			case 2: set '@itemid,976; break;
			case 3: set '@itemid,978; break;
			case 4: set '@itemid,979; break;
			case 5: set '@itemid,980; break;
			case 6: set '@itemid,981; break;
			case 7: set '@itemid,982; break;
			case 8: set '@itemid,983; break;
			}
			if(countitem('@itemid) < 1) {
				mes "[�C�X�R]";
				mes "����A" +getitemname('@itemid)+ "��";
				mes "�����Ă��Ȃ��悤�ł����B";
				close;
			}
			mes "[�C�X�R]";
			mes (Sex? "���Z": "���o")+ "���񂪎����Ă���" +getitemname('@itemid)+ "��";
			mes countitem('@itemid)+ "�ł��ˁB";
			mes "����������ł����H";
			break;
		}
		break;
	}
	next;
	if(select("1��","���ʂ��w�肷��") == 1) {
		if('@itemid == 6497) {
			mes "[�C�X�R]";
			mes "�ււցc�c�B";
			mes "�ЂƂ����ė��Ă��ꂽ��ł��ˁB";
		} else {
			mes "[�C�X�R]";
			mes "�ււցc�c�B";
			mes "�ЂƂ����ė�����ł��ˁB";
		}
		next;
		set '@num,1;
	} else {
		mes "[�C�X�R]";
		mes "�ււցc�c�B";
		mes "�܂������Z�����܂�ł��Ȃ��āA";
		//mes "��x��30�܂ł���";
		mes "��x��50�܂ł���";
		mes "�v�Z���ł��Ȃ���ł��B";
		mes "���������ė��Ă��ꂽ��ł����H";
		next;
		input '@num;
		if('@num <= 0 || '@num > 50) {
			if('@itemid == 6497) {
				mes "[�C�X�R]";
				mes "�Ӓn���c�c����������������";
				mes "�����Z���ł��܂����c�c�B";
				close;
			} else {
				mes "[�C�X�R]";
				mes "�Ӓn���`�B";
				mes "���������������Ƒ����Z��";
				mes "�ł��܂����c�c�B";
				close;
			}
		}
	}
	if(countitem('@itemid) < '@num) {
		mes "[�C�X�R]";
		mes "����H�@" +(Sex? "���Z": "���o")+ "����I";
		mes getitemname('@itemid)+ "�͂ǂ��ɂ����ł����H";
		close;
	}
	delitem '@itemid,'@num;
	if('@itemid == 6497) {
		set $MalayaFes01,$MalayaFes01+'@num;
	} else if('@itemid == 6402) {
		set $MalayaFes02,$MalayaFes02+'@num;
	} else {
		set $MalayaFes03,$MalayaFes03+'@num;
	}
	set '@temp,'@temp-'@num;
	mes "[�C�X�R]";
	mes "�ււցc�c�B";
	mes "���肪�Ƃ��������܂��B" +(Sex? "���Z": "���o")+ "����!";
	if('@temp > 0) {
		mes "����ŕK�v��" +'@itemname$+ "�́A";
		mes "����" +'@temp+ "�ɂȂ�܂����B";
	}
	else {
		mes "�����" +'@itemname$+ "��";
		mes "�K�v�Ȑ����W�܂�܂����B������`�I";
	}
	close;
OnStart:
	initnpctimer;
	set $MalayaFes,1;
	hideoffnpc "�ό��q#pin1";
	hideoffnpc "�ό��q#pin2";
	hideoffnpc "�ό��q#pin3";
	hideoffnpc "�ό��q#pin4";
	hideoffnpc "�Ⴂ�^�g�D�[�C�X�g#pin";
	hideoffnpc "���ۂ�@���N#pin1";
	hideoffnpc "���ۂ�@���N#pin2";
	hideoffnpc "���ۂ�@���N#pin3";
	hideoffnpc "���q�����킹�鏭�N#pin1";
	hideoffnpc "���q�����킹�鏭�N#pin2";
	hideoffnpc "���q�����킹�鏭�N#pin3";
	announce "�����������T�ԁA�o���I�E�}�q���K�Ńs���^�h�X�t�F�X�e�B�o�����J�Â���܂��B",0;
	end;
OnReset:
	set $MalayaFes,0;
	set $MalayaFes01,0;
	set $MalayaFes02,0;
	set $MalayaFes03,0;
	hideonnpc "�ό��q#pin1";
	hideonnpc "�ό��q#pin2";
	hideonnpc "�ό��q#pin3";
	hideonnpc "�ό��q#pin4";
	hideonnpc "�Ⴂ�^�g�D�[�C�X�g#pin";
	hideonnpc "���ۂ�@���N#pin1";
	hideonnpc "���ۂ�@���N#pin2";
	hideonnpc "���ۂ�@���N#pin3";
	hideonnpc "���q�����킹�鏭�N#pin1";
	hideonnpc "���q�����킹�鏭�N#pin2";
	hideonnpc "���q�����킹�鏭�N#pin3";
	announce "�s���^�h�X�t�F�X�e�B�o���͐����̖��A�I�����܂����B",0;
	stopnpctimer;
	end;
OnTimer3600000:
	if($MalayaFes < 169) {
		set $MalayaFes,$MalayaFes+1;
		initnpctimer;
	}
	else if($MalayaFes == 169) {
		donpcevent "�C�X�R#pin::OnReset";
	}
	end;
OnInit:
	waitingroom "�s���^�h�X�t�F�X�e�B�o��",0;
	if($MalayaFes >= 1)
		initnpctimer;
	end;
}

ma_fild01.gat,192,200,8	script	�ό��q#pin1	58,{
	mes "[�ό��q]";
	mes "�����Ńs���^�h�X�t�F�X�e�B�o����";
	mes "���Ƃ������炷�ׂē����o����";
	mes "�V�тɗ����񂾁B";
	next;
	mes "[�ό��q]";
	mes "�V�тɗ����̂͌�����ĂȂ����ǁc�c�B";
	next;
	mes "[�ό��q]";
	mes "�v���؂��ē��ꂽ�^�g�D�[��";
	mes "�C�}�C�`�C�ɂ���Ȃ��񂾁B";
	next;
	mes "[�ό��q]";
	mes "�w���ɓ���Ė�����^�g�D�[��";
	mes "���ʂɉf���Č��Ă邯�ǁc�c�B";
	mes "�ǂ����^�g�D�[�C�X�g��";
	mes "���s�����悤�Ȃ񂾁B";
	next;
	mes "[�ό��q]";
	mes "�y���݂������̂Ɂc�c�B";
	next;
	mes "[�ό��q]";
	mes "���`���c�c�B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "�ό��q#pin1";
	end;
}

ma_fild01.gat,211,200,6	script	�ό��q#pin2	775,{
	mes "[�ό��q]";
	mes "�s���^�h�X�t�F�X�e�B�o����";
	mes "�J�Â���Ƃ����ăR����������";
	mes "�V�тɗ����񂾁B";
	next;
	mes "[�ό��q]";
	mes "������Ă��邩������Ȃ�����";
	mes "��Ɍ����Ă������ǁA";
	mes "���̊�̓^�g�D�[����ꂽ�̂ł͂Ȃ�";
	mes "���ʂ�����ȁc�c�B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "�ό��q#pin2";
	end;
}

ma_fild01.gat,251,205,2	script	�ό��q#pin3	824,{
	mes "[�ό��q]";
	mes "����͎������߂Ă���";
	mes "�^�g�D�[����Ȃ���!!";
	next;
	mes "[�ό��q]";
	mes "���̓X�^�C���b�V���ȃ^�g�D�[��";
	mes "���Ă���Ɨ��񂾂̂Ɂc�c�B";
	mes "�r�����E���S������Ȃ�";
	mes "�ӂƂ܂����i�D�������Ƃ�!!";
	mes "�C���[�W�Ƒ�Ⴂ���I";
	mes "��蒼���Ă���I";
	next;
	mes "[�Ⴂ�^�g�D�[�C�X�g]";
	mes "���́c�c���q����A";
	mes "�r�����E���S�͂����������̂���";
	mes "������������Ȃ��ł����B";
	mes "���`�A������v�����ł����̂�";
	mes "��߂����������ƌ������̂Ɂc�c�B";
	next;
	mes "[�ό��q]";
	mes "���₢��B���₢�₢��!!";
	mes "���ꂶ��ʖڂ��I�Ⴄ�I";
	mes "���ނ����蒼���Ă���I";
	next;
	mes "[�Ⴂ�^�g�D�[�C�X�g]";
	mes "���[�A�����I";
	mes "�������ȁc�c�B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "�ό��q#pin3";
	end;
}

ma_fild01.gat,162,235,6	script	�ό��q#pin4	815,{
	mes "[�ό��q]";
	mes "�s���^�h�X�t�F�X�e�B�o����";
	mes "��T�Ԃ����J�Â����炵���ł��ˁB";
	next;
	mes "[�ό��q]";
	mes "���͉����̗��V�邩��V�тɗ��Ă����ǁA";
	mes "���傤�ǃs���^�h�X�t�F�X�e�B�o����";
	mes "�J�Ê��Ԓ��������Ƃ́c�c�B";
	mes "�^���ǂ������悤�ł��B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "�ό��q#pin4";
	end;
}

ma_fild01.gat,249,206,6	script	�Ⴂ�^�g�D�[�C�X�g#pin	582,{
	mes "[�Ⴂ�^�g�D�[�C�X�g]";
	mes "���v��Ȑl�����q�l����";
	mes "�{���ɍ���܂��B";
	next;
	mes "[�Ⴂ�^�g�D�[�C�X�g]";
	mes "�ŋ߂͋C�y�ɓ������������ł���";
	mes "��͂�^�g�D�[�͊o���M�O��";
	mes "���ނ��̂��Ǝv���Ă��܂��B";
	mes "�C�ɓ���Ȃ�����";
	mes "��蒼���Ă���ƌ����Ă��c�c";
	mes "���������̂ł��B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "�Ⴂ�^�g�D�[�C�X�g#pin";
	end;
}

ma_fild01.gat,164,234,6	script	���ۂ�@���N#pin1	578,{
	mes "�]�h�h�h�h�[���]";
	next;
	mes "[���ۂ�@���N]";
	mes "��͂�s���^�h�X�t�F�X�e�B�o����";
	mes "���Ԓ��́A���ۂ�@���Ȃ���";
	mes "�y���ނ̂���Ԃ��ȁB";
	next;
	mes "[���ۂ�@���N]";
	mes "�N���y���񂾂�ǂ����H";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "���ۂ�@���N#pin1";
	end;
}

ma_fild01.gat,170,231,4	script	���ۂ�@���N#pin2	578,{
	mes "�]�h�h�h�h�[���]";
	next;
	mes "[���ۂ�@���N]";
	mes "�s���^�h�X�t�F�X�e�B�o����";
	mes "�s���^�h�X�́A���B�̌��t��";
	mes "�h���Ă���Ƃ����Ӗ��ł��B";
	next;
	mes "[���ۂ�@���N]";
	mes "������A���̊��Ԃ̊Ԃ���";
	mes "���ʂȃ^�g�D�[�����Ă�������";
	mes "�����ł���B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "���ۂ�@���N#pin2";
	end;
}

ma_fild01.gat,164,228,6	script	���ۂ�@���N#pin3	578,{
	mes "�]�h�h�h�h�[���]";
	next;
	mes "[���ۂ�@���N]";
	mes "�悭�o���ĂȂ����A";
	next;
	mes "[���ۂ�@���N]";
	mes "�����q���̍���";
	mes "�s���^�h�X�t�F�X�e�B�o����";
	mes "���قǃ^�g�D�[��O�ʂ�";
	mes "�����o�����Ղł͂Ȃ��A";
	mes "�L���Ȏ��n����ԍՂ������炵���B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "���ۂ�@���N#pin3";
	end;
}

ma_fild01.gat,170,234,4	script	���q�����킹�鏭�N#pin1	577,{
	mes "�]�^�^�^�^���]";
	next;
	mes "[���q�����킹�鏭�N]";
	mes "���ۂ̉��Ɩ_�Ŕ��q�����킹�鉹��";
	mes "�������Ă�����オ��܂��ˁB";
	next;
	mes "[���q�����킹�鏭�N]";
	mes "�^�^�^�^�[���^�^�^�^�[��";
	mes "�y�����ȁ`�B";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "���q�����킹�鏭�N#pin1";
	end;
}

ma_fild01.gat,164,231,6	script	���q�����킹�鏭�N#pin2	577,{
	mes "�]�^�^�^�^���]";
	next;
	mes "[���q�����킹�鏭�N]";
	mes "���͖_���g����";
	mes "���q�����킹�Ă邯��";
	next;
	mes "[���q�����킹�鏭�N]";
	mes "�����͖l�����ۂ�@������";
	mes "����̂��ȁH";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "���q�����킹�鏭�N#pin2";
	end;
}

ma_fild01.gat,170,228,4	script	���q�����킹�鏭�N#pin3	577,{
	mes "�]�^�^�^�^���]";
	next;
	mes "[���q�����킹�鏭�N]";
	mes "���͖_���g����";
	mes "���q�����킹�Ă邯��";
	next;
	mes "[���q�����킹�鏭�N]";
	mes "�����͖l�����ۂ�@������";
	mes "����̂��ȁH";
	close;
OnInit:
	if($MalayaFes == 0)
		hideonnpc "���q�����킹�鏭�N#pin3";
	end;
}